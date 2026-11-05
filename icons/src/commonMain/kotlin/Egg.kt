package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Egg: ImageVector
    get() {
        val current = _egg
        if (current != null) return current

        return ImageVector.Builder(
            name = "Egg",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 C8 2 4 8 4 14 a8 8 0 0 0 16 0 c0 -6 -4 -12 -8 -12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // C 8 2 4 8 4 14
                curveTo(
                    x1 = 8.0f,
                    y1 = 2.0f,
                    x2 = 4.0f,
                    y2 = 8.0f,
                    x3 = 4.0f,
                    y3 = 14.0f,
                )
                // a 8 8 0 0 0 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // c 0 -6 -4 -12 -8 -12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                    dx2 = -4.0f,
                    dy2 = -12.0f,
                    dx3 = -8.0f,
                    dy3 = -12.0f,
                )
            }
        }.build().also { _egg = it }
    }


@Suppress("ObjectPropertyName")
private var _egg: ImageVector? = null
