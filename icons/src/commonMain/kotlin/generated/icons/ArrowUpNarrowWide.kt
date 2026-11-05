package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowUpNarrowWide: ImageVector
    get() {
        val current = _arrowUpNarrowWide
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowUpNarrowWide",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m3 8 4 -4 4 4 M7 4 v16 m4 -8 h4 m-4 4 h7 m-7 4 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 8
                moveTo(x = 3.0f, y = 8.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // M 7 4
                moveTo(x = 7.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // m 4 -8
                moveToRelative(dx = 4.0f, dy = -8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // m -7 4
                moveToRelative(dx = -7.0f, dy = 4.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
        }.build().also { _arrowUpNarrowWide = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowUpNarrowWide: ImageVector? = null
