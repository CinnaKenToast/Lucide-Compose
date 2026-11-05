package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PinOff: ImageVector
    get() {
        val current = _pinOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PinOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 17 v5 m3 -12.66 V7 a1 1 0 0 1 1 -1 2 2 0 0 0 0 -4 H7.89 M2 2 l20 20 M9 9 v1.76 a2 2 0 0 1 -1.11 1.79 l-1.78 .9 A2 2 0 0 0 5 15.24 V16 a1 1 0 0 0 1 1 h11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m 3 -12.66
                moveToRelative(dx = 3.0f, dy = -12.66f)
                // V 7
                verticalLineTo(y = 7.0f)
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
                // a 2 2 0 0 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // H 7.89
                horizontalLineTo(x = 7.89f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 9 9
                moveTo(x = 9.0f, y = 9.0f)
                // v 1.76
                verticalLineToRelative(dy = 1.76f)
                // a 2 2 0 0 1 -1.11 1.79
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.11f,
                    dy1 = 1.79f,
                )
                // l -1.78 0.9
                lineToRelative(dx = -1.78f, dy = 0.9f)
                // A 2 2 0 0 0 5 15.24
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 15.24f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
            }
        }.build().also { _pinOff = it }
    }

@Suppress("ObjectPropertyName")
private var _pinOff: ImageVector? = null
