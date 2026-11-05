package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wand: ImageVector
    get() {
        val current = _wand
        if (current != null) return current

        return ImageVector.Builder(
            name = "Wand",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 4 V2 m0 14 v-2 M8 9 h2 m10 0 h2 m-4.2 2.8 L19 13 m-4 -4z m2.79 -2.8 L19 5 M3 21 l9 -9 m.2 -5.8 L11 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 4
                moveTo(x = 15.0f, y = 4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // m 0 14
                moveToRelative(dx = 0.0f, dy = 14.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // M 8 9
                moveTo(x = 8.0f, y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 10 0
                moveToRelative(dx = 10.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -4.2 2.8
                moveToRelative(dx = -4.2f, dy = 2.8f)
                // L 19 13
                lineTo(x = 19.0f, y = 13.0f)
                // m -4 -4z
                moveToRelative(dx = -4.0f, dy = -4.0f)
                close()
                // m 2.79 -2.8
                moveToRelative(dx = 2.79f, dy = -2.8f)
                // L 19 5
                lineTo(x = 19.0f, y = 5.0f)
                // M 3 21
                moveTo(x = 3.0f, y = 21.0f)
                // l 9 -9
                lineToRelative(dx = 9.0f, dy = -9.0f)
                // m 0.2 -5.8
                moveToRelative(dx = 0.2f, dy = -5.8f)
                // L 11 5
                lineTo(x = 11.0f, y = 5.0f)
            }
        }.build().also { _wand = it }
    }


@Suppress("ObjectPropertyName")
private var _wand: ImageVector? = null
