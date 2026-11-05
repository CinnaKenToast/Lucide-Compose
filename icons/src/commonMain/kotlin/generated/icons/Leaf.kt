package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Leaf: ImageVector
    get() {
        val current = _leaf
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Leaf",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 20 a10 10 0 0 0 10 -10 26 26 0 0 0 -1.04 -7.28 1 1 0 0 0 -1.75 -.33 C15.83 5.5 13 5.5 9.8 6.1 A7 7 0 0 0 11 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 20
                moveTo(x = 11.0f, y = 20.0f)
                // a 10 10 0 0 0 10 -10
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = -10.0f,
                )
                // a 26 26 0 0 0 -1.04 -7.28
                arcToRelative(
                    a = 26.0f,
                    b = 26.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.04f,
                    dy1 = -7.28f,
                )
                // a 1 1 0 0 0 -1.75 -0.33
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.75f,
                    dy1 = -0.33f,
                )
                // C 15.83 5.5 13 5.5 9.8 6.1
                curveTo(
                    x1 = 15.83f,
                    y1 = 5.5f,
                    x2 = 13.0f,
                    y2 = 5.5f,
                    x3 = 9.8f,
                    y3 = 6.1f,
                )
                // A 7 7 0 0 0 11 20
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.0f,
                    y1 = 20.0f,
                )
            }
            // M2 21 a5 5 0 0 1 2.91 -4.54 C7.61 15.2 8.35 15.24 11 13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // a 5 5 0 0 1 2.91 -4.54
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.91f,
                    dy1 = -4.54f,
                )
                // C 7.61 15.2 8.35 15.24 11 13
                curveTo(
                    x1 = 7.61f,
                    y1 = 15.2f,
                    x2 = 8.35f,
                    y2 = 15.24f,
                    x3 = 11.0f,
                    y3 = 13.0f,
                )
            }
        }.build().also { _leaf = it }
    }

@Suppress("ObjectPropertyName")
private var _leaf: ImageVector? = null
