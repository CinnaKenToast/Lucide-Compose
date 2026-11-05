package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TextAlignJustifyEnd: ImageVector
    get() {
        val current = _textAlignJustifyEnd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TextAlignJustifyEnd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 5 h18 M3 12 h18 m-10 7 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // m -10 7
                moveToRelative(dx = -10.0f, dy = 7.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
        }.build().also { _textAlignJustifyEnd = it }
    }

@Suppress("ObjectPropertyName")
private var _textAlignJustifyEnd: ImageVector? = null
