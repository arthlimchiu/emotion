package com.arthlimchiu.feature.levels.ui

import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.arthlimchiu.core.model.Day
import com.arthlimchiu.core.ui.theme.EmotionTheme

@Composable
fun DayTabs(
    days: List<Day>,
    modifier: Modifier = Modifier,
    selectedTabIndex: Int = 0,
    onClick: ((index: Int) -> Unit)? = null
) {
    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier,
        containerColor = Color.White,
        indicator = { tabPositions ->
            if (selectedTabIndex < tabPositions.size) {
                TabRowDefaults.SecondaryIndicator(
                    modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                    height = 2.dp
                )
            }
        },
        divider = {
            HorizontalDivider(thickness = 2.dp, color = EmotionTheme.colors.mercury)
        }
    ) {
        days.forEachIndexed { index, day ->
            DayTab(
                name = day.name,
                selected = index == selectedTabIndex,
                onClick = { onClick?.invoke(index) }
            )
        }
    }
}