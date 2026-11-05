package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ZodiacLeo: ImageVector
    get() {
        val current = _zodiacLeo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ZodiacLeo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 16 c0 -4 -3 -4.5 -3 -8 a5 5 0 0 1 10 0 c0 3.47 -3 6.2 -3 10 a3 3 0 0 0 6 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 16
                moveTo(x = 10.0f, y = 16.0f)
                // c 0 -4 -3 -4.5 -3 -8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = -3.0f,
                    dy2 = -4.5f,
                    dx3 = -3.0f,
                    dy3 = -8.0f,
                )
                // a 5 5 0 0 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // c 0 3.47 -3 6.2 -3 10
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.47f,
                    dx2 = -3.0f,
                    dy2 = 6.2f,
                    dx3 = -3.0f,
                    dy3 = 10.0f,
                )
                // a 3 3 0 0 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
            }
            // <circle cx="7.0" cy="16.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 16
                moveTo(x = 7.0f, y = 16.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _zodiacLeo = it }
    }

@Suppress("ObjectPropertyName")
private var _zodiacLeo: ImageVector? = null
