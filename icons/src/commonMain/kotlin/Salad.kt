package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Salad: ImageVector
    get() {
        val current = _salad
        if (current != null) return current

        return ImageVector.Builder(
            name = "Salad",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19.5 12 a2.5 2.5 0 0 0 .4 -2.21 2 2 0 0 0 .42 -3.29 A2 2 0 0 0 19 3 a2 2 0 0 0 -1.5 .68 2 2 0 0 0 -3.29 .42 2.5 2.5 0 0 0 -3.19 2.06 A3 3 0 0 0 12 12 l4 -4 M4 12 a1 1 0 0 0 -.99 1.13 A9 9 0 0 0 12 21 a9 9 0 0 0 8.99 -7.87 A1 1 0 0 0 20 12z m3 9 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.5 12
                moveTo(x = 19.5f, y = 12.0f)
                // a 2.5 2.5 0 0 0 0.4 -2.21
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.4f,
                    dy1 = -2.21f,
                )
                // a 2 2 0 0 0 0.42 -3.29
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.42f,
                    dy1 = -3.29f,
                )
                // A 2 2 0 0 0 19 3
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 3.0f,
                )
                // a 2 2 0 0 0 -1.5 0.68
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.5f,
                    dy1 = 0.68f,
                )
                // a 2 2 0 0 0 -3.29 0.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.29f,
                    dy1 = 0.42f,
                )
                // a 2.5 2.5 0 0 0 -3.19 2.06
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.19f,
                    dy1 = 2.06f,
                )
                // A 3 3 0 0 0 12 12
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 12.0f,
                )
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // a 1 1 0 0 0 -0.99 1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.99f,
                    dy1 = 1.13f,
                )
                // A 9 9 0 0 0 12 21
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 21.0f,
                )
                // a 9 9 0 0 0 8.99 -7.87
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.99f,
                    dy1 = -7.87f,
                )
                // A 1 1 0 0 0 20 12z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 12.0f,
                )
                close()
                // m 3 9
                moveToRelative(dx = 3.0f, dy = 9.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
            // M9.85 6.9 a3.5 3.5 0 0 0 -4.8 5.1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.85 6.9
                moveTo(x = 9.85f, y = 6.9f)
                // a 3.5 3.5 0 0 0 -4.8 5.1
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.8f,
                    dy1 = 5.1f,
                )
            }
        }.build().also { _salad = it }
    }


@Suppress("ObjectPropertyName")
private var _salad: ImageVector? = null
