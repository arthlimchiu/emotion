package com.arthlimchiu.core.local.level.entity

import androidx.room.Embedded
import androidx.room.Relation
import com.arthlimchiu.core.local.activity.entity.ActivityEntity

data class LevelWithActivitiesEntity(
    @Embedded val level: LevelEntity,
    @Relation(
        parentColumn = "level_id",
        entityColumn = "level_id"
    )
    val activities: List<ActivityEntity>
)