package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Milk: ImageVector
    get() {
        val current = _milk
        if (current != null) return current

        return ImageVector.Builder(
            name = "Milk",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 2 h8 M9 2 v2.79 A4 4 0 0 1 8.33 7 L7.67 7.99 A4 4 0 0 0 7 10.21 V20 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-9.79 A4 4 0 0 0 16.33 8 l-.66 -.98 A4 4 0 0 1 15 4.79 V2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 9 2
                moveTo(x = 9.0f, y = 2.0f)
                // v 2.79
                verticalLineToRelative(dy = 2.79f)
                // A 4 4 0 0 1 8.33 7
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.33f,
                    y1 = 7.0f,
                )
                // L 7.67 7.99
                lineTo(x = 7.67f, y = 7.99f)
                // A 4 4 0 0 0 7 10.21
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 10.21f,
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v -9.79
                verticalLineToRelative(dy = -9.79f)
                // A 4 4 0 0 0 16.33 8
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.33f,
                    y1 = 8.0f,
                )
                // l -0.66 -0.98
                lineToRelative(dx = -0.66f, dy = -0.98f)
                // A 4 4 0 0 1 15 4.79
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 4.79f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
            }
            // M7 15 a6.5 6.5 0 0 1 5 0 6.5 6.5 0 0 0 5 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 15
                moveTo(x = 7.0f, y = 15.0f)
                // a 6.5 6.5 0 0 1 5 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 6.5 6.5 0 0 0 5 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _milk = it }
    }


@Suppress("ObjectPropertyName")
private var _milk: ImageVector? = null
