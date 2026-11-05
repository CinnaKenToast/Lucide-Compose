package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TrendingDown: ImageVector
    get() {
        val current = _trendingDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TrendingDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 17 h6 v-6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 17
                moveTo(x = 16.0f, y = 17.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
            }
            // m22 17 -8.5 -8.5 -5 5 L2 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 17
                moveTo(x = 22.0f, y = 17.0f)
                // l -8.5 -8.5
                lineToRelative(dx = -8.5f, dy = -8.5f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // L 2 7
                lineTo(x = 2.0f, y = 7.0f)
            }
        }.build().also { _trendingDown = it }
    }

@Suppress("ObjectPropertyName")
private var _trendingDown: ImageVector? = null
