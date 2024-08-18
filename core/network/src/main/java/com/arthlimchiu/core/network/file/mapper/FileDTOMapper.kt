package com.arthlimchiu.core.network.file.mapper

import com.arthlimchiu.core.model.File
import com.arthlimchiu.core.network.file.dto.FileDTO

internal fun FileDTO.asExternalModel(): File {
    return File(
        url = url
    )
}