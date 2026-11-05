package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Bus: ImageVector
    get() {
        val current = _bus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Bus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 6 v6 m7 -6 v6 M2 12 h19.6 M18 18 h3 s.5 -1.7 .8 -2.8 c.1 -.4 .2 -.8 .2 -1.2 s-.1 -.8 -.2 -1.2 l-1.4 -5 C20.1 6.8 19.1 6 18 6 H4 a2 2 0 0 0 -2 2 v10 h3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 7 -6
                moveToRelative(dx = 7.0f, dy = -6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 19.6
                horizontalLineToRelative(dx = 19.6f)
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // s 0.5 -1.7 0.8 -2.8
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = -1.7f,
                    dx2 = 0.8f,
                    dy2 = -2.8f,
                )
                // c 0.1 -0.4 0.2 -0.8 0.2 -1.2
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = -0.4f,
                    dx2 = 0.2f,
                    dy2 = -0.8f,
                    dx3 = 0.2f,
                    dy3 = -1.2f,
                )
                // s -0.1 -0.8 -0.2 -1.2
                reflectiveCurveToRelative(
                    dx1 = -0.1f,
                    dy1 = -0.8f,
                    dx2 = -0.2f,
                    dy2 = -1.2f,
                )
                // l -1.4 -5
                lineToRelative(dx = -1.4f, dy = -5.0f)
                // C 20.1 6.8 19.1 6 18 6
                curveTo(
                    x1 = 20.1f,
                    y1 = 6.8f,
                    x2 = 19.1f,
                    y2 = 6.0f,
                    x3 = 18.0f,
                    y3 = 6.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
            }
            // <circle cx="7.0" cy="18.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
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
            // M9 18 h5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 18
                moveTo(x = 9.0f, y = 18.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
            }
            // <circle cx="16.0" cy="18.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 18
                moveTo(x = 16.0f, y = 18.0f)
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
        }.build().also { _bus = it }
    }

@Suppress("ObjectPropertyName")
private var _bus: ImageVector? = null
