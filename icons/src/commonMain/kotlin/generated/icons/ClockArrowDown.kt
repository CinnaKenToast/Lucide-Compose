package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ClockArrowDown: ImageVector
    get() {
        val current = _clockArrowDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ClockArrowDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 6 v6 l2.42 1.21 M18 21 l-3 -3 m6 0 -3 3 v-6
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
                // l 2.42 1.21
                lineToRelative(dx = 2.42f, dy = 1.21f)
                // M 18 21
                moveTo(x = 18.0f, y = 21.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // m 6 0
                moveToRelative(dx = 6.0f, dy = 0.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
            }
            // M21.83 13.85 a10 10 0 1 0 -8.56 8.07
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.83 13.85
                moveTo(x = 21.83f, y = 13.85f)
                // a 10 10 0 1 0 -8.56 8.07
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.56f,
                    dy1 = 8.07f,
                )
            }
        }.build().also { _clockArrowDown = it }
    }

@Suppress("ObjectPropertyName")
private var _clockArrowDown: ImageVector? = null
