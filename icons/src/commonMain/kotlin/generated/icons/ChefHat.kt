package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChefHat: ImageVector
    get() {
        val current = _chefHat
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChefHat",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 11 v5 m4 -5 v5 m-8 -3.35 c0 -.46 -.32 -.84 -.73 -1.04 a4 4 0 0 1 2.25 -7.58 A1.5 1.5 0 0 0 8.89 3.5 a4 4 0 0 1 6.22 0 1.5 1.5 0 0 0 1.37 .54 4 4 0 0 1 2.25 7.58 C18.32 11.8 18 12.19 18 12.65 V19 a2 2 0 0 1 -2 2 H8 a2 2 0 0 1 -2 -2z M6 16 h12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 11
                moveTo(x = 10.0f, y = 11.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m 4 -5
                moveToRelative(dx = 4.0f, dy = -5.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m -8 -3.35
                moveToRelative(dx = -8.0f, dy = -3.35f)
                // c 0 -0.46 -0.32 -0.84 -0.73 -1.04
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.46f,
                    dx2 = -0.32f,
                    dy2 = -0.84f,
                    dx3 = -0.73f,
                    dy3 = -1.04f,
                )
                // a 4 4 0 0 1 2.25 -7.58
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.25f,
                    dy1 = -7.58f,
                )
                // A 1.5 1.5 0 0 0 8.89 3.5
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.89f,
                    y1 = 3.5f,
                )
                // a 4 4 0 0 1 6.22 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.22f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 0 0 1.37 0.54
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.37f,
                    dy1 = 0.54f,
                )
                // a 4 4 0 0 1 2.25 7.58
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.25f,
                    dy1 = 7.58f,
                )
                // C 18.32 11.8 18 12.19 18 12.65
                curveTo(
                    x1 = 18.32f,
                    y1 = 11.8f,
                    x2 = 18.0f,
                    y2 = 12.19f,
                    x3 = 18.0f,
                    y3 = 12.65f,
                )
                // V 19
                verticalLineTo(y = 19.0f)
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
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
                // M 6 16
                moveTo(x = 6.0f, y = 16.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
            }
        }.build().also { _chefHat = it }
    }

@Suppress("ObjectPropertyName")
private var _chefHat: ImageVector? = null
