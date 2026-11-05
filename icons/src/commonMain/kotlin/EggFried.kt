package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EggFried: ImageVector
    get() {
        val current = _eggFried
        if (current != null) return current

        return ImageVector.Builder(
            name = "EggFried",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="11.5" cy="12.5" radius="3.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.5 12.5
                moveTo(x = 11.5f, y = 12.5f)
                // m -3.5 0
                moveToRelative(dx = -3.5f, dy = 0.0f)
                // a 3.5 3.5 0 1 1 7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // a 3.5 3.5 0 1 1 -7 0z
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M3 8 c0 -3.5 2.5 -6 6.5 -6 5 0 4.83 3 7.5 5 s5 2 5 6 c0 4.5 -2.5 6.5 -7 6.5 -2.5 0 -2.5 2.5 -6 2.5 s-7 -2 -7 -5.5 c0 -3 1.5 -3 1.5 -5 C3.5 10 3 9 3 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 8
                moveTo(x = 3.0f, y = 8.0f)
                // c 0 -3.5 2.5 -6 6.5 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.5f,
                    dx2 = 2.5f,
                    dy2 = -6.0f,
                    dx3 = 6.5f,
                    dy3 = -6.0f,
                )
                // c 5 0 4.83 3 7.5 5
                curveToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                    dx2 = 4.83f,
                    dy2 = 3.0f,
                    dx3 = 7.5f,
                    dy3 = 5.0f,
                )
                // s 5 2 5 6
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = 2.0f,
                    dx2 = 5.0f,
                    dy2 = 6.0f,
                )
                // c 0 4.5 -2.5 6.5 -7 6.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.5f,
                    dx2 = -2.5f,
                    dy2 = 6.5f,
                    dx3 = -7.0f,
                    dy3 = 6.5f,
                )
                // c -2.5 0 -2.5 2.5 -6 2.5
                curveToRelative(
                    dx1 = -2.5f,
                    dy1 = 0.0f,
                    dx2 = -2.5f,
                    dy2 = 2.5f,
                    dx3 = -6.0f,
                    dy3 = 2.5f,
                )
                // s -7 -2 -7 -5.5
                reflectiveCurveToRelative(
                    dx1 = -7.0f,
                    dy1 = -2.0f,
                    dx2 = -7.0f,
                    dy2 = -5.5f,
                )
                // c 0 -3 1.5 -3 1.5 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = 1.5f,
                    dy2 = -3.0f,
                    dx3 = 1.5f,
                    dy3 = -5.0f,
                )
                // C 3.5 10 3 9 3 8
                curveTo(
                    x1 = 3.5f,
                    y1 = 10.0f,
                    x2 = 3.0f,
                    y2 = 9.0f,
                    x3 = 3.0f,
                    y3 = 8.0f,
                )
            }
        }.build().also { _eggFried = it }
    }


@Suppress("ObjectPropertyName")
private var _eggFried: ImageVector? = null
