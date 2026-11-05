package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LetterT: ImageVector
    get() {
        val current = _letterT
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LetterT",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 20 V4 M5 4 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 20
                moveTo(x = 12.0f, y = 20.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // M 5 4
                moveTo(x = 5.0f, y = 4.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
        }.build().also { _letterT = it }
    }

@Suppress("ObjectPropertyName")
private var _letterT: ImageVector? = null
