package com.example.data.mapper

import com.example.data.remote.dto.datasource.user.response.DataGetAllUsersResponse
import com.example.data.remote.dto.datasource.user.response.DataUserInfo
import com.example.domain.dto.datasource.user.response.DomainGetAllUsersResponse
import com.example.domain.dto.datasource.user.response.DomainUserInfo

object UserMapper {

    fun getAllUsersMapper(
        dataResponse: List<DataUserInfo>?
    ): List<DomainUserInfo>? {
        return if (dataResponse != null) {
            List<DomainUserInfo>(

            )
        } else dataResponse
    }

}