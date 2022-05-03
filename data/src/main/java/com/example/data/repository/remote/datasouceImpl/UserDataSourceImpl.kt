package com.example.data.repository.remote.datasouceImpl

import com.example.data.remote.api.UserApi
import com.example.data.remote.dto.datasource.user.response.DataGetAllUsersResponse
import com.example.data.repository.remote.datasource.UserDataSource
import com.example.data.utils.base.BaseDataSource
import com.example.domain.utils.RemoteErrorEmitter
import retrofit2.Response
import javax.inject.Inject

class UserDataSourceImpl @Inject constructor(
    private val userApi: UserApi
) : BaseDataSource(), UserDataSource {
    override suspend fun getAllUsers(remoteErrorEmitter: RemoteErrorEmitter): DataGetAllUsersResponse? {
        return safeApiCall(remoteErrorEmitter) {
            userApi.getAllUsers()
        }?.body()
    }
}