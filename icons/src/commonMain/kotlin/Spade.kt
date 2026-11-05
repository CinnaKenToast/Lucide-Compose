package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Spade: ImageVector
    get() {
        val current = _spade
        if (current != null) return current

        return ImageVector.Builder(
            name = "Spade",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 18 v4 M2 14.5 a5.5 5.5 0 0 0 9.6 3.67 .6 .6 0 0 1 .8 0 A5.5 5.5 0 0 0 22 14.5 c0 -2.29 -1.5 -4 -3 -5.5 l-5.5 -5.31 a2 2 0 0 0 -3 -.02 L5 9 c-1.5 1.5 -3 3.2 -3 5.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // M 2 14.5
                moveTo(x = 2.0f, y = 14.5f)
                // a 5.5 5.5 0 0 0 9.6 3.67
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.6f,
                    dy1 = 3.67f,
                )
                // a 0.6 0.6 0 0 1 0.8 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.8f,
                    dy1 = 0.0f,
                )
                // A 5.5 5.5 0 0 0 22 14.5
                arcTo(
                    horizontalEllipseRadius = 5.5f,
                    verticalEllipseRadius = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 14.5f,
                )
                // c 0 -2.29 -1.5 -4 -3 -5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.29f,
                    dx2 = -1.5f,
                    dy2 = -4.0f,
                    dx3 = -3.0f,
                    dy3 = -5.5f,
                )
                // l -5.5 -5.31
                lineToRelative(dx = -5.5f, dy = -5.31f)
                // a 2 2 0 0 0 -3 -0.02
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -0.02f,
                )
                // L 5 9
                lineTo(x = 5.0f, y = 9.0f)
                // c -1.5 1.5 -3 3.2 -3 5.5
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 1.5f,
                    dx2 = -3.0f,
                    dy2 = 3.2f,
                    dx3 = -3.0f,
                    dy3 = 5.5f,
                )
            }
        }.build().also { _spade = it }
    }


@Suppress("ObjectPropertyName")
private var _spade: ImageVector? = null
