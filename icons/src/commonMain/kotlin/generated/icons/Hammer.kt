package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Hammer: ImageVector
    get() {
        val current = _hammer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Hammer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 12 -9.37 9.37 a1 1 0 0 1 -3 -3 L12 9 m6 6 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 12
                moveTo(x = 15.0f, y = 12.0f)
                // l -9.37 9.37
                lineToRelative(dx = -9.37f, dy = 9.37f)
                // a 1 1 0 0 1 -3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // L 12 9
                lineTo(x = 12.0f, y = 9.0f)
                // m 6 6
                moveToRelative(dx = 6.0f, dy = 6.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
            // m21.5 11.5 -1.91 -1.91 A2 2 0 0 1 19 8.17 V7.83 a2 2 0 0 0 -.59 -1.42 l-1.65 -1.65 A6 6 0 0 0 12.52 3 H9 l1.24 1.24 A6 6 0 0 1 12 8.48 V10 l2 2 h1.17 a2 2 0 0 1 1.42 .59 l1.91 1.91
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.5 11.5
                moveTo(x = 21.5f, y = 11.5f)
                // l -1.91 -1.91
                lineToRelative(dx = -1.91f, dy = -1.91f)
                // A 2 2 0 0 1 19 8.17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 8.17f,
                )
                // V 7.83
                verticalLineTo(y = 7.83f)
                // a 2 2 0 0 0 -0.59 -1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.59f,
                    dy1 = -1.42f,
                )
                // l -1.65 -1.65
                lineToRelative(dx = -1.65f, dy = -1.65f)
                // A 6 6 0 0 0 12.52 3
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.52f,
                    y1 = 3.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // l 1.24 1.24
                lineToRelative(dx = 1.24f, dy = 1.24f)
                // A 6 6 0 0 1 12 8.48
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 8.48f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // h 1.17
                horizontalLineToRelative(dx = 1.17f)
                // a 2 2 0 0 1 1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.42f,
                    dy1 = 0.59f,
                )
                // l 1.91 1.91
                lineToRelative(dx = 1.91f, dy = 1.91f)
            }
        }.build().also { _hammer = it }
    }

@Suppress("ObjectPropertyName")
private var _hammer: ImageVector? = null
