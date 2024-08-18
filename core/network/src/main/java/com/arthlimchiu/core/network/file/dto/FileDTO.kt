package com.arthlimchiu.core.network.file.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FileDTO(
    @SerialName("url") val url: String
)