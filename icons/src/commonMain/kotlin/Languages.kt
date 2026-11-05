package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Languages: ImageVector
    get() {
        val current = _languages
        if (current != null) return current

        return ImageVector.Builder(
            name = "Languages",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m5 8 6 6 m-7 0 6 -6 2 -3 M2 5 h12 M7 2 h1 m14 20 -5 -10 -5 10 m2 -4 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 8
                moveTo(x = 5.0f, y = 8.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // m -7 0
                moveToRelative(dx = -7.0f, dy = 0.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // l 2 -3
                lineToRelative(dx = 2.0f, dy = -3.0f)
                // M 2 5
                moveTo(x = 2.0f, y = 5.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // M 7 2
                moveTo(x = 7.0f, y = 2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 14 20
                moveToRelative(dx = 14.0f, dy = 20.0f)
                // l -5 -10
                lineToRelative(dx = -5.0f, dy = -10.0f)
                // l -5 10
                lineToRelative(dx = -5.0f, dy = 10.0f)
                // m 2 -4
                moveToRelative(dx = 2.0f, dy = -4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _languages = it }
    }


@Suppress("ObjectPropertyName")
private var _languages: ImageVector? = null
