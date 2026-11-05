package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.X: ImageVector
    get() {
        val current = _x
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.X",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 6 6 18 M6 6 l12 12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
                // L 6 18
                lineTo(x = 6.0f, y = 18.0f)
                // M 6 6
                moveTo(x = 6.0f, y = 6.0f)
                // l 12 12
                lineToRelative(dx = 12.0f, dy = 12.0f)
            }
        }.build().also { _x = it }
    }

@Suppress("ObjectPropertyName")
private var _x: ImageVector? = null
