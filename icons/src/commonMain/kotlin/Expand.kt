package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Expand: ImageVector
    get() {
        val current = _expand
        if (current != null) return current

        return ImageVector.Builder(
            name = "Expand",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 15 6 6 M15 9 l6 -6 m0 13 v5 h-5 m5 -13 V3 h-5 M3 16 v5 h5 m-5 0 6 -6 M3 8 V3 h5 m1 6 L3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 15
                moveTo(x = 15.0f, y = 15.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // m 0 13
                moveToRelative(dx = 0.0f, dy = 13.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // m 5 -13
                moveToRelative(dx = 5.0f, dy = -13.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // M 3 8
                moveTo(x = 3.0f, y = 8.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // m 1 6
                moveToRelative(dx = 1.0f, dy = 6.0f)
                // L 3 3
                lineTo(x = 3.0f, y = 3.0f)
            }
        }.build().also { _expand = it }
    }


@Suppress("ObjectPropertyName")
private var _expand: ImageVector? = null
