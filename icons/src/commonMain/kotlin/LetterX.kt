package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterX: ImageVector
    get() {
        val current = _letterX
        if (current != null) return current

        return ImageVector.Builder(
            name = "LetterX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 4 6 20 M6 4 l12 16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 4
                moveTo(x = 18.0f, y = 4.0f)
                // L 6 20
                lineTo(x = 6.0f, y = 20.0f)
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // l 12 16
                lineToRelative(dx = 12.0f, dy = 16.0f)
            }
        }.build().also { _letterX = it }
    }


@Suppress("ObjectPropertyName")
private var _letterX: ImageVector? = null
