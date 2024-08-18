package com.arthlimchiu.core.data.days

import com.arthlimchiu.core.common.di.Dispatcher
import com.arthlimchiu.core.common.di.EmotionDispatchers
import com.arthlimchiu.core.model.Day
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DaysRepositoryImpl @Inject constructor(
    @Dispatcher(EmotionDispatchers.IO) private val ioDispatcher: CoroutineDispatcher
) : DaysRepository {

    override suspend fun getDays(): List<Day> = withContext(ioDispatcher) {
        listOf(
            Day(name = "MON"),
            Day(name = "TUE"),
            Day(name = "WED"),
            Day(name = "THU"),
            Day(name = "FRI"),
            Day(name = "SAT"),
            Day(name = "SUN")
        )
    }
}