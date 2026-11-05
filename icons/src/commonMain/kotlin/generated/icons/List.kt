package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.List: ImageVector
    get() {
        val current = _list
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.List",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 5z M3 12z M3 19z M8 5 h13 M8 12 h13 M8 19 h13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 5z
                moveTo(x = 3.0f, y = 5.0f)
                close()
                // M 3 12z
                moveTo(x = 3.0f, y = 12.0f)
                close()
                // M 3 19z
                moveTo(x = 3.0f, y = 19.0f)
                close()
                // M 8 5
                moveTo(x = 8.0f, y = 5.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // M 8 19
                moveTo(x = 8.0f, y = 19.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
            }
        }.build().also { _list = it }
    }

@Suppress("ObjectPropertyName")
private var _list: ImageVector? = null
