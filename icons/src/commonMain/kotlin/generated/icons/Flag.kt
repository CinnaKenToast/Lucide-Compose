package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Flag: ImageVector
    get() {
        val current = _flag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Flag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 22 V4 a1 1 0 0 1 .4 -.8 A6 6 0 0 1 8 2 c3 0 5 2 7.33 2 q2 0 3.07 -.8 A1 1 0 0 1 20 4 v10 a1 1 0 0 1 -.4 .8 A6 6 0 0 1 16 16 c-3 0 -5 -2 -8 -2 a6 6 0 0 0 -4 1.53
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 22
                moveTo(x = 4.0f, y = 22.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 1 1 0 0 1 0.4 -0.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = -0.8f,
                )
                // A 6 6 0 0 1 8 2
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 2.0f,
                )
                // c 3 0 5 2 7.33 2
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = 2.0f,
                    dx3 = 7.33f,
                    dy3 = 2.0f,
                )
                // q 2 0 3.07 -0.8
                quadToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 3.07f,
                    dy2 = -0.8f,
                )
                // A 1 1 0 0 1 20 4
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 4.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 1 1 0 0 1 -0.4 0.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.8f,
                )
                // A 6 6 0 0 1 16 16
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 16.0f,
                )
                // c -3 0 -5 -2 -8 -2
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = -2.0f,
                    dx3 = -8.0f,
                    dy3 = -2.0f,
                )
                // a 6 6 0 0 0 -4 1.53
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 1.53f,
                )
            }
        }.build().also { _flag = it }
    }

@Suppress("ObjectPropertyName")
private var _flag: ImageVector? = null
