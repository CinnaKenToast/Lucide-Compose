package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Gem: ImageVector
    get() {
        val current = _gem
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Gem",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.5 3 8 9 l4 13 4 -13 -2.5 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.5 3
                moveTo(x = 10.5f, y = 3.0f)
                // L 8 9
                lineTo(x = 8.0f, y = 9.0f)
                // l 4 13
                lineToRelative(dx = 4.0f, dy = 13.0f)
                // l 4 -13
                lineToRelative(dx = 4.0f, dy = -13.0f)
                // l -2.5 -6
                lineToRelative(dx = -2.5f, dy = -6.0f)
            }
            // M17 3 a2 2 0 0 1 1.6 .8 l3 4 a2 2 0 0 1 .01 2.38 l-7.99 10.99 a2 2 0 0 1 -3.24 0 l-8 -10.99 A2 2 0 0 1 2.4 7.8 l3 -4 A2 2 0 0 1 7 3z M2 9 h20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 3
                moveTo(x = 17.0f, y = 3.0f)
                // a 2 2 0 0 1 1.6 0.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.6f,
                    dy1 = 0.8f,
                )
                // l 3 4
                lineToRelative(dx = 3.0f, dy = 4.0f)
                // a 2 2 0 0 1 0.01 2.38
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.01f,
                    dy1 = 2.38f,
                )
                // l -7.99 10.99
                lineToRelative(dx = -7.99f, dy = 10.99f)
                // a 2 2 0 0 1 -3.24 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.24f,
                    dy1 = 0.0f,
                )
                // l -8 -10.99
                lineToRelative(dx = -8.0f, dy = -10.99f)
                // A 2 2 0 0 1 2.4 7.8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.4f,
                    y1 = 7.8f,
                )
                // l 3 -4
                lineToRelative(dx = 3.0f, dy = -4.0f)
                // A 2 2 0 0 1 7 3z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 3.0f,
                )
                close()
                // M 2 9
                moveTo(x = 2.0f, y = 9.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
            }
        }.build().also { _gem = it }
    }

@Suppress("ObjectPropertyName")
private var _gem: ImageVector? = null
