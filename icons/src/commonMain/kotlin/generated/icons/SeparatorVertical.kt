package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SeparatorVertical: ImageVector
    get() {
        val current = _separatorVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SeparatorVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 v18 m4 -5 4 -4 -4 -4 M8 8 l-4 4 4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // m 4 -5
                moveToRelative(dx = 4.0f, dy = -5.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
            }
        }.build().also { _separatorVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _separatorVertical: ImageVector? = null
