package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Infinity: ImageVector
    get() {
        val current = _infinity
        if (current != null) return current

        return ImageVector.Builder(
            name = "Infinity",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 16 c5 0 7 -8 12 -8 a4 4 0 0 1 0 8 c-5 0 -7 -8 -12 -8 a4 4 0 1 0 0 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 16
                moveTo(x = 6.0f, y = 16.0f)
                // c 5 0 7 -8 12 -8
                curveToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                    dx2 = 7.0f,
                    dy2 = -8.0f,
                    dx3 = 12.0f,
                    dy3 = -8.0f,
                )
                // a 4 4 0 0 1 0 8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
                // c -5 0 -7 -8 -12 -8
                curveToRelative(
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = -8.0f,
                    dx3 = -12.0f,
                    dy3 = -8.0f,
                )
                // a 4 4 0 1 0 0 8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
            }
        }.build().also { _infinity = it }
    }


@Suppress("ObjectPropertyName")
private var _infinity: ImageVector? = null
