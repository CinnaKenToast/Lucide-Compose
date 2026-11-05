package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ClefAlto: ImageVector
    get() {
        val current = _clefAlto
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ClefAlto",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 4 v16 m4 -15.24 a3 3 0 1 1 -.15 4.33 A4 4 0 0 1 10 12 a4 4 0 0 1 3.85 2.9 A3 3 0 1 1 14 19.25 M6 4 v16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 4
                moveTo(x = 10.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // m 4 -15.24
                moveToRelative(dx = 4.0f, dy = -15.24f)
                // a 3 3 0 1 1 -0.15 4.33
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.15f,
                    dy1 = 4.33f,
                )
                // A 4 4 0 0 1 10 12
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 12.0f,
                )
                // a 4 4 0 0 1 3.85 2.9
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.85f,
                    dy1 = 2.9f,
                )
                // A 3 3 0 1 1 14 19.25
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 19.25f,
                )
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
            }
        }.build().also { _clefAlto = it }
    }

@Suppress("ObjectPropertyName")
private var _clefAlto: ImageVector? = null
