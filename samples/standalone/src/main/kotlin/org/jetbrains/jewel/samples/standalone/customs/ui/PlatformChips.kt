package org.jetbrains.jewel.samples.standalone.customs.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.jewel.Chip
import org.jetbrains.jewel.Text
import org.jetbrains.jewel.samples.standalone.customs.data.Platform

@Composable
fun PlatformChips(supportedPlatforms: List<Platform>, modifier: Modifier = Modifier) {
    Row(modifier) {
        supportedPlatforms.forEach { platform ->
            Chip(
                enabled = true,
                onChipClick = {}
            ) {
                Text(
                    text = platform.name,
                    modifier = Modifier.padding(
                        horizontal = if (platform.name.length < 10) 6.dp else 12.dp
                    )
                )
            }
        }
    }
}
