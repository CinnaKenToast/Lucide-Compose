package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gauge: ImageVector
    get() {
        val current = _gauge
        if (current != null) return current

        return ImageVector.Builder(
            name = "Gauge",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12 14 4 -4 M3.34 19 a10 10 0 1 1 17.32 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 14
                moveTo(x = 12.0f, y = 14.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // M 3.34 19
                moveTo(x = 3.34f, y = 19.0f)
                // a 10 10 0 1 1 17.32 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 17.32f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _gauge = it }
    }


@Suppress("ObjectPropertyName")
private var _gauge: ImageVector? = null
