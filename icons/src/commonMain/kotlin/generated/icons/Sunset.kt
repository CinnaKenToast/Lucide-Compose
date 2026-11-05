package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Sunset: ImageVector
    get() {
        val current = _sunset
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Sunset",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 10 V2 m-7.07 8.93 1.41 1.41 M2 18 h2 m16 0 h2 m-2.93 -7.07 -1.41 1.41 M22 22 H2 M16 6 l-4 4 -4 -4 m8 12 a4 4 0 0 0 -8 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // m -7.07 8.93
                moveToRelative(dx = -7.07f, dy = 8.93f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2.93 -7.07
                moveToRelative(dx = -2.93f, dy = -7.07f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // M 22 22
                moveTo(x = 22.0f, y = 22.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // M 16 6
                moveTo(x = 16.0f, y = 6.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // m 8 12
                moveToRelative(dx = 8.0f, dy = 12.0f)
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
            }
        }.build().also { _sunset = it }
    }

@Suppress("ObjectPropertyName")
private var _sunset: ImageVector? = null
