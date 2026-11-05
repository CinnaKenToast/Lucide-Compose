package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lambda: ImageVector
    get() {
        val current = _lambda
        if (current != null) return current

        return ImageVector.Builder(
            name = "Lambda",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.38 10 5 20 m14 -2 a2 2 0 0 1 -2 2 C12.13 20 11.95 4 7 4 a2 2 0 0 0 -2 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.38 10
                moveTo(x = 11.38f, y = 10.0f)
                // L 5 20
                lineTo(x = 5.0f, y = 20.0f)
                // m 14 -2
                moveToRelative(dx = 14.0f, dy = -2.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // C 12.13 20 11.95 4 7 4
                curveTo(
                    x1 = 12.13f,
                    y1 = 20.0f,
                    x2 = 11.95f,
                    y2 = 4.0f,
                    x3 = 7.0f,
                    y3 = 4.0f,
                )
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
            }
        }.build().also { _lambda = it }
    }


@Suppress("ObjectPropertyName")
private var _lambda: ImageVector? = null
