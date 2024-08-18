package com.arthlimchiu.core.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.arthlimchiu.core.local.activity.dao.ActivityDao
import com.arthlimchiu.core.local.activity.entity.ActivityEntity
import com.arthlimchiu.core.local.level.dao.LevelDao
import com.arthlimchiu.core.local.level.entity.LevelEntity

@Database(
    entities = [
        LevelEntity::class,
        ActivityEntity::class,
    ],
    version = 1,
    exportSchema = false
)
abstract class EmotionDatabase : RoomDatabase() {

    abstract fun levelDao(): LevelDao

    abstract fun activityDao(): ActivityDao

    companion object {
        @Volatile
        private var instance: EmotionDatabase? = null

        fun getInstance(context: Context): EmotionDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): EmotionDatabase {
            return Room
                .databaseBuilder(context, EmotionDatabase::class.java, "emotion-db")
                .fallbackToDestructiveMigration() // Don't use this for production and instead use migrations
                .build()
        }
    }
}