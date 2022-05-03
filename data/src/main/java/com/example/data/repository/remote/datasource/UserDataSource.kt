package com.example.data.repository.remote.datasource

import com.example.data.remote.dto.datasource.user.response.DataGetAllUsersResponse
import com.example.domain.utils.RemoteErrorEmitter
import retrofit2.Response

interface UserDataSource {
    suspend fun getAllUsers(remoteErrorEmitter: RemoteErrorEmitter): DataGetAllUsersResponse?
}