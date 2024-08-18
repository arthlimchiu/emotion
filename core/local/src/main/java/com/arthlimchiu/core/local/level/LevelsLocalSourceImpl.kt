package com.arthlimchiu.core.local.level

import com.arthlimchiu.core.local.activity.dao.ActivityDao
import com.arthlimchiu.core.local.activity.mapper.asEntity
import com.arthlimchiu.core.local.level.dao.LevelDao
import com.arthlimchiu.core.local.level.mapper.asEntity
import com.arthlimchiu.core.local.level.mapper.asExternalModel
import com.arthlimchiu.core.model.Level
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LevelsLocalSourceImpl @Inject constructor(
    private val levelDao: LevelDao,
    private val activityDao: ActivityDao
) : LevelsLocalSource {

    override suspend fun getLevels(): Flow<List<Level>> {
        return levelDao
            .getAll()
            .map { levelWithActivities ->
                levelWithActivities.map { it.asExternalModel() }
            }
    }

    override suspend fun saveLevels(levels: List<Level>) {
        levelDao.deleteLevelsAndActivities()
        levels.forEach { level ->
            val levelId = levelDao.insertLevel(level.asEntity())
            level.activities.forEach { activity ->
                activityDao.insertActivity(activity.asEntity(levelId))
            }
        }
    }
}