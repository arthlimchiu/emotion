package com.arthlimchiu.core.data.days

import com.arthlimchiu.core.model.Day

interface DaysRepository {

    suspend fun getDays(): List<Day>
}