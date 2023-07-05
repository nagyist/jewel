package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Layout: IntellijIconData
    get() {
        if (_layout != null) {
            return _layout!!
        }
        _layout = IntellijIconData(imageVector = { LayoutComposable(it) })
        return _layout!!
    }

private var _layout: IntellijIconData? = null

private fun LayoutComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Layout", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(6.9999f, 3.0f)
        lineTo(3.9999f, 3.0f)
        curveTo(3.4476f, 3.0f, 2.9999f, 3.4477f, 2.9999f, 4.0f)
        lineTo(2.9999f, 12.0f)
        curveTo(2.9999f, 12.5523f, 3.4476f, 13.0f, 3.9999f, 13.0f)
        lineTo(6.9999f, 13.0f)
        lineTo(6.9999f, 8.0f)
        lineTo(6.9999f, 7.0f)
        lineTo(6.9999f, 3.0f)
        close()
        moveTo(7.9999f, 3.0f)
        lineTo(7.9999f, 7.0f)
        lineTo(12.9999f, 7.0f)
        lineTo(12.9999f, 4.0f)
        curveTo(12.9999f, 3.4477f, 12.5522f, 3.0f, 11.9999f, 3.0f)
        lineTo(7.9999f, 3.0f)
        close()
        moveTo(7.9999f, 8.0f)
        lineTo(7.9999f, 13.0f)
        lineTo(11.9999f, 13.0f)
        curveTo(12.5522f, 13.0f, 12.9999f, 12.5523f, 12.9999f, 12.0f)
        lineTo(12.9999f, 8.0f)
        lineTo(7.9999f, 8.0f)
        close()
        moveTo(3.9999f, 2.0f)
        curveTo(2.8954f, 2.0f, 1.9999f, 2.8954f, 1.9999f, 4.0f)
        lineTo(1.9999f, 12.0f)
        curveTo(1.9999f, 13.1046f, 2.8954f, 14.0f, 3.9999f, 14.0f)
        lineTo(11.9999f, 14.0f)
        curveTo(13.1045f, 14.0f, 13.9999f, 13.1046f, 13.9999f, 12.0f)
        lineTo(13.9999f, 4.0f)
        curveTo(13.9999f, 2.8954f, 13.1045f, 2.0f, 11.9999f, 2.0f)
        lineTo(3.9999f, 2.0f)
        close()
    }
}
.build()
