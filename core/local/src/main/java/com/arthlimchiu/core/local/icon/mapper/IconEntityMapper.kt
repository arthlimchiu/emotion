package com.arthlimchiu.core.local.icon.mapper

import com.arthlimchiu.core.local.icon.entity.IconEntity
import com.arthlimchiu.core.model.File
import com.arthlimchiu.core.model.Icon

internal fun IconEntity.asExternalModel(): Icon {
    return Icon(
        file = File(url = fileUrl)
    )
}

internal fun Icon.asEntity(): IconEntity {
    return IconEntity(
        fileUrl = file.url
    )
}