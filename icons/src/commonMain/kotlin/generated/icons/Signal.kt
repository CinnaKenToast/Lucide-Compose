package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Signal: ImageVector
    get() {
        val current = _signal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Signal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 20z M7 20 v-4 m5 4 v-8 m5 8 V8 m5 -4 v16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 20z
                moveTo(x = 2.0f, y = 20.0f)
                close()
                // M 7 20
                moveTo(x = 7.0f, y = 20.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // m 5 4
                moveToRelative(dx = 5.0f, dy = 4.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // m 5 8
                moveToRelative(dx = 5.0f, dy = 8.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // m 5 -4
                moveToRelative(dx = 5.0f, dy = -4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
            }
        }.build().also { _signal = it }
    }

@Suppress("ObjectPropertyName")
private var _signal: ImageVector? = null
