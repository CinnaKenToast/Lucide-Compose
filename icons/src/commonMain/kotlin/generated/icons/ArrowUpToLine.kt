package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowUpToLine: ImageVector
    get() {
        val current = _arrowUpToLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowUpToLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 3 h14 m-1 10 -6 -6 -6 6 m6 -6 v14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 3
                moveTo(x = 5.0f, y = 3.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // m -1 10
                moveToRelative(dx = -1.0f, dy = 10.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // m 6 -6
                moveToRelative(dx = 6.0f, dy = -6.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
            }
        }.build().also { _arrowUpToLine = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowUpToLine: ImageVector? = null
