package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudMoonRain: ImageVector
    get() {
        val current = _cloudMoonRain
        if (current != null) return current

        return ImageVector.Builder(
            name = "CloudMoonRain",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 20 v2 m7.38 -7.49 a6 6 0 0 0 3.46 -4.12 c.14 -.63 -.66 -.97 -1.25 -.72 a4 4 0 0 1 -5.26 -5.26 c.25 -.59 -.09 -1.4 -.72 -1.25 a6 6 0 0 0 -4.59 5.36 M3 20 a5 5 0 1 1 8.9 -4 H13 a3 3 0 0 1 2 5.24 M7 19 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 20
                moveTo(x = 11.0f, y = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 7.38 -7.49
                moveToRelative(dx = 7.38f, dy = -7.49f)
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
                // M 3 20
                moveTo(x = 3.0f, y = 20.0f)
                // a 5 5 0 1 1 8.9 -4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.9f,
                    dy1 = -4.0f,
                )
                // H 13
                horizontalLineTo(x = 13.0f)
                // a 3 3 0 0 1 2 5.24
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 5.24f,
                )
                // M 7 19
                moveTo(x = 7.0f, y = 19.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _cloudMoonRain = it }
    }


@Suppress("ObjectPropertyName")
private var _cloudMoonRain: ImageVector? = null
