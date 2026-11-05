package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LensConcave: ImageVector
    get() {
        val current = _lensConcave
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LensConcave",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7 2 a1 1 0 0 0 -.8 1.6 14 14 0 0 1 0 16.8 A1 1 0 0 0 7 22 h10 a1 1 0 0 0 .8 -1.6 14 14 0 0 1 0 -16.8 A1 1 0 0 0 17 2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 2
                moveTo(x = 7.0f, y = 2.0f)
                // a 1 1 0 0 0 -0.8 1.6
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.8f,
                    dy1 = 1.6f,
                )
                // a 14 14 0 0 1 0 16.8
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 16.8f,
                )
                // A 1 1 0 0 0 7 22
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 22.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 1 1 0 0 0 0.8 -1.6
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.8f,
                    dy1 = -1.6f,
                )
                // a 14 14 0 0 1 0 -16.8
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -16.8f,
                )
                // A 1 1 0 0 0 17 2z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 2.0f,
                )
                close()
            }
        }.build().also { _lensConcave = it }
    }

@Suppress("ObjectPropertyName")
private var _lensConcave: ImageVector? = null
