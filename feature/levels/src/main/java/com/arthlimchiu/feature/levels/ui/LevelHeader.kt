package com.arthlimchiu.feature.levels.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arthlimchiu.core.ui.theme.EmotionTheme
import com.arthlimchiu.feature.levels.R

@Composable
fun LevelHeader(
    level: String,
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Box(
            modifier = modifier
                .width(IntrinsicSize.Min)
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_level),
                contentDescription = null,
                modifier = Modifier
                    .width(120.dp)
                    .align(Alignment.TopCenter)
                    .padding(bottom = 20.dp),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .background(color = EmotionTheme.colors.lead, shape = RoundedCornerShape(8.dp))
            ) {
                Text(
                    text = stringResource(id = R.string.level, level),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 4.dp, vertical = 8.dp),
                    color = Color.White,
                    style = MaterialTheme.typography.labelMedium,
                    textAlign = TextAlign.Center
                )
            }
        }
        Text(
            text = title,
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 24.dp),
            color = EmotionTheme.colors.lead,
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
        )
        Text(
            text = description,
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 8.dp),
            color = EmotionTheme.colors.ironSideGrey,
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
internal fun LevelPreview() {
    EmotionTheme {
        Surface {
            LevelHeader(
                level = "1",
                title = "Find your tools",
                description = "Collect the best ways for you to notice and manage anger"
            )
        }
    }
}