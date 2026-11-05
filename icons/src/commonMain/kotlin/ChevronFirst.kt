package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronFirst: ImageVector
    get() {
        val current = _chevronFirst
        if (current != null) return current

        return ImageVector.Builder(
            name = "ChevronFirst",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m17 18 -6 -6 6 -6 M7 6 v12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 18
                moveTo(x = 17.0f, y = 18.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // M 7 6
                moveTo(x = 7.0f, y = 6.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
            }
        }.build().also { _chevronFirst = it }
    }


@Suppress("ObjectPropertyName")
private var _chevronFirst: ImageVector? = null
