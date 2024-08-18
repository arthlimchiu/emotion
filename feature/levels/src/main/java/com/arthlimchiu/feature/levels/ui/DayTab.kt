package com.arthlimchiu.feature.levels.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.arthlimchiu.core.ui.theme.EmotionTheme
import com.arthlimchiu.feature.levels.R

@Composable
fun DayTab(
    name: String,
    selected: Boolean = false,
    onClick: (() -> Unit)? = null
) {
    Tab(selected = selected, onClick = { onClick?.invoke() }) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = if (selected) {
                    painterResource(id = R.drawable.ic_circle_filled_selected)
                } else {
                    painterResource(id = R.drawable.ic_circle_outline)
                },
                contentDescription = "tab indicator"
            )
            Text(
                text = name,
                modifier = Modifier.padding(top = 12.dp, bottom = 8.dp),
                color = if (selected) EmotionTheme.colors.purplishBlue else EmotionTheme.colors.dawn,
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}