package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Sprout: ImageVector
    get() {
        val current = _sprout
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Sprout",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 9.54 V7 a4 4 0 0 1 4 -4 h1.5 A.5 .5 0 0 1 20 3.5 V5 a4 4 0 0 1 -4 4 4 4 0 0 0 -4 4 c0 2 1 3 1 5 a5 5 0 0 1 -1 3 M4 9 a5 5 0 0 1 8 4 5 5 0 0 1 -8 -4 m1 12 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 9.54
                moveTo(x = 14.0f, y = 9.54f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // A 0.5 0.5 0 0 1 20 3.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 3.5f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // c 0 2 1 3 1 5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 1.0f,
                    dy2 = 3.0f,
                    dx3 = 1.0f,
                    dy3 = 5.0f,
                )
                // a 5 5 0 0 1 -1 3
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 3.0f,
                )
                // M 4 9
                moveTo(x = 4.0f, y = 9.0f)
                // a 5 5 0 0 1 8 4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 4.0f,
                )
                // a 5 5 0 0 1 -8 -4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = -4.0f,
                )
                // m 1 12
                moveToRelative(dx = 1.0f, dy = 12.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
        }.build().also { _sprout = it }
    }

@Suppress("ObjectPropertyName")
private var _sprout: ImageVector? = null
