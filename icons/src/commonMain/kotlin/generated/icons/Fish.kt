package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Fish: ImageVector
    get() {
        val current = _fish
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Fish",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6.5 12 c.94 -3.46 4.94 -6 8.5 -6 s6.06 2.54 7 6 c-.94 3.47 -3.44 6 -7 6 s-7.56 -2.53 -8.5 -6 M18 12 v.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.5 12
                moveTo(x = 6.5f, y = 12.0f)
                // c 0.94 -3.46 4.94 -6 8.5 -6
                curveToRelative(
                    dx1 = 0.94f,
                    dy1 = -3.46f,
                    dx2 = 4.94f,
                    dy2 = -6.0f,
                    dx3 = 8.5f,
                    dy3 = -6.0f,
                )
                // s 6.06 2.54 7 6
                reflectiveCurveToRelative(
                    dx1 = 6.06f,
                    dy1 = 2.54f,
                    dx2 = 7.0f,
                    dy2 = 6.0f,
                )
                // c -0.94 3.47 -3.44 6 -7 6
                curveToRelative(
                    dx1 = -0.94f,
                    dy1 = 3.47f,
                    dx2 = -3.44f,
                    dy2 = 6.0f,
                    dx3 = -7.0f,
                    dy3 = 6.0f,
                )
                // s -7.56 -2.53 -8.5 -6
                reflectiveCurveToRelative(
                    dx1 = -7.56f,
                    dy1 = -2.53f,
                    dx2 = -8.5f,
                    dy2 = -6.0f,
                )
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // v 0.5
                verticalLineToRelative(dy = 0.5f)
            }
            // M16 17.93 a9.8 9.8 0 0 1 0 -11.86 m-9 4.6 C7 8 5.58 5.97 2.73 5.5 c-1 1.5 -1 5 .23 6.5 -1.24 1.5 -1.24 5 -.23 6.5 C5.58 18.03 7 16 7 13.33
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 17.93
                moveTo(x = 16.0f, y = 17.93f)
                // a 9.8 9.8 0 0 1 0 -11.86
                arcToRelative(
                    a = 9.8f,
                    b = 9.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -11.86f,
                )
                // m -9 4.6
                moveToRelative(dx = -9.0f, dy = 4.6f)
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
            }
            // M10.46 7.26 C10.2 5.88 9.17 4.24 8 3 h5.8 a2 2 0 0 1 1.98 1.67 l.23 1.4 m0 11.86 -.23 1.4 A2 2 0 0 1 13.8 21 H9.5 a6 6 0 0 0 1.49 -3.98
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.46 7.26
                moveTo(x = 10.46f, y = 7.26f)
                // C 10.2 5.88 9.17 4.24 8 3
                curveTo(
                    x1 = 10.2f,
                    y1 = 5.88f,
                    x2 = 9.17f,
                    y2 = 4.24f,
                    x3 = 8.0f,
                    y3 = 3.0f,
                )
                // h 5.8
                horizontalLineToRelative(dx = 5.8f)
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
                // m 0 11.86
                moveToRelative(dx = 0.0f, dy = 11.86f)
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
            }
        }.build().also { _fish = it }
    }

@Suppress("ObjectPropertyName")
private var _fish: ImageVector? = null
