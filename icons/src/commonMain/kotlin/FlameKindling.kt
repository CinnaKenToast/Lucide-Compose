package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlameKindling: ImageVector
    get() {
        val current = _flameKindling
        if (current != null) return current

        return ImageVector.Builder(
            name = "FlameKindling",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 c1 3 2.5 3.5 3.5 4.5 A5 5 0 0 1 17 10 a5 5 0 1 1 -10 0 c0 -.3 0 -.6 .1 -.9 a2 2 0 1 0 3.3 -2 C8 4.5 11 2 12 2 M5 22 l14 -4 M5 18 l14 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // c 1 3 2.5 3.5 3.5 4.5
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 3.0f,
                    dx2 = 2.5f,
                    dy2 = 3.5f,
                    dx3 = 3.5f,
                    dy3 = 4.5f,
                )
                // A 5 5 0 0 1 17 10
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 10.0f,
                )
                // a 5 5 0 1 1 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                // c 0 -0.3 0 -0.6 0.1 -0.9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.3f,
                    dx2 = 0.0f,
                    dy2 = -0.6f,
                    dx3 = 0.1f,
                    dy3 = -0.9f,
                )
                // a 2 2 0 1 0 3.3 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.3f,
                    dy1 = -2.0f,
                )
                // C 8 4.5 11 2 12 2
                curveTo(
                    x1 = 8.0f,
                    y1 = 4.5f,
                    x2 = 11.0f,
                    y2 = 2.0f,
                    x3 = 12.0f,
                    y3 = 2.0f,
                )
                // M 5 22
                moveTo(x = 5.0f, y = 22.0f)
                // l 14 -4
                lineToRelative(dx = 14.0f, dy = -4.0f)
                // M 5 18
                moveTo(x = 5.0f, y = 18.0f)
                // l 14 4
                lineToRelative(dx = 14.0f, dy = 4.0f)
            }
        }.build().also { _flameKindling = it }
    }


@Suppress("ObjectPropertyName")
private var _flameKindling: ImageVector? = null
