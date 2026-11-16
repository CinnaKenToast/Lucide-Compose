package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cap: ImageVector
    get() {
        val current = _cap
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Cap",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.04 4.02 a12 12 0 0 0 -2.63 11.1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.04 4.02
                moveTo(x = 11.04f, y = 4.02f)
                // a 12 12 0 0 0 -2.63 11.1
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.63f,
                    dy1 = 11.1f,
                )
            }
            // M5 16 c3.3 0 6 -3 10 -3 a8 8 0 0 1 6.81 3.8 A1.3 1.3 0 0 1 22 17.5 a.5 .5 0 0 1 -.5 .5 c-.73 0 -2.04 -1 -3.5 -1 -3 0 -5.2 2.98 -8 3 -2.76 0 -5 -1.79 -5 -4 -1.5 0 -2.54 -.66 -2.71 -1.3 A8.5 8.5 0 1 1 19 12.5 a9 9 0 0 1 -.13 1.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 16
                moveTo(x = 5.0f, y = 16.0f)
                // c 3.3 0 6 -3 10 -3
                curveToRelative(
                    dx1 = 3.3f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = -3.0f,
                    dx3 = 10.0f,
                    dy3 = -3.0f,
                )
                // a 8 8 0 0 1 6.81 3.8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.81f,
                    dy1 = 3.8f,
                )
                // A 1.3 1.3 0 0 1 22 17.5
                arcTo(
                    horizontalEllipseRadius = 1.3f,
                    verticalEllipseRadius = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 17.5f,
                )
                // a 0.5 0.5 0 0 1 -0.5 0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.5f,
                    dy1 = 0.5f,
                )
                // c -0.73 0 -2.04 -1 -3.5 -1
                curveToRelative(
                    dx1 = -0.73f,
                    dy1 = 0.0f,
                    dx2 = -2.04f,
                    dy2 = -1.0f,
                    dx3 = -3.5f,
                    dy3 = -1.0f,
                )
                // c -3 0 -5.2 2.98 -8 3
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -5.2f,
                    dy2 = 2.98f,
                    dx3 = -8.0f,
                    dy3 = 3.0f,
                )
                // c -2.76 0 -5 -1.79 -5 -4
                curveToRelative(
                    dx1 = -2.76f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = -1.79f,
                    dx3 = -5.0f,
                    dy3 = -4.0f,
                )
                // c -1.5 0 -2.54 -0.66 -2.71 -1.3
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.0f,
                    dx2 = -2.54f,
                    dy2 = -0.66f,
                    dx3 = -2.71f,
                    dy3 = -1.3f,
                )
                // A 8.5 8.5 0 1 1 19 12.5
                arcTo(
                    horizontalEllipseRadius = 8.5f,
                    verticalEllipseRadius = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 12.5f,
                )
                // a 9 9 0 0 1 -0.13 1.5
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.13f,
                    dy1 = 1.5f,
                )
            }
        }.build().also { _cap = it }
    }

@Suppress("ObjectPropertyName")
private var _cap: ImageVector? = null
