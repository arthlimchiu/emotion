package com.arthlimchiu.core.network.level.dto

import com.arthlimchiu.core.network.activity.dto.ActivityDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LevelDTO(
    @SerialName("level") val level: String,
    @SerialName("title") val title: String,
    @SerialName("description") val description: String,
    @SerialName("activities") val activities: List<ActivityDTO>
)