package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Navigation2: ImageVector
    get() {
        val current = _navigation2
        if (current != null) return current

        return ImageVector.Builder(
            name = "Navigation2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <polygon points="12.0 2.0 19.0 21.0 12.0 17.0 5.0 21.0 12.0 2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // L 19 21
                lineTo(x = 19.0f, y = 21.0f)
                // L 12 17
                lineTo(x = 12.0f, y = 17.0f)
                // L 5 21
                lineTo(x = 5.0f, y = 21.0f)
                // L 12 2z
                lineTo(x = 12.0f, y = 2.0f)
                close()
            }
        }.build().also { _navigation2 = it }
    }


@Suppress("ObjectPropertyName")
private var _navigation2: ImageVector? = null
