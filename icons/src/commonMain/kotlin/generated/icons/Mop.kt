package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Mop: ImageVector
    get() {
        val current = _mop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Mop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 22 c2.76 0 5 -1.79 5 -4 -4.42 0 -4.08 -5 -8.5 -5 a1 1 0 1 0 0 9z a3 3 0 0 1 -3 -3 m5.5 -7.5 L22 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 22
                moveTo(x = 10.0f, y = 22.0f)
                // c 2.76 0 5 -1.79 5 -4
                curveToRelative(
                    dx1 = 2.76f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = -1.79f,
                    dx3 = 5.0f,
                    dy3 = -4.0f,
                )
                // c -4.42 0 -4.08 -5 -8.5 -5
                curveToRelative(
                    dx1 = -4.42f,
                    dy1 = 0.0f,
                    dx2 = -4.08f,
                    dy2 = -5.0f,
                    dx3 = -8.5f,
                    dy3 = -5.0f,
                )
                // a 1 1 0 1 0 0 9z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 9.0f,
                )
                close()
                // a 3 3 0 0 1 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // m 5.5 -7.5
                moveToRelative(dx = 5.5f, dy = -7.5f)
                // L 22 2
                lineTo(x = 22.0f, y = 2.0f)
            }
            // m6.98 13.02 2.67 -2.66 a1.2 1.2 0 0 1 1.7 0 l2.3 2.28 a1.2 1.2 0 0 1 0 1.72 l-2.1 2.08
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.98 13.02
                moveTo(x = 6.98f, y = 13.02f)
                // l 2.67 -2.66
                lineToRelative(dx = 2.67f, dy = -2.66f)
                // a 1.2 1.2 0 0 1 1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 2.3 2.28
                lineToRelative(dx = 2.3f, dy = 2.28f)
                // a 1.2 1.2 0 0 1 0 1.72
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.72f,
                )
                // l -2.1 2.08
                lineToRelative(dx = -2.1f, dy = 2.08f)
            }
        }.build().also { _mop = it }
    }

@Suppress("ObjectPropertyName")
private var _mop: ImageVector? = null
