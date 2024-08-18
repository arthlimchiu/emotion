package com.arthlimchiu.core.network.level

import com.arthlimchiu.core.model.Level

interface LevelsRemoteSource {

    suspend fun getLevels(): List<Level>
}