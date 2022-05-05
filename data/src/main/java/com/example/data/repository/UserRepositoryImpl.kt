package com.example.data.repository

import com.example.data.mapper.UserMapper
import com.example.data.repository.remote.datasource.UserDataSource
import com.example.domain.dto.datasource.user.response.DomainUserInfo
import com.example.domain.repository.UserRepository
import com.example.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDataSource: UserDataSource,
) : UserRepository {
    override suspend fun getAllUsers(remoteErrorEmitter: RemoteErrorEmitter): List<DomainUserInfo> {
        return userDataSource.getAllUsers(remoteErrorEmitter)!!.map {
            UserMapper.getAllUsersMapper(it)
        }
    }
}