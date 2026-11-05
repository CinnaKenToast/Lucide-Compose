package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ampersand: ImageVector
    get() {
        val current = _ampersand
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Ampersand",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 12 h3 m-1.5 0 a8 8 0 0 1 -8 8 A4.5 4.5 0 0 1 5 15.5 c0 -6 8 -4 8 -8.5 a3 3 0 1 0 -6 0 c0 3 2.5 8.5 12 13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 12
                moveTo(x = 16.0f, y = 12.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 8 8 0 0 1 -8 8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 8.0f,
                )
                // A 4.5 4.5 0 0 1 5 15.5
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 15.5f,
                )
                // c 0 -6 8 -4 8 -8.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                    dx2 = 8.0f,
                    dy2 = -4.0f,
                    dx3 = 8.0f,
                    dy3 = -8.5f,
                )
                // a 3 3 0 1 0 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // c 0 3 2.5 8.5 12 13
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = 2.5f,
                    dy2 = 8.5f,
                    dx3 = 12.0f,
                    dy3 = 13.0f,
                )
            }
        }.build().also { _ampersand = it }
    }

@Suppress("ObjectPropertyName")
private var _ampersand: ImageVector? = null
