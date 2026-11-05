package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TextQuote: ImageVector
    get() {
        val current = _textQuote
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TextQuote",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 5 H3 m18 7 H8 m13 7 H8 m-5 -7 v7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 5
                moveTo(x = 17.0f, y = 5.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 18 7
                moveToRelative(dx = 18.0f, dy = 7.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 13 7
                moveToRelative(dx = 13.0f, dy = 7.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m -5 -7
                moveToRelative(dx = -5.0f, dy = -7.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
            }
        }.build().also { _textQuote = it }
    }

@Suppress("ObjectPropertyName")
private var _textQuote: ImageVector? = null
