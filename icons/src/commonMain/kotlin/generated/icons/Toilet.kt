package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Toilet: ImageVector
    get() {
        val current = _toilet
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Toilet",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7 12 h13 a1 1 0 0 1 1 1 5 5 0 0 1 -5 5 h-.6 a.5 .5 0 0 0 -.42 .77 l1.54 2.47 A.5 .5 0 0 1 16.1 22 H5.4 a.5 .5 0 0 1 -.42 -.76 L7 18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // a 5 5 0 0 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // h -0.6
                horizontalLineToRelative(dx = -0.6f)
                // a 0.5 0.5 0 0 0 -0.42 0.77
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.42f,
                    dy1 = 0.77f,
                )
                // l 1.54 2.47
                lineToRelative(dx = 1.54f, dy = 2.47f)
                // A 0.5 0.5 0 0 1 16.1 22
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.1f,
                    y1 = 22.0f,
                )
                // H 5.4
                horizontalLineTo(x = 5.4f)
                // a 0.5 0.5 0 0 1 -0.42 -0.76
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.42f,
                    dy1 = -0.76f,
                )
                // L 7 18
                lineTo(x = 7.0f, y = 18.0f)
            }
            // M8 18 a5 5 0 0 1 -5 -5 V4 a2 2 0 0 1 2 -2 h8 a2 2 0 0 1 2 2 v8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 18
                moveTo(x = 8.0f, y = 18.0f)
                // a 5 5 0 0 1 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
            }
        }.build().also { _toilet = it }
    }

@Suppress("ObjectPropertyName")
private var _toilet: ImageVector? = null
