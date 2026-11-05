package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mouth: ImageVector
    get() {
        val current = _mouth
        if (current != null) return current

        return ImageVector.Builder(
            name = "Mouth",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 12 a51 51 0 0 0 20 0 1 1 0 0 0 -1 -1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // a 51 51 0 0 0 20 0
                arcToRelative(
                    a = 51.0f,
                    b = 51.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
            }
            // M2.46 11.16 a1 1 0 0 0 -.31 1.37 11.6 11.6 0 0 0 19.7 0 1 1 0 0 0 -.3 -1.37 c-2.43 -1.57 -3.66 -2.28 -5.49 -3.64 a2.6 2.6 0 0 0 -3.37 .2 1 1 0 0 1 -1.38 0 2.6 2.6 0 0 0 -3.37 -.2 C6.1 8.88 4.88 9.59 2.46 11.16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2.46 11.16
                moveTo(x = 2.46f, y = 11.16f)
                // a 1 1 0 0 0 -0.31 1.37
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.31f,
                    dy1 = 1.37f,
                )
                // a 11.6 11.6 0 0 0 19.7 0
                arcToRelative(
                    a = 11.6f,
                    b = 11.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 19.7f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 0 0 -0.3 -1.37
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.3f,
                    dy1 = -1.37f,
                )
                // c -2.43 -1.57 -3.66 -2.28 -5.49 -3.64
                curveToRelative(
                    dx1 = -2.43f,
                    dy1 = -1.57f,
                    dx2 = -3.66f,
                    dy2 = -2.28f,
                    dx3 = -5.49f,
                    dy3 = -3.64f,
                )
                // a 2.6 2.6 0 0 0 -3.37 0.2
                arcToRelative(
                    a = 2.6f,
                    b = 2.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.37f,
                    dy1 = 0.2f,
                )
                // a 1 1 0 0 1 -1.38 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.38f,
                    dy1 = 0.0f,
                )
                // a 2.6 2.6 0 0 0 -3.37 -0.2
                arcToRelative(
                    a = 2.6f,
                    b = 2.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.37f,
                    dy1 = -0.2f,
                )
                // C 6.1 8.88 4.88 9.59 2.46 11.16
                curveTo(
                    x1 = 6.1f,
                    y1 = 8.88f,
                    x2 = 4.88f,
                    y2 = 9.59f,
                    x3 = 2.46f,
                    y3 = 11.16f,
                )
            }
        }.build().also { _mouth = it }
    }


@Suppress("ObjectPropertyName")
private var _mouth: ImageVector? = null
