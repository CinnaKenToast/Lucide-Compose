package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ThermometerSun: ImageVector
    get() {
        val current = _thermometerSun
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ThermometerSun",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v2 m0 4 a4 4 0 0 0 -1.64 7.65 M2 12 h2 m16 2.54 a4 4 0 1 1 -4 0 V4 a2 2 0 0 1 4 0z M4.93 4.93 l1.41 1.41 m0 11.32 -1.41 1.41
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // a 4 4 0 0 0 -1.64 7.65
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.64f,
                    dy1 = 7.65f,
                )
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 2.54
                moveToRelative(dx = 16.0f, dy = 2.54f)
                // a 4 4 0 1 1 -4 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                close()
                // M 4.93 4.93
                moveTo(x = 4.93f, y = 4.93f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // m 0 11.32
                moveToRelative(dx = 0.0f, dy = 11.32f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
            }
        }.build().also { _thermometerSun = it }
    }

@Suppress("ObjectPropertyName")
private var _thermometerSun: ImageVector? = null
