package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudMoon: ImageVector
    get() {
        val current = _cloudMoon
        if (current != null) return current

        return ImageVector.Builder(
            name = "CloudMoon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 16 a3 3 0 0 1 0 6 H7 a5 5 0 1 1 4.9 -6z m5.38 -1.49 a6 6 0 0 0 3.46 -4.12 c.14 -.63 -.66 -.97 -1.25 -.72 a4 4 0 0 1 -5.26 -5.26 c.25 -.59 -.09 -1.4 -.72 -1.25 a6 6 0 0 0 -4.59 5.36
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 16
                moveTo(x = 13.0f, y = 16.0f)
                // a 3 3 0 0 1 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 5 5 0 1 1 4.9 -6z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.9f,
                    dy1 = -6.0f,
                )
                close()
                // m 5.38 -1.49
                moveToRelative(dx = 5.38f, dy = -1.49f)
                // a 6 6 0 0 0 3.46 -4.12
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.46f,
                    dy1 = -4.12f,
                )
                // c 0.14 -0.63 -0.66 -0.97 -1.25 -0.72
                curveToRelative(
                    dx1 = 0.14f,
                    dy1 = -0.63f,
                    dx2 = -0.66f,
                    dy2 = -0.97f,
                    dx3 = -1.25f,
                    dy3 = -0.72f,
                )
                // a 4 4 0 0 1 -5.26 -5.26
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.26f,
                    dy1 = -5.26f,
                )
                // c 0.25 -0.59 -0.09 -1.4 -0.72 -1.25
                curveToRelative(
                    dx1 = 0.25f,
                    dy1 = -0.59f,
                    dx2 = -0.09f,
                    dy2 = -1.4f,
                    dx3 = -0.72f,
                    dy3 = -1.25f,
                )
                // a 6 6 0 0 0 -4.59 5.36
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.59f,
                    dy1 = 5.36f,
                )
            }
        }.build().also { _cloudMoon = it }
    }


@Suppress("ObjectPropertyName")
private var _cloudMoon: ImageVector? = null
