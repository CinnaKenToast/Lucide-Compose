package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ClockArrowUp: ImageVector
    get() {
        val current = _clockArrowUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ClockArrowUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 6 v6 l2.23 1.11 M18 15 v6 m3 -3 -3 -3 -3 3
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
                // l 2.23 1.11
                lineToRelative(dx = 2.23f, dy = 1.11f)
                // M 18 15
                moveTo(x = 18.0f, y = 15.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 3 -3
                moveToRelative(dx = 3.0f, dy = -3.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
            }
            // M21.92 13.27 a10 10 0 1 0 -8.07 8.56
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.92 13.27
                moveTo(x = 21.92f, y = 13.27f)
                // a 10 10 0 1 0 -8.07 8.56
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.07f,
                    dy1 = 8.56f,
                )
            }
        }.build().also { _clockArrowUp = it }
    }

@Suppress("ObjectPropertyName")
private var _clockArrowUp: ImageVector? = null
