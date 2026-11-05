package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowUpDown: ImageVector
    get() {
        val current = _arrowUpDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowUpDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m21 16 -4 4 -4 -4 m4 4 V4 M3 8 l4 -4 4 4 M7 4 v16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 16
                moveTo(x = 21.0f, y = 16.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // m 4 4
                moveToRelative(dx = 4.0f, dy = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // M 3 8
                moveTo(x = 3.0f, y = 8.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // M 7 4
                moveTo(x = 7.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
            }
        }.build().also { _arrowUpDown = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowUpDown: ImageVector? = null
