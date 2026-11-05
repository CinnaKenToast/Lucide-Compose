package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageCircleHeart: ImageVector
    get() {
        val current = _messageCircleHeart
        if (current != null) return current

        return ImageVector.Builder(
            name = "MessageCircleHeart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 16.34 a2 2 0 0 1 .09 1.17 L2.02 20.8 a1 1 0 0 0 1.24 1.17 l3.41 -1 a2 2 0 0 1 1.1 .1 10 10 0 1 0 -4.78 -4.73
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 16.34
                moveTo(x = 3.0f, y = 16.34f)
                // a 2 2 0 0 1 0.09 1.17
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.09f,
                    dy1 = 1.17f,
                )
                // L 2.02 20.8
                lineTo(x = 2.02f, y = 20.8f)
                // a 1 1 0 0 0 1.24 1.17
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.24f,
                    dy1 = 1.17f,
                )
                // l 3.41 -1
                lineToRelative(dx = 3.41f, dy = -1.0f)
                // a 2 2 0 0 1 1.1 0.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.1f,
                )
                // a 10 10 0 1 0 -4.78 -4.73
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.78f,
                    dy1 = -4.73f,
                )
            }
            // M7.83 13.07 A3 3 0 0 1 12 8.77 a3 3 0 0 1 5 2.22 3 3 0 0 1 -.83 2.08 l-3.45 3.62 a1 1 0 0 1 -1.45 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7.83 13.07
                moveTo(x = 7.83f, y = 13.07f)
                // A 3 3 0 0 1 12 8.77
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 8.77f,
                )
                // a 3 3 0 0 1 5 2.22
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 2.22f,
                )
                // a 3 3 0 0 1 -0.83 2.08
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.83f,
                    dy1 = 2.08f,
                )
                // l -3.45 3.62
                lineToRelative(dx = -3.45f, dy = 3.62f)
                // a 1 1 0 0 1 -1.45 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.45f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _messageCircleHeart = it }
    }


@Suppress("ObjectPropertyName")
private var _messageCircleHeart: ImageVector? = null
