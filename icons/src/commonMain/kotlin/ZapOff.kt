package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZapOff: ImageVector
    get() {
        val current = _zapOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "ZapOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10.77 5.11 2.67 -2.67 A1.5 1.5 0 0 1 15.91 4 l-1.63 4.63 m4.6 4.6 .68 -.67 A1.5 1.5 0 0 0 18.5 10 h-2.84 M2 2 l20 20 M7.94 7.94 l-3.5 3.5 A1.5 1.5 0 0 0 5.5 14 h4 a.5 .5 0 0 1 .47 .67 L8.1 20 a1.5 1.5 0 0 0 2.47 1.56 l5.5 -5.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.77 5.11
                moveTo(x = 10.77f, y = 5.11f)
                // l 2.67 -2.67
                lineToRelative(dx = 2.67f, dy = -2.67f)
                // A 1.5 1.5 0 0 1 15.91 4
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.91f,
                    y1 = 4.0f,
                )
                // l -1.63 4.63
                lineToRelative(dx = -1.63f, dy = 4.63f)
                // m 4.6 4.6
                moveToRelative(dx = 4.6f, dy = 4.6f)
                // l 0.68 -0.67
                lineToRelative(dx = 0.68f, dy = -0.67f)
                // A 1.5 1.5 0 0 0 18.5 10
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.5f,
                    y1 = 10.0f,
                )
                // h -2.84
                horizontalLineToRelative(dx = -2.84f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 7.94 7.94
                moveTo(x = 7.94f, y = 7.94f)
                // l -3.5 3.5
                lineToRelative(dx = -3.5f, dy = 3.5f)
                // A 1.5 1.5 0 0 0 5.5 14
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.5f,
                    y1 = 14.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 0.5 0.5 0 0 1 0.47 0.67
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.47f,
                    dy1 = 0.67f,
                )
                // L 8.1 20
                lineTo(x = 8.1f, y = 20.0f)
                // a 1.5 1.5 0 0 0 2.47 1.56
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.47f,
                    dy1 = 1.56f,
                )
                // l 5.5 -5.5
                lineToRelative(dx = 5.5f, dy = -5.5f)
            }
        }.build().also { _zapOff = it }
    }


@Suppress("ObjectPropertyName")
private var _zapOff: ImageVector? = null
