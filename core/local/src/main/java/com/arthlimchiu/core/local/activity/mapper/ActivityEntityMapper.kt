package com.arthlimchiu.core.local.activity.mapper

import com.arthlimchiu.core.local.activity.entity.ActivityEntity
import com.arthlimchiu.core.local.icon.mapper.asEntity
import com.arthlimchiu.core.local.icon.mapper.asExternalModel
import com.arthlimchiu.core.model.Activity

internal fun ActivityEntity.asExternalModel(): Activity {
    return Activity(
        id = activityId,
        title = title,
        icon = icon.asExternalModel()
    )
}

internal fun Activity.asEntity(levelId: Long): ActivityEntity {
    return ActivityEntity(
        activityId = id,
        levelId = levelId,
        title = title,
        icon = icon.asEntity()
    )
}