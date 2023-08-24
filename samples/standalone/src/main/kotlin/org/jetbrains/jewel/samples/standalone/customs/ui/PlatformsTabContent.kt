package org.jetbrains.jewel.samples.standalone.customs.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.samples.standalone.customs.copy.SpacingInnerElements
import org.jetbrains.jewel.samples.standalone.customs.copy.SpacingMainElements
import org.jetbrains.jewel.samples.standalone.customs.data.Platform

@Composable
fun PlatformsTabContent(supportedPlatforms: List<Platform>) {
    Column(verticalArrangement = Arrangement.spacedBy(SpacingMainElements())) {
        Column(verticalArrangement = Arrangement.spacedBy(SpacingInnerElements())) {
            PlatformChips(supportedPlatforms, Modifier.padding(8.dp))
        }
        Column(verticalArrangement = Arrangement.spacedBy(SpacingInnerElements())) {
            PlatformDetails(supportedPlatforms)
        }
    }
}
