package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ClockCheck: ImageVector
    get() {
        val current = _clockCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ClockCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21.95 13 a10 10 0 1 0 -8.68 8.92
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.95 13
                moveTo(x = 21.95f, y = 13.0f)
                // a 10 10 0 1 0 -8.68 8.92
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.68f,
                    dy1 = 8.92f,
                )
            }
            // M12 6 v6 l4 2 m0 5 2 2 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // l 4 2
                lineToRelative(dx = 4.0f, dy = 2.0f)
                // m 0 5
                moveToRelative(dx = 0.0f, dy = 5.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
        }.build().also { _clockCheck = it }
    }

@Suppress("ObjectPropertyName")
private var _clockCheck: ImageVector? = null
