package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RemoveFormatting: ImageVector
    get() {
        val current = _removeFormatting
        if (current != null) return current

        return ImageVector.Builder(
            name = "RemoveFormatting",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 7 V4 h16 v3 M5 20 h6 m2 -16 L8 20 m7 -5 5 5 m0 -5 -5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 7
                moveTo(x = 4.0f, y = 7.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // M 5 20
                moveTo(x = 5.0f, y = 20.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m 2 -16
                moveToRelative(dx = 2.0f, dy = -16.0f)
                // L 8 20
                lineTo(x = 8.0f, y = 20.0f)
                // m 7 -5
                moveToRelative(dx = 7.0f, dy = -5.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
            }
        }.build().also { _removeFormatting = it }
    }


@Suppress("ObjectPropertyName")
private var _removeFormatting: ImageVector? = null
