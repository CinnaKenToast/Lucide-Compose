package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RotateCcwClock: ImageVector
    get() {
        val current = _rotateCcwClock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.RotateCcwClock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 12 a9 9 0 1 0 9 -9 9.8 9.8 0 0 0 -6.74 2.74 L3 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // a 9 9 0 1 0 9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 9.0f,
                    dy1 = -9.0f,
                )
                // a 9.8 9.8 0 0 0 -6.74 2.74
                arcToRelative(
                    a = 9.8f,
                    b = 9.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.74f,
                    dy1 = 2.74f,
                )
                // L 3 8
                lineTo(x = 3.0f, y = 8.0f)
            }
            // M3 3 v5 h5 m4 -1 v5 l4 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // m 4 -1
                moveToRelative(dx = 4.0f, dy = -1.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // l 4 2
                lineToRelative(dx = 4.0f, dy = 2.0f)
            }
        }.build().also { _rotateCcwClock = it }
    }

@Suppress("ObjectPropertyName")
private var _rotateCcwClock: ImageVector? = null
