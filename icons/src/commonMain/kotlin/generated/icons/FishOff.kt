package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FishOff: ImageVector
    get() {
        val current = _fishOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FishOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 12.47 v.03 m0 -.5 v.47 m-.47 5.06 A7 7 0 0 1 15 18 c-3.56 0 -7.56 -2.53 -8.5 -6 a7.4 7.4 0 0 1 2.12 -3.38 m3.45 -2.09 A9 9 0 0 1 15 6 c3.56 0 6.06 2.54 7 6 a10 10 0 0 1 -1.41 3.06
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 12.47
                moveTo(x = 18.0f, y = 12.47f)
                // v 0.03
                verticalLineToRelative(dy = 0.03f)
                // m 0 -0.5
                moveToRelative(dx = 0.0f, dy = -0.5f)
                // v 0.47
                verticalLineToRelative(dy = 0.47f)
                // m -0.47 5.06
                moveToRelative(dx = -0.47f, dy = 5.06f)
                // A 7 7 0 0 1 15 18
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 18.0f,
                )
                // c -3.56 0 -7.56 -2.53 -8.5 -6
                curveToRelative(
                    dx1 = -3.56f,
                    dy1 = 0.0f,
                    dx2 = -7.56f,
                    dy2 = -2.53f,
                    dx3 = -8.5f,
                    dy3 = -6.0f,
                )
                // a 7.4 7.4 0 0 1 2.12 -3.38
                arcToRelative(
                    a = 7.4f,
                    b = 7.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.12f,
                    dy1 = -3.38f,
                )
                // m 3.45 -2.09
                moveToRelative(dx = 3.45f, dy = -2.09f)
                // A 9 9 0 0 1 15 6
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 6.0f,
                )
                // c 3.56 0 6.06 2.54 7 6
                curveToRelative(
                    dx1 = 3.56f,
                    dy1 = 0.0f,
                    dx2 = 6.06f,
                    dy2 = 2.54f,
                    dx3 = 7.0f,
                    dy3 = 6.0f,
                )
                // a 10 10 0 0 1 -1.41 3.06
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.41f,
                    dy1 = 3.06f,
                )
            }
            // M7 10.67 C7 8 5.58 5.97 2.73 5.5 c-1 1.5 -1 5 .23 6.5 -1.24 1.5 -1.24 5 -.23 6.5 C5.58 18.03 7 16 7 13.33 m7.48 -4.37 A10 10 0 0 1 16 6.07 m0 11.86 a10 10 0 0 1 -1.73 -3.62
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 10.67
                moveTo(x = 7.0f, y = 10.67f)
                // C 7 8 5.58 5.97 2.73 5.5
                curveTo(
                    x1 = 7.0f,
                    y1 = 8.0f,
                    x2 = 5.58f,
                    y2 = 5.97f,
                    x3 = 2.73f,
                    y3 = 5.5f,
                )
                // c -1 1.5 -1 5 0.23 6.5
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.5f,
                    dx2 = -1.0f,
                    dy2 = 5.0f,
                    dx3 = 0.23f,
                    dy3 = 6.5f,
                )
                // c -1.24 1.5 -1.24 5 -0.23 6.5
                curveToRelative(
                    dx1 = -1.24f,
                    dy1 = 1.5f,
                    dx2 = -1.24f,
                    dy2 = 5.0f,
                    dx3 = -0.23f,
                    dy3 = 6.5f,
                )
                // C 5.58 18.03 7 16 7 13.33
                curveTo(
                    x1 = 5.58f,
                    y1 = 18.03f,
                    x2 = 7.0f,
                    y2 = 16.0f,
                    x3 = 7.0f,
                    y3 = 13.33f,
                )
                // m 7.48 -4.37
                moveToRelative(dx = 7.48f, dy = -4.37f)
                // A 10 10 0 0 1 16 6.07
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 6.07f,
                )
                // m 0 11.86
                moveToRelative(dx = 0.0f, dy = 11.86f)
                // a 10 10 0 0 1 -1.73 -3.62
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.73f,
                    dy1 = -3.62f,
                )
            }
            // m16.01 17.93 -.23 1.4 A2 2 0 0 1 13.8 21 H9.5 a6 6 0 0 0 1.49 -3.98 M8.53 3 h5.27 a2 2 0 0 1 1.98 1.67 l.23 1.4 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.01 17.93
                moveTo(x = 16.01f, y = 17.93f)
                // l -0.23 1.4
                lineToRelative(dx = -0.23f, dy = 1.4f)
                // A 2 2 0 0 1 13.8 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.8f,
                    y1 = 21.0f,
                )
                // H 9.5
                horizontalLineTo(x = 9.5f)
                // a 6 6 0 0 0 1.49 -3.98
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.49f,
                    dy1 = -3.98f,
                )
                // M 8.53 3
                moveTo(x = 8.53f, y = 3.0f)
                // h 5.27
                horizontalLineToRelative(dx = 5.27f)
                // a 2 2 0 0 1 1.98 1.67
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.98f,
                    dy1 = 1.67f,
                )
                // l 0.23 1.4
                lineToRelative(dx = 0.23f, dy = 1.4f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _fishOff = it }
    }

@Suppress("ObjectPropertyName")
private var _fishOff: ImageVector? = null
