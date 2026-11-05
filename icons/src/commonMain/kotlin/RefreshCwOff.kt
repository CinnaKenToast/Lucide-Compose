package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RefreshCwOff: ImageVector
    get() {
        val current = _refreshCwOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "RefreshCwOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m21 8 -2.26 -2.26 A9.8 9.8 0 0 0 12 3 q-1.51 0 -2.87 .47 M8 16 H3 v5 m0 -9 c0 -2.49 1 -4.74 2.64 -6.36
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 8
                moveTo(x = 21.0f, y = 8.0f)
                // l -2.26 -2.26
                lineToRelative(dx = -2.26f, dy = -2.26f)
                // A 9.8 9.8 0 0 0 12 3
                arcTo(
                    horizontalEllipseRadius = 9.8f,
                    verticalEllipseRadius = 9.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 3.0f,
                )
                // q -1.51 0 -2.87 0.47
                quadToRelative(
                    dx1 = -1.51f,
                    dy1 = 0.0f,
                    dx2 = -2.87f,
                    dy2 = 0.47f,
                )
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m 0 -9
                moveToRelative(dx = 0.0f, dy = -9.0f)
                // c 0 -2.49 1 -4.74 2.64 -6.36
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.49f,
                    dx2 = 1.0f,
                    dy2 = -4.74f,
                    dx3 = 2.64f,
                    dy3 = -6.36f,
                )
            }
            // m3 16 2.26 2.26 A9.8 9.8 0 0 0 12 21 c2.49 0 4.74 -1 6.36 -2.64 M21 12 q0 1.51 -.47 2.87 M21 3 v5 h-5 m6 14 L2 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // l 2.26 2.26
                lineToRelative(dx = 2.26f, dy = 2.26f)
                // A 9.8 9.8 0 0 0 12 21
                arcTo(
                    horizontalEllipseRadius = 9.8f,
                    verticalEllipseRadius = 9.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 21.0f,
                )
                // c 2.49 0 4.74 -1 6.36 -2.64
                curveToRelative(
                    dx1 = 2.49f,
                    dy1 = 0.0f,
                    dx2 = 4.74f,
                    dy2 = -1.0f,
                    dx3 = 6.36f,
                    dy3 = -2.64f,
                )
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // q 0 1.51 -0.47 2.87
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.51f,
                    dx2 = -0.47f,
                    dy2 = 2.87f,
                )
                // M 21 3
                moveTo(x = 21.0f, y = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // m 6 14
                moveToRelative(dx = 6.0f, dy = 14.0f)
                // L 2 2
                lineTo(x = 2.0f, y = 2.0f)
            }
        }.build().also { _refreshCwOff = it }
    }


@Suppress("ObjectPropertyName")
private var _refreshCwOff: ImageVector? = null
