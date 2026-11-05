package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Terminal: ImageVector
    get() {
        val current = _terminal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Terminal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 19 h8 M4 17 l6 -6 -6 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 19
                moveTo(x = 12.0f, y = 19.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 4 17
                moveTo(x = 4.0f, y = 17.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
            }
        }.build().also { _terminal = it }
    }

@Suppress("ObjectPropertyName")
private var _terminal: ImageVector? = null
