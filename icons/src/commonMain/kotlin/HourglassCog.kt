package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HourglassCog: ImageVector
    get() {
        val current = _hourglassCog
        if (current != null) return current

        return ImageVector.Builder(
            name = "HourglassCog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14.3 19.53 .93 -.38 m0 -2.3 -.93 -.38 m2.55 -1.24 -.38 -.93 m.38 6.47 -.38 .93 M17 2 v4.17 a2 2 0 0 1 -.59 1.42 L7.6 16.4 A2 2 0 0 0 7 17.83 V22 m12.15 -6.77 .38 -.93 m0 7.4 -.38 -.93 m1.62 -3.92 .93 -.38 m-.93 2.68 .93 .38 M5 22 h6.16 M5 2 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.3 19.53
                moveTo(x = 14.3f, y = 19.53f)
                // l 0.93 -0.38
                lineToRelative(dx = 0.93f, dy = -0.38f)
                // m 0 -2.3
                moveToRelative(dx = 0.0f, dy = -2.3f)
                // l -0.93 -0.38
                lineToRelative(dx = -0.93f, dy = -0.38f)
                // m 2.55 -1.24
                moveToRelative(dx = 2.55f, dy = -1.24f)
                // l -0.38 -0.93
                lineToRelative(dx = -0.38f, dy = -0.93f)
                // m 0.38 6.47
                moveToRelative(dx = 0.38f, dy = 6.47f)
                // l -0.38 0.93
                lineToRelative(dx = -0.38f, dy = 0.93f)
                // M 17 2
                moveTo(x = 17.0f, y = 2.0f)
                // v 4.17
                verticalLineToRelative(dy = 4.17f)
                // a 2 2 0 0 1 -0.59 1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.59f,
                    dy1 = 1.42f,
                )
                // L 7.6 16.4
                lineTo(x = 7.6f, y = 16.4f)
                // A 2 2 0 0 0 7 17.83
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 17.83f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // m 12.15 -6.77
                moveToRelative(dx = 12.15f, dy = -6.77f)
                // l 0.38 -0.93
                lineToRelative(dx = 0.38f, dy = -0.93f)
                // m 0 7.4
                moveToRelative(dx = 0.0f, dy = 7.4f)
                // l -0.38 -0.93
                lineToRelative(dx = -0.38f, dy = -0.93f)
                // m 1.62 -3.92
                moveToRelative(dx = 1.62f, dy = -3.92f)
                // l 0.93 -0.38
                lineToRelative(dx = 0.93f, dy = -0.38f)
                // m -0.93 2.68
                moveToRelative(dx = -0.93f, dy = 2.68f)
                // l 0.93 0.38
                lineToRelative(dx = 0.93f, dy = 0.38f)
                // M 5 22
                moveTo(x = 5.0f, y = 22.0f)
                // h 6.16
                horizontalLineToRelative(dx = 6.16f)
                // M 5 2
                moveTo(x = 5.0f, y = 2.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
            // M7 2 v4.17 A2 2 0 0 0 7.59 7.6 l5.18 5.18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 2
                moveTo(x = 7.0f, y = 2.0f)
                // v 4.17
                verticalLineToRelative(dy = 4.17f)
                // A 2 2 0 0 0 7.59 7.6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.59f,
                    y1 = 7.6f,
                )
                // l 5.18 5.18
                lineToRelative(dx = 5.18f, dy = 5.18f)
            }
            // <circle cx="18.0" cy="18.0" radius="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _hourglassCog = it }
    }


@Suppress("ObjectPropertyName")
private var _hourglassCog: ImageVector? = null
