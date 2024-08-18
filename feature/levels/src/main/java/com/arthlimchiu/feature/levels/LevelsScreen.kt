package com.arthlimchiu.feature.levels

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.arthlimchiu.core.model.Day
import com.arthlimchiu.core.model.Level
import com.arthlimchiu.feature.levels.ui.ActivityTile
import com.arthlimchiu.feature.levels.ui.DayTabs
import com.arthlimchiu.feature.levels.ui.LevelHeader

@Composable
fun LevelsScreen(
    viewModel: LevelsViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    var selectedTabIndex by remember { mutableIntStateOf(0) }

    LevelsScreen(
        days = uiState.days,
        levels = uiState.levels,
        selectedTabIndex = selectedTabIndex,
        onDayTabSelected = { index -> selectedTabIndex = index }
    )
}

@Composable
fun LevelsScreen(
    days: List<Day>,
    levels: List<Level>,
    selectedTabIndex: Int,
    onDayTabSelected: ((Int) -> Unit)? = null
) {
    Column {
        DayTabs(
            days = days,
            selectedTabIndex = selectedTabIndex,
            onClick = { index -> onDayTabSelected?.invoke(index) }
        )
        LevelsGrid(
            levels = levels,
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize()
        )
    }
}

@Composable
fun LevelsGrid(
    modifier: Modifier = Modifier,
    levels: List<Level> = emptyList(),
    columns: GridCells = GridCells.Fixed(2),
    state: LazyGridState = rememberLazyGridState(),
    contentPadding: PaddingValues = PaddingValues(horizontal = 36.dp, vertical = 24.dp),
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(24.dp),
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(24.dp)
) {
    LazyVerticalGrid(
        columns = columns,
        modifier = modifier,
        state = state,
        contentPadding = contentPadding,
        verticalArrangement = verticalArrangement,
        horizontalArrangement = horizontalArrangement
    ) {
        levels.forEach { level ->
            item(span = { GridItemSpan(2) }) {
                LevelHeader(
                    level = level.level,
                    title = level.title,
                    description = level.description
                )
            }
            level.activities.forEachIndexed { index, activity ->
                item(span = {
                    if (index == level.activities.lastIndex && index % 2 == 0) {
                        GridItemSpan(2)
                    } else {
                        GridItemSpan(1)
                    }
                }) {
                    ActivityTile(
                        imageUrl = activity.icon.file.url,
                        title = activity.title
                    )
                }
            }
        }
    }
}