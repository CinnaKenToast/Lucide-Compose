package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MoundShovel: ImageVector
    get() {
        val current = _moundShovel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MoundShovel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m16 16 1.55 -3.1 a1 1 0 0 0 -.44 -1.35 l-2.22 -1.1 a1 1 0 0 0 -1.34 .44 l-1.19 2.4 M20 3 l-4 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // l 1.55 -3.1
                lineToRelative(dx = 1.55f, dy = -3.1f)
                // a 1 1 0 0 0 -0.44 -1.35
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.44f,
                    dy1 = -1.35f,
                )
                // l -2.22 -1.1
                lineToRelative(dx = -2.22f, dy = -1.1f)
                // a 1 1 0 0 0 -1.34 0.44
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.34f,
                    dy1 = 0.44f,
                )
                // l -1.19 2.4
                lineToRelative(dx = -1.19f, dy = 2.4f)
                // M 20 3
                moveTo(x = 20.0f, y = 3.0f)
                // l -4 8
                lineToRelative(dx = -4.0f, dy = 8.0f)
            }
            // M21 21 a1 1 0 0 0 .6 -1.8 c-1.33 -1 -1 -4.21 -3.6 -4.2 -1.27 0 -1.5 1 -2 1 -2.5 0 -3.2 -4 -6.5 -4 -5.1 0 -4 5.1 -7.06 7.17 A1 1 0 0 0 3 21z m1 -17 -4 -2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 21
                moveTo(x = 21.0f, y = 21.0f)
                // a 1 1 0 0 0 0.6 -1.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.6f,
                    dy1 = -1.8f,
                )
                // c -1.33 -1 -1 -4.21 -3.6 -4.2
                curveToRelative(
                    dx1 = -1.33f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -4.21f,
                    dx3 = -3.6f,
                    dy3 = -4.2f,
                )
                // c -1.27 0 -1.5 1 -2 1
                curveToRelative(
                    dx1 = -1.27f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 1.0f,
                    dx3 = -2.0f,
                    dy3 = 1.0f,
                )
                // c -2.5 0 -3.2 -4 -6.5 -4
                curveToRelative(
                    dx1 = -2.5f,
                    dy1 = 0.0f,
                    dx2 = -3.2f,
                    dy2 = -4.0f,
                    dx3 = -6.5f,
                    dy3 = -4.0f,
                )
                // c -5.1 0 -4 5.1 -7.06 7.17
                curveToRelative(
                    dx1 = -5.1f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 5.1f,
                    dx3 = -7.06f,
                    dy3 = 7.17f,
                )
                // A 1 1 0 0 0 3 21z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 21.0f,
                )
                close()
                // m 1 -17
                moveToRelative(dx = 1.0f, dy = -17.0f)
                // l -4 -2
                lineToRelative(dx = -4.0f, dy = -2.0f)
            }
        }.build().also { _moundShovel = it }
    }

@Suppress("ObjectPropertyName")
private var _moundShovel: ImageVector? = null
