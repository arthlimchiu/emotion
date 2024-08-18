package com.arthlimchiu.feature.levels

import com.arthlimchiu.core.model.Day
import com.arthlimchiu.core.model.Level

data class LevelsUiState(
    val days: List<Day> = emptyList(),
    val levels: List<Level> = emptyList()
)