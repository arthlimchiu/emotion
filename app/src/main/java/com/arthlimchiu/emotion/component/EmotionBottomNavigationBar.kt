package com.arthlimchiu.emotion.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arthlimchiu.core.ui.theme.EmotionTheme
import com.arthlimchiu.emotion.R

@Composable
fun EmotionBottomNavigationBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .windowInsetsPadding(WindowInsets.systemBars.exclude(WindowInsets.statusBars))
    ) {
        HorizontalDivider(color = EmotionTheme.colors.mercury)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.ic_journey),
                    contentDescription = "journey",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    text = stringResource(id = R.string.journey),
                    modifier = Modifier.padding(top = 8.dp),
                    color = EmotionTheme.colors.purplishBlue,
                    fontSize = 12.sp
                )
            }
        }
    }
}