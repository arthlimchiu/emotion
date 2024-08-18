package com.arthlimchiu.core.data.levels

import com.arthlimchiu.core.model.Level
import kotlinx.coroutines.flow.Flow

interface LevelsRepository {

    suspend fun getLevels(): Flow<List<Level>>

    suspend fun fetchLevels()
}