package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterH: ImageVector
    get() {
        val current = _letterH
        if (current != null) return current

        return ImageVector.Builder(
            name = "LetterH",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 20 V4 M6 12 h12 M6 20 V4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 20
                moveTo(x = 18.0f, y = 20.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // M 6 20
                moveTo(x = 6.0f, y = 20.0f)
                // V 4
                verticalLineTo(y = 4.0f)
            }
        }.build().also { _letterH = it }
    }


@Suppress("ObjectPropertyName")
private var _letterH: ImageVector? = null
