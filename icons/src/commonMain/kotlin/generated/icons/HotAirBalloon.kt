package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HotAirBalloon: ImageVector
    get() {
        val current = _hotAirBalloon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HotAirBalloon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.5 18 C10 15 9 12 9 9 a3 7 0 0 1 6 0 c0 3 -1 6 -2.5 9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.5 18
                moveTo(x = 11.5f, y = 18.0f)
                // C 10 15 9 12 9 9
                curveTo(
                    x1 = 10.0f,
                    y1 = 15.0f,
                    x2 = 9.0f,
                    y2 = 12.0f,
                    x3 = 9.0f,
                    y3 = 9.0f,
                )
                // a 3 7 0 0 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // c 0 3 -1 6 -2.5 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = -1.0f,
                    dy2 = 6.0f,
                    dx3 = -2.5f,
                    dy3 = 9.0f,
                )
            }
            // M15 18 c3 -3 5 -5 5 -9 A8 7 0 0 0 4 9 c0 4 2 6 5 9 m6 0 H9 v3 a1 1 0 0 0 1 1 h4 a1 1 0 0 0 1 -1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 18
                moveTo(x = 15.0f, y = 18.0f)
                // c 3 -3 5 -5 5 -9
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                    dx2 = 5.0f,
                    dy2 = -5.0f,
                    dx3 = 5.0f,
                    dy3 = -9.0f,
                )
                // A 8 7 0 0 0 4 9
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 9.0f,
                )
                // c 0 4 2 6 5 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 2.0f,
                    dy2 = 6.0f,
                    dx3 = 5.0f,
                    dy3 = 9.0f,
                )
                // m 6 0
                moveToRelative(dx = 6.0f, dy = 0.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 1 1 0 0 0 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
        }.build().also { _hotAirBalloon = it }
    }

@Suppress("ObjectPropertyName")
private var _hotAirBalloon: ImageVector? = null
