package com.example.sego.di

import com.example.sego.data.Repository.RemoteRepositoryImp
import com.example.sego.data.remot.ApiService
import com.example.sego.domain.reposatory.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRemoteRepository(apiService: ApiService): Repository {
        return RemoteRepositoryImp(apiService)
    }
}