package com.arthlimchiu.core.network.di

import com.arthlimchiu.core.network.level.LevelsRemoteSource
import com.arthlimchiu.core.network.level.LevelsRemoteSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class RemoteSourceModule {

    @Binds
    abstract fun bindLevelsRemoteSource(remote: LevelsRemoteSourceImpl): LevelsRemoteSource
}