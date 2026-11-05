package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LensConvex: ImageVector
    get() {
        val current = _lensConvex
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LensConvex",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.43 2 a1 1 0 0 1 .83 .45 18 18 0 0 1 0 19.1 A1 1 0 0 1 13.43 22 h-2.86 a1 1 0 0 1 -.83 -.45 18 18 0 0 1 0 -19.1 A1 1 0 0 1 10.57 2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.43 2
                moveTo(x = 13.43f, y = 2.0f)
                // a 1 1 0 0 1 0.83 0.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.83f,
                    dy1 = 0.45f,
                )
                // a 18 18 0 0 1 0 19.1
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 19.1f,
                )
                // A 1 1 0 0 1 13.43 22
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.43f,
                    y1 = 22.0f,
                )
                // h -2.86
                horizontalLineToRelative(dx = -2.86f)
                // a 1 1 0 0 1 -0.83 -0.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.83f,
                    dy1 = -0.45f,
                )
                // a 18 18 0 0 1 0 -19.1
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -19.1f,
                )
                // A 1 1 0 0 1 10.57 2z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.57f,
                    y1 = 2.0f,
                )
                close()
            }
        }.build().also { _lensConvex = it }
    }

@Suppress("ObjectPropertyName")
private var _lensConvex: ImageVector? = null
