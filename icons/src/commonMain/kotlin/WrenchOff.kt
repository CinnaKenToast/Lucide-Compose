package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WrenchOff: ImageVector
    get() {
        val current = _wrenchOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "WrenchOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.75 5.1 a6 6 0 0 1 6.84 -2.89 c.44 .12 .54 .66 .22 .98 L14.7 6.3 a1 1 0 0 0 0 1.4 l1.6 1.6 a1 1 0 0 0 1.4 0 l3.1 -3.1 c.33 -.33 .87 -.23 .99 .21 a6 6 0 0 1 -2.88 6.84 M13.5 13.5 l-7.88 7.88 a1 1 0 0 1 -3 -3 l7.88 -7.88 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.75 5.1
                moveTo(x = 10.75f, y = 5.1f)
                // a 6 6 0 0 1 6.84 -2.89
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.84f,
                    dy1 = -2.89f,
                )
                // c 0.44 0.12 0.54 0.66 0.22 0.98
                curveToRelative(
                    dx1 = 0.44f,
                    dy1 = 0.12f,
                    dx2 = 0.54f,
                    dy2 = 0.66f,
                    dx3 = 0.22f,
                    dy3 = 0.98f,
                )
                // L 14.7 6.3
                lineTo(x = 14.7f, y = 6.3f)
                // a 1 1 0 0 0 0 1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.4f,
                )
                // l 1.6 1.6
                lineToRelative(dx = 1.6f, dy = 1.6f)
                // a 1 1 0 0 0 1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 3.1 -3.1
                lineToRelative(dx = 3.1f, dy = -3.1f)
                // c 0.33 -0.33 0.87 -0.23 0.99 0.21
                curveToRelative(
                    dx1 = 0.33f,
                    dy1 = -0.33f,
                    dx2 = 0.87f,
                    dy2 = -0.23f,
                    dx3 = 0.99f,
                    dy3 = 0.21f,
                )
                // a 6 6 0 0 1 -2.88 6.84
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.88f,
                    dy1 = 6.84f,
                )
                // M 13.5 13.5
                moveTo(x = 13.5f, y = 13.5f)
                // l -7.88 7.88
                lineToRelative(dx = -7.88f, dy = 7.88f)
                // a 1 1 0 0 1 -3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // l 7.88 -7.88
                lineToRelative(dx = 7.88f, dy = -7.88f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _wrenchOff = it }
    }


@Suppress("ObjectPropertyName")
private var _wrenchOff: ImageVector? = null
