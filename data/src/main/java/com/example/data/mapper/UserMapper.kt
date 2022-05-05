package com.example.data.mapper

import com.example.data.remote.dto.datasource.user.response.DataUserInfo
import com.example.domain.dto.datasource.user.response.DomainUserInfo

object UserMapper {

    fun getAllUsersMapper(dataUserInfo: DataUserInfo): DomainUserInfo {
        return DomainUserInfo(
            email = dataUserInfo.email,
            name = dataUserInfo.name,
            grade = dataUserInfo.grade,
        )
    }
}