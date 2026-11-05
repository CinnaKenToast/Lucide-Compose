package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Rose: ImageVector
    get() {
        val current = _rose
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Rose",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 10 h-1 a4 4 0 1 1 4 -4 v.53
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 10
                moveTo(x = 17.0f, y = 10.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 4 4 0 1 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // v 0.53
                verticalLineToRelative(dy = 0.53f)
            }
            // M17 6 h1 a4 4 0 0 1 1.42 7.74 l-2.29 .87 a6 6 0 0 1 -5.34 -10.68 l2.07 -1.31 M4.5 17 c2.8 -.5 4.4 0 5.5 .8 s1.8 2.2 2.3 3.7 c-2 .4 -3.5 .4 -4.8 -.3 -1.2 -.6 -2.3 -1.9 -3 -4.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 6
                moveTo(x = 17.0f, y = 6.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 4 4 0 0 1 1.42 7.74
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.42f,
                    dy1 = 7.74f,
                )
                // l -2.29 0.87
                lineToRelative(dx = -2.29f, dy = 0.87f)
                // a 6 6 0 0 1 -5.34 -10.68
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.34f,
                    dy1 = -10.68f,
                )
                // l 2.07 -1.31
                lineToRelative(dx = 2.07f, dy = -1.31f)
                // M 4.5 17
                moveTo(x = 4.5f, y = 17.0f)
                // c 2.8 -0.5 4.4 0 5.5 0.8
                curveToRelative(
                    dx1 = 2.8f,
                    dy1 = -0.5f,
                    dx2 = 4.4f,
                    dy2 = 0.0f,
                    dx3 = 5.5f,
                    dy3 = 0.8f,
                )
                // s 1.8 2.2 2.3 3.7
                reflectiveCurveToRelative(
                    dx1 = 1.8f,
                    dy1 = 2.2f,
                    dx2 = 2.3f,
                    dy2 = 3.7f,
                )
                // c -2 0.4 -3.5 0.4 -4.8 -0.3
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.4f,
                    dx2 = -3.5f,
                    dy2 = 0.4f,
                    dx3 = -4.8f,
                    dy3 = -0.3f,
                )
                // c -1.2 -0.6 -2.3 -1.9 -3 -4.2
                curveToRelative(
                    dx1 = -1.2f,
                    dy1 = -0.6f,
                    dx2 = -2.3f,
                    dy2 = -1.9f,
                    dx3 = -3.0f,
                    dy3 = -4.2f,
                )
            }
            // M9.77 12 C4 15 2 22 2 22
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.77 12
                moveTo(x = 9.77f, y = 12.0f)
                // C 4 15 2 22 2 22
                curveTo(
                    x1 = 4.0f,
                    y1 = 15.0f,
                    x2 = 2.0f,
                    y2 = 22.0f,
                    x3 = 2.0f,
                    y3 = 22.0f,
                )
            }
            // <circle cx="17.0" cy="8.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 8
                moveTo(x = 17.0f, y = 8.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _rose = it }
    }

@Suppress("ObjectPropertyName")
private var _rose: ImageVector? = null
