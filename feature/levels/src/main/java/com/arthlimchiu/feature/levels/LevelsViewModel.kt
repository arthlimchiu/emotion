package com.arthlimchiu.feature.levels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arthlimchiu.core.data.days.DaysRepository
import com.arthlimchiu.core.data.levels.LevelsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LevelsViewModel @Inject constructor(
    private val daysRepository: DaysRepository,
    private val levelsRepository: LevelsRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(LevelsUiState())
    val uiState: StateFlow<LevelsUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            val days = daysRepository.getDays()
            _uiState.update { it.copy(days = days) }

            levelsRepository
                .getLevels()
                .collect { levels ->
                    _uiState.update { it.copy(levels = levels) }
                }
        }
    }
}