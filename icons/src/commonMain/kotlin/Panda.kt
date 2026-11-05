package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Panda: ImageVector
    get() {
        val current = _panda
        if (current != null) return current

        return ImageVector.Builder(
            name = "Panda",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.25 17.25 h1.5 L12 18z M15 12 l2 2 m.9 -7.4 -.5 -.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.25 17.25
                moveTo(x = 11.25f, y = 17.25f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // L 12 18z
                lineTo(x = 12.0f, y = 18.0f)
                close()
                // M 15 12
                moveTo(x = 15.0f, y = 12.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // m 0.9 -7.4
                moveToRelative(dx = 0.9f, dy = -7.4f)
                // l -0.5 -0.5
                lineToRelative(dx = -0.5f, dy = -0.5f)
            }
            // M2 14.5 C2 19.47 6.48 22 12 22 s10 -2.53 10 -7.5 a10 10 0 0 0 -1.3 -4.83 4.5 4.5 0 1 0 -7.05 -5.5 8 8 0 0 0 -3.3 0 4.5 4.5 0 1 0 -7.04 5.5 A10 10 0 0 0 2 14.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 14.5
                moveTo(x = 2.0f, y = 14.5f)
                // C 2 19.47 6.48 22 12 22
                curveTo(
                    x1 = 2.0f,
                    y1 = 19.47f,
                    x2 = 6.48f,
                    y2 = 22.0f,
                    x3 = 12.0f,
                    y3 = 22.0f,
                )
                // s 10 -2.53 10 -7.5
                reflectiveCurveToRelative(
                    dx1 = 10.0f,
                    dy1 = -2.53f,
                    dx2 = 10.0f,
                    dy2 = -7.5f,
                )
                // a 10 10 0 0 0 -1.3 -4.83
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.3f,
                    dy1 = -4.83f,
                )
                // a 4.5 4.5 0 1 0 -7.05 -5.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -7.05f,
                    dy1 = -5.5f,
                )
                // a 8 8 0 0 0 -3.3 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.3f,
                    dy1 = 0.0f,
                )
                // a 4.5 4.5 0 1 0 -7.04 5.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -7.04f,
                    dy1 = 5.5f,
                )
                // A 10 10 0 0 0 2 14.5
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 14.5f,
                )
            }
            // m6.1 6.6 .5 -.5 M9 12 l-2 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.1 6.6
                moveTo(x = 6.1f, y = 6.6f)
                // l 0.5 -0.5
                lineToRelative(dx = 0.5f, dy = -0.5f)
                // M 9 12
                moveTo(x = 9.0f, y = 12.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
            }
        }.build().also { _panda = it }
    }


@Suppress("ObjectPropertyName")
private var _panda: ImageVector? = null
