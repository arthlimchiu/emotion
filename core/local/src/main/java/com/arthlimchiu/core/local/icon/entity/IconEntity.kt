package com.arthlimchiu.core.local.icon.entity

import androidx.room.ColumnInfo

data class IconEntity(
    @ColumnInfo("file_url") val fileUrl: String
)