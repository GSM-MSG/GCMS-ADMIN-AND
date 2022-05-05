package com.example.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.dto.datasource.user.response.DomainUserInfo
import com.example.domain.usecase.GetAllUsersUseCase
import com.example.domain.utils.ErrorType
import com.example.domain.utils.RemoteErrorEmitter
import com.example.domain.utils.ScreenState
import com.example.presentation.widget.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllUsersUseCase: GetAllUsersUseCase,
) : ViewModel(), RemoteErrorEmitter {

    private val _getAllUsers: MutableLiveData<List<DomainUserInfo>> = MutableLiveData()
    val getAllUsers: LiveData<List<DomainUserInfo>> = _getAllUsers

    var apiErrorType = ErrorType.UNKNOWN
    var errorMessage = "none"

    fun getAllUsers() {
        viewModelScope.launch {
            _getAllUsers.value = getAllUsersUseCase.getAllUsers(this@MainViewModel)
        }
    }

    override fun onError(msg: String) {
        errorMessage = msg
    }

    override fun onError(errorType: ErrorType) {
        apiErrorType = errorType
    }
}