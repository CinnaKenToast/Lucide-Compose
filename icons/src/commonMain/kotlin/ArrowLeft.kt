package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowLeft: ImageVector
    get() {
        val current = _arrowLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "ArrowLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12 19 -7 -7 7 -7 m7 7 H5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 19
                moveTo(x = 12.0f, y = 19.0f)
                // l -7 -7
                lineToRelative(dx = -7.0f, dy = -7.0f)
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // m 7 7
                moveToRelative(dx = 7.0f, dy = 7.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
            }
        }.build().also { _arrowLeft = it }
    }


@Suppress("ObjectPropertyName")
private var _arrowLeft: ImageVector? = null
