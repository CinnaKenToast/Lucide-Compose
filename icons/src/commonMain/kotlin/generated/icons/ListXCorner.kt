package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ListXCorner: ImageVector
    get() {
        val current = _listXCorner
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ListXCorner",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 16 5 5 m-4 -9 H3 m13 -7 H3 m17 11 -5 5 M3 19 h8.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 16
                moveTo(x = 15.0f, y = 16.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // m -4 -9
                moveToRelative(dx = -4.0f, dy = -9.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 13 -7
                moveToRelative(dx = 13.0f, dy = -7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 17 11
                moveToRelative(dx = 17.0f, dy = 11.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // h 8.5
                horizontalLineToRelative(dx = 8.5f)
            }
        }.build().also { _listXCorner = it }
    }

@Suppress("ObjectPropertyName")
private var _listXCorner: ImageVector? = null
