package com.example.domain.repository

import com.example.domain.dto.datasource.user.response.DomainGetAllUsersResponse
import com.example.domain.utils.RemoteErrorEmitter
import retrofit2.Response
import retrofit2.http.Body

interface UserRepository {
    suspend fun getAllUsers(remoteErrorEmitter: RemoteErrorEmitter): DomainGetAllUsersResponse?
}