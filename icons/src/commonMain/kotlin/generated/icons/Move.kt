package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Move: ImageVector
    get() {
        val current = _move
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Move",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v20 m3 -3 -3 3 -3 -3 M19 9 l3 3 -3 3 M2 12 h20 M5 9 l-3 3 3 3 M9 5 l3 -3 3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // m 3 -3
                moveToRelative(dx = 3.0f, dy = -3.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // M 19 9
                moveTo(x = 19.0f, y = 9.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 5 9
                moveTo(x = 5.0f, y = 9.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
            }
        }.build().also { _move = it }
    }

@Suppress("ObjectPropertyName")
private var _move: ImageVector? = null
