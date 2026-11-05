package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.NavigationOff: ImageVector
    get() {
        val current = _navigationOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.NavigationOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8.43 8.43 3 11 l8 2 2 8 2.57 -5.43 m1.82 -3.84 L22 2 l-9.73 4.61
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.43 8.43
                moveTo(x = 8.43f, y = 8.43f)
                // L 3 11
                lineTo(x = 3.0f, y = 11.0f)
                // l 8 2
                lineToRelative(dx = 8.0f, dy = 2.0f)
                // l 2 8
                lineToRelative(dx = 2.0f, dy = 8.0f)
                // l 2.57 -5.43
                lineToRelative(dx = 2.57f, dy = -5.43f)
                // m 1.82 -3.84
                moveToRelative(dx = 1.82f, dy = -3.84f)
                // L 22 2
                lineTo(x = 22.0f, y = 2.0f)
                // l -9.73 4.61
                lineToRelative(dx = -9.73f, dy = 4.61f)
            }
            // <line x1="2.0" y1="2.0" x2="22.0" y2="22.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // L 22 22
                lineTo(x = 22.0f, y = 22.0f)
            }
        }.build().also { _navigationOff = it }
    }

@Suppress("ObjectPropertyName")
private var _navigationOff: ImageVector? = null
