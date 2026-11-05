package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HeartOff: ImageVector
    get() {
        val current = _heartOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HeartOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.5 4.9 a6 6 0 0 1 1.1 .92 .56 .56 0 0 0 .8 0 A5.49 5.49 0 0 1 22 9.5 c0 1.87 -1 3.36 -2.19 4.66 m-2.84 2.8 -3.46 3.35 a2 2 0 0 1 -3 .02 L5 15 c-1.5 -1.5 -3 -3.2 -3 -5.5 a5.5 5.5 0 0 1 2.75 -4.76 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.5 4.9
                moveTo(x = 10.5f, y = 4.9f)
                // a 6 6 0 0 1 1.1 0.92
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.92f,
                )
                // a 0.56 0.56 0 0 0 0.8 0
                arcToRelative(
                    a = 0.56f,
                    b = 0.56f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.8f,
                    dy1 = 0.0f,
                )
                // A 5.49 5.49 0 0 1 22 9.5
                arcTo(
                    horizontalEllipseRadius = 5.49f,
                    verticalEllipseRadius = 5.49f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 9.5f,
                )
                // c 0 1.87 -1 3.36 -2.19 4.66
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.87f,
                    dx2 = -1.0f,
                    dy2 = 3.36f,
                    dx3 = -2.19f,
                    dy3 = 4.66f,
                )
                // m -2.84 2.8
                moveToRelative(dx = -2.84f, dy = 2.8f)
                // l -3.46 3.35
                lineToRelative(dx = -3.46f, dy = 3.35f)
                // a 2 2 0 0 1 -3 0.02
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.02f,
                )
                // L 5 15
                lineTo(x = 5.0f, y = 15.0f)
                // c -1.5 -1.5 -3 -3.2 -3 -5.5
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = -1.5f,
                    dx2 = -3.0f,
                    dy2 = -3.2f,
                    dx3 = -3.0f,
                    dy3 = -5.5f,
                )
                // a 5.5 5.5 0 0 1 2.75 -4.76
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.75f,
                    dy1 = -4.76f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _heartOff = it }
    }

@Suppress("ObjectPropertyName")
private var _heartOff: ImageVector? = null
