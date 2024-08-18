package com.arthlimchiu.core.network.level

import android.content.Context
import com.arthlimchiu.core.model.Level
import com.arthlimchiu.core.network.level.dto.LevelsDTO
import com.arthlimchiu.core.network.level.mapper.asExternalModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.serialization.json.Json
import javax.inject.Inject

class LevelsRemoteSourceImpl @Inject constructor(
    @ApplicationContext private val applicationContext: Context
) : LevelsRemoteSource {

    override suspend fun getLevels(): List<Level> {
        applicationContext.assets.open("sample_response.json").bufferedReader().use { reader ->
            return Json { ignoreUnknownKeys = true }
                .decodeFromString<LevelsDTO>(reader.readText())
                .levels
                .map { it.asExternalModel() }
        }
    }
}