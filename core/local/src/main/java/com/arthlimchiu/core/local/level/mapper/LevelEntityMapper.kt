package com.arthlimchiu.core.local.level.mapper

import com.arthlimchiu.core.local.activity.mapper.asExternalModel
import com.arthlimchiu.core.local.level.entity.LevelEntity
import com.arthlimchiu.core.local.level.entity.LevelWithActivitiesEntity
import com.arthlimchiu.core.model.Level

internal fun LevelWithActivitiesEntity.asExternalModel(): Level {
    return Level(
        level = level.level,
        title = level.title,
        description = level.description,
        activities = activities.map { it.asExternalModel() }
    )
}

internal fun Level.asEntity(): LevelEntity {
    return LevelEntity(
        levelId = 0,
        level = level,
        title = title,
        description = description
    )
}