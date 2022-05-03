package com.example.gcms_andmin.di

import com.example.data.remote.api.UserApi
import com.example.data.repository.remote.datasouceImpl.UserDataSourceImpl
import com.example.data.repository.remote.datasource.UserDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    @Singleton
    fun provideUserDataSource(
        userApi: UserApi
    ): UserDataSource {
        return UserDataSourceImpl(
            userApi
        )
    }
}