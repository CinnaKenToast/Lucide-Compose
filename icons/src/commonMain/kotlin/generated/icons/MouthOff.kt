package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MouthOff: ImageVector
    get() {
        val current = _mouthOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MouthOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.07 7.42 a2.6 2.6 0 0 1 3 .1 c1.82 1.36 3.05 2.07 5.47 3.64 a1 1 0 0 1 .31 1.37 12 12 0 0 1 -1.62 2.05 M2 12 a51 51 0 0 0 10.99 .99 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.07 7.42
                moveTo(x = 13.07f, y = 7.42f)
                // a 2.6 2.6 0 0 1 3 0.1
                arcToRelative(
                    a = 2.6f,
                    b = 2.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.1f,
                )
                // c 1.82 1.36 3.05 2.07 5.47 3.64
                curveToRelative(
                    dx1 = 1.82f,
                    dy1 = 1.36f,
                    dx2 = 3.05f,
                    dy2 = 2.07f,
                    dx3 = 5.47f,
                    dy3 = 3.64f,
                )
                // a 1 1 0 0 1 0.31 1.37
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.31f,
                    dy1 = 1.37f,
                )
                // a 12 12 0 0 1 -1.62 2.05
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.62f,
                    dy1 = 2.05f,
                )
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // a 51 51 0 0 0 10.99 0.99
                arcToRelative(
                    a = 51.0f,
                    b = 51.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.99f,
                    dy1 = 0.99f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
            // M21 11 a1 1 0 0 1 1 1 51 51 0 0 1 -3.73 .61 M7.7 7.7 C6 8.94 4.78 9.66 2.46 11.16 a1 1 0 0 0 -.31 1.37 11.6 11.6 0 0 0 14.77 4.39
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 11
                moveTo(x = 21.0f, y = 11.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // a 51 51 0 0 1 -3.73 0.61
                arcToRelative(
                    a = 51.0f,
                    b = 51.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.73f,
                    dy1 = 0.61f,
                )
                // M 7.7 7.7
                moveTo(x = 7.7f, y = 7.7f)
                // C 6 8.94 4.78 9.66 2.46 11.16
                curveTo(
                    x1 = 6.0f,
                    y1 = 8.94f,
                    x2 = 4.78f,
                    y2 = 9.66f,
                    x3 = 2.46f,
                    y3 = 11.16f,
                )
                // a 1 1 0 0 0 -0.31 1.37
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.31f,
                    dy1 = 1.37f,
                )
                // a 11.6 11.6 0 0 0 14.77 4.39
                arcToRelative(
                    a = 11.6f,
                    b = 11.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 14.77f,
                    dy1 = 4.39f,
                )
            }
        }.build().also { _mouthOff = it }
    }

@Suppress("ObjectPropertyName")
private var _mouthOff: ImageVector? = null
