package com.arthlimchiu.core.network.icon.mapper

import com.arthlimchiu.core.model.Icon
import com.arthlimchiu.core.network.file.mapper.asExternalModel
import com.arthlimchiu.core.network.icon.dto.IconDTO

internal fun IconDTO.asExternalModel(): Icon {
    return Icon(
        file = file.asExternalModel()
    )
}