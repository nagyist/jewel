package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.Newfolder: ImageVector
    get() {
        if (_newfolder != null) {
            return _newfolder!!
        }
        _newfolder = Builder(name = "Newfolder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 9.0f)
                curveTo(12.7761f, 9.0f, 13.0f, 9.2239f, 13.0f, 9.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.5f)
                curveTo(15.7761f, 12.0f, 16.0f, 12.2239f, 16.0f, 12.5f)
                curveTo(16.0f, 12.7761f, 15.7761f, 13.0f, 15.5f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.5f)
                curveTo(13.0f, 15.7761f, 12.7761f, 16.0f, 12.5f, 16.0f)
                curveTo(12.2239f, 16.0f, 12.0f, 15.7761f, 12.0f, 15.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.5f)
                curveTo(9.2239f, 13.0f, 9.0f, 12.7761f, 9.0f, 12.5f)
                curveTo(9.0f, 12.2239f, 9.2239f, 12.0f, 9.5f, 12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.5f)
                curveTo(12.0f, 9.2239f, 12.2239f, 9.0f, 12.5f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEBECF0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6333f, 2.0f)
                curveTo(1.7313f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
                verticalLineTo(12.1333f)
                curveTo(1.0f, 13.1643f, 1.7313f, 14.0f, 2.6333f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.5f)
                curveTo(8.0f, 11.6716f, 8.6716f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.5f)
                curveTo(11.0f, 8.6716f, 11.6716f, 8.0f, 12.5f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
                lineTo(8.4667f, 4.0f)
                lineTo(6.8434f, 2.3077f)
                curveTo(6.6548f, 2.1112f, 6.3941f, 2.0f, 6.1217f, 2.0f)
                horizontalLineTo(2.6333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6C707E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1217f, 3.0f)
                lineTo(2.6333f, 3.0f)
                curveTo(2.4048f, 3.0f, 2.0f, 3.2584f, 2.0f, 3.8667f)
                verticalLineTo(12.1333f)
                curveTo(2.0f, 12.7416f, 2.4048f, 13.0f, 2.6333f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.6333f)
                curveTo(1.7313f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
                verticalLineTo(3.8667f)
                curveTo(1.0f, 2.8357f, 1.7313f, 2.0f, 2.6333f, 2.0f)
                horizontalLineTo(6.1217f)
                curveTo(6.3941f, 2.0f, 6.6548f, 2.1112f, 6.8434f, 2.3077f)
                lineTo(8.4667f, 4.0f)
                lineTo(13.0f, 4.0f)
                curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                curveTo(14.0f, 5.4477f, 13.5523f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(8.0402f)
                lineTo(6.1217f, 3.0f)
                close()
            }
        }
        .build()
        return _newfolder!!
    }

private var _newfolder: ImageVector? = null
