package org.jetbrains.jewel.samples.standalone.customs.data

data class Platform(
    val name: String,
    val supportedTargets: List<Target>
)

data class Target(
    val name: String,
)
