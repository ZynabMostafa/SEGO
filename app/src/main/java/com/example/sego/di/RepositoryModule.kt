package com.example.sego.di

import com.example.sego.data.Repository.remot.RemoteRepositoryImp
import com.example.sego.data.remot.ApiService
import com.example.sego.domain.reposatory.remot.RemoteRepository
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
    fun provideRemoteRepository(apiService: ApiService): RemoteRepository {
        return RemoteRepositoryImp(apiService)
    }
}