package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Carrot: ImageVector
    get() {
        val current = _carrot
        if (current != null) return current

        return ImageVector.Builder(
            name = "Carrot",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 16 a1 1 0 0 0 -7 -7 q-4 4 -5.99 12.39 a.5 .5 0 0 0 .6 .6 Q11 20 15 16 l-3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 16
                moveTo(x = 15.0f, y = 16.0f)
                // a 1 1 0 0 0 -7 -7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                // q -4 4 -5.99 12.39
                quadToRelative(
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                    dx2 = -5.99f,
                    dy2 = 12.39f,
                )
                // a 0.5 0.5 0 0 0 0.6 0.6
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.6f,
                    dy1 = 0.6f,
                )
                // Q 11 20 15 16
                quadTo(
                    x1 = 11.0f,
                    y1 = 20.0f,
                    x2 = 15.0f,
                    y2 = 16.0f,
                )
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
            }
            // M15 9 q4 4 7 0 -3 -4 -7 0 4 -4 0 -7 -4 3 0 7 m-7 6 -2.58 -2.58
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // q 4 4 7 0
                quadToRelative(
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                    dx2 = 7.0f,
                    dy2 = 0.0f,
                )
                // q -3 -4 -7 0
                quadToRelative(
                    dx1 = -3.0f,
                    dy1 = -4.0f,
                    dx2 = -7.0f,
                    dy2 = 0.0f,
                )
                // q 4 -4 0 -7
                quadToRelative(
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                    dx2 = 0.0f,
                    dy2 = -7.0f,
                )
                // q -4 3 0 7
                quadToRelative(
                    dx1 = -4.0f,
                    dy1 = 3.0f,
                    dx2 = 0.0f,
                    dy2 = 7.0f,
                )
                // m -7 6
                moveToRelative(dx = -7.0f, dy = 6.0f)
                // l -2.58 -2.58
                lineToRelative(dx = -2.58f, dy = -2.58f)
            }
        }.build().also { _carrot = it }
    }


@Suppress("ObjectPropertyName")
private var _carrot: ImageVector? = null
