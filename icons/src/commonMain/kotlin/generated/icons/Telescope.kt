package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Telescope: ImageVector
    get() {
        val current = _telescope
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Telescope",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.07 12.5 3.89 13.8 a.93 .93 0 0 1 -1.11 -.7 l-.54 -2.15 a1.07 1.07 0 0 1 .7 -1.27 l13.5 -4.44 m-2.88 6.5 4.33 -.93 M16 21 l-3.1 -6.21
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.07 12.5
                moveTo(x = 10.07f, y = 12.5f)
                // L 3.89 13.8
                lineTo(x = 3.89f, y = 13.8f)
                // a 0.93 0.93 0 0 1 -1.11 -0.7
                arcToRelative(
                    a = 0.93f,
                    b = 0.93f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.11f,
                    dy1 = -0.7f,
                )
                // l -0.54 -2.15
                lineToRelative(dx = -0.54f, dy = -2.15f)
                // a 1.07 1.07 0 0 1 0.7 -1.27
                arcToRelative(
                    a = 1.07f,
                    b = 1.07f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.7f,
                    dy1 = -1.27f,
                )
                // l 13.5 -4.44
                lineToRelative(dx = 13.5f, dy = -4.44f)
                // m -2.88 6.5
                moveToRelative(dx = -2.88f, dy = 6.5f)
                // l 4.33 -0.93
                lineToRelative(dx = 4.33f, dy = -0.93f)
                // M 16 21
                moveTo(x = 16.0f, y = 21.0f)
                // l -3.1 -6.21
                lineToRelative(dx = -3.1f, dy = -6.21f)
            }
            // M16.49 5.94 a2 2 0 0 1 1.45 -2.42 l1.09 -.28 a1 1 0 0 1 1.21 .73 l1.52 6.06 a1 1 0 0 1 -.73 1.21 l-1.09 .27 a2 2 0 0 1 -2.43 -1.45z M6.15 8.64 l1.11 4.45 M8 21 l3.1 -6.21
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.49 5.94
                moveTo(x = 16.49f, y = 5.94f)
                // a 2 2 0 0 1 1.45 -2.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.45f,
                    dy1 = -2.42f,
                )
                // l 1.09 -0.28
                lineToRelative(dx = 1.09f, dy = -0.28f)
                // a 1 1 0 0 1 1.21 0.73
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.21f,
                    dy1 = 0.73f,
                )
                // l 1.52 6.06
                lineToRelative(dx = 1.52f, dy = 6.06f)
                // a 1 1 0 0 1 -0.73 1.21
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.73f,
                    dy1 = 1.21f,
                )
                // l -1.09 0.27
                lineToRelative(dx = -1.09f, dy = 0.27f)
                // a 2 2 0 0 1 -2.43 -1.45z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.43f,
                    dy1 = -1.45f,
                )
                close()
                // M 6.15 8.64
                moveTo(x = 6.15f, y = 8.64f)
                // l 1.11 4.45
                lineToRelative(dx = 1.11f, dy = 4.45f)
                // M 8 21
                moveTo(x = 8.0f, y = 21.0f)
                // l 3.1 -6.21
                lineToRelative(dx = 3.1f, dy = -6.21f)
            }
            // <circle cx="12.0" cy="13.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 13
                moveTo(x = 12.0f, y = 13.0f)
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
        }.build().also { _telescope = it }
    }

@Suppress("ObjectPropertyName")
private var _telescope: ImageVector? = null
