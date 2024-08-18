package com.arthlimchiu.core.model

data class Level(
    val level: String,
    val title: String,
    val description: String,
    val activities: List<Activity>
)