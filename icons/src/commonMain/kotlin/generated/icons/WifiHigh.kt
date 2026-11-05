package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.WifiHigh: ImageVector
    get() {
        val current = _wifiHigh
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.WifiHigh",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 20z M5 12.86 a10 10 0 0 1 14 0 M8.5 16.43 a5 5 0 0 1 7 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 20z
                moveTo(x = 12.0f, y = 20.0f)
                close()
                // M 5 12.86
                moveTo(x = 5.0f, y = 12.86f)
                // a 10 10 0 0 1 14 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
                // M 8.5 16.43
                moveTo(x = 8.5f, y = 16.43f)
                // a 5 5 0 0 1 7 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _wifiHigh = it }
    }

@Suppress("ObjectPropertyName")
private var _wifiHigh: ImageVector? = null
