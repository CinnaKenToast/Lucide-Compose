package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Broccoli: ImageVector
    get() {
        val current = _broccoli
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Broccoli",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 13 a3 3 0 0 1 -2.12 -5.12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // a 3 3 0 0 1 -2.12 -5.12
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.12f,
                    dy1 = -5.12f,
                )
            }
            // M15.6 14.2 c-3.5 1.5 -5.9 4.5 -8.9 7.5 A1 1 0 0 1 6 22 c-2 0 -4 -2 -4 -4 a1 1 0 0 1 .3 -.7 c1.9 -1.92 3.82 -3.59 5.34 -5.45
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.6 14.2
                moveTo(x = 15.6f, y = 14.2f)
                // c -3.5 1.5 -5.9 4.5 -8.9 7.5
                curveToRelative(
                    dx1 = -3.5f,
                    dy1 = 1.5f,
                    dx2 = -5.9f,
                    dy2 = 4.5f,
                    dx3 = -8.9f,
                    dy3 = 7.5f,
                )
                // A 1 1 0 0 1 6 22
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 22.0f,
                )
                // c -2 0 -4 -2 -4 -4
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -2.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // a 1 1 0 0 1 0.3 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.3f,
                    dy1 = -0.7f,
                )
                // c 1.9 -1.92 3.82 -3.59 5.34 -5.45
                curveToRelative(
                    dx1 = 1.9f,
                    dy1 = -1.92f,
                    dx2 = 3.82f,
                    dy2 = -3.59f,
                    dx3 = 5.34f,
                    dy3 = -5.45f,
                )
            }
            // M16.57 14.74 A4 4 0 0 1 14 11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.57 14.74
                moveTo(x = 16.57f, y = 14.74f)
                // A 4 4 0 0 1 14 11
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 11.0f,
                )
            }
            // M7.14 10.9 A4 4 0 1 1 9.9 3.49 a4 4 0 0 1 6.8 1 2 2 0 0 1 2.82 2.82 4 4 0 0 1 1 6.8 4 4 0 1 1 -7.5 1.6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7.14 10.9
                moveTo(x = 7.14f, y = 10.9f)
                // A 4 4 0 1 1 9.9 3.49
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 9.9f,
                    y1 = 3.49f,
                )
                // a 4 4 0 0 1 6.8 1
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.8f,
                    dy1 = 1.0f,
                )
                // a 2 2 0 0 1 2.82 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.82f,
                    dy1 = 2.82f,
                )
                // a 4 4 0 0 1 1 6.8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 6.8f,
                )
                // a 4 4 0 1 1 -7.5 1.6
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.5f,
                    dy1 = 1.6f,
                )
            }
        }.build().also { _broccoli = it }
    }

@Suppress("ObjectPropertyName")
private var _broccoli: ImageVector? = null
