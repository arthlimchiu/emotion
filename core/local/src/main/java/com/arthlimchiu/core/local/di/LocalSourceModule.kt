package com.arthlimchiu.core.local.di

import com.arthlimchiu.core.local.level.LevelsLocalSource
import com.arthlimchiu.core.local.level.LevelsLocalSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class LocalSourceModule {

    @Binds
    abstract fun bindLevelsLocalSource(local: LevelsLocalSourceImpl): LevelsLocalSource

}