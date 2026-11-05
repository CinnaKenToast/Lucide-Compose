package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BeerOff: ImageVector
    get() {
        val current = _beerOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BeerOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 13 v5 m4 -6.53 V8 m0 3 h1 a3 3 0 0 1 2.75 4.21 M2 2 l20 20 M5 8 v12 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 13
                moveTo(x = 13.0f, y = 13.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m 4 -6.53
                moveToRelative(dx = 4.0f, dy = -6.53f)
                // V 8
                verticalLineTo(y = 8.0f)
                // m 0 3
                moveToRelative(dx = 0.0f, dy = 3.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 3 3 0 0 1 2.75 4.21
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.75f,
                    dy1 = 4.21f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 5 8
                moveTo(x = 5.0f, y = 8.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
            }
            // M7.54 7.54 C6.77 7.64 6.15 8 5.5 8 a2.5 2.5 0 0 1 -1.77 -4.27 m5 -.53 C9.3 2.77 9.88 2 11 2 c1.56 0 2 1.5 3 1.5 S15.72 3 16.5 3 a1 1 0 1 1 0 5 C15.72 8 15 7.5 14 7.5 a3 3 0 0 0 -.84 .12 M9 14.6 V18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7.54 7.54
                moveTo(x = 7.54f, y = 7.54f)
                // C 6.77 7.64 6.15 8 5.5 8
                curveTo(
                    x1 = 6.77f,
                    y1 = 7.64f,
                    x2 = 6.15f,
                    y2 = 8.0f,
                    x3 = 5.5f,
                    y3 = 8.0f,
                )
                // a 2.5 2.5 0 0 1 -1.77 -4.27
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.77f,
                    dy1 = -4.27f,
                )
                // m 5 -0.53
                moveToRelative(dx = 5.0f, dy = -0.53f)
                // C 9.3 2.77 9.88 2 11 2
                curveTo(
                    x1 = 9.3f,
                    y1 = 2.77f,
                    x2 = 9.88f,
                    y2 = 2.0f,
                    x3 = 11.0f,
                    y3 = 2.0f,
                )
                // c 1.56 0 2 1.5 3 1.5
                curveToRelative(
                    dx1 = 1.56f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 1.5f,
                    dx3 = 3.0f,
                    dy3 = 1.5f,
                )
                // S 15.72 3 16.5 3
                reflectiveCurveTo(
                    x1 = 15.72f,
                    y1 = 3.0f,
                    x2 = 16.5f,
                    y2 = 3.0f,
                )
                // a 1 1 0 1 1 0 5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // C 15.72 8 15 7.5 14 7.5
                curveTo(
                    x1 = 15.72f,
                    y1 = 8.0f,
                    x2 = 15.0f,
                    y2 = 7.5f,
                    x3 = 14.0f,
                    y3 = 7.5f,
                )
                // a 3 3 0 0 0 -0.84 0.12
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.84f,
                    dy1 = 0.12f,
                )
                // M 9 14.6
                moveTo(x = 9.0f, y = 14.6f)
                // V 18
                verticalLineTo(y = 18.0f)
            }
        }.build().also { _beerOff = it }
    }

@Suppress("ObjectPropertyName")
private var _beerOff: ImageVector? = null
