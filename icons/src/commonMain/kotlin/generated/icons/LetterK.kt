package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LetterK: ImageVector
    get() {
        val current = _letterK
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LetterK",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 4 6 15 m0 5 V4 m3 8 8 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 4
                moveTo(x = 17.0f, y = 4.0f)
                // L 6 15
                lineTo(x = 6.0f, y = 15.0f)
                // m 0 5
                moveToRelative(dx = 0.0f, dy = 5.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // m 3 8
                moveToRelative(dx = 3.0f, dy = 8.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
            }
        }.build().also { _letterK = it }
    }

@Suppress("ObjectPropertyName")
private var _letterK: ImageVector? = null
