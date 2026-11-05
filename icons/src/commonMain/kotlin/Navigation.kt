package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Navigation: ImageVector
    get() {
        val current = _navigation
        if (current != null) return current

        return ImageVector.Builder(
            name = "Navigation",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <polygon points="3.0 11.0 22.0 2.0 13.0 21.0 11.0 13.0 3.0 11.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 11
                moveTo(x = 3.0f, y = 11.0f)
                // L 22 2
                lineTo(x = 22.0f, y = 2.0f)
                // L 13 21
                lineTo(x = 13.0f, y = 21.0f)
                // L 11 13
                lineTo(x = 11.0f, y = 13.0f)
                // L 3 11z
                lineTo(x = 3.0f, y = 11.0f)
                close()
            }
        }.build().also { _navigation = it }
    }


@Suppress("ObjectPropertyName")
private var _navigation: ImageVector? = null
