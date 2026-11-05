package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HandleBottomRight: ImageVector
    get() {
        val current = _handleBottomRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HandleBottomRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 8 8 21 m13 -6 -6 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 8
                moveTo(x = 21.0f, y = 8.0f)
                // L 8 21
                lineTo(x = 8.0f, y = 21.0f)
                // m 13 -6
                moveToRelative(dx = 13.0f, dy = -6.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
            }
        }.build().also { _handleBottomRight = it }
    }

@Suppress("ObjectPropertyName")
private var _handleBottomRight: ImageVector? = null
