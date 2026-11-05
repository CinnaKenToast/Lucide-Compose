package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radar: ImageVector
    get() {
        val current = _radar
        if (current != null) return current

        return ImageVector.Builder(
            name = "Radar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19.07 4.93 A10 10 0 0 0 6.99 3.34 M4 6z M2.29 9.62 a10 10 0 1 0 19.02 -1.27
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.07 4.93
                moveTo(x = 19.07f, y = 4.93f)
                // A 10 10 0 0 0 6.99 3.34
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.99f,
                    y1 = 3.34f,
                )
                // M 4 6z
                moveTo(x = 4.0f, y = 6.0f)
                close()
                // M 2.29 9.62
                moveTo(x = 2.29f, y = 9.62f)
                // a 10 10 0 1 0 19.02 -1.27
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 19.02f,
                    dy1 = -1.27f,
                )
            }
            // M16.24 7.76 a6 6 0 1 0 -8.01 8.91 M12 18z m5.98 -6.34 a6 6 0 0 1 -2.22 5.01
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.24 7.76
                moveTo(x = 16.24f, y = 7.76f)
                // a 6 6 0 1 0 -8.01 8.91
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.01f,
                    dy1 = 8.91f,
                )
                // M 12 18z
                moveTo(x = 12.0f, y = 18.0f)
                close()
                // m 5.98 -6.34
                moveToRelative(dx = 5.98f, dy = -6.34f)
                // a 6 6 0 0 1 -2.22 5.01
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.22f,
                    dy1 = 5.01f,
                )
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
            // m13.41 10.59 5.66 -5.66
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.41 10.59
                moveTo(x = 13.41f, y = 10.59f)
                // l 5.66 -5.66
                lineToRelative(dx = 5.66f, dy = -5.66f)
            }
        }.build().also { _radar = it }
    }


@Suppress("ObjectPropertyName")
private var _radar: ImageVector? = null
