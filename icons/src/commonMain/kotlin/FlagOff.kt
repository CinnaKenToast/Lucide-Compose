package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlagOff: ImageVector
    get() {
        val current = _flagOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "FlagOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 16 c-3 0 -5 -2 -8 -2 a6 6 0 0 0 -4 1.53 M2 2 l20 20 M4 22 V4 m3.66 -2 H8 c3 0 5 2 7.33 2 q2 0 3.07 -.8 A1 1 0 0 1 20 4 v10.35
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // c -3 0 -5 -2 -8 -2
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = -2.0f,
                    dx3 = -8.0f,
                    dy3 = -2.0f,
                )
                // a 6 6 0 0 0 -4 1.53
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 1.53f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 4 22
                moveTo(x = 4.0f, y = 22.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // m 3.66 -2
                moveToRelative(dx = 3.66f, dy = -2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // c 3 0 5 2 7.33 2
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = 2.0f,
                    dx3 = 7.33f,
                    dy3 = 2.0f,
                )
                // q 2 0 3.07 -0.8
                quadToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 3.07f,
                    dy2 = -0.8f,
                )
                // A 1 1 0 0 1 20 4
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 4.0f,
                )
                // v 10.35
                verticalLineToRelative(dy = 10.35f)
            }
        }.build().also { _flagOff = it }
    }


@Suppress("ObjectPropertyName")
private var _flagOff: ImageVector? = null
