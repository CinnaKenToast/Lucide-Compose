package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PhoneOff: ImageVector
    get() {
        val current = _phoneOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PhoneOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.1 13.9 a14 14 0 0 0 3.73 2.67 1 1 0 0 0 1.22 -.3 l.35 -.47 A2 2 0 0 1 17 15 h3 a2 2 0 0 1 2 2 v3 a2 2 0 0 1 -2 2 18 18 0 0 1 -12.73 -5.27 M22 2 2 22 m2.76 -8.42 A18 18 0 0 1 2 4 a2 2 0 0 1 2 -2 h3 a2 2 0 0 1 2 2 v3 a2 2 0 0 1 -.8 1.6 L7.73 8.95 a1 1 0 0 0 -.29 1.23 l.24 .48
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.1 13.9
                moveTo(x = 10.1f, y = 13.9f)
                // a 14 14 0 0 0 3.73 2.67
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.73f,
                    dy1 = 2.67f,
                )
                // a 1 1 0 0 0 1.22 -0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.22f,
                    dy1 = -0.3f,
                )
                // l 0.35 -0.47
                lineToRelative(dx = 0.35f, dy = -0.47f)
                // A 2 2 0 0 1 17 15
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 15.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // a 18 18 0 0 1 -12.73 -5.27
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -12.73f,
                    dy1 = -5.27f,
                )
                // M 22 2
                moveTo(x = 22.0f, y = 2.0f)
                // L 2 22
                lineTo(x = 2.0f, y = 22.0f)
                // m 2.76 -8.42
                moveToRelative(dx = 2.76f, dy = -8.42f)
                // A 18 18 0 0 1 2 4
                arcTo(
                    horizontalEllipseRadius = 18.0f,
                    verticalEllipseRadius = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 4.0f,
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 2 2 0 0 1 -0.8 1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.8f,
                    dy1 = 1.6f,
                )
                // L 7.73 8.95
                lineTo(x = 7.73f, y = 8.95f)
                // a 1 1 0 0 0 -0.29 1.23
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.29f,
                    dy1 = 1.23f,
                )
                // l 0.24 0.48
                lineToRelative(dx = 0.24f, dy = 0.48f)
            }
        }.build().also { _phoneOff = it }
    }

@Suppress("ObjectPropertyName")
private var _phoneOff: ImageVector? = null
