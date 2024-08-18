package com.arthlimchiu.core.local.activity.dao

import androidx.room.Dao
import androidx.room.Insert
import com.arthlimchiu.core.local.activity.entity.ActivityEntity

@Dao
interface ActivityDao {

    @Insert
    fun insertActivity(activity: ActivityEntity)
}