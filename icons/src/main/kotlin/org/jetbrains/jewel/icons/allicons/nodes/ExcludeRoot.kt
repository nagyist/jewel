package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.ExcludeRoot: IntellijIconData
    get() {
        if (_excludeRoot != null) {
            return _excludeRoot!!
        }
        _excludeRoot = IntellijIconData(name = "ExcludeRoot",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ExcludeRootComposable(it) })
        return _excludeRoot!!
    }

private var _excludeRoot: IntellijIconData? = null

private fun ExcludeRootComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ExcludeRoot", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.orangeFill), stroke = SolidColor(Color(0xFFF28C35)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.1513f, 4.3584f)
        lineTo(8.2969f, 4.5f)
        horizontalLineTo(8.5f)
        horizontalLineTo(13.0f)
        curveTo(13.8284f, 4.5f, 14.5f, 5.1716f, 14.5f, 6.0f)
        verticalLineTo(12.1333f)
        curveTo(14.5f, 12.919f, 13.9104f, 13.5f, 13.25f, 13.5f)
        horizontalLineTo(2.75f)
        curveTo(2.0896f, 13.5f, 1.5f, 12.919f, 1.5f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(1.5f, 3.081f, 2.0896f, 2.5f, 2.75f, 2.5f)
        horizontalLineTo(6.0382f)
        curveTo(6.1685f, 2.5f, 6.2936f, 2.5508f, 6.3869f, 2.6416f)
        lineTo(8.1513f, 4.3584f)
        close()
    }
}
.build()
