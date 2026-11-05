package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Compass: ImageVector
    get() {
        val current = _compass
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Compass",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="12.0" radius="10.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0z
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m16.24 7.76 -1.8 5.41 a2 2 0 0 1 -1.27 1.27 l-5.41 1.8 1.8 -5.41 a2 2 0 0 1 1.27 -1.27z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.24 7.76
                moveTo(x = 16.24f, y = 7.76f)
                // l -1.8 5.41
                lineToRelative(dx = -1.8f, dy = 5.41f)
                // a 2 2 0 0 1 -1.27 1.27
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.27f,
                    dy1 = 1.27f,
                )
                // l -5.41 1.8
                lineToRelative(dx = -5.41f, dy = 1.8f)
                // l 1.8 -5.41
                lineToRelative(dx = 1.8f, dy = -5.41f)
                // a 2 2 0 0 1 1.27 -1.27z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.27f,
                    dy1 = -1.27f,
                )
                close()
            }
        }.build().also { _compass = it }
    }

@Suppress("ObjectPropertyName")
private var _compass: ImageVector? = null
