package com.arthlimchiu.core.local.level.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "level")
data class LevelEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo("level_id") val levelId: Long,
    @ColumnInfo(name = "level") val level: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "description") val description: String
)