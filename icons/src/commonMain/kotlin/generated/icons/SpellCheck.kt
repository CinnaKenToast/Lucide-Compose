package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SpellCheck: ImageVector
    get() {
        val current = _spellCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SpellCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m20 15 -5.5 5.5 L12 18 m-8 -2 6 -12 5.12 10.23 M6 12 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 15
                moveTo(x = 20.0f, y = 15.0f)
                // l -5.5 5.5
                lineToRelative(dx = -5.5f, dy = 5.5f)
                // L 12 18
                lineTo(x = 12.0f, y = 18.0f)
                // m -8 -2
                moveToRelative(dx = -8.0f, dy = -2.0f)
                // l 6 -12
                lineToRelative(dx = 6.0f, dy = -12.0f)
                // l 5.12 10.23
                lineToRelative(dx = 5.12f, dy = 10.23f)
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _spellCheck = it }
    }

@Suppress("ObjectPropertyName")
private var _spellCheck: ImageVector? = null
