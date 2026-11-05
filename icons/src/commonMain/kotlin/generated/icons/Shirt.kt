package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Shirt: ImageVector
    get() {
        val current = _shirt
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Shirt",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M20.38 3.46 16 2 a4 4 0 0 1 -8 0 L3.62 3.46 a2 2 0 0 0 -1.34 2.23 l.58 3.47 A1 1 0 0 0 3.85 10 H6 v10 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V10 h2.15 a1 1 0 0 0 .99 -.84 l.58 -3.47 a2 2 0 0 0 -1.34 -2.23
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20.38 3.46
                moveTo(x = 20.38f, y = 3.46f)
                // L 16 2
                lineTo(x = 16.0f, y = 2.0f)
                // a 4 4 0 0 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // L 3.62 3.46
                lineTo(x = 3.62f, y = 3.46f)
                // a 2 2 0 0 0 -1.34 2.23
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.34f,
                    dy1 = 2.23f,
                )
                // l 0.58 3.47
                lineToRelative(dx = 0.58f, dy = 3.47f)
                // A 1 1 0 0 0 3.85 10
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.85f,
                    y1 = 10.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // h 2.15
                horizontalLineToRelative(dx = 2.15f)
                // a 1 1 0 0 0 0.99 -0.84
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.99f,
                    dy1 = -0.84f,
                )
                // l 0.58 -3.47
                lineToRelative(dx = 0.58f, dy = -3.47f)
                // a 2 2 0 0 0 -1.34 -2.23
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.34f,
                    dy1 = -2.23f,
                )
            }
        }.build().also { _shirt = it }
    }

@Suppress("ObjectPropertyName")
private var _shirt: ImageVector? = null
