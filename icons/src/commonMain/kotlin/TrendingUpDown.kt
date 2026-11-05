package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrendingUpDown: ImageVector
    get() {
        val current = _trendingUpDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "TrendingUpDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14.83 14.83 21 21 m0 -5 v5 h-5 m5 -18 -9 9 -4 -4 -6 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.83 14.83
                moveTo(x = 14.83f, y = 14.83f)
                // L 21 21
                lineTo(x = 21.0f, y = 21.0f)
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // m 5 -18
                moveToRelative(dx = 5.0f, dy = -18.0f)
                // l -9 9
                lineToRelative(dx = -9.0f, dy = 9.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
            }
            // M21 8 V3 h-5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 8
                moveTo(x = 21.0f, y = 8.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
            }
        }.build().also { _trendingUpDown = it }
    }


@Suppress("ObjectPropertyName")
private var _trendingUpDown: ImageVector? = null
