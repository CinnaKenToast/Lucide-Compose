package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PhoneLog: ImageVector
    get() {
        val current = _phoneLog
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PhoneLog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.83 16.57 a1 1 0 0 0 1.22 -.3 l.35 -.47 A2 2 0 0 1 17 15 h3 a2 2 0 0 1 2 2 v3 a2 2 0 0 1 -2 2 A18 18 0 0 1 2 4 a2 2 0 0 1 2 -2 h3 a2 2 0 0 1 2 2 v3 a2 2 0 0 1 -.8 1.6 L7.73 8.95 a1 1 0 0 0 -.29 1.23 14 14 0 0 0 6.4 6.39 m.56 -12.4 h7.17 m-4.23 4 h4.23
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.83 16.57
                moveTo(x = 13.83f, y = 16.57f)
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
                // a 14 14 0 0 0 6.4 6.39
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.4f,
                    dy1 = 6.39f,
                )
                // m 0.56 -12.4
                moveToRelative(dx = 0.56f, dy = -12.4f)
                // h 7.17
                horizontalLineToRelative(dx = 7.17f)
                // m -4.23 4
                moveToRelative(dx = -4.23f, dy = 4.0f)
                // h 4.23
                horizontalLineToRelative(dx = 4.23f)
            }
        }.build().also { _phoneLog = it }
    }

@Suppress("ObjectPropertyName")
private var _phoneLog: ImageVector? = null
