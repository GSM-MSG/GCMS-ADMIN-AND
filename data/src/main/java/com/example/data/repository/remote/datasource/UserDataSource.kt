package com.example.data.repository.remote.datasource

import com.example.data.remote.dto.datasource.user.response.DataUserInfo
import com.example.domain.utils.RemoteErrorEmitter

interface UserDataSource {
    suspend fun getAllUsers(remoteErrorEmitter: RemoteErrorEmitter): List<DataUserInfo>?
}