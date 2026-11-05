package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChevronUp: ImageVector
    get() {
        val current = _chevronUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChevronUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m18 15 -6 -6 -6 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 15
                moveTo(x = 18.0f, y = 15.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
            }
        }.build().also { _chevronUp = it }
    }

@Suppress("ObjectPropertyName")
private var _chevronUp: ImageVector? = null
