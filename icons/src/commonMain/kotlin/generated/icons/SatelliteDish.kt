package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SatelliteDish: ImageVector
    get() {
        val current = _satelliteDish
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SatelliteDish",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 12 a6 6 0 0 0 -6 -6 m-9.18 4.46 a8 8 0 0 0 10.72 10.72 c.56 -.28 .62 -1.02 .18 -1.46 l-9.44 -9.44 C3.84 9.84 3.1 9.9 2.82 10.46 M22 12 A10 10 0 0 0 12 2 M9 15 l4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // a 6 6 0 0 0 -6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = -6.0f,
                )
                // m -9.18 4.46
                moveToRelative(dx = -9.18f, dy = 4.46f)
                // a 8 8 0 0 0 10.72 10.72
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.72f,
                    dy1 = 10.72f,
                )
                // c 0.56 -0.28 0.62 -1.02 0.18 -1.46
                curveToRelative(
                    dx1 = 0.56f,
                    dy1 = -0.28f,
                    dx2 = 0.62f,
                    dy2 = -1.02f,
                    dx3 = 0.18f,
                    dy3 = -1.46f,
                )
                // l -9.44 -9.44
                lineToRelative(dx = -9.44f, dy = -9.44f)
                // C 3.84 9.84 3.1 9.9 2.82 10.46
                curveTo(
                    x1 = 3.84f,
                    y1 = 9.84f,
                    x2 = 3.1f,
                    y2 = 9.9f,
                    x3 = 2.82f,
                    y3 = 10.46f,
                )
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // A 10 10 0 0 0 12 2
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 2.0f,
                )
                // M 9 15
                moveTo(x = 9.0f, y = 15.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
        }.build().also { _satelliteDish = it }
    }

@Suppress("ObjectPropertyName")
private var _satelliteDish: ImageVector? = null
