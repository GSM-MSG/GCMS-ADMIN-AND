package com.example.domain.usecase

import com.example.domain.repository.UserRepository
import com.example.domain.utils.RemoteErrorEmitter
import retrofit2.http.Body
import javax.inject.Inject

class GetAllUsersUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend fun getAllUsers(remoteErrorEmitter: RemoteErrorEmitter) = userRepository.getAllUsers(remoteErrorEmitter)
}