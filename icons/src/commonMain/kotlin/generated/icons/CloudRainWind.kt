package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudRainWind: ImageVector
    get() {
        val current = _cloudRainWind
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CloudRainWind",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 14.9 A7 7 0 1 1 15.71 8 h1.79 a4.5 4.5 0 0 1 2.5 8.24 M9.2 22 l3 -7 M9 13 l-3 7 m11 -7 -3 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 14.9
                moveTo(x = 4.0f, y = 14.9f)
                // A 7 7 0 1 1 15.71 8
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 15.71f,
                    y1 = 8.0f,
                )
                // h 1.79
                horizontalLineToRelative(dx = 1.79f)
                // a 4.5 4.5 0 0 1 2.5 8.24
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.5f,
                    dy1 = 8.24f,
                )
                // M 9.2 22
                moveTo(x = 9.2f, y = 22.0f)
                // l 3 -7
                lineToRelative(dx = 3.0f, dy = -7.0f)
                // M 9 13
                moveTo(x = 9.0f, y = 13.0f)
                // l -3 7
                lineToRelative(dx = -3.0f, dy = 7.0f)
                // m 11 -7
                moveToRelative(dx = 11.0f, dy = -7.0f)
                // l -3 7
                lineToRelative(dx = -3.0f, dy = 7.0f)
            }
        }.build().also { _cloudRainWind = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudRainWind: ImageVector? = null
