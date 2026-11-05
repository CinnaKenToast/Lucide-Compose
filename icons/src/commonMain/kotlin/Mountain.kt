package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mountain: ImageVector
    get() {
        val current = _mountain
        if (current != null) return current

        return ImageVector.Builder(
            name = "Mountain",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m8 3 4 8 5 -5 5 15 H2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // l 4 8
                lineToRelative(dx = 4.0f, dy = 8.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // l 5 15
                lineToRelative(dx = 5.0f, dy = 15.0f)
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
            }
        }.build().also { _mountain = it }
    }


@Suppress("ObjectPropertyName")
private var _mountain: ImageVector? = null
