package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HeartHandshake: ImageVector
    get() {
        val current = _heartHandshake
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HeartHandshake",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19.41 14.41 C21 12.83 22 11.5 22 9.5 a5.5 5.5 0 0 0 -9.6 -3.68 .6 .6 0 0 1 -.8 0 A5.5 5.5 0 0 0 2 9.5 c0 2.3 1.5 4 3 5.5 l5.54 5.36 a2 2 0 0 0 2.87 .05 2.1 2.1 0 0 0 0 -3 2.12 2.12 0 1 0 3 -3 2.1 2.1 0 0 0 3 0 2 2 0 0 0 0 -2.82 L17.53 9.7 a2.4 2.4 0 0 0 -3.4 0 l-1.72 1.71 a2 2 0 0 1 -2.82 0 2 2 0 0 1 0 -2.82 l2.82 -2.77
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.41 14.41
                moveTo(x = 19.41f, y = 14.41f)
                // C 21 12.83 22 11.5 22 9.5
                curveTo(
                    x1 = 21.0f,
                    y1 = 12.83f,
                    x2 = 22.0f,
                    y2 = 11.5f,
                    x3 = 22.0f,
                    y3 = 9.5f,
                )
                // a 5.5 5.5 0 0 0 -9.6 -3.68
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.6f,
                    dy1 = -3.68f,
                )
                // a 0.6 0.6 0 0 1 -0.8 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.8f,
                    dy1 = 0.0f,
                )
                // A 5.5 5.5 0 0 0 2 9.5
                arcTo(
                    horizontalEllipseRadius = 5.5f,
                    verticalEllipseRadius = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 9.5f,
                )
                // c 0 2.3 1.5 4 3 5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.3f,
                    dx2 = 1.5f,
                    dy2 = 4.0f,
                    dx3 = 3.0f,
                    dy3 = 5.5f,
                )
                // l 5.54 5.36
                lineToRelative(dx = 5.54f, dy = 5.36f)
                // a 2 2 0 0 0 2.87 0.05
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.87f,
                    dy1 = 0.05f,
                )
                // a 2.1 2.1 0 0 0 0 -3
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                )
                // a 2.12 2.12 0 1 0 3 -3
                arcToRelative(
                    a = 2.12f,
                    b = 2.12f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // a 2.1 2.1 0 0 0 3 0
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 0 0 0 -2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.82f,
                )
                // L 17.53 9.7
                lineTo(x = 17.53f, y = 9.7f)
                // a 2.4 2.4 0 0 0 -3.4 0
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.4f,
                    dy1 = 0.0f,
                )
                // l -1.72 1.71
                lineToRelative(dx = -1.72f, dy = 1.71f)
                // a 2 2 0 0 1 -2.82 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.82f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 0 1 0 -2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.82f,
                )
                // l 2.82 -2.77
                lineToRelative(dx = 2.82f, dy = -2.77f)
            }
        }.build().also { _heartHandshake = it }
    }

@Suppress("ObjectPropertyName")
private var _heartHandshake: ImageVector? = null
