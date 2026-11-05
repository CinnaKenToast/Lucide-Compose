package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartLine: ImageVector
    get() {
        val current = _chartLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChartLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 3 v16 a2 2 0 0 0 2 2 h16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
            }
            // m19 9 -5 5 -4 -4 -3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 9
                moveTo(x = 19.0f, y = 9.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
            }
        }.build().also { _chartLine = it }
    }

@Suppress("ObjectPropertyName")
private var _chartLine: ImageVector? = null
