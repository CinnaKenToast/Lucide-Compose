package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ShieldCogCorner: ImageVector
    get() {
        val current = _shieldCogCorner
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ShieldCogCorner",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 22 c-3.8 -1.45 -7 -3.97 -7 -9 V6 a1 1 0 0 1 1 -1 c2 0 4.5 -1.2 6.24 -2.72 a1.2 1.2 0 0 1 1.52 0 C14.51 3.81 17 5 19 5 a1 1 0 0 1 1 1 v4 m-5.08 6.55 L14 16.16 m.92 2.68 L14 19.23 m2.55 -4.3 L16.16 14 m.39 6.47 -.39 .92 m2.68 -6.47 L19.23 14 m0 7.4 -.39 -.93 m1.63 -3.92 .92 -.39 m-.92 2.68 .92 .39
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 22
                moveTo(x = 11.0f, y = 22.0f)
                // c -3.8 -1.45 -7 -3.97 -7 -9
                curveToRelative(
                    dx1 = -3.8f,
                    dy1 = -1.45f,
                    dx2 = -7.0f,
                    dy2 = -3.97f,
                    dx3 = -7.0f,
                    dy3 = -9.0f,
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
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m -5.08 6.55
                moveToRelative(dx = -5.08f, dy = 6.55f)
                // L 14 16.16
                lineTo(x = 14.0f, y = 16.16f)
                // m 0.92 2.68
                moveToRelative(dx = 0.92f, dy = 2.68f)
                // L 14 19.23
                lineTo(x = 14.0f, y = 19.23f)
                // m 2.55 -4.3
                moveToRelative(dx = 2.55f, dy = -4.3f)
                // L 16.16 14
                lineTo(x = 16.16f, y = 14.0f)
                // m 0.39 6.47
                moveToRelative(dx = 0.39f, dy = 6.47f)
                // l -0.39 0.92
                lineToRelative(dx = -0.39f, dy = 0.92f)
                // m 2.68 -6.47
                moveToRelative(dx = 2.68f, dy = -6.47f)
                // L 19.23 14
                lineTo(x = 19.23f, y = 14.0f)
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
            }
            // <circle cx="17.695" cy="17.695" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.695 17.695
                moveTo(x = 17.695f, y = 17.695f)
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
        }.build().also { _shieldCogCorner = it }
    }

@Suppress("ObjectPropertyName")
private var _shieldCogCorner: ImageVector? = null
