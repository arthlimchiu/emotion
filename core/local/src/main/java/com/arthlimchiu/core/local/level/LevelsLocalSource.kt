package com.arthlimchiu.core.local.level

import com.arthlimchiu.core.model.Level
import kotlinx.coroutines.flow.Flow

interface LevelsLocalSource {

    suspend fun getLevels(): Flow<List<Level>>

    suspend fun saveLevels(levels: List<Level>)
}