package com.arthlimchiu.core.network.level.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LevelsDTO(
    @SerialName("levels") val levels: List<LevelDTO>
)