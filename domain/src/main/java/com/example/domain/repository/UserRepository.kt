package com.example.domain.repository

import com.example.domain.dto.datasource.user.response.DomainUserInfo
import com.example.domain.utils.RemoteErrorEmitter

interface UserRepository {
    suspend fun getAllUsers(remoteErrorEmitter: RemoteErrorEmitter): List<DomainUserInfo>?
}