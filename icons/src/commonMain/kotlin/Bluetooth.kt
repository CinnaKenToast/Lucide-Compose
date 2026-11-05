package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bluetooth: ImageVector
    get() {
        val current = _bluetooth
        if (current != null) return current

        return ImageVector.Builder(
            name = "Bluetooth",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m7 7 10 10 -5 5 V2 l5 5 L7 17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 7
                moveTo(x = 7.0f, y = 7.0f)
                // l 10 10
                lineToRelative(dx = 10.0f, dy = 10.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // L 7 17
                lineTo(x = 7.0f, y = 17.0f)
            }
        }.build().also { _bluetooth = it }
    }


@Suppress("ObjectPropertyName")
private var _bluetooth: ImageVector? = null
