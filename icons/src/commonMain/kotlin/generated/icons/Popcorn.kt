package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Popcorn: ImageVector
    get() {
        val current = _popcorn
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Popcorn",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 8 a2 2 0 0 0 0 -4 2 2 0 0 0 -4 0 2 2 0 0 0 -4 0 2 2 0 0 0 -4 0 2 2 0 0 0 0 4 m4 14 L9 8 m5 14 1 -14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 8
                moveTo(x = 18.0f, y = 8.0f)
                // a 2 2 0 0 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // a 2 2 0 0 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 0 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 0 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 0 0 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // m 4 14
                moveToRelative(dx = 4.0f, dy = 14.0f)
                // L 9 8
                lineTo(x = 9.0f, y = 8.0f)
                // m 5 14
                moveToRelative(dx = 5.0f, dy = 14.0f)
                // l 1 -14
                lineToRelative(dx = 1.0f, dy = -14.0f)
            }
            // M20 8 c.5 0 .9 .4 .8 1 l-2.6 12 c-.1 .5 -.7 1 -1.2 1 H7 c-.6 0 -1.1 -.4 -1.2 -1 L3.2 9 C3.1 8.4 3.5 8 4 8Z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 8
                moveTo(x = 20.0f, y = 8.0f)
                // c 0.5 0 0.9 0.4 0.8 1
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.0f,
                    dx2 = 0.9f,
                    dy2 = 0.4f,
                    dx3 = 0.8f,
                    dy3 = 1.0f,
                )
                // l -2.6 12
                lineToRelative(dx = -2.6f, dy = 12.0f)
                // c -0.1 0.5 -0.7 1 -1.2 1
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.5f,
                    dx2 = -0.7f,
                    dy2 = 1.0f,
                    dx3 = -1.2f,
                    dy3 = 1.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // c -0.6 0 -1.1 -0.4 -1.2 -1
                curveToRelative(
                    dx1 = -0.6f,
                    dy1 = 0.0f,
                    dx2 = -1.1f,
                    dy2 = -0.4f,
                    dx3 = -1.2f,
                    dy3 = -1.0f,
                )
                // L 3.2 9
                lineTo(x = 3.2f, y = 9.0f)
                // C 3.1 8.4 3.5 8 4 8z
                curveTo(
                    x1 = 3.1f,
                    y1 = 8.4f,
                    x2 = 3.5f,
                    y2 = 8.0f,
                    x3 = 4.0f,
                    y3 = 8.0f,
                )
                close()
            }
        }.build().also { _popcorn = it }
    }

@Suppress("ObjectPropertyName")
private var _popcorn: ImageVector? = null
