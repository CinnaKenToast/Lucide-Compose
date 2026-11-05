package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowUpLeft: ImageVector
    get() {
        val current = _arrowUpLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowUpLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7 17 V7 h10 m0 10 L7 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 17
                moveTo(x = 7.0f, y = 17.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // m 0 10
                moveToRelative(dx = 0.0f, dy = 10.0f)
                // L 7 7
                lineTo(x = 7.0f, y = 7.0f)
            }
        }.build().also { _arrowUpLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowUpLeft: ImageVector? = null
