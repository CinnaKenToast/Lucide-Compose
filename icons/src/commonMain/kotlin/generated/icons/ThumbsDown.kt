package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ThumbsDown: ImageVector
    get() {
        val current = _thumbsDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ThumbsDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9 18.12 10 14 H4.17 a2 2 0 0 1 -1.92 -2.56 l2.33 -8 A2 2 0 0 1 6.5 2 H20 a2 2 0 0 1 2 2 v8 a2 2 0 0 1 -2 2 h-2.76 a2 2 0 0 0 -1.79 1.11 L12 22 a3.13 3.13 0 0 1 -3 -3.88 M17 14 V2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 18.12
                moveTo(x = 9.0f, y = 18.12f)
                // L 10 14
                lineTo(x = 10.0f, y = 14.0f)
                // H 4.17
                horizontalLineTo(x = 4.17f)
                // a 2 2 0 0 1 -1.92 -2.56
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.92f,
                    dy1 = -2.56f,
                )
                // l 2.33 -8
                lineToRelative(dx = 2.33f, dy = -8.0f)
                // A 2 2 0 0 1 6.5 2
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.5f,
                    y1 = 2.0f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // h -2.76
                horizontalLineToRelative(dx = -2.76f)
                // a 2 2 0 0 0 -1.79 1.11
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.79f,
                    dy1 = 1.11f,
                )
                // L 12 22
                lineTo(x = 12.0f, y = 22.0f)
                // a 3.13 3.13 0 0 1 -3 -3.88
                arcToRelative(
                    a = 3.13f,
                    b = 3.13f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.88f,
                )
                // M 17 14
                moveTo(x = 17.0f, y = 14.0f)
                // V 2
                verticalLineTo(y = 2.0f)
            }
        }.build().also { _thumbsDown = it }
    }

@Suppress("ObjectPropertyName")
private var _thumbsDown: ImageVector? = null
