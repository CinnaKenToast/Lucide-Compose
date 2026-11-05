package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowRight: ImageVector
    get() {
        val current = _arrowRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 12 h14 m-7 -7 7 7 -7 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 12
                moveTo(x = 5.0f, y = 12.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // m -7 -7
                moveToRelative(dx = -7.0f, dy = -7.0f)
                // l 7 7
                lineToRelative(dx = 7.0f, dy = 7.0f)
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
            }
        }.build().also { _arrowRight = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRight: ImageVector? = null
