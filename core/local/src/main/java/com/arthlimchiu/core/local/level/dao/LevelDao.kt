package com.arthlimchiu.core.local.level.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.arthlimchiu.core.local.level.entity.LevelEntity
import com.arthlimchiu.core.local.level.entity.LevelWithActivitiesEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LevelDao {

    @Query("SELECT * from level")
    @Transaction
    fun getAll(): Flow<List<LevelWithActivitiesEntity>>

    @Insert
    fun insertLevel(level: LevelEntity): Long

    @Query("DELETE from level")
    fun deleteAllLevels()

    @Query("DELETE from activity")
    fun deleteAllActivities()

    @Transaction
    fun deleteLevelsAndActivities() {
        deleteAllActivities()
        deleteAllLevels()
    }
}