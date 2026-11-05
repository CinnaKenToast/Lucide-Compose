package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BeanOff: ImageVector
    get() {
        val current = _beanOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BeanOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9 9 a5 5 0 0 1 -2.4 1.17 A6 6 0 0 0 8 22 a14 14 0 0 0 9.9 -4.1 M10.75 5.1 A6 6 0 0 1 22 8 c0 2.41 -.61 4.68 -1.68 6.66
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 9
                moveTo(x = 9.0f, y = 9.0f)
                // a 5 5 0 0 1 -2.4 1.17
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.4f,
                    dy1 = 1.17f,
                )
                // A 6 6 0 0 0 8 22
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 22.0f,
                )
                // a 14 14 0 0 0 9.9 -4.1
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.9f,
                    dy1 = -4.1f,
                )
                // M 10.75 5.1
                moveTo(x = 10.75f, y = 5.1f)
                // A 6 6 0 0 1 22 8
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 8.0f,
                )
                // c 0 2.41 -0.61 4.68 -1.68 6.66
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.41f,
                    dx2 = -0.61f,
                    dy2 = 4.68f,
                    dx3 = -1.68f,
                    dy3 = 6.66f,
                )
            }
            // M5.34 10.62 a4 4 0 0 0 6.49 1.2 m-1.21 -6.48 a4 4 0 0 1 2.04 2.04
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.34 10.62
                moveTo(x = 5.34f, y = 10.62f)
                // a 4 4 0 0 0 6.49 1.2
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.49f,
                    dy1 = 1.2f,
                )
                // m -1.21 -6.48
                moveToRelative(dx = -1.21f, dy = -6.48f)
                // a 4 4 0 0 1 2.04 2.04
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.04f,
                    dy1 = 2.04f,
                )
            }
            // <line x1="2.0" y1="2.0" x2="22.0" y2="22.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // L 22 22
                lineTo(x = 22.0f, y = 22.0f)
            }
        }.build().also { _beanOff = it }
    }

@Suppress("ObjectPropertyName")
private var _beanOff: ImageVector? = null
