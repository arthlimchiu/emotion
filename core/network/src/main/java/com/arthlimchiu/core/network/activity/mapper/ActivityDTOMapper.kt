package com.arthlimchiu.core.network.activity.mapper

import com.arthlimchiu.core.model.Activity
import com.arthlimchiu.core.network.activity.dto.ActivityDTO
import com.arthlimchiu.core.network.icon.mapper.asExternalModel

internal fun ActivityDTO.asExternalModel(): Activity {
    return Activity(
        id = id,
        title = title,
        icon = icon.asExternalModel()
    )
}