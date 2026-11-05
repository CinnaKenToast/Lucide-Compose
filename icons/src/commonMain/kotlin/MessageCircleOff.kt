package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageCircleOff: ImageVector
    get() {
        val current = _messageCircleOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "MessageCircleOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 2 20 20 M4.93 4.93 a10 10 0 0 0 -1.94 11.41 2 2 0 0 1 .1 1.17 L2.02 20.8 a1 1 0 0 0 1.24 1.17 l3.41 -1 a2 2 0 0 1 1.1 .09 10 10 0 0 0 11.3 -1.99 M8.35 2.7 A10 10 0 0 1 21.3 15.65
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 4.93 4.93
                moveTo(x = 4.93f, y = 4.93f)
                // a 10 10 0 0 0 -1.94 11.41
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.94f,
                    dy1 = 11.41f,
                )
                // a 2 2 0 0 1 0.1 1.17
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.1f,
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
                // a 2 2 0 0 1 1.1 0.09
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.09f,
                )
                // a 10 10 0 0 0 11.3 -1.99
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 11.3f,
                    dy1 = -1.99f,
                )
                // M 8.35 2.7
                moveTo(x = 8.35f, y = 2.7f)
                // A 10 10 0 0 1 21.3 15.65
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.3f,
                    y1 = 15.65f,
                )
            }
        }.build().also { _messageCircleOff = it }
    }


@Suppress("ObjectPropertyName")
private var _messageCircleOff: ImageVector? = null
