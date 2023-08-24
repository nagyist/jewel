package org.jetbrains.jewel.samples.standalone.customs

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.jewel.samples.standalone.customs.ui.PlatformsTabContent
import org.jetbrains.jewel.samples.standalone.customs.data.Platform
import org.jetbrains.jewel.themes.intui.standalone.IntUiTheme
import org.jetbrains.jewel.samples.standalone.customs.data.Target

fun main() = singleWindowApplication(
    title = "Platform Tab Implementation",
) {
    var isDark by remember { mutableStateOf(false) }
    val theme = if (isDark) IntUiTheme.dark() else IntUiTheme.light()

    val supportedPlatform = listOf(
        Platform(
            name = "Android",
            supportedTargets = listOf(
                Target("android"),
            )
        ),
        Platform(
            name = "Apple",
            supportedTargets = listOf(
                Target("iosX64"),
                Target("iosArm64"),
                Target("iosSimulatorArm64"),
                Target("macosArm64"),
                Target("macosX64"),
                Target("watchosArm32"),
                Target("watchosArm64"),
                Target("watchosSimulatorArm64"),
                Target("watchosX64"),
                Target("tvosArm64"),
                Target("tvosX64"),
                Target("tvsSimulatorArm64"),
            )
        ),
        Platform(
            name = "Java",
            supportedTargets = listOf(
                Target("jvm"),
            )
        ),
        Platform(
            name = "JavaScript",
            supportedTargets = listOf(
                Target("jsLegacy"),
                Target("jsIr"),
            )
        ),
        Platform(
            name = "Linux",
            supportedTargets = listOf(
                Target("linuxMipsel32"),
                Target("linuxArm64"),
                Target("linuxArm32Hfp"),
                Target("linuxX64"),
            )
        ),
        Platform(
            name = "Windows",
            supportedTargets = listOf(
                Target("mingwX64"),
                Target("mingwX86"),
            )
        ),
        Platform(
            name = "WebAssembly",
            supportedTargets = listOf(
                Target("wasm"),
                Target("wasm32"),
            )
        ),
    )

    IntUiTheme(theme) {
        PlatformsTabContent(supportedPlatform)
    }
}
