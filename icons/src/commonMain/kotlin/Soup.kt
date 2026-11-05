package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Soup: ImageVector
    get() {
        val current = _soup
        if (current != null) return current

        return ImageVector.Builder(
            name = "Soup",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.25 3 c.27 .1 .8 .53 .74 1.36 -.05 .83 -.93 1.2 -.98 2.02 -.06 .78 .33 1.24 .72 1.62 m4.52 -5 c.27 .1 .8 .53 .75 1.36 s-.93 1.2 -1 2.02 C15.95 7.16 16.34 7.62 16.73 8 m2.77 4 L22 6 M4 12 a1 1 0 0 0 -.99 1.13 A9 9 0 0 0 12 21 a9 9 0 0 0 8.99 -7.87 A1 1 0 0 0 20 12z m2.25 -9 C6.52 3.1 7.05 3.53 7 4.36 s-.93 1.2 -1 2.02 C5.95 7.16 6.34 7.62 6.74 8 M7 21 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.25 3
                moveTo(x = 11.25f, y = 3.0f)
                // c 0.27 0.1 0.8 0.53 0.74 1.36
                curveToRelative(
                    dx1 = 0.27f,
                    dy1 = 0.1f,
                    dx2 = 0.8f,
                    dy2 = 0.53f,
                    dx3 = 0.74f,
                    dy3 = 1.36f,
                )
                // c -0.05 0.83 -0.93 1.2 -0.98 2.02
                curveToRelative(
                    dx1 = -0.05f,
                    dy1 = 0.83f,
                    dx2 = -0.93f,
                    dy2 = 1.2f,
                    dx3 = -0.98f,
                    dy3 = 2.02f,
                )
                // c -0.06 0.78 0.33 1.24 0.72 1.62
                curveToRelative(
                    dx1 = -0.06f,
                    dy1 = 0.78f,
                    dx2 = 0.33f,
                    dy2 = 1.24f,
                    dx3 = 0.72f,
                    dy3 = 1.62f,
                )
                // m 4.52 -5
                moveToRelative(dx = 4.52f, dy = -5.0f)
                // c 0.27 0.1 0.8 0.53 0.75 1.36
                curveToRelative(
                    dx1 = 0.27f,
                    dy1 = 0.1f,
                    dx2 = 0.8f,
                    dy2 = 0.53f,
                    dx3 = 0.75f,
                    dy3 = 1.36f,
                )
                // s -0.93 1.2 -1 2.02
                reflectiveCurveToRelative(
                    dx1 = -0.93f,
                    dy1 = 1.2f,
                    dx2 = -1.0f,
                    dy2 = 2.02f,
                )
                // C 15.95 7.16 16.34 7.62 16.73 8
                curveTo(
                    x1 = 15.95f,
                    y1 = 7.16f,
                    x2 = 16.34f,
                    y2 = 7.62f,
                    x3 = 16.73f,
                    y3 = 8.0f,
                )
                // m 2.77 4
                moveToRelative(dx = 2.77f, dy = 4.0f)
                // L 22 6
                lineTo(x = 22.0f, y = 6.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // a 1 1 0 0 0 -0.99 1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.99f,
                    dy1 = 1.13f,
                )
                // A 9 9 0 0 0 12 21
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 21.0f,
                )
                // a 9 9 0 0 0 8.99 -7.87
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.99f,
                    dy1 = -7.87f,
                )
                // A 1 1 0 0 0 20 12z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 12.0f,
                )
                close()
                // m 2.25 -9
                moveToRelative(dx = 2.25f, dy = -9.0f)
                // C 6.52 3.1 7.05 3.53 7 4.36
                curveTo(
                    x1 = 6.52f,
                    y1 = 3.1f,
                    x2 = 7.05f,
                    y2 = 3.53f,
                    x3 = 7.0f,
                    y3 = 4.36f,
                )
                // s -0.93 1.2 -1 2.02
                reflectiveCurveToRelative(
                    dx1 = -0.93f,
                    dy1 = 1.2f,
                    dx2 = -1.0f,
                    dy2 = 2.02f,
                )
                // C 5.95 7.16 6.34 7.62 6.74 8
                curveTo(
                    x1 = 5.95f,
                    y1 = 7.16f,
                    x2 = 6.34f,
                    y2 = 7.62f,
                    x3 = 6.74f,
                    y3 = 8.0f,
                )
                // M 7 21
                moveTo(x = 7.0f, y = 21.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
        }.build().also { _soup = it }
    }


@Suppress("ObjectPropertyName")
private var _soup: ImageVector? = null
