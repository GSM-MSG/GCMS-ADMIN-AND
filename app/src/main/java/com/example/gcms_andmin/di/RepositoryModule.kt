package com.example.gcms_andmin.di

import com.example.data.repository.UserRepositoryImpl
import com.example.data.repository.remote.datasource.UserDataSource
import com.example.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

     @Provides
     fun provideUserRepository(
         userDataSource: UserDataSource
     ) : UserRepository {
         return UserRepositoryImpl(
             userDataSource
         )
     }
}