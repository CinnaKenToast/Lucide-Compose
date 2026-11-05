package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ToothbrushSparkles: ImageVector
    get() {
        val current = _toothbrushSparkles
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ToothbrushSparkles",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 3 H8 m6.59 8.41 L22 4 m-7 7 -.43 .4 M2 22 l7 -7 c1.86 -1.86 3.71 -1.99 5.57 -3.6 L12.6 9.41 A2 2 0 0 1 14 6 a2 2 0 0 1 2 -2 2 2 0 0 1 3.26 -1.55 l2.15 2.14 M20 15 v4 m2 -2 h-4 M4 5 v4 m2 -2 H2 m7 -5 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 3
                moveTo(x = 10.0f, y = 3.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 6.59 8.41
                moveToRelative(dx = 6.59f, dy = 8.41f)
                // L 22 4
                lineTo(x = 22.0f, y = 4.0f)
                // m -7 7
                moveToRelative(dx = -7.0f, dy = 7.0f)
                // l -0.43 0.4
                lineToRelative(dx = -0.43f, dy = 0.4f)
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // c 1.86 -1.86 3.71 -1.99 5.57 -3.6
                curveToRelative(
                    dx1 = 1.86f,
                    dy1 = -1.86f,
                    dx2 = 3.71f,
                    dy2 = -1.99f,
                    dx3 = 5.57f,
                    dy3 = -3.6f,
                )
                // L 12.6 9.41
                lineTo(x = 12.6f, y = 9.41f)
                // A 2 2 0 0 1 14 6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 6.0f,
                )
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 1 3.26 -1.55
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.26f,
                    dy1 = -1.55f,
                )
                // l 2.15 2.14
                lineToRelative(dx = 2.15f, dy = 2.14f)
                // M 20 15
                moveTo(x = 20.0f, y = 15.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 2 -2
                moveToRelative(dx = 2.0f, dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 2 -2
                moveToRelative(dx = 2.0f, dy = -2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 7 -5
                moveToRelative(dx = 7.0f, dy = -5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _toothbrushSparkles = it }
    }

@Suppress("ObjectPropertyName")
private var _toothbrushSparkles: ImageVector? = null
