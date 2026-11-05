package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PaintBucket: ImageVector
    get() {
        val current = _paintBucket
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PaintBucket",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 7 6 2 m13 10 H2.03 m19.1 6.38 A3.3 3.3 0 0 1 20 16.5 a3.3 3.3 0 0 1 -1.14 1.88 2 2 0 0 0 -.86 1.6 A2 2 0 0 0 20 22 a2 2 0 0 0 2 -2.02 q0 -.88 -.85 -1.6 M8.5 4.5 l2.15 -2.15 a1.2 1.2 0 0 1 1.7 0 l7.3 7.3 a1.2 1.2 0 0 1 0 1.7 l-7.6 7.6 a3.6 3.6 0 0 1 -5.1 0 l-3.9 -3.9 a3.6 3.6 0 0 1 0 -5.1 l2.62 -2.62
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 7
                moveTo(x = 11.0f, y = 7.0f)
                // L 6 2
                lineTo(x = 6.0f, y = 2.0f)
                // m 13 10
                moveToRelative(dx = 13.0f, dy = 10.0f)
                // H 2.03
                horizontalLineTo(x = 2.03f)
                // m 19.1 6.38
                moveToRelative(dx = 19.1f, dy = 6.38f)
                // A 3.3 3.3 0 0 1 20 16.5
                arcTo(
                    horizontalEllipseRadius = 3.3f,
                    verticalEllipseRadius = 3.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 16.5f,
                )
                // a 3.3 3.3 0 0 1 -1.14 1.88
                arcToRelative(
                    a = 3.3f,
                    b = 3.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.14f,
                    dy1 = 1.88f,
                )
                // a 2 2 0 0 0 -0.86 1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.86f,
                    dy1 = 1.6f,
                )
                // A 2 2 0 0 0 20 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 22.0f,
                )
                // a 2 2 0 0 0 2 -2.02
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.02f,
                )
                // q 0 -0.88 -0.85 -1.6
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.88f,
                    dx2 = -0.85f,
                    dy2 = -1.6f,
                )
                // M 8.5 4.5
                moveTo(x = 8.5f, y = 4.5f)
                // l 2.15 -2.15
                lineToRelative(dx = 2.15f, dy = -2.15f)
                // a 1.2 1.2 0 0 1 1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 7.3 7.3
                lineToRelative(dx = 7.3f, dy = 7.3f)
                // a 1.2 1.2 0 0 1 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l -7.6 7.6
                lineToRelative(dx = -7.6f, dy = 7.6f)
                // a 3.6 3.6 0 0 1 -5.1 0
                arcToRelative(
                    a = 3.6f,
                    b = 3.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.1f,
                    dy1 = 0.0f,
                )
                // l -3.9 -3.9
                lineToRelative(dx = -3.9f, dy = -3.9f)
                // a 3.6 3.6 0 0 1 0 -5.1
                arcToRelative(
                    a = 3.6f,
                    b = 3.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -5.1f,
                )
                // l 2.62 -2.62
                lineToRelative(dx = 2.62f, dy = -2.62f)
            }
        }.build().also { _paintBucket = it }
    }

@Suppress("ObjectPropertyName")
private var _paintBucket: ImageVector? = null
