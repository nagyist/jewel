@file:Suppress("UnstableApiUsage")

import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    jewel
    alias(libs.plugins.composeDesktop)
}

dependencies {
    implementation(libs.kotlin.reflect)
    implementation(libs.filePicker)
    implementation(projects.intUi.intUiStandalone)
    implementation(projects.intUi.intUiDecoratedWindow)
    implementation(projects.markdown.intUiStandaloneStyling)
    implementation(projects.markdown.extension.gfmAlerts)
    implementation(projects.markdown.extension.autolink)
    implementation(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material")
    }
    implementation(libs.intellijPlatform.icons)
}

java {
    toolchain {
        vendor = JvmVendorSpec.JETBRAINS
    }
}

kotlin {
    jvmToolchain {
        vendor = JvmVendorSpec.JETBRAINS
    }
}

compose.desktop {
    application {
        mainClass = "org.jetbrains.jewel.samples.standalone.MainKt"

        jvmArgs("-Dorg.jetbrains.jewel.debug=true")

        nativeDistributions {
            targetFormats(TargetFormat.Dmg)
            packageName = "Jewel Sample"
            packageVersion = "1.0"
            description = "Jewel Sample Application"
            vendor = "JetBrains"
            licenseFile = rootProject.file("LICENSE")

            macOS {
                dockName = "Jewel Sample"
                bundleID = "org.jetbrains.jewel.sample.standalone"
                iconFile = file("icons/jewel.icns")
            }
        }
    }
}

val jdkLevel = project.property("jdk.level") as String
tasks {
    withType<JavaExec> {
        // afterEvaluate is needed because the Compose Gradle Plugin
        // register the task in the afterEvaluate block
        afterEvaluate {
            javaLauncher =
                project.javaToolchains.launcherFor {
                    languageVersion = JavaLanguageVersion.of(jdkLevel)
                }
            setExecutable(javaLauncher.map { it.executablePath.asFile.absolutePath }.get())
        }
    }
}
