package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Baby: ImageVector
    get() {
        val current = _baby
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Baby",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 16 c.5 .3 1.2 .5 2 .5 s1.5 -.2 2 -.5 m1 -4z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 16
                moveTo(x = 10.0f, y = 16.0f)
                // c 0.5 0.3 1.2 0.5 2 0.5
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.3f,
                    dx2 = 1.2f,
                    dy2 = 0.5f,
                    dx3 = 2.0f,
                    dy3 = 0.5f,
                )
                // s 1.5 -0.2 2 -0.5
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -0.2f,
                    dx2 = 2.0f,
                    dy2 = -0.5f,
                )
                // m 1 -4z
                moveToRelative(dx = 1.0f, dy = -4.0f)
                close()
            }
            // M19.38 6.81 a9 9 0 0 1 1.42 3.39 2 2 0 0 1 0 3.6 9 9 0 0 1 -17.6 0 2 2 0 0 1 0 -3.6 A9 9 0 0 1 12 3 c2 0 3.5 1.1 3.5 2.5 S14.6 8 13.5 8 C12.7 8 12 7.6 12 7 m-3 5z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.38 6.81
                moveTo(x = 19.38f, y = 6.81f)
                // a 9 9 0 0 1 1.42 3.39
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.42f,
                    dy1 = 3.39f,
                )
                // a 2 2 0 0 1 0 3.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.6f,
                )
                // a 9 9 0 0 1 -17.6 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -17.6f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 0 1 0 -3.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.6f,
                )
                // A 9 9 0 0 1 12 3
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 3.0f,
                )
                // c 2 0 3.5 1.1 3.5 2.5
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 3.5f,
                    dy2 = 1.1f,
                    dx3 = 3.5f,
                    dy3 = 2.5f,
                )
                // S 14.6 8 13.5 8
                reflectiveCurveTo(
                    x1 = 14.6f,
                    y1 = 8.0f,
                    x2 = 13.5f,
                    y2 = 8.0f,
                )
                // C 12.7 8 12 7.6 12 7
                curveTo(
                    x1 = 12.7f,
                    y1 = 8.0f,
                    x2 = 12.0f,
                    y2 = 7.6f,
                    x3 = 12.0f,
                    y3 = 7.0f,
                )
                // m -3 5z
                moveToRelative(dx = -3.0f, dy = 5.0f)
                close()
            }
        }.build().also { _baby = it }
    }

@Suppress("ObjectPropertyName")
private var _baby: ImageVector? = null
