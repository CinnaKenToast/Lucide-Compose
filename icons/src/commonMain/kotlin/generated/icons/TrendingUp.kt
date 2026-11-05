package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TrendingUp: ImageVector
    get() {
        val current = _trendingUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TrendingUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 7 h6 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 7
                moveTo(x = 16.0f, y = 7.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
            // m22 7 -8.5 8.5 -5 -5 L2 17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 7
                moveTo(x = 22.0f, y = 7.0f)
                // l -8.5 8.5
                lineToRelative(dx = -8.5f, dy = 8.5f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // L 2 17
                lineTo(x = 2.0f, y = 17.0f)
            }
        }.build().also { _trendingUp = it }
    }

@Suppress("ObjectPropertyName")
private var _trendingUp: ImageVector? = null
