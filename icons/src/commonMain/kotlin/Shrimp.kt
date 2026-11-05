package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shrimp: ImageVector
    get() {
        val current = _shrimp
        if (current != null) return current

        return ImageVector.Builder(
            name = "Shrimp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 2 a3.3 3.3 0 0 0 3.23 1.8 l6.17 -.56 A1 1 0 1 1 19.6 8 H8.5 a6.44 6.44 0 0 0 -5.63 9.75 A6.5 6.5 0 0 0 8.5 21 c1.38 0 2 -.5 2.5 -1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // a 3.3 3.3 0 0 0 3.23 1.8
                arcToRelative(
                    a = 3.3f,
                    b = 3.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.23f,
                    dy1 = 1.8f,
                )
                // l 6.17 -0.56
                lineToRelative(dx = 6.17f, dy = -0.56f)
                // A 1 1 0 1 1 19.6 8
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 19.6f,
                    y1 = 8.0f,
                )
                // H 8.5
                horizontalLineTo(x = 8.5f)
                // a 6.44 6.44 0 0 0 -5.63 9.75
                arcToRelative(
                    a = 6.44f,
                    b = 6.44f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.63f,
                    dy1 = 9.75f,
                )
                // A 6.5 6.5 0 0 0 8.5 21
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.5f,
                    y1 = 21.0f,
                )
                // c 1.38 0 2 -0.5 2.5 -1
                curveToRelative(
                    dx1 = 1.38f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.5f,
                    dx3 = 2.5f,
                    dy3 = -1.0f,
                )
            }
            // M10 8 a8.5 8.5 0 0 0 0 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 8
                moveTo(x = 10.0f, y = 8.0f)
                // a 8.5 8.5 0 0 0 0 8
                arcToRelative(
                    a = 8.5f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
            }
            // M11 22 c-.5 -.5 -1.12 -1 -2.5 -1 a1 1 0 0 1 0 -5 H12 a7 7 0 0 0 7 -7 V8 m-6 4z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 22
                moveTo(x = 11.0f, y = 22.0f)
                // c -0.5 -0.5 -1.12 -1 -2.5 -1
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = -0.5f,
                    dx2 = -1.12f,
                    dy2 = -1.0f,
                    dx3 = -2.5f,
                    dy3 = -1.0f,
                )
                // a 1 1 0 0 1 0 -5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // a 7 7 0 0 0 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // m -6 4z
                moveToRelative(dx = -6.0f, dy = 4.0f)
                close()
            }
            // M8 16 c-2 0 -4.5 -4 -4 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // c -2 0 -4.5 -4 -4 -6
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -4.5f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -6.0f,
                )
            }
        }.build().also { _shrimp = it }
    }


@Suppress("ObjectPropertyName")
private var _shrimp: ImageVector? = null
