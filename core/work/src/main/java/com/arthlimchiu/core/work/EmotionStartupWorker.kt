package com.arthlimchiu.core.work

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.arthlimchiu.core.data.levels.LevelsRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class EmotionStartupWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParams: WorkerParameters,
    private val levelsRepository: LevelsRepository
) : CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result {
        levelsRepository.fetchLevels()
        return Result.success()
    }
}