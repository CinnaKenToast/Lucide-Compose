package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextAlignCenter: ImageVector
    get() {
        val current = _textAlignCenter
        if (current != null) return current

        return ImageVector.Builder(
            name = "TextAlignCenter",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 5 H3 m14 7 H7 m12 7 H5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 5
                moveTo(x = 21.0f, y = 5.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 14 7
                moveToRelative(dx = 14.0f, dy = 7.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // m 12 7
                moveToRelative(dx = 12.0f, dy = 7.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
            }
        }.build().also { _textAlignCenter = it }
    }


@Suppress("ObjectPropertyName")
private var _textAlignCenter: ImageVector? = null
