package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BluetoothOff: ImageVector
    get() {
        val current = _bluetoothOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "BluetoothOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m17 17 -5 5 V12 l-5 5 M2 2 l20 20 M14.5 9.5 17 7 l-5 -5 v4.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 17
                moveTo(x = 17.0f, y = 17.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 14.5 9.5
                moveTo(x = 14.5f, y = 9.5f)
                // L 17 7
                lineTo(x = 17.0f, y = 7.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // v 4.5
                verticalLineToRelative(dy = 4.5f)
            }
        }.build().also { _bluetoothOff = it }
    }


@Suppress("ObjectPropertyName")
private var _bluetoothOff: ImageVector? = null
