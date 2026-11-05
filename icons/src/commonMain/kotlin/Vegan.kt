package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Vegan: ImageVector
    get() {
        val current = _vegan
        if (current != null) return current

        return ImageVector.Builder(
            name = "Vegan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 8 q6 0 6 -6 -6 0 -6 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // q 6 0 6 -6
                quadToRelative(
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = -6.0f,
                )
                // q -6 0 -6 6
                quadToRelative(
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 6.0f,
                )
            }
            // M17.41 3.59 a10 10 0 1 0 3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.41 3.59
                moveTo(x = 17.41f, y = 3.59f)
                // a 10 10 0 1 0 3 3
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
            }
            // M2 2 a26.6 26.6 0 0 1 10 20 c.9 -6.82 1.5 -9.5 4 -14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // a 26.6 26.6 0 0 1 10 20
                arcToRelative(
                    a = 26.6f,
                    b = 26.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 20.0f,
                )
                // c 0.9 -6.82 1.5 -9.5 4 -14
                curveToRelative(
                    dx1 = 0.9f,
                    dy1 = -6.82f,
                    dx2 = 1.5f,
                    dy2 = -9.5f,
                    dx3 = 4.0f,
                    dy3 = -14.0f,
                )
            }
        }.build().also { _vegan = it }
    }


@Suppress("ObjectPropertyName")
private var _vegan: ImageVector? = null
