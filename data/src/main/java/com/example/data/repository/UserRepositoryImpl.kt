package com.example.data.repository

import com.example.data.mapper.UserMapper
import com.example.data.repository.remote.datasource.UserDataSource
import com.example.domain.dto.datasource.user.response.DomainGetAllUsersResponse
import com.example.domain.repository.UserRepository
import com.example.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDataSource: UserDataSource,
) : UserRepository {
    override suspend fun getAllUsers(remoteErrorEmitter: RemoteErrorEmitter): DomainGetAllUsersResponse? {
        return UserMapper.getAllUsersMapper(userDataSource.getAllUsers(remoteErrorEmitter))
    }
}