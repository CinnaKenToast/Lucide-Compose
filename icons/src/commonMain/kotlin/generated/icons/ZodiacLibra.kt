package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ZodiacLibra: ImageVector
    get() {
        val current = _zodiacLibra
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ZodiacLibra",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 16 h6.86 c.16 -.01 .19 -.32 .03 -.38 a6 6 0 1 1 4.22 0 c-.16 .06 -.13 .37 .03 .38 H21 M3 20 h18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // h 6.86
                horizontalLineToRelative(dx = 6.86f)
                // c 0.16 -0.01 0.19 -0.32 0.03 -0.38
                curveToRelative(
                    dx1 = 0.16f,
                    dy1 = -0.01f,
                    dx2 = 0.19f,
                    dy2 = -0.32f,
                    dx3 = 0.03f,
                    dy3 = -0.38f,
                )
                // a 6 6 0 1 1 4.22 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.22f,
                    dy1 = 0.0f,
                )
                // c -0.16 0.06 -0.13 0.37 0.03 0.38
                curveToRelative(
                    dx1 = -0.16f,
                    dy1 = 0.06f,
                    dx2 = -0.13f,
                    dy2 = 0.37f,
                    dx3 = 0.03f,
                    dy3 = 0.38f,
                )
                // H 21
                horizontalLineTo(x = 21.0f)
                // M 3 20
                moveTo(x = 3.0f, y = 20.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
            }
        }.build().also { _zodiacLibra = it }
    }

@Suppress("ObjectPropertyName")
private var _zodiacLibra: ImageVector? = null
