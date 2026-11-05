package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartNoAxesGantt: ImageVector
    get() {
        val current = _chartNoAxesGantt
        if (current != null) return current

        return ImageVector.Builder(
            name = "ChartNoAxesGantt",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 5 h12 M4 12 h10 m-2 7 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 5
                moveTo(x = 6.0f, y = 5.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // m -2 7
                moveToRelative(dx = -2.0f, dy = 7.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _chartNoAxesGantt = it }
    }


@Suppress("ObjectPropertyName")
private var _chartNoAxesGantt: ImageVector? = null
