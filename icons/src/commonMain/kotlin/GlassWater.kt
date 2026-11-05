package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GlassWater: ImageVector
    get() {
        val current = _glassWater
        if (current != null) return current

        return ImageVector.Builder(
            name = "GlassWater",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5.12 4.1 A1 1 0 0 1 6.1 3 h11.78 a1 1 0 0 1 1 1.1 l-1.7 16.11 A2 2 0 0 1 15.2 22 H8.8 a2 2 0 0 1 -2 -1.79z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.12 4.1
                moveTo(x = 5.12f, y = 4.1f)
                // A 1 1 0 0 1 6.1 3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.1f,
                    y1 = 3.0f,
                )
                // h 11.78
                horizontalLineToRelative(dx = 11.78f)
                // a 1 1 0 0 1 1 1.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.1f,
                )
                // l -1.7 16.11
                lineToRelative(dx = -1.7f, dy = 16.11f)
                // A 2 2 0 0 1 15.2 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.2f,
                    y1 = 22.0f,
                )
                // H 8.8
                horizontalLineTo(x = 8.8f)
                // a 2 2 0 0 1 -2 -1.79z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -1.79f,
                )
                close()
            }
            // M6 12 a5 5 0 0 1 6 0 5 5 0 0 0 6 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // a 5 5 0 0 1 6 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 0 0 6 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _glassWater = it }
    }


@Suppress("ObjectPropertyName")
private var _glassWater: ImageVector? = null
