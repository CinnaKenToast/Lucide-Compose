package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ExclamationMark: ImageVector
    get() {
        val current = _exclamationMark
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ExclamationMark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 15 V4 m0 16z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // m 0 16z
                moveToRelative(dx = 0.0f, dy = 16.0f)
                close()
            }
        }.build().also { _exclamationMark = it }
    }

@Suppress("ObjectPropertyName")
private var _exclamationMark: ImageVector? = null
