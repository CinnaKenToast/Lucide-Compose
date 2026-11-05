package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SeparatorHorizontal: ImageVector
    get() {
        val current = _separatorHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SeparatorHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m16 16 -4 4 -4 -4 m-5 -4 h18 M8 8 l4 -4 4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // m -5 -4
                moveToRelative(dx = -5.0f, dy = -4.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
            }
        }.build().also { _separatorHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _separatorHorizontal: ImageVector? = null
