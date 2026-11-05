package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LandPlot: ImageVector
    get() {
        val current = _landPlot
        if (current != null) return current

        return ImageVector.Builder(
            name = "LandPlot",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12 8 6 -3 -6 -3 v10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // l 6 -3
                lineToRelative(dx = 6.0f, dy = -3.0f)
                // l -6 -3
                lineToRelative(dx = -6.0f, dy = -3.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
            }
            // m8 11.99 -5.5 3.14 a1 1 0 0 0 0 1.74 l8.5 4.86 a2 2 0 0 0 2 0 l8.5 -4.86 a1 1 0 0 0 0 -1.74 L16 12 m-9.51 .85 11.02 6.3 m0 -6.3 L6.5 19.15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 11.99
                moveTo(x = 8.0f, y = 11.99f)
                // l -5.5 3.14
                lineToRelative(dx = -5.5f, dy = 3.14f)
                // a 1 1 0 0 0 0 1.74
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.74f,
                )
                // l 8.5 4.86
                lineToRelative(dx = 8.5f, dy = 4.86f)
                // a 2 2 0 0 0 2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // l 8.5 -4.86
                lineToRelative(dx = 8.5f, dy = -4.86f)
                // a 1 1 0 0 0 0 -1.74
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.74f,
                )
                // L 16 12
                lineTo(x = 16.0f, y = 12.0f)
                // m -9.51 0.85
                moveToRelative(dx = -9.51f, dy = 0.85f)
                // l 11.02 6.3
                lineToRelative(dx = 11.02f, dy = 6.3f)
                // m 0 -6.3
                moveToRelative(dx = 0.0f, dy = -6.3f)
                // L 6.5 19.15
                lineTo(x = 6.5f, y = 19.15f)
            }
        }.build().also { _landPlot = it }
    }


@Suppress("ObjectPropertyName")
private var _landPlot: ImageVector? = null
