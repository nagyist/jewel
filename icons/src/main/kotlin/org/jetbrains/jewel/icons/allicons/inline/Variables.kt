package org.jetbrains.jewel.icons.allicons.`inline`

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.InlineGroup

public val InlineGroup.Variables: IntellijIconData
    get() {
        if (_variables != null) {
            return _variables!!
        }
        _variables = IntellijIconData(imageVector = { VariablesComposable(it) })
        return _variables!!
    }

private var _variables: IntellijIconData? = null

private fun VariablesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Variables", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA8ADBD)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 1.5f)
        lineTo(12.0f, 1.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 3.0f)
        lineTo(13.5f, 13.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 14.5f)
        lineTo(4.0f, 14.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 13.0f)
        lineTo(2.5f, 3.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 1.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 5.0f)
        lineTo(10.5f, 5.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 5.5f)
        lineTo(11.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 6.0f)
        lineTo(5.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 5.5f)
        lineTo(5.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 5.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 7.5f)
        lineTo(10.5f, 7.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 8.0f)
        lineTo(11.0f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 8.5f)
        lineTo(5.5f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 8.0f)
        lineTo(5.0f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 7.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 10.0f)
        lineTo(10.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 10.5f)
        lineTo(11.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 11.0f)
        lineTo(5.5f, 11.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 10.5f)
        lineTo(5.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 10.0f)
        close()
    }
}
.build()
