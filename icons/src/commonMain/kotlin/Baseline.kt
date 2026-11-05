package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Baseline: ImageVector
    get() {
        val current = _baseline
        if (current != null) return current

        return ImageVector.Builder(
            name = "Baseline",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 20 h16 M6 16 l6 -12 6 12 M8 12 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 6 16
                moveTo(x = 6.0f, y = 16.0f)
                // l 6 -12
                lineToRelative(dx = 6.0f, dy = -12.0f)
                // l 6 12
                lineToRelative(dx = 6.0f, dy = 12.0f)
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _baseline = it }
    }


@Suppress("ObjectPropertyName")
private var _baseline: ImageVector? = null
