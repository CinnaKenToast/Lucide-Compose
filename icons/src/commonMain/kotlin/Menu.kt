package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Menu: ImageVector
    get() {
        val current = _menu
        if (current != null) return current

        return ImageVector.Builder(
            name = "Menu",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 5 h16 M4 12 h16 M4 19 h16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 4 19
                moveTo(x = 4.0f, y = 19.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
            }
        }.build().also { _menu = it }
    }


@Suppress("ObjectPropertyName")
private var _menu: ImageVector? = null
