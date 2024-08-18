package com.arthlimchiu.core.network.icon.dto

import com.arthlimchiu.core.network.file.dto.FileDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class IconDTO(
    @SerialName("file") val file: FileDTO
)