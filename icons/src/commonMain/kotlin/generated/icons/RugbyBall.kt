package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RugbyBall: ImageVector
    get() {
        val current = _rugbyBall
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.RugbyBall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10 10 4 4 m-1 -7 4 4 m-1.66 -8.86 a15 15 0 0 0 -13.2 13.2 c-.36 2.94 0 4.92 .8 5.72 s2.78 1.16 5.72 .8 a15 15 0 0 0 13.2 -13.2 c.36 -2.94 0 -4.92 -.8 -5.72 s-2.78 -1.16 -5.72 -.8 M17 7 7 17 m0 -4 4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m -1 -7
                moveToRelative(dx = -1.0f, dy = -7.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m -1.66 -8.86
                moveToRelative(dx = -1.66f, dy = -8.86f)
                // a 15 15 0 0 0 -13.2 13.2
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -13.2f,
                    dy1 = 13.2f,
                )
                // c -0.36 2.94 0 4.92 0.8 5.72
                curveToRelative(
                    dx1 = -0.36f,
                    dy1 = 2.94f,
                    dx2 = 0.0f,
                    dy2 = 4.92f,
                    dx3 = 0.8f,
                    dy3 = 5.72f,
                )
                // s 2.78 1.16 5.72 0.8
                reflectiveCurveToRelative(
                    dx1 = 2.78f,
                    dy1 = 1.16f,
                    dx2 = 5.72f,
                    dy2 = 0.8f,
                )
                // a 15 15 0 0 0 13.2 -13.2
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 13.2f,
                    dy1 = -13.2f,
                )
                // c 0.36 -2.94 0 -4.92 -0.8 -5.72
                curveToRelative(
                    dx1 = 0.36f,
                    dy1 = -2.94f,
                    dx2 = 0.0f,
                    dy2 = -4.92f,
                    dx3 = -0.8f,
                    dy3 = -5.72f,
                )
                // s -2.78 -1.16 -5.72 -0.8
                reflectiveCurveToRelative(
                    dx1 = -2.78f,
                    dy1 = -1.16f,
                    dx2 = -5.72f,
                    dy2 = -0.8f,
                )
                // M 17 7
                moveTo(x = 17.0f, y = 7.0f)
                // L 7 17
                lineTo(x = 7.0f, y = 17.0f)
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
            }
        }.build().also { _rugbyBall = it }
    }

@Suppress("ObjectPropertyName")
private var _rugbyBall: ImageVector? = null
