package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ClefBass: ImageVector
    get() {
        val current = _clefBass
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ClefBass",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 11 h.01 M19 6 h.01 M5 8 c0 -4 4 -4 4 -4 6 0 6 6 6 6 0 7 -10 11 -10 11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 11
                moveTo(x = 19.0f, y = 11.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 19 6
                moveTo(x = 19.0f, y = 6.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 5 8
                moveTo(x = 5.0f, y = 8.0f)
                // c 0 -4 4 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // c 6 0 6 6 6 6
                curveToRelative(
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 6.0f,
                    dx3 = 6.0f,
                    dy3 = 6.0f,
                )
                // c 0 7 -10 11 -10 11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.0f,
                    dx2 = -10.0f,
                    dy2 = 11.0f,
                    dx3 = -10.0f,
                    dy3 = 11.0f,
                )
            }
            // <circle cx="7.0" cy="8.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 8
                moveTo(x = 7.0f, y = 8.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _clefBass = it }
    }

@Suppress("ObjectPropertyName")
private var _clefBass: ImageVector? = null
