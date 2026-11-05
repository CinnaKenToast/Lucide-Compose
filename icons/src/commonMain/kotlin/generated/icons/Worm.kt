package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Worm: ImageVector
    get() {
        val current = _worm
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Worm",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m19 12 -1.5 3 m2.13 3.81 L22 20 M6.47 8.23 a1.68 1.68 0 0 1 2.44 1.93 l-.64 2.08 a6.76 6.76 0 0 0 10.16 7.67 l.42 -.27 a1 1 0 1 0 -2.73 -4.21 L15.7 15.7 a1.76 1.76 0 0 1 -2.63 -1.99 l.64 -2.08 A6.66 6.66 0 0 0 3.94 3.9 l-.7 .4 a1 1 0 1 0 2.55 4.34z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 12
                moveTo(x = 19.0f, y = 12.0f)
                // l -1.5 3
                lineToRelative(dx = -1.5f, dy = 3.0f)
                // m 2.13 3.81
                moveToRelative(dx = 2.13f, dy = 3.81f)
                // L 22 20
                lineTo(x = 22.0f, y = 20.0f)
                // M 6.47 8.23
                moveTo(x = 6.47f, y = 8.23f)
                // a 1.68 1.68 0 0 1 2.44 1.93
                arcToRelative(
                    a = 1.68f,
                    b = 1.68f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.44f,
                    dy1 = 1.93f,
                )
                // l -0.64 2.08
                lineToRelative(dx = -0.64f, dy = 2.08f)
                // a 6.76 6.76 0 0 0 10.16 7.67
                arcToRelative(
                    a = 6.76f,
                    b = 6.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.16f,
                    dy1 = 7.67f,
                )
                // l 0.42 -0.27
                lineToRelative(dx = 0.42f, dy = -0.27f)
                // a 1 1 0 1 0 -2.73 -4.21
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.73f,
                    dy1 = -4.21f,
                )
                // L 15.7 15.7
                lineTo(x = 15.7f, y = 15.7f)
                // a 1.76 1.76 0 0 1 -2.63 -1.99
                arcToRelative(
                    a = 1.76f,
                    b = 1.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.63f,
                    dy1 = -1.99f,
                )
                // l 0.64 -2.08
                lineToRelative(dx = 0.64f, dy = -2.08f)
                // A 6.66 6.66 0 0 0 3.94 3.9
                arcTo(
                    horizontalEllipseRadius = 6.66f,
                    verticalEllipseRadius = 6.66f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.94f,
                    y1 = 3.9f,
                )
                // l -0.7 0.4
                lineToRelative(dx = -0.7f, dy = 0.4f)
                // a 1 1 0 1 0 2.55 4.34z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.55f,
                    dy1 = 4.34f,
                )
                close()
            }
        }.build().also { _worm = it }
    }

@Suppress("ObjectPropertyName")
private var _worm: ImageVector? = null
