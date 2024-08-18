package com.arthlimchiu.emotion.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arthlimchiu.core.ui.modifier.dropShadow
import com.arthlimchiu.core.ui.theme.EmotionTheme
import com.arthlimchiu.emotion.R

@Composable
fun EmotionTopBar() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .windowInsetsPadding(WindowInsets.statusBars)
    ) {
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Min)
                .padding(horizontal = 16.dp)
        ) {
            Image(
                painterResource(id = R.drawable.ic_emotion),
                contentDescription = "emotion icon",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp, top = 4.dp),
            ) {
                Text(
                    text = "Taming temper",
                    style = MaterialTheme.typography.bodyLarge
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    LinearProgressIndicator(
                        progress = { 0.7f },
                        modifier = Modifier.width(72.dp),
                        color = EmotionTheme.colors.purplishBlue,
                        strokeCap = StrokeCap.Round
                    )
                    Text(
                        text = "3%",
                        modifier = Modifier.padding(start = 8.dp),
                        color = EmotionTheme.colors.purplishBlue,
                        fontSize = 10.sp,
                        style = MaterialTheme.typography.labelSmall
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painterResource(id = R.drawable.ic_fire),
                    contentDescription = "emotion icon"
                )
                Text(
                    text = "0",
                    modifier = Modifier.padding(top = 2.dp, end = 16.dp),
                    color = EmotionTheme.colors.purplishBlue,
                    style = MaterialTheme.typography.titleLarge
                )
            }
            Box(
                modifier = Modifier
                    .padding()
                    .align(Alignment.CenterVertically)
                    .dropShadow(shape = CircleShape, blur = 6.dp, offsetY = 2.dp)
                    .drawBehind {
                        drawCircle(color = Color.White)
                        drawCircle(
                            color = Color.LightGray.copy(alpha = 0.5f),
                            style = Stroke(width = 3f)
                        )
                    }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_avatar),
                    contentDescription = "avatar",
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 14.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun AheadTopBarPreview() {
    EmotionTheme {
        Surface {
            EmotionTopBar()
        }
    }
}