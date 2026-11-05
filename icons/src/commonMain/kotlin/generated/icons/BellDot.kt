package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BellDot: ImageVector
    get() {
        val current = _bellDot
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BellDot",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.27 21 a2 2 0 0 0 3.46 0 M11.68 2 A6 6 0 0 0 6 8 c0 4.5 -1.41 5.96 -2.74 7.33 A1 1 0 0 0 4 17 h16 a1 1 0 0 0 .74 -1.67 8 8 0 0 1 -2.21 -3.35
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.27 21
                moveTo(x = 10.27f, y = 21.0f)
                // a 2 2 0 0 0 3.46 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.46f,
                    dy1 = 0.0f,
                )
                // M 11.68 2
                moveTo(x = 11.68f, y = 2.0f)
                // A 6 6 0 0 0 6 8
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 8.0f,
                )
                // c 0 4.5 -1.41 5.96 -2.74 7.33
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.5f,
                    dx2 = -1.41f,
                    dy2 = 5.96f,
                    dx3 = -2.74f,
                    dy3 = 7.33f,
                )
                // A 1 1 0 0 0 4 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 17.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 1 1 0 0 0 0.74 -1.67
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.74f,
                    dy1 = -1.67f,
                )
                // a 8 8 0 0 1 -2.21 -3.35
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.21f,
                    dy1 = -3.35f,
                )
            }
            // <circle cx="18.0" cy="5.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _bellDot = it }
    }

@Suppress("ObjectPropertyName")
private var _bellDot: ImageVector? = null
