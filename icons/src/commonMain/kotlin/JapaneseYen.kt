package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JapaneseYen: ImageVector
    get() {
        val current = _japaneseYen
        if (current != null) return current

        return ImageVector.Builder(
            name = "JapaneseYen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 v8 M6 4 l6 8 6 -8 M8 13 h8 m-8 4 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // l 6 8
                lineToRelative(dx = 6.0f, dy = 8.0f)
                // l 6 -8
                lineToRelative(dx = 6.0f, dy = -8.0f)
                // M 8 13
                moveTo(x = 8.0f, y = 13.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 4
                moveToRelative(dx = -8.0f, dy = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _japaneseYen = it }
    }


@Suppress("ObjectPropertyName")
private var _japaneseYen: ImageVector? = null
