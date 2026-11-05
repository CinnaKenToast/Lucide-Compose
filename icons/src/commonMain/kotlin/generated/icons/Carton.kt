package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Carton: ImageVector
    get() {
        val current = _carton
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Carton",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 22 V10 a2 2 0 0 1 .54 -1.37 L16 6 H8 L5.54 8.63 A2 2 0 0 0 5 10 v10 a2 2 0 0 0 2 2 h10 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -.54 -1.37 L16 6 V3 a1 1 0 0 0 -1 -1 H9 a1 1 0 0 0 -1 1 v3 m-3 4 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 22
                moveTo(x = 13.0f, y = 22.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // a 2 2 0 0 1 0.54 -1.37
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.54f,
                    dy1 = -1.37f,
                )
                // L 16 6
                lineTo(x = 16.0f, y = 6.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // L 5.54 8.63
                lineTo(x = 5.54f, y = 8.63f)
                // A 2 2 0 0 0 5 10
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 10.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // a 2 2 0 0 0 -0.54 -1.37
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.54f,
                    dy1 = -1.37f,
                )
                // L 16 6
                lineTo(x = 16.0f, y = 6.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m -3 4
                moveToRelative(dx = -3.0f, dy = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _carton = it }
    }

@Suppress("ObjectPropertyName")
private var _carton: ImageVector? = null
