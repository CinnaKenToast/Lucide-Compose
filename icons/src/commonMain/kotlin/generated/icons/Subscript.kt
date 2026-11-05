package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Subscript: ImageVector
    get() {
        val current = _subscript
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Subscript",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m4 5 8 8 m0 -8 -8 8 m16 6 h-4 c0 -1.5 .44 -2 1.5 -2.5 S20 15.33 20 14 a2 2 0 0 0 -.48 -1.29 2.1 2.1 0 0 0 -2.62 -.44 2 2 0 0 0 -.9 1.07
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // l -8 8
                lineToRelative(dx = -8.0f, dy = 8.0f)
                // m 16 6
                moveToRelative(dx = 16.0f, dy = 6.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c 0 -1.5 0.44 -2 1.5 -2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.5f,
                    dx2 = 0.44f,
                    dy2 = -2.0f,
                    dx3 = 1.5f,
                    dy3 = -2.5f,
                )
                // S 20 15.33 20 14
                reflectiveCurveTo(
                    x1 = 20.0f,
                    y1 = 15.33f,
                    x2 = 20.0f,
                    y2 = 14.0f,
                )
                // a 2 2 0 0 0 -0.48 -1.29
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.48f,
                    dy1 = -1.29f,
                )
                // a 2.1 2.1 0 0 0 -2.62 -0.44
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.62f,
                    dy1 = -0.44f,
                )
                // a 2 2 0 0 0 -0.9 1.07
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = 1.07f,
                )
            }
        }.build().also { _subscript = it }
    }

@Suppress("ObjectPropertyName")
private var _subscript: ImageVector? = null
