package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartRadar: ImageVector
    get() {
        val current = _chartRadar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChartRadar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v10 m4 6 3.09 -8.12 L12 4.1 3.47 9.44 6.67 20z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // m 4 6
                moveToRelative(dx = 4.0f, dy = 6.0f)
                // l 3.09 -8.12
                lineToRelative(dx = 3.09f, dy = -8.12f)
                // L 12 4.1
                lineTo(x = 12.0f, y = 4.1f)
                // L 3.47 9.44
                lineTo(x = 3.47f, y = 9.44f)
                // L 6.67 20z
                lineTo(x = 6.67f, y = 20.0f)
                close()
            }
            // m2 9 10 3 6 9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 9
                moveTo(x = 2.0f, y = 9.0f)
                // l 10 3
                lineToRelative(dx = 10.0f, dy = 3.0f)
                // l 6 9
                lineToRelative(dx = 6.0f, dy = 9.0f)
            }
            // m6 21 6 -9 10 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 21
                moveTo(x = 6.0f, y = 21.0f)
                // l 6 -9
                lineToRelative(dx = 6.0f, dy = -9.0f)
                // l 10 -3
                lineToRelative(dx = 10.0f, dy = -3.0f)
            }
        }.build().also { _chartRadar = it }
    }

@Suppress("ObjectPropertyName")
private var _chartRadar: ImageVector? = null
