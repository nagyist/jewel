package org.jetbrains.jewel.samples.standalone.customs.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.LocalTextStyle
import org.jetbrains.jewel.Text
import org.jetbrains.jewel.samples.standalone.customs.copy.TextSubHeaderMultiplier
import org.jetbrains.jewel.samples.standalone.customs.data.Platform

@Composable
fun PlatformDetails(supportedPlatforms: List<Platform>, modifier: Modifier = Modifier) {
    val themeIsDark = false

    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "Plaforms:",
            fontWeight = FontWeight.Bold,
            fontSize = LocalTextStyle.current.fontSize * TextSubHeaderMultiplier,
        )
    }
    supportedPlatforms.forEach { platform ->
        Row(

        ) {
            // Left
            Column(
                modifier = Modifier.width(120.dp)
            ) {
                Row() {
                    Text(
                        text = platform.name,
                        color = if (themeIsDark) Color.Gray else Color.Black,
                        modifier = Modifier.padding(end = 7.dp)
                    )
                    Text(
                        text = platform.supportedTargets.count().toString(),
                        color = Color.Gray,
                    )
                }
            }
            // Right
            Column(

            ) {
                platform.supportedTargets.forEach { target ->
                    Text(
                        text = target.name,
                        color = if (themeIsDark) Color.Gray else Color.Black,
                    )
                }
            }
        }
    }
}
