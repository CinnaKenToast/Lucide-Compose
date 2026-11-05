package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ShoppingBag: ImageVector
    get() {
        val current = _shoppingBag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ShoppingBag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 10 a4 4 0 0 1 -8 0 M3.1 6.03 h17.8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 10
                moveTo(x = 16.0f, y = 10.0f)
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
                // M 3.1 6.03
                moveTo(x = 3.1f, y = 6.03f)
                // h 17.8
                horizontalLineToRelative(dx = 17.8f)
            }
            // M3.4 5.47 A2 2 0 0 0 3 6.67 V20 a2 2 0 0 0 2 2 h14 a2 2 0 0 0 2 -2 V6.67 a2 2 0 0 0 -.4 -1.2 l-2 -2.67 A2 2 0 0 0 17 2 H7 a2 2 0 0 0 -1.6 .8z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3.4 5.47
                moveTo(x = 3.4f, y = 5.47f)
                // A 2 2 0 0 0 3 6.67
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 6.67f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // V 6.67
                verticalLineTo(y = 6.67f)
                // a 2 2 0 0 0 -0.4 -1.2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.4f,
                    dy1 = -1.2f,
                )
                // l -2 -2.67
                lineToRelative(dx = -2.0f, dy = -2.67f)
                // A 2 2 0 0 0 17 2
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 2.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 2 2 0 0 0 -1.6 0.8z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.6f,
                    dy1 = 0.8f,
                )
                close()
            }
        }.build().also { _shoppingBag = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingBag: ImageVector? = null
