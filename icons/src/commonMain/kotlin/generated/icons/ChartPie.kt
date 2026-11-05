package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartPie: ImageVector
    get() {
        val current = _chartPie
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChartPie",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 12 c.55 0 1 -.45 .95 -1 A10 10 0 0 0 13 2.05 C12.45 2 12 2.45 12 3 v8 a1 1 0 0 0 1 1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // c 0.55 0 1 -0.45 0.95 -1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.45f,
                    dx3 = 0.95f,
                    dy3 = -1.0f,
                )
                // A 10 10 0 0 0 13 2.05
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.0f,
                    y1 = 2.05f,
                )
                // C 12.45 2 12 2.45 12 3
                curveTo(
                    x1 = 12.45f,
                    y1 = 2.0f,
                    x2 = 12.0f,
                    y2 = 2.45f,
                    x3 = 12.0f,
                    y3 = 3.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 1 1 0 0 0 1 1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                close()
            }
            // M21.21 15.89 A10 10 0 1 1 8 2.83
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.21 15.89
                moveTo(x = 21.21f, y = 15.89f)
                // A 10 10 0 1 1 8 2.83
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 2.83f,
                )
            }
        }.build().also { _chartPie = it }
    }

@Suppress("ObjectPropertyName")
private var _chartPie: ImageVector? = null
