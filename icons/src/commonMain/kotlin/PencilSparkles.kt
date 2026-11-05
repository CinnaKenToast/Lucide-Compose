package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PencilSparkles: ImageVector
    get() {
        val current = _pencilSparkles
        if (current != null) return current

        return ImageVector.Builder(
            name = "PencilSparkles",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 3 H8 m7 2 4 4 m1 6 v4 m1.17 -12.19 a2.82 2.82 0 0 0 -3.98 -3.98 L3.84 16.18 A2 2 0 0 0 3.34 17 l-1.32 4.35 a.5 .5 0 0 0 .62 .62 L7 20.66 a2 2 0 0 0 .83 -.5z M22 17 h-4 M4 5 v4 m2 -2 H2 m7 -5 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 3
                moveTo(x = 10.0f, y = 3.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 7 2
                moveToRelative(dx = 7.0f, dy = 2.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m 1 6
                moveToRelative(dx = 1.0f, dy = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 1.17 -12.19
                moveToRelative(dx = 1.17f, dy = -12.19f)
                // a 2.82 2.82 0 0 0 -3.98 -3.98
                arcToRelative(
                    a = 2.82f,
                    b = 2.82f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.98f,
                    dy1 = -3.98f,
                )
                // L 3.84 16.18
                lineTo(x = 3.84f, y = 16.18f)
                // A 2 2 0 0 0 3.34 17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.34f,
                    y1 = 17.0f,
                )
                // l -1.32 4.35
                lineToRelative(dx = -1.32f, dy = 4.35f)
                // a 0.5 0.5 0 0 0 0.62 0.62
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.62f,
                    dy1 = 0.62f,
                )
                // L 7 20.66
                lineTo(x = 7.0f, y = 20.66f)
                // a 2 2 0 0 0 0.83 -0.5z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.83f,
                    dy1 = -0.5f,
                )
                close()
                // M 22 17
                moveTo(x = 22.0f, y = 17.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 2 -2
                moveToRelative(dx = 2.0f, dy = -2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 7 -5
                moveToRelative(dx = 7.0f, dy = -5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _pencilSparkles = it }
    }


@Suppress("ObjectPropertyName")
private var _pencilSparkles: ImageVector? = null
