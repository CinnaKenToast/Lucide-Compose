package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BellRing: ImageVector
    get() {
        val current = _bellRing
        if (current != null) return current

        return ImageVector.Builder(
            name = "BellRing",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.27 21 a2 2 0 0 0 3.46 0 M22 8 c0 -2.3 -.8 -4.3 -2 -6 M3.26 15.33 A1 1 0 0 0 4 17 h16 a1 1 0 0 0 .74 -1.67 C19.41 13.96 18 12.5 18 8 A6 6 0 0 0 6 8 c0 4.5 -1.41 5.96 -2.74 7.33 M4 2 C2.8 3.7 2 5.7 2 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.27 21
                moveTo(x = 10.27f, y = 21.0f)
                // a 2 2 0 0 0 3.46 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.46f,
                    dy1 = 0.0f,
                )
                // M 22 8
                moveTo(x = 22.0f, y = 8.0f)
                // c 0 -2.3 -0.8 -4.3 -2 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.3f,
                    dx2 = -0.8f,
                    dy2 = -4.3f,
                    dx3 = -2.0f,
                    dy3 = -6.0f,
                )
                // M 3.26 15.33
                moveTo(x = 3.26f, y = 15.33f)
                // A 1 1 0 0 0 4 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 17.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 1 1 0 0 0 0.74 -1.67
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.74f,
                    dy1 = -1.67f,
                )
                // C 19.41 13.96 18 12.5 18 8
                curveTo(
                    x1 = 19.41f,
                    y1 = 13.96f,
                    x2 = 18.0f,
                    y2 = 12.5f,
                    x3 = 18.0f,
                    y3 = 8.0f,
                )
                // A 6 6 0 0 0 6 8
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 8.0f,
                )
                // c 0 4.5 -1.41 5.96 -2.74 7.33
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.5f,
                    dx2 = -1.41f,
                    dy2 = 5.96f,
                    dx3 = -2.74f,
                    dy3 = 7.33f,
                )
                // M 4 2
                moveTo(x = 4.0f, y = 2.0f)
                // C 2.8 3.7 2 5.7 2 8
                curveTo(
                    x1 = 2.8f,
                    y1 = 3.7f,
                    x2 = 2.0f,
                    y2 = 5.7f,
                    x3 = 2.0f,
                    y3 = 8.0f,
                )
            }
        }.build().also { _bellRing = it }
    }


@Suppress("ObjectPropertyName")
private var _bellRing: ImageVector? = null
