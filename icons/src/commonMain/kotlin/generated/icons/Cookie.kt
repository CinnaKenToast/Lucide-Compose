package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cookie: ImageVector
    get() {
        val current = _cookie
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Cookie",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 17z M11.5 2 c.32 -.02 .55 .3 .53 .62 a4 4 0 0 0 4.23 4.36 .7 .7 0 0 1 .76 .76 4 4 0 0 0 4.36 4.24 c.33 -.03 .63 .2 .62 .52 a10 10 0 0 1 -2.92 6.57 A1 1 0 1 1 4.93 4.92 10 10 0 0 1 11.5 2 M12 12z M16 16 h.01 M16 3 h.01 M21 4 h.01 M21 8 h.01 M7 14z M9 8z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 17z
                moveTo(x = 11.0f, y = 17.0f)
                close()
                // M 11.5 2
                moveTo(x = 11.5f, y = 2.0f)
                // c 0.32 -0.02 0.55 0.3 0.53 0.62
                curveToRelative(
                    dx1 = 0.32f,
                    dy1 = -0.02f,
                    dx2 = 0.55f,
                    dy2 = 0.3f,
                    dx3 = 0.53f,
                    dy3 = 0.62f,
                )
                // a 4 4 0 0 0 4.23 4.36
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.23f,
                    dy1 = 4.36f,
                )
                // a 0.7 0.7 0 0 1 0.76 0.76
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.76f,
                    dy1 = 0.76f,
                )
                // a 4 4 0 0 0 4.36 4.24
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.36f,
                    dy1 = 4.24f,
                )
                // c 0.33 -0.03 0.63 0.2 0.62 0.52
                curveToRelative(
                    dx1 = 0.33f,
                    dy1 = -0.03f,
                    dx2 = 0.63f,
                    dy2 = 0.2f,
                    dx3 = 0.62f,
                    dy3 = 0.52f,
                )
                // a 10 10 0 0 1 -2.92 6.57
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.92f,
                    dy1 = 6.57f,
                )
                // A 1 1 0 1 1 4.93 4.92
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 4.93f,
                    y1 = 4.92f,
                )
                // A 10 10 0 0 1 11.5 2
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.5f,
                    y1 = 2.0f,
                )
                // M 12 12z
                moveTo(x = 12.0f, y = 12.0f)
                close()
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 16 3
                moveTo(x = 16.0f, y = 3.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 21 4
                moveTo(x = 21.0f, y = 4.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 21 8
                moveTo(x = 21.0f, y = 8.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 7 14z
                moveTo(x = 7.0f, y = 14.0f)
                close()
                // M 9 8z
                moveTo(x = 9.0f, y = 8.0f)
                close()
            }
        }.build().also { _cookie = it }
    }

@Suppress("ObjectPropertyName")
private var _cookie: ImageVector? = null
