package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartSpline: ImageVector
    get() {
        val current = _chartSpline
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChartSpline",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 3 v16 a2 2 0 0 0 2 2 h16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
            }
            // M7 16 c.5 -2 1.5 -7 4 -7 2 0 2 3 4 3 2.5 0 4.5 -5 5 -7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 16
                moveTo(x = 7.0f, y = 16.0f)
                // c 0.5 -2 1.5 -7 4 -7
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = -2.0f,
                    dx2 = 1.5f,
                    dy2 = -7.0f,
                    dx3 = 4.0f,
                    dy3 = -7.0f,
                )
                // c 2 0 2 3 4 3
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 3.0f,
                    dx3 = 4.0f,
                    dy3 = 3.0f,
                )
                // c 2.5 0 4.5 -5 5 -7
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 4.5f,
                    dy2 = -5.0f,
                    dx3 = 5.0f,
                    dy3 = -7.0f,
                )
            }
        }.build().also { _chartSpline = it }
    }

@Suppress("ObjectPropertyName")
private var _chartSpline: ImageVector? = null
