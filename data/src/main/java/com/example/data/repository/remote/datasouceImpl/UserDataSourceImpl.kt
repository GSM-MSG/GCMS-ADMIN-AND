package com.example.data.repository.remote.datasouceImpl

import com.example.data.remote.api.UserApi
import com.example.data.remote.dto.datasource.user.response.DataUserInfo
import com.example.data.repository.remote.datasource.UserDataSource
import com.example.data.utils.base.BaseDataSource
import com.example.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class UserDataSourceImpl @Inject constructor(
    private val userApi: UserApi
) : BaseDataSource(), UserDataSource {
    override suspend fun getAllUsers(remoteErrorEmitter: RemoteErrorEmitter): List<DataUserInfo>? {
        return safeApiCall(remoteErrorEmitter) {
            userApi.getAllUsers()
        }
    }
}