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

public val NodesGroup.MethodReference: IntellijIconData
    get() {
        if (_methodReference != null) {
            return _methodReference!!
        }
        _methodReference = IntellijIconData(name = "MethodReference",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { MethodReferenceComposable(it) })
        return _methodReference!!
    }

private var _methodReference: IntellijIconData? = null

private fun MethodReferenceComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MethodReference", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.redFill), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.0f, 4.0f)
        lineTo(6.2112f, 3.8944f)
        curveTo(7.3373f, 3.3314f, 8.6627f, 3.3314f, 9.7888f, 3.8944f)
        lineTo(10.0f, 4.0f)
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0657f, 5.2457f)
        curveTo(9.2536f, 5.2457f, 8.636f, 5.6473f, 8.2959f, 6.3154f)
        curveTo(8.0037f, 5.6426f, 7.4055f, 5.2457f, 6.6071f, 5.2457f)
        curveTo(5.8492f, 5.2457f, 5.2815f, 5.6095f, 4.9619f, 6.2486f)
        verticalLineTo(5.3719f)
        horizontalLineTo(4.0f)
        verticalLineTo(10.7543f)
        horizontalLineTo(4.9987f)
        verticalLineTo(7.59f)
        curveTo(4.9987f, 6.6807f, 5.5138f, 6.1077f, 6.3285f, 6.1077f)
        curveTo(7.0749f, 6.1077f, 7.5059f, 6.6176f, 7.5059f, 7.4376f)
        verticalLineTo(10.7543f)
        horizontalLineTo(8.4941f)
        verticalLineTo(7.59f)
        curveTo(8.4941f, 6.6807f, 9.0197f, 6.1077f, 9.8239f, 6.1077f)
        curveTo(10.5756f, 6.1077f, 11.0013f, 6.6176f, 11.0013f, 7.4376f)
        verticalLineTo(10.7543f)
        horizontalLineTo(12.0f)
        verticalLineTo(7.3587f)
        curveTo(12.0f, 6.071f, 11.2168f, 5.2457f, 10.0657f, 5.2457f)
        close()
    }
}
.build()
