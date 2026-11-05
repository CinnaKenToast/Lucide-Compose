package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BicepsFlexed: ImageVector
    get() {
        val current = _bicepsFlexed
        if (current != null) return current

        return ImageVector.Builder(
            name = "BicepsFlexed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.4 13.02 A5 5 0 0 1 22 15 c0 3.87 -4 7 -9 7 -4.08 0 -8.15 -.82 -10.37 -2.46 A1.6 1.6 0 0 1 2 18.18 C2.1 12.72 2.63 2 10 2 a3 3 0 0 1 3 3 2 2 0 0 1 -2 2 C9.9 7 9.36 6.56 9 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.4 13.02
                moveTo(x = 12.4f, y = 13.02f)
                // A 5 5 0 0 1 22 15
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 15.0f,
                )
                // c 0 3.87 -4 7 -9 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.87f,
                    dx2 = -4.0f,
                    dy2 = 7.0f,
                    dx3 = -9.0f,
                    dy3 = 7.0f,
                )
                // c -4.08 0 -8.15 -0.82 -10.37 -2.46
                curveToRelative(
                    dx1 = -4.08f,
                    dy1 = 0.0f,
                    dx2 = -8.15f,
                    dy2 = -0.82f,
                    dx3 = -10.37f,
                    dy3 = -2.46f,
                )
                // A 1.6 1.6 0 0 1 2 18.18
                arcTo(
                    horizontalEllipseRadius = 1.6f,
                    verticalEllipseRadius = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 18.18f,
                )
                // C 2.1 12.72 2.63 2 10 2
                curveTo(
                    x1 = 2.1f,
                    y1 = 12.72f,
                    x2 = 2.63f,
                    y2 = 2.0f,
                    x3 = 10.0f,
                    y3 = 2.0f,
                )
                // a 3 3 0 0 1 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // C 9.9 7 9.36 6.56 9 6
                curveTo(
                    x1 = 9.9f,
                    y1 = 7.0f,
                    x2 = 9.36f,
                    y2 = 6.56f,
                    x3 = 9.0f,
                    y3 = 6.0f,
                )
            }
            // M15 14 a5 5 0 0 0 -7.58 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 14
                moveTo(x = 15.0f, y = 14.0f)
                // a 5 5 0 0 0 -7.58 2
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.58f,
                    dy1 = 2.0f,
                )
            }
            // M9.96 6.83 C8.02 7.98 9.5 13 8 15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.96 6.83
                moveTo(x = 9.96f, y = 6.83f)
                // C 8.02 7.98 9.5 13 8 15
                curveTo(
                    x1 = 8.02f,
                    y1 = 7.98f,
                    x2 = 9.5f,
                    y2 = 13.0f,
                    x3 = 8.0f,
                    y3 = 15.0f,
                )
            }
        }.build().also { _bicepsFlexed = it }
    }


@Suppress("ObjectPropertyName")
private var _bicepsFlexed: ImageVector? = null
