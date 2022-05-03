package com.example.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.dto.datasource.user.response.DomainGetAllUsersResponse
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

    val apiCallEvent: LiveData<ScreenState> get() = _apiCallEvent
    private var _apiCallEvent = SingleLiveEvent<ScreenState>()

    var getAllUsers = DomainGetAllUsersResponse("", "", "")
    var apiErrorType = ErrorType.UNKNOWN
    var errorMessage = "none"

    fun getAllUsers() {
        viewModelScope.launch {
            getAllUsersUseCase.getAllUsers(this@MainViewModel)
                .let { response ->
                    if (response != null) {
                        getAllUsers = response
                        _apiCallEvent.postValue(ScreenState.LOADING)
                    } else _apiCallEvent.postValue(ScreenState.ERROR)

                }
        }
    }

    override fun onError(msg: String) {
        errorMessage = msg
    }

    override fun onError(errorType: ErrorType) {
        apiErrorType = errorType
    }
}