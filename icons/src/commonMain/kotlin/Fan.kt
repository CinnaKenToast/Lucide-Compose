package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fan: ImageVector
    get() {
        val current = _fan
        if (current != null) return current

        return ImageVector.Builder(
            name = "Fan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.83 16.38 a6.08 6.08 0 0 1 -8.62 -7 l5.41 1.45 a6.08 6.08 0 0 1 7 -8.62 l-1.45 5.41 a6.08 6.08 0 0 1 8.62 7 l-5.41 -1.45 a6.08 6.08 0 0 1 -7 8.62z M12 12z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.83 16.38
                moveTo(x = 10.83f, y = 16.38f)
                // a 6.08 6.08 0 0 1 -8.62 -7
                arcToRelative(
                    a = 6.08f,
                    b = 6.08f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.62f,
                    dy1 = -7.0f,
                )
                // l 5.41 1.45
                lineToRelative(dx = 5.41f, dy = 1.45f)
                // a 6.08 6.08 0 0 1 7 -8.62
                arcToRelative(
                    a = 6.08f,
                    b = 6.08f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = -8.62f,
                )
                // l -1.45 5.41
                lineToRelative(dx = -1.45f, dy = 5.41f)
                // a 6.08 6.08 0 0 1 8.62 7
                arcToRelative(
                    a = 6.08f,
                    b = 6.08f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.62f,
                    dy1 = 7.0f,
                )
                // l -5.41 -1.45
                lineToRelative(dx = -5.41f, dy = -1.45f)
                // a 6.08 6.08 0 0 1 -7 8.62z
                arcToRelative(
                    a = 6.08f,
                    b = 6.08f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 8.62f,
                )
                close()
                // M 12 12z
                moveTo(x = 12.0f, y = 12.0f)
                close()
            }
        }.build().also { _fan = it }
    }


@Suppress("ObjectPropertyName")
private var _fan: ImageVector? = null
