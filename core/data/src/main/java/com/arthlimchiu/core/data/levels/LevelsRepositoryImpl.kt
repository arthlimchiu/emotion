package com.arthlimchiu.core.data.levels

import com.arthlimchiu.core.common.di.Dispatcher
import com.arthlimchiu.core.common.di.EmotionDispatchers
import com.arthlimchiu.core.local.level.LevelsLocalSource
import com.arthlimchiu.core.model.Level
import com.arthlimchiu.core.network.level.LevelsRemoteSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LevelsRepositoryImpl @Inject constructor(
    private val local: LevelsLocalSource,
    private val remote: LevelsRemoteSource,
    @Dispatcher(EmotionDispatchers.IO) private val ioDispatcher: CoroutineDispatcher
) : LevelsRepository {

    override suspend fun getLevels(): Flow<List<Level>> = withContext(ioDispatcher) {
        local.getLevels()
    }

    override suspend fun fetchLevels() {
        withContext(ioDispatcher) {
            val levels = remote.getLevels()
            local.saveLevels(levels)
        }
    }
}