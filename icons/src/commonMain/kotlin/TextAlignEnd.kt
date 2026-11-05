package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextAlignEnd: ImageVector
    get() {
        val current = _textAlignEnd
        if (current != null) return current

        return ImageVector.Builder(
            name = "TextAlignEnd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 5 H3 m18 7 H9 m12 7 H7
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
                // m 18 7
                moveToRelative(dx = 18.0f, dy = 7.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // m 12 7
                moveToRelative(dx = 12.0f, dy = 7.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
            }
        }.build().also { _textAlignEnd = it }
    }


@Suppress("ObjectPropertyName")
private var _textAlignEnd: ImageVector? = null
