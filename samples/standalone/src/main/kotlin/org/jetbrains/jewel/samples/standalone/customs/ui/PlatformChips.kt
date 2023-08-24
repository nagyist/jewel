package org.jetbrains.jewel.samples.standalone.customs.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                Text(platform.name)
            }
        }
    }
}
