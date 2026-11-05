package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Recycle: ImageVector
    get() {
        val current = _recycle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Recycle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7 19 H4.82 a1.8 1.8 0 0 1 -1.57 -.88 1.8 1.8 0 0 1 0 -1.79 L7.2 9.5 M11 19 h8.2 a1.8 1.8 0 0 0 1.56 -.89 1.8 1.8 0 0 0 0 -1.77 l-1.23 -2.12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 19
                moveTo(x = 7.0f, y = 19.0f)
                // H 4.82
                horizontalLineTo(x = 4.82f)
                // a 1.8 1.8 0 0 1 -1.57 -0.88
                arcToRelative(
                    a = 1.8f,
                    b = 1.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.57f,
                    dy1 = -0.88f,
                )
                // a 1.8 1.8 0 0 1 0 -1.79
                arcToRelative(
                    a = 1.8f,
                    b = 1.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.79f,
                )
                // L 7.2 9.5
                lineTo(x = 7.2f, y = 9.5f)
                // M 11 19
                moveTo(x = 11.0f, y = 19.0f)
                // h 8.2
                horizontalLineToRelative(dx = 8.2f)
                // a 1.8 1.8 0 0 0 1.56 -0.89
                arcToRelative(
                    a = 1.8f,
                    b = 1.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.56f,
                    dy1 = -0.89f,
                )
                // a 1.8 1.8 0 0 0 0 -1.77
                arcToRelative(
                    a = 1.8f,
                    b = 1.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.77f,
                )
                // l -1.23 -2.12
                lineToRelative(dx = -1.23f, dy = -2.12f)
            }
            // m14 16 -3 3 3 3 m-5.7 -8.4 L7.2 9.5 l-4.1 1.1 M9.34 5.8 l1.1 -1.9 A1.8 1.8 0 0 1 11.99 3 a1.8 1.8 0 0 1 1.54 .89 l3.94 6.84
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 16
                moveTo(x = 14.0f, y = 16.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // m -5.7 -8.4
                moveToRelative(dx = -5.7f, dy = -8.4f)
                // L 7.2 9.5
                lineTo(x = 7.2f, y = 9.5f)
                // l -4.1 1.1
                lineToRelative(dx = -4.1f, dy = 1.1f)
                // M 9.34 5.8
                moveTo(x = 9.34f, y = 5.8f)
                // l 1.1 -1.9
                lineToRelative(dx = 1.1f, dy = -1.9f)
                // A 1.8 1.8 0 0 1 11.99 3
                arcTo(
                    horizontalEllipseRadius = 1.8f,
                    verticalEllipseRadius = 1.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.99f,
                    y1 = 3.0f,
                )
                // a 1.8 1.8 0 0 1 1.54 0.89
                arcToRelative(
                    a = 1.8f,
                    b = 1.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.54f,
                    dy1 = 0.89f,
                )
                // l 3.94 6.84
                lineToRelative(dx = 3.94f, dy = 6.84f)
            }
            // m13.38 9.63 4.1 1.1 1.1 -4.1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.38 9.63
                moveTo(x = 13.38f, y = 9.63f)
                // l 4.1 1.1
                lineToRelative(dx = 4.1f, dy = 1.1f)
                // l 1.1 -4.1
                lineToRelative(dx = 1.1f, dy = -4.1f)
            }
        }.build().also { _recycle = it }
    }

@Suppress("ObjectPropertyName")
private var _recycle: ImageVector? = null
