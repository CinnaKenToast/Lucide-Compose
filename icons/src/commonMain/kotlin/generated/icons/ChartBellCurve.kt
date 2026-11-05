package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartBellCurve: ImageVector
    get() {
        val current = _chartBellCurve
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChartBellCurve",
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
            // M7 16 c3.5 0 2.5 -10 6 -10 s2.5 10 6 10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 16
                moveTo(x = 7.0f, y = 16.0f)
                // c 3.5 0 2.5 -10 6 -10
                curveToRelative(
                    dx1 = 3.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -10.0f,
                    dx3 = 6.0f,
                    dy3 = -10.0f,
                )
                // s 2.5 10 6 10
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = 10.0f,
                    dx2 = 6.0f,
                    dy2 = 10.0f,
                )
            }
        }.build().also { _chartBellCurve = it }
    }

@Suppress("ObjectPropertyName")
private var _chartBellCurve: ImageVector? = null
