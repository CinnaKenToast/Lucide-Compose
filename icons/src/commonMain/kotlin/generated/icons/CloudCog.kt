package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudCog: ImageVector
    get() {
        val current = _cloudCog
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CloudCog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10.85 19.77 -.38 .93 m2.68 -6.47 .38 -.93 m-.38 6.47 a3 3 0 1 0 -2.3 -5.54 l-.38 -.93
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.85 19.77
                moveTo(x = 10.85f, y = 19.77f)
                // l -0.38 0.93
                lineToRelative(dx = -0.38f, dy = 0.93f)
                // m 2.68 -6.47
                moveToRelative(dx = 2.68f, dy = -6.47f)
                // l 0.38 -0.93
                lineToRelative(dx = 0.38f, dy = -0.93f)
                // m -0.38 6.47
                moveToRelative(dx = -0.38f, dy = 6.47f)
                // a 3 3 0 1 0 -2.3 -5.54
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.3f,
                    dy1 = -5.54f,
                )
                // l -0.38 -0.93
                lineToRelative(dx = -0.38f, dy = -0.93f)
            }
            // m13.53 20.7 -.38 -.93 a3 3 0 1 1 -2.3 -5.54 m3.92 1.62 .93 -.38 m-.93 2.68 .93 .38
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.53 20.7
                moveTo(x = 13.53f, y = 20.7f)
                // l -0.38 -0.93
                lineToRelative(dx = -0.38f, dy = -0.93f)
                // a 3 3 0 1 1 -2.3 -5.54
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.3f,
                    dy1 = -5.54f,
                )
                // m 3.92 1.62
                moveToRelative(dx = 3.92f, dy = 1.62f)
                // l 0.93 -0.38
                lineToRelative(dx = 0.93f, dy = -0.38f)
                // m -0.93 2.68
                moveToRelative(dx = -0.93f, dy = 2.68f)
                // l 0.93 0.38
                lineToRelative(dx = 0.93f, dy = 0.38f)
            }
            // M4.2 15.1 a7 7 0 1 1 9.93 -9.86 A7 7 0 0 1 15.71 8 h1.79 a4.5 4.5 0 0 1 2.5 8.2 M9.23 15.85 8.3 15.47 m.93 2.68 L8.3 18.53
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.2 15.1
                moveTo(x = 4.2f, y = 15.1f)
                // a 7 7 0 1 1 9.93 -9.86
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.93f,
                    dy1 = -9.86f,
                )
                // A 7 7 0 0 1 15.71 8
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.71f,
                    y1 = 8.0f,
                )
                // h 1.79
                horizontalLineToRelative(dx = 1.79f)
                // a 4.5 4.5 0 0 1 2.5 8.2
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.5f,
                    dy1 = 8.2f,
                )
                // M 9.23 15.85
                moveTo(x = 9.23f, y = 15.85f)
                // L 8.3 15.47
                lineTo(x = 8.3f, y = 15.47f)
                // m 0.93 2.68
                moveToRelative(dx = 0.93f, dy = 2.68f)
                // L 8.3 18.53
                lineTo(x = 8.3f, y = 18.53f)
            }
        }.build().also { _cloudCog = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudCog: ImageVector? = null
