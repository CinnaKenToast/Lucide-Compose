package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DropletOff: ImageVector
    get() {
        val current = _dropletOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "DropletOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18.72 13.19 A8 8 0 0 0 16 9.5 c-2 -1.6 -3.5 -4 -4 -6.5 a11 11 0 0 1 -.88 2.59 M2 2 l20 20 M8.8 8.8 A11 11 0 0 1 8 9.5 C6 11.1 5 13 5 15 a7 7 0 0 0 13.22 3.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.72 13.19
                moveTo(x = 18.72f, y = 13.19f)
                // A 8 8 0 0 0 16 9.5
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 9.5f,
                )
                // c -2 -1.6 -3.5 -4 -4 -6.5
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = -1.6f,
                    dx2 = -3.5f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -6.5f,
                )
                // a 11 11 0 0 1 -0.88 2.59
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.88f,
                    dy1 = 2.59f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 8.8 8.8
                moveTo(x = 8.8f, y = 8.8f)
                // A 11 11 0 0 1 8 9.5
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 9.5f,
                )
                // C 6 11.1 5 13 5 15
                curveTo(
                    x1 = 6.0f,
                    y1 = 11.1f,
                    x2 = 5.0f,
                    y2 = 13.0f,
                    x3 = 5.0f,
                    y3 = 15.0f,
                )
                // a 7 7 0 0 0 13.22 3.2
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 13.22f,
                    dy1 = 3.2f,
                )
            }
        }.build().also { _dropletOff = it }
    }


@Suppress("ObjectPropertyName")
private var _dropletOff: ImageVector? = null
