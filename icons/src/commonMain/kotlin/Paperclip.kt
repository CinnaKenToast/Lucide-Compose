package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Paperclip: ImageVector
    get() {
        val current = _paperclip
        if (current != null) return current

        return ImageVector.Builder(
            name = "Paperclip",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m16 6 -8.41 8.59 a2 2 0 0 0 2.83 2.83 l8.4 -8.6 a4 4 0 1 0 -5.65 -5.65 L4.8 11.72 a6 6 0 1 0 8.49 8.49 l8.38 -8.55
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 6
                moveTo(x = 16.0f, y = 6.0f)
                // l -8.41 8.59
                lineToRelative(dx = -8.41f, dy = 8.59f)
                // a 2 2 0 0 0 2.83 2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.83f,
                    dy1 = 2.83f,
                )
                // l 8.4 -8.6
                lineToRelative(dx = 8.4f, dy = -8.6f)
                // a 4 4 0 1 0 -5.65 -5.65
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.65f,
                    dy1 = -5.65f,
                )
                // L 4.8 11.72
                lineTo(x = 4.8f, y = 11.72f)
                // a 6 6 0 1 0 8.49 8.49
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.49f,
                    dy1 = 8.49f,
                )
                // l 8.38 -8.55
                lineToRelative(dx = 8.38f, dy = -8.55f)
            }
        }.build().also { _paperclip = it }
    }


@Suppress("ObjectPropertyName")
private var _paperclip: ImageVector? = null
