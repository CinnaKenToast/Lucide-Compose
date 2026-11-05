package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowDownNarrowWide: ImageVector
    get() {
        val current = _arrowDownNarrowWide
        if (current != null) return current

        return ImageVector.Builder(
            name = "ArrowDownNarrowWide",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m3 16 4 4 4 -4 m-4 4 V4 m4 0 h4 m-4 4 h7 m-7 4 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
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
        }.build().also { _arrowDownNarrowWide = it }
    }


@Suppress("ObjectPropertyName")
private var _arrowDownNarrowWide: ImageVector? = null
