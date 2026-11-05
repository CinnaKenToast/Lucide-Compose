package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ToolCase: ImageVector
    get() {
        val current = _toolCase
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ToolCase",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 15 h4 m.5 -10.94 .57 -1.43 a1 1 0 0 1 1.3 -.56 l5 2 a1 1 0 0 1 .55 .53 .9 .9 0 0 1 .01 .77 L19.6 11.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 15
                moveTo(x = 10.0f, y = 15.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 0.5 -10.94
                moveToRelative(dx = 0.5f, dy = -10.94f)
                // l 0.57 -1.43
                lineToRelative(dx = 0.57f, dy = -1.43f)
                // a 1 1 0 0 1 1.3 -0.56
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.3f,
                    dy1 = -0.56f,
                )
                // l 5 2
                lineToRelative(dx = 5.0f, dy = 2.0f)
                // a 1 1 0 0 1 0.55 0.53
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.55f,
                    dy1 = 0.53f,
                )
                // a 0.9 0.9 0 0 1 0.01 0.77
                arcToRelative(
                    a = 0.9f,
                    b = 0.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.01f,
                    dy1 = 0.77f,
                )
                // L 19.6 11.2
                lineTo(x = 19.6f, y = 11.2f)
            }
            // m15.63 11 -.18 -.34 -1.17 -1.76 1.3 -1.65 a2 2 0 0 0 -2.1 -3.17 l-2.03 .57 -1.17 -1.76 A2 2 0 0 0 6.6 3.92 L6.53 6.03 4.5 6.6 a2 2 0 0 0 -.16 3.8 L5.96 11 M4 12 a1 1 0 0 1 1 -1 h14 a1 1 0 0 1 1 1 v7 a2 2 0 0 1 -2 2 H6 a2 2 0 0 1 -2 -2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.63 11
                moveTo(x = 15.63f, y = 11.0f)
                // l -0.18 -0.34
                lineToRelative(dx = -0.18f, dy = -0.34f)
                // l -1.17 -1.76
                lineToRelative(dx = -1.17f, dy = -1.76f)
                // l 1.3 -1.65
                lineToRelative(dx = 1.3f, dy = -1.65f)
                // a 2 2 0 0 0 -2.1 -3.17
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.1f,
                    dy1 = -3.17f,
                )
                // l -2.03 0.57
                lineToRelative(dx = -2.03f, dy = 0.57f)
                // l -1.17 -1.76
                lineToRelative(dx = -1.17f, dy = -1.76f)
                // A 2 2 0 0 0 6.6 3.92
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.6f,
                    y1 = 3.92f,
                )
                // L 6.53 6.03
                lineTo(x = 6.53f, y = 6.03f)
                // L 4.5 6.6
                lineTo(x = 4.5f, y = 6.6f)
                // a 2 2 0 0 0 -0.16 3.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.16f,
                    dy1 = 3.8f,
                )
                // L 5.96 11
                lineTo(x = 5.96f, y = 11.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _toolCase = it }
    }

@Suppress("ObjectPropertyName")
private var _toolCase: ImageVector? = null
