package com.arthlimchiu.emotion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.arthlimchiu.core.ui.theme.EmotionTheme
import com.arthlimchiu.emotion.component.EmotionBottomNavigationBar
import com.arthlimchiu.emotion.component.EmotionTopBar
import com.arthlimchiu.feature.levels.LevelsScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmotionTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { EmotionTopBar() },
                    bottomBar = { EmotionBottomNavigationBar() }
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxSize()
                            .padding(innerPadding)
                            .padding(top = 24.dp)
                    ) {
                        LevelsScreen()
                    }
                }
            }
        }
    }
}