package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Euro: ImageVector
    get() {
        val current = _euro
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Euro",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 10 h12 M4 14 h9 m6 -8 a7.7 7.7 0 0 0 -5.2 -2 A7.9 7.9 0 0 0 6 12 c0 4.4 3.5 8 7.8 8 a8 8 0 0 0 5.2 -2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 10
                moveTo(x = 4.0f, y = 10.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // M 4 14
                moveTo(x = 4.0f, y = 14.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // m 6 -8
                moveToRelative(dx = 6.0f, dy = -8.0f)
                // a 7.7 7.7 0 0 0 -5.2 -2
                arcToRelative(
                    a = 7.7f,
                    b = 7.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.2f,
                    dy1 = -2.0f,
                )
                // A 7.9 7.9 0 0 0 6 12
                arcTo(
                    horizontalEllipseRadius = 7.9f,
                    verticalEllipseRadius = 7.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 12.0f,
                )
                // c 0 4.4 3.5 8 7.8 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.4f,
                    dx2 = 3.5f,
                    dy2 = 8.0f,
                    dx3 = 7.8f,
                    dy3 = 8.0f,
                )
                // a 8 8 0 0 0 5.2 -2
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.2f,
                    dy1 = -2.0f,
                )
            }
        }.build().also { _euro = it }
    }

@Suppress("ObjectPropertyName")
private var _euro: ImageVector? = null
