package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cog: ImageVector
    get() {
        val current = _cog
        if (current != null) return current

        return ImageVector.Builder(
            name = "Cog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 10.27 7 3.34 m4 10.39 -4 6.93 M12 22 v-2 m0 -18 v2 m2 8 h8 m-5 8.66 -1 -1.73 m1 -15.59 -1 1.73 M2 12 h2 m16.66 5 -1.73 -1 m1.73 -9 -1.73 1 M3.34 17 l1.73 -1 M3.34 7 l1.73 1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 10.27
                moveTo(x = 11.0f, y = 10.27f)
                // L 7 3.34
                lineTo(x = 7.0f, y = 3.34f)
                // m 4 10.39
                moveToRelative(dx = 4.0f, dy = 10.39f)
                // l -4 6.93
                lineToRelative(dx = -4.0f, dy = 6.93f)
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 -18
                moveToRelative(dx = 0.0f, dy = -18.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 2 8
                moveToRelative(dx = 2.0f, dy = 8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -5 8.66
                moveToRelative(dx = -5.0f, dy = 8.66f)
                // l -1 -1.73
                lineToRelative(dx = -1.0f, dy = -1.73f)
                // m 1 -15.59
                moveToRelative(dx = 1.0f, dy = -15.59f)
                // l -1 1.73
                lineToRelative(dx = -1.0f, dy = 1.73f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16.66 5
                moveToRelative(dx = 16.66f, dy = 5.0f)
                // l -1.73 -1
                lineToRelative(dx = -1.73f, dy = -1.0f)
                // m 1.73 -9
                moveToRelative(dx = 1.73f, dy = -9.0f)
                // l -1.73 1
                lineToRelative(dx = -1.73f, dy = 1.0f)
                // M 3.34 17
                moveTo(x = 3.34f, y = 17.0f)
                // l 1.73 -1
                lineToRelative(dx = 1.73f, dy = -1.0f)
                // M 3.34 7
                moveTo(x = 3.34f, y = 7.0f)
                // l 1.73 1
                lineToRelative(dx = 1.73f, dy = 1.0f)
            }
            // <circle cx="12.0" cy="12.0" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
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
            // <circle cx="12.0" cy="12.0" radius="8.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 8 8 0 1 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // a 8 8 0 1 1 -16 0z
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _cog = it }
    }


@Suppress("ObjectPropertyName")
private var _cog: ImageVector? = null
