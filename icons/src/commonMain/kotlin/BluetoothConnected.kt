package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BluetoothConnected: ImageVector
    get() {
        val current = _bluetoothConnected
        if (current != null) return current

        return ImageVector.Builder(
            name = "BluetoothConnected",
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
            // <line x1="18.0" y1="12.0" x2="21.0" y2="12.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // L 21 12
                lineTo(x = 21.0f, y = 12.0f)
            }
            // <line x1="3.0" y1="12.0" x2="6.0" y2="12.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // L 6 12
                lineTo(x = 6.0f, y = 12.0f)
            }
        }.build().also { _bluetoothConnected = it }
    }


@Suppress("ObjectPropertyName")
private var _bluetoothConnected: ImageVector? = null
