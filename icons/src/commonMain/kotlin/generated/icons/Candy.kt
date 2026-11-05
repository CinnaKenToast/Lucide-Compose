package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Candy: ImageVector
    get() {
        val current = _candy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Candy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 7 v10.9 m4 -11.8 V17 m2 -10 V3 a1 1 0 0 1 1.7 -.7 A2.5 2.5 0 0 0 19.87 3 a1 1 0 0 1 1.13 1.13 2.5 2.5 0 0 0 .72 2.15 A1 1 0 0 1 21 8 h-4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 7
                moveTo(x = 10.0f, y = 7.0f)
                // v 10.9
                verticalLineToRelative(dy = 10.9f)
                // m 4 -11.8
                moveToRelative(dx = 4.0f, dy = -11.8f)
                // V 17
                verticalLineTo(y = 17.0f)
                // m 2 -10
                moveToRelative(dx = 2.0f, dy = -10.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 1 1.7 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = -0.7f,
                )
                // A 2.5 2.5 0 0 0 19.87 3
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.87f,
                    y1 = 3.0f,
                )
                // a 1 1 0 0 1 1.13 1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.13f,
                    dy1 = 1.13f,
                )
                // a 2.5 2.5 0 0 0 0.72 2.15
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.72f,
                    dy1 = 2.15f,
                )
                // A 1 1 0 0 1 21 8
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 8.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
            }
            // M16.54 7.47 a5 5 0 0 0 -7.08 0 l-2 2 a5 5 0 0 0 0 7.07 5 5 0 0 0 7.08 0 l2 -2 a5 5 0 0 0 0 -7.07
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.54 7.47
                moveTo(x = 16.54f, y = 7.47f)
                // a 5 5 0 0 0 -7.08 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.08f,
                    dy1 = 0.0f,
                )
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // a 5 5 0 0 0 0 7.07
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 7.07f,
                )
                // a 5 5 0 0 0 7.08 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.08f,
                    dy1 = 0.0f,
                )
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // a 5 5 0 0 0 0 -7.07
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -7.07f,
                )
            }
            // M8 17 v4 a1 1 0 0 1 -1.7 .7 A2.5 2.5 0 0 0 4.13 21 a1 1 0 0 1 -1.13 -1.13 2.5 2.5 0 0 0 -.72 -2.15 A1 1 0 0 1 3 16 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 17
                moveTo(x = 8.0f, y = 17.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 1 1 0 0 1 -1.7 0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.7f,
                    dy1 = 0.7f,
                )
                // A 2.5 2.5 0 0 0 4.13 21
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.13f,
                    y1 = 21.0f,
                )
                // a 1 1 0 0 1 -1.13 -1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.13f,
                    dy1 = -1.13f,
                )
                // a 2.5 2.5 0 0 0 -0.72 -2.15
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.72f,
                    dy1 = -2.15f,
                )
                // A 1 1 0 0 1 3 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.0f,
                    y1 = 16.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _candy = it }
    }

@Suppress("ObjectPropertyName")
private var _candy: ImageVector? = null
