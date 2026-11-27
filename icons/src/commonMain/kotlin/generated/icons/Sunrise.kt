package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Sunrise: ImageVector
    get() {
        val current = _sunrise
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Sunrise",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 v6 m4 8 a4 4 0 0 0 -8 0 m11.07 -7.07 -1.41 1.41 M2 17 h2 m16 0 h2 m0 4 H2 M4.93 9.93 l1.41 1.41 M9 6 l3 -3 3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 4 8
                moveToRelative(dx = 4.0f, dy = 8.0f)
                // a 4 4 0 0 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // m 11.07 -7.07
                moveToRelative(dx = 11.07f, dy = -7.07f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // M 2 17
                moveTo(x = 2.0f, y = 17.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // M 4.93 9.93
                moveTo(x = 4.93f, y = 9.93f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // M 9 6
                moveTo(x = 9.0f, y = 6.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
            }
        }.build().also { _sunrise = it }
    }

@Suppress("ObjectPropertyName")
private var _sunrise: ImageVector? = null
