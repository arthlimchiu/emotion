package com.arthlimchiu.core.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.arthlimchiu.core.ui.R

val euclidFamily = FontFamily(
    Font(R.font.euclid_circular_b_medium, FontWeight.Medium),
    Font(R.font.euclid_circular_b_regular, FontWeight.Normal),
    Font(R.font.euclid_circular_b_bold, FontWeight.Bold),
    Font(R.font.euclid_circular_b_semibold, FontWeight.SemiBold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    ),
    displayMedium = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 52.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displaySmall = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 42.sp,
        lineHeight = 44.0.sp,
        letterSpacing = 0.0.sp,
    ),
    headlineLarge = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 33.sp,
        lineHeight = 40.0.sp,
        letterSpacing = 0.0.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
        lineHeight = 36.0.sp,
        letterSpacing = 0.0.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
        lineHeight = 32.0.sp,
        letterSpacing = 0.0.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 26.0.sp,
        letterSpacing = 0.0.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 30.0.sp,
        letterSpacing = 0.0.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.0.sp,
        letterSpacing = 0.0.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 18.0.sp,
        letterSpacing = 0.0.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.0.sp,
        letterSpacing = 0.2.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 18.0.sp,
        letterSpacing = 0.0.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.0.sp,
        letterSpacing = 0.1.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 18.0.sp,
        letterSpacing = 0.0.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = euclidFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 15.0.sp,
        letterSpacing = 0.0.sp,
    )
)