package com.arthlimchiu.core.local.activity.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arthlimchiu.core.local.icon.entity.IconEntity

@Entity(tableName = "activity")
data class ActivityEntity(
    @PrimaryKey @ColumnInfo("activity_id") val activityId: String,
    @ColumnInfo(name = "level_id") val levelId: Long,
    @ColumnInfo(name = "title") val title: String,
    @Embedded(prefix = "icon_") val icon: IconEntity
)