package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeartX: ImageVector
    get() {
        val current = _heartX
        if (current != null) return current

        return ImageVector.Builder(
            name = "HeartX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15.5 12.5 5 5 m0 -5 -5 5 m6.45 -8.73 a5.5 5.5 0 0 0 -9.54 -2.95 .6 .6 0 0 1 -.82 0 A5.5 5.5 0 0 0 2 9.5 c0 2.3 1.5 4 3 5.5 l5.5 5.33 a2 2 0 0 0 2.58 .35
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.5 12.5
                moveTo(x = 15.5f, y = 12.5f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // m 6.45 -8.73
                moveToRelative(dx = 6.45f, dy = -8.73f)
                // a 5.5 5.5 0 0 0 -9.54 -2.95
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.54f,
                    dy1 = -2.95f,
                )
                // a 0.6 0.6 0 0 1 -0.82 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.82f,
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
                // l 5.5 5.33
                lineToRelative(dx = 5.5f, dy = 5.33f)
                // a 2 2 0 0 0 2.58 0.35
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.58f,
                    dy1 = 0.35f,
                )
            }
        }.build().also { _heartX = it }
    }


@Suppress("ObjectPropertyName")
private var _heartX: ImageVector? = null
