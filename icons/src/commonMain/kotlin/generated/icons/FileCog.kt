package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FileCog: ImageVector
    get() {
        val current = _fileCog
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FileCog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 8 a1 1 0 0 1 -1 -1 V2 a2.4 2.4 0 0 1 1.7 .7 l3.6 3.6 A2.4 2.4 0 0 1 20 8z m5 0 v12 a2 2 0 0 1 -2 2 h-4.18 M3.3 19.53 l.92 -.38 M4 10.59 V4 a2 2 0 0 1 2 -2 h8 M4.23 16.85 3.3 16.47 m2.55 -1.24 L5.47 14.3 m.38 6.47 L5.47 21.7 m2.68 -6.47 .38 -.93 m0 7.4 -.38 -.93 m1.62 -3.92 .93 -.38 m-.93 2.68 .93 .38
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 8
                moveTo(x = 15.0f, y = 8.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // a 2.4 2.4 0 0 1 1.7 0.7
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.7f,
                )
                // l 3.6 3.6
                lineToRelative(dx = 3.6f, dy = 3.6f)
                // A 2.4 2.4 0 0 1 20 8z
                arcTo(
                    horizontalEllipseRadius = 2.4f,
                    verticalEllipseRadius = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 8.0f,
                )
                close()
                // m 5 0
                moveToRelative(dx = 5.0f, dy = 0.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -4.18
                horizontalLineToRelative(dx = -4.18f)
                // M 3.3 19.53
                moveTo(x = 3.3f, y = 19.53f)
                // l 0.92 -0.38
                lineToRelative(dx = 0.92f, dy = -0.38f)
                // M 4 10.59
                moveTo(x = 4.0f, y = 10.59f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 4.23 16.85
                moveTo(x = 4.23f, y = 16.85f)
                // L 3.3 16.47
                lineTo(x = 3.3f, y = 16.47f)
                // m 2.55 -1.24
                moveToRelative(dx = 2.55f, dy = -1.24f)
                // L 5.47 14.3
                lineTo(x = 5.47f, y = 14.3f)
                // m 0.38 6.47
                moveToRelative(dx = 0.38f, dy = 6.47f)
                // L 5.47 21.7
                lineTo(x = 5.47f, y = 21.7f)
                // m 2.68 -6.47
                moveToRelative(dx = 2.68f, dy = -6.47f)
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
            }
            // <circle cx="7.0" cy="18.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
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
        }.build().also { _fileCog = it }
    }

@Suppress("ObjectPropertyName")
private var _fileCog: ImageVector? = null
