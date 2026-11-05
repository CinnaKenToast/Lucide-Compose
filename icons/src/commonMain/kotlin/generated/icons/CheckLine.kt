package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CheckLine: ImageVector
    get() {
        val current = _checkLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CheckLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M20 4 9 15 m12 4 H3 m6 -4 -5 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 4
                moveTo(x = 20.0f, y = 4.0f)
                // L 9 15
                lineTo(x = 9.0f, y = 15.0f)
                // m 12 4
                moveToRelative(dx = 12.0f, dy = 4.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 6 -4
                moveToRelative(dx = 6.0f, dy = -4.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
            }
        }.build().also { _checkLine = it }
    }

@Suppress("ObjectPropertyName")
private var _checkLine: ImageVector? = null
