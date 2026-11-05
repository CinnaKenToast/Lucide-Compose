package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ShieldCog: ImageVector
    get() {
        val current = _shieldCog
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ShieldCog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10.93 14.47 -.38 .92 m.38 -6.47 L10.55 8 m2.67 .92 L13.62 8 m0 7.4 -.39 -.93 m1.63 -3.92 .92 -.39 m-.92 2.68 .92 .39 M20 13 c0 5 -3.5 7.5 -7.66 8.95 a1 1 0 0 1 -.67 -.01 C7.5 20.5 4 18 4 13 V6 a1 1 0 0 1 1 -1 c2 0 4.5 -1.2 6.24 -2.72 a1.2 1.2 0 0 1 1.52 0 C14.51 3.81 17 5 19 5 a1 1 0 0 1 1 1z M9.3 10.55 l-.92 -.39 m.92 2.68 -.92 .39
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.93 14.47
                moveTo(x = 10.93f, y = 14.47f)
                // l -0.38 0.92
                lineToRelative(dx = -0.38f, dy = 0.92f)
                // m 0.38 -6.47
                moveToRelative(dx = 0.38f, dy = -6.47f)
                // L 10.55 8
                lineTo(x = 10.55f, y = 8.0f)
                // m 2.67 0.92
                moveToRelative(dx = 2.67f, dy = 0.92f)
                // L 13.62 8
                lineTo(x = 13.62f, y = 8.0f)
                // m 0 7.4
                moveToRelative(dx = 0.0f, dy = 7.4f)
                // l -0.39 -0.93
                lineToRelative(dx = -0.39f, dy = -0.93f)
                // m 1.63 -3.92
                moveToRelative(dx = 1.63f, dy = -3.92f)
                // l 0.92 -0.39
                lineToRelative(dx = 0.92f, dy = -0.39f)
                // m -0.92 2.68
                moveToRelative(dx = -0.92f, dy = 2.68f)
                // l 0.92 0.39
                lineToRelative(dx = 0.92f, dy = 0.39f)
                // M 20 13
                moveTo(x = 20.0f, y = 13.0f)
                // c 0 5 -3.5 7.5 -7.66 8.95
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                    dx2 = -3.5f,
                    dy2 = 7.5f,
                    dx3 = -7.66f,
                    dy3 = 8.95f,
                )
                // a 1 1 0 0 1 -0.67 -0.01
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.67f,
                    dy1 = -0.01f,
                )
                // C 7.5 20.5 4 18 4 13
                curveTo(
                    x1 = 7.5f,
                    y1 = 20.5f,
                    x2 = 4.0f,
                    y2 = 18.0f,
                    x3 = 4.0f,
                    y3 = 13.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // c 2 0 4.5 -1.2 6.24 -2.72
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 4.5f,
                    dy2 = -1.2f,
                    dx3 = 6.24f,
                    dy3 = -2.72f,
                )
                // a 1.2 1.2 0 0 1 1.52 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.52f,
                    dy1 = 0.0f,
                )
                // C 14.51 3.81 17 5 19 5
                curveTo(
                    x1 = 14.51f,
                    y1 = 3.81f,
                    x2 = 17.0f,
                    y2 = 5.0f,
                    x3 = 19.0f,
                    y3 = 5.0f,
                )
                // a 1 1 0 0 1 1 1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                close()
                // M 9.3 10.55
                moveTo(x = 9.3f, y = 10.55f)
                // l -0.92 -0.39
                lineToRelative(dx = -0.92f, dy = -0.39f)
                // m 0.92 2.68
                moveToRelative(dx = 0.92f, dy = 2.68f)
                // l -0.92 0.39
                lineToRelative(dx = -0.92f, dy = 0.39f)
            }
            // <circle cx="12.077" cy="11.695" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.077 11.695
                moveTo(x = 12.077f, y = 11.695f)
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
        }.build().also { _shieldCog = it }
    }

@Suppress("ObjectPropertyName")
private var _shieldCog: ImageVector? = null
