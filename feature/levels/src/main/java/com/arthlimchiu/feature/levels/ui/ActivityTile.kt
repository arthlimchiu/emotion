package com.arthlimchiu.feature.levels.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.arthlimchiu.core.ui.components.PdfImage
import com.arthlimchiu.core.ui.theme.EmotionTheme

@Composable
fun ActivityTile(
    imageUrl: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        PdfImage(
            imageUrl = imageUrl,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(width = 148.dp, height = 136.dp)
        )
        Text(
            text = title,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 8.dp),
            color = EmotionTheme.colors.lead,
            style = MaterialTheme.typography.titleSmall,
            textAlign = TextAlign.Center
        )
    }
}