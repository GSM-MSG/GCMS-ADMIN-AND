package com.example.data.mapper

import com.example.data.remote.dto.datasource.user.response.DataGetAllUsersResponse
import com.example.domain.dto.datasource.user.response.DomainGetAllUsersResponse

object UserMapper {

    fun getAllUsersMapper(
        dataResponse: DataGetAllUsersResponse?
    ): DomainGetAllUsersResponse? {
        return if (dataResponse != null) {
            DomainGetAllUsersResponse(
                email = dataResponse.email,
                name = dataResponse.name,
                grade = dataResponse.grade,
            )
        } else dataResponse
    }

}