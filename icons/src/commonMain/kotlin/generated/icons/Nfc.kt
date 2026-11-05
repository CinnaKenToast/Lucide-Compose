package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Nfc: ImageVector
    get() {
        val current = _nfc
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Nfc",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 8.32 a7.4 7.4 0 0 1 0 7.36 m3.46 -9.47 a11.8 11.8 0 0 1 0 11.58 M12.91 4.1 a15.9 15.9 0 0 1 .01 15.8 M16.37 2 a20.2 20.2 0 0 1 0 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 8.32
                moveTo(x = 6.0f, y = 8.32f)
                // a 7.4 7.4 0 0 1 0 7.36
                arcToRelative(
                    a = 7.4f,
                    b = 7.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 7.36f,
                )
                // m 3.46 -9.47
                moveToRelative(dx = 3.46f, dy = -9.47f)
                // a 11.8 11.8 0 0 1 0 11.58
                arcToRelative(
                    a = 11.8f,
                    b = 11.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 11.58f,
                )
                // M 12.91 4.1
                moveTo(x = 12.91f, y = 4.1f)
                // a 15.9 15.9 0 0 1 0.01 15.8
                arcToRelative(
                    a = 15.9f,
                    b = 15.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.01f,
                    dy1 = 15.8f,
                )
                // M 16.37 2
                moveTo(x = 16.37f, y = 2.0f)
                // a 20.2 20.2 0 0 1 0 20
                arcToRelative(
                    a = 20.2f,
                    b = 20.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 20.0f,
                )
            }
        }.build().also { _nfc = it }
    }

@Suppress("ObjectPropertyName")
private var _nfc: ImageVector? = null
