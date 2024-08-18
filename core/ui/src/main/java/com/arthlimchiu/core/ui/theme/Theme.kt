package com.arthlimchiu.core.ui.theme

import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme()

private val emotionColors = EmotionColors()

@Composable
fun EmotionTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalEmotionColors provides emotionColors) {
        MaterialTheme(
            colorScheme = LightColorScheme,
            typography = Typography,
            content = {
                CompositionLocalProvider(
                    LocalRippleTheme provides DisabledRippleTheme,
                    content = content
                )
            }
        )
    }
}

object EmotionTheme {
    val colors: EmotionColors
        @Composable
        get() = LocalEmotionColors.current
}

private object DisabledRippleTheme : RippleTheme {

    @Composable
    override fun defaultColor(): Color = Color.Transparent

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleAlpha(0f, 0f, 0f, 0f)
}