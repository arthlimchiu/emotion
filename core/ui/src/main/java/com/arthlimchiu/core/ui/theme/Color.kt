package com.arthlimchiu.core.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class EmotionColors(
    val purplishBlue: Color = Color(0xFF6442EF),
    val lead: Color = Color(0xFF212121),
    val mercury: Color = Color(0xFFE6E6E6),
    val ironSideGrey: Color = Color(0xFF666666),
    val dawn: Color = Color(0xFFA2A2A2)
)

val LocalEmotionColors = staticCompositionLocalOf { EmotionColors() }