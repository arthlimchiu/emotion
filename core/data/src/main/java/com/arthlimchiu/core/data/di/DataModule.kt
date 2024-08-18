package com.arthlimchiu.core.data.di

import com.arthlimchiu.core.data.days.DaysRepository
import com.arthlimchiu.core.data.days.DaysRepositoryImpl
import com.arthlimchiu.core.data.levels.LevelsRepository
import com.arthlimchiu.core.data.levels.LevelsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class DataModule {

    @Binds
    abstract fun bindsLevelsRepository(repository: LevelsRepositoryImpl): LevelsRepository

    @Binds
    abstract fun bindsDaysRepository(repository: DaysRepositoryImpl): DaysRepository
}