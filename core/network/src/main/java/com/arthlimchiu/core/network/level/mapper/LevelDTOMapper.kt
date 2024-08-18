package com.arthlimchiu.core.network.level.mapper

import com.arthlimchiu.core.model.Level
import com.arthlimchiu.core.network.activity.mapper.asExternalModel
import com.arthlimchiu.core.network.level.dto.LevelDTO

internal fun LevelDTO.asExternalModel(): Level {
    return Level(
        level = level,
        title = title,
        description = description,
        activities = activities.map { it.asExternalModel() }
    )
}