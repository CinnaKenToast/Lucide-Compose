package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BluetoothSearching: ImageVector
    get() {
        val current = _bluetoothSearching
        if (current != null) return current

        return ImageVector.Builder(
            name = "BluetoothSearching",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m7 7 10 10 -5 5 V2 l5 5 L7 17 m13.83 -2.17 a4 4 0 0 0 0 -5.66 M18 12 h.01
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
                // m 13.83 -2.17
                moveToRelative(dx = 13.83f, dy = -2.17f)
                // a 4 4 0 0 0 0 -5.66
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -5.66f,
                )
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
        }.build().also { _bluetoothSearching = it }
    }


@Suppress("ObjectPropertyName")
private var _bluetoothSearching: ImageVector? = null
