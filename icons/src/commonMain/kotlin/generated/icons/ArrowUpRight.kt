package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowUpRight: ImageVector
    get() {
        val current = _arrowUpRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowUpRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7 7 h10 v10 M7 17 17 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 7
                moveTo(x = 7.0f, y = 7.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // M 7 17
                moveTo(x = 7.0f, y = 17.0f)
                // L 17 7
                lineTo(x = 17.0f, y = 7.0f)
            }
        }.build().also { _arrowUpRight = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowUpRight: ImageVector? = null
