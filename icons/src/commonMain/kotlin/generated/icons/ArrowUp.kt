package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowUp: ImageVector
    get() {
        val current = _arrowUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m5 12 7 -7 7 7 m-7 7 V5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 12
                moveTo(x = 5.0f, y = 12.0f)
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // l 7 7
                lineToRelative(dx = 7.0f, dy = 7.0f)
                // m -7 7
                moveToRelative(dx = -7.0f, dy = 7.0f)
                // V 5
                verticalLineTo(y = 5.0f)
            }
        }.build().also { _arrowUp = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowUp: ImageVector? = null
