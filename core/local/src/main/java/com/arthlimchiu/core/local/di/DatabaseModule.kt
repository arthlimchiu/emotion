package com.arthlimchiu.core.local.di

import android.content.Context
import com.arthlimchiu.core.local.EmotionDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun providesEmotionDatabase(@ApplicationContext context: Context): EmotionDatabase {
        return EmotionDatabase.getInstance(context)
    }

    @Provides
    fun providesLevelDao(database: EmotionDatabase) = database.levelDao()

    @Provides
    fun providesActivityDao(database: EmotionDatabase) = database.activityDao()
}