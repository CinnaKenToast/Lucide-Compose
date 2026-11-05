package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowLeftToLine: ImageVector
    get() {
        val current = _arrowLeftToLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowLeftToLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 19 V5 m10 1 -6 6 6 6 m-6 -6 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // m 10 1
                moveToRelative(dx = 10.0f, dy = 1.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // m -6 -6
                moveToRelative(dx = -6.0f, dy = -6.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
        }.build().also { _arrowLeftToLine = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowLeftToLine: ImageVector? = null
