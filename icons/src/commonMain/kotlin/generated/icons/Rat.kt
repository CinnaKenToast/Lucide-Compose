package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Rat: ImageVector
    get() {
        val current = _rat
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Rat",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 22 H4 a2 2 0 0 1 0 -4 h12 m-2.76 0 a3 3 0 0 0 -2.2 -5 M16 9 h.01
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 22
                moveTo(x = 13.0f, y = 22.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // m -2.76 0
                moveToRelative(dx = -2.76f, dy = 0.0f)
                // a 3 3 0 0 0 -2.2 -5
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.2f,
                    dy1 = -5.0f,
                )
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
            // M16.82 3.94 a3 3 0 1 1 3.24 4.87 l1.81 2.58 a1.5 1.5 0 0 1 -1.5 2.1 l-2.87 -.45 a3 3 0 0 0 -3.5 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.82 3.94
                moveTo(x = 16.82f, y = 3.94f)
                // a 3 3 0 1 1 3.24 4.87
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.24f,
                    dy1 = 4.87f,
                )
                // l 1.81 2.58
                lineToRelative(dx = 1.81f, dy = 2.58f)
                // a 1.5 1.5 0 0 1 -1.5 2.1
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.5f,
                    dy1 = 2.1f,
                )
                // l -2.87 -0.45
                lineToRelative(dx = -2.87f, dy = -0.45f)
                // a 3 3 0 0 0 -3.5 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.5f,
                    dy1 = 3.0f,
                )
            }
            // M17 4.99 a3 3 0 1 0 -5.2 2.05 A7 7 0 0 0 4 14.02 4 4 0 0 0 8 18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 4.99
                moveTo(x = 17.0f, y = 4.99f)
                // a 3 3 0 1 0 -5.2 2.05
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.2f,
                    dy1 = 2.05f,
                )
                // A 7 7 0 0 0 4 14.02
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 14.02f,
                )
                // A 4 4 0 0 0 8 18
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 18.0f,
                )
            }
        }.build().also { _rat = it }
    }

@Suppress("ObjectPropertyName")
private var _rat: ImageVector? = null
