package com.example.gcms_andmin.di

import com.example.domain.repository.UserRepository
import com.example.domain.usecase.GetAllUsersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun providegetAllUsersUseCase(repository: UserRepository): GetAllUsersUseCase = GetAllUsersUseCase(repository)
}