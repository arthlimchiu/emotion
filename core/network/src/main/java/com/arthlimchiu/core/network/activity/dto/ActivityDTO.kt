package com.arthlimchiu.core.network.activity.dto

import com.arthlimchiu.core.network.icon.dto.IconDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ActivityDTO(
    @SerialName("id") val id: String,
    @SerialName("title") val title: String,
    @SerialName("icon") val icon: IconDTO
)