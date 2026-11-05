package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartNoAxesColumnIncreasing: ImageVector
    get() {
        val current = _chartNoAxesColumnIncreasing
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChartNoAxesColumnIncreasing",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 21 v-6 m7 6 V9 m7 12 V3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 21
                moveTo(x = 5.0f, y = 21.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // m 7 6
                moveToRelative(dx = 7.0f, dy = 6.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // m 7 12
                moveToRelative(dx = 7.0f, dy = 12.0f)
                // V 3
                verticalLineTo(y = 3.0f)
            }
        }.build().also { _chartNoAxesColumnIncreasing = it }
    }

@Suppress("ObjectPropertyName")
private var _chartNoAxesColumnIncreasing: ImageVector? = null
