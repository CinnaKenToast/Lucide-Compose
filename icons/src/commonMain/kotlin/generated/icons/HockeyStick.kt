package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HockeyStick: ImageVector
    get() {
        val current = _hockeyStick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HockeyStick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 4 v4 c0 1.1 -2.02 2 -4.5 2 S2 9.1 2 8 V4 m16.21 -.9 a2 2 0 0 1 3.58 1.8 l-6.9 13.78 A6 6 0 0 1 9.53 22 H4.5 a1 1 0 0 1 0 -5 h5.53 a2 2 0 0 0 1.79 -1.1z m.38 8.2 -3.58 -1.8 m5.78 -2.6 -3.58 -1.8 M7 17 v5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 4
                moveTo(x = 11.0f, y = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 1.1 -2.02 2 -4.5 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.1f,
                    dx2 = -2.02f,
                    dy2 = 2.0f,
                    dx3 = -4.5f,
                    dy3 = 2.0f,
                )
                // S 2 9.1 2 8
                reflectiveCurveTo(
                    x1 = 2.0f,
                    y1 = 9.1f,
                    x2 = 2.0f,
                    y2 = 8.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // m 16.21 -0.9
                moveToRelative(dx = 16.21f, dy = -0.9f)
                // a 2 2 0 0 1 3.58 1.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.58f,
                    dy1 = 1.8f,
                )
                // l -6.9 13.78
                lineToRelative(dx = -6.9f, dy = 13.78f)
                // A 6 6 0 0 1 9.53 22
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.53f,
                    y1 = 22.0f,
                )
                // H 4.5
                horizontalLineTo(x = 4.5f)
                // a 1 1 0 0 1 0 -5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                )
                // h 5.53
                horizontalLineToRelative(dx = 5.53f)
                // a 2 2 0 0 0 1.79 -1.1z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.79f,
                    dy1 = -1.1f,
                )
                close()
                // m 0.38 8.2
                moveToRelative(dx = 0.38f, dy = 8.2f)
                // l -3.58 -1.8
                lineToRelative(dx = -3.58f, dy = -1.8f)
                // m 5.78 -2.6
                moveToRelative(dx = 5.78f, dy = -2.6f)
                // l -3.58 -1.8
                lineToRelative(dx = -3.58f, dy = -1.8f)
                // M 7 17
                moveTo(x = 7.0f, y = 17.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
            }
            // <ellipse cx="6.5" cy="4.0" rx="4.5" ry="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.5 2
                moveTo(x = 6.5f, y = 2.0f)
                // A 4.5 2 0 1 0 6.5 6
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 6.5f,
                    y1 = 6.0f,
                )
                // A 4.5 2 0 1 0 6.5 2z
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 6.5f,
                    y1 = 2.0f,
                )
                close()
            }
        }.build().also { _hockeyStick = it }
    }

@Suppress("ObjectPropertyName")
private var _hockeyStick: ImageVector? = null
