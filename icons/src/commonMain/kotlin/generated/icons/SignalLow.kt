package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SignalLow: ImageVector
    get() {
        val current = _signalLow
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SignalLow",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 20z M7 20 v-4
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
            }
        }.build().also { _signalLow = it }
    }

@Suppress("ObjectPropertyName")
private var _signalLow: ImageVector? = null
