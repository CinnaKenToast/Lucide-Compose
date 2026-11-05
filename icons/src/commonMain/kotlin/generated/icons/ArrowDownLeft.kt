package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowDownLeft: ImageVector
    get() {
        val current = _arrowDownLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowDownLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 7 7 17 m10 0 H7 V7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 7
                moveTo(x = 17.0f, y = 7.0f)
                // L 7 17
                lineTo(x = 7.0f, y = 17.0f)
                // m 10 0
                moveToRelative(dx = 10.0f, dy = 0.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // V 7
                verticalLineTo(y = 7.0f)
            }
        }.build().also { _arrowDownLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDownLeft: ImageVector? = null
