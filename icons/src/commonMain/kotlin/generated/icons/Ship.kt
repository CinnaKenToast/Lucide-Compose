package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ship: ImageVector
    get() {
        val current = _ship
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Ship",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v2 m0 5.19 V13 m7 -1 V6 a2 2 0 0 0 -2 -2 H7 a2 2 0 0 0 -2 2 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 5.19
                moveToRelative(dx = 0.0f, dy = 5.19f)
                // V 13
                verticalLineTo(y = 13.0f)
                // m 7 -1
                moveToRelative(dx = 7.0f, dy = -1.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
            // M19.38 19 A11.6 11.6 0 0 0 21 13 l-8.19 -3.64 a2 2 0 0 0 -1.62 0 L3 13 a11.6 11.6 0 0 0 2.81 7.76
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.38 19
                moveTo(x = 19.38f, y = 19.0f)
                // A 11.6 11.6 0 0 0 21 13
                arcTo(
                    horizontalEllipseRadius = 11.6f,
                    verticalEllipseRadius = 11.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 13.0f,
                )
                // l -8.19 -3.64
                lineToRelative(dx = -8.19f, dy = -3.64f)
                // a 2 2 0 0 0 -1.62 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.62f,
                    dy1 = 0.0f,
                )
                // L 3 13
                lineTo(x = 3.0f, y = 13.0f)
                // a 11.6 11.6 0 0 0 2.81 7.76
                arcToRelative(
                    a = 11.6f,
                    b = 11.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.81f,
                    dy1 = 7.76f,
                )
            }
            // M2 20 c.6 .5 1.2 1 2.5 1 2.5 0 2.5 -2 5 -2 1.3 0 1.9 .5 2.5 1 s1.2 1 2.5 1 c2.5 0 2.5 -2 5 -2 1.3 0 1.9 .5 2.5 1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 20
                moveTo(x = 2.0f, y = 20.0f)
                // c 0.6 0.5 1.2 1 2.5 1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.5f,
                    dx2 = 1.2f,
                    dy2 = 1.0f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 1.3 0 1.9 0.5 2.5 1
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 0.5f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // s 1.2 1 2.5 1
                reflectiveCurveToRelative(
                    dx1 = 1.2f,
                    dy1 = 1.0f,
                    dx2 = 2.5f,
                    dy2 = 1.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 1.3 0 1.9 0.5 2.5 1
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 0.5f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
            }
        }.build().also { _ship = it }
    }

@Suppress("ObjectPropertyName")
private var _ship: ImageVector? = null
