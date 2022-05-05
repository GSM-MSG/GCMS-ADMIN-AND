package com.example.data.remote.api

import com.example.data.remote.dto.datasource.user.response.DataUserInfo
import retrofit2.http.GET

interface UserApi {
    @GET("user/users")
    suspend fun getAllUsers(): List<DataUserInfo>
}