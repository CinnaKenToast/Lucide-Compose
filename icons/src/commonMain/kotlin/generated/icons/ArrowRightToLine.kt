package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowRightToLine: ImageVector
    get() {
        val current = _arrowRightToLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowRightToLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 12 H3 m8 6 6 -6 -6 -6 m10 -1 v14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 12
                moveTo(x = 17.0f, y = 12.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 8 6
                moveToRelative(dx = 8.0f, dy = 6.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // m 10 -1
                moveToRelative(dx = 10.0f, dy = -1.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
            }
        }.build().also { _arrowRightToLine = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRightToLine: ImageVector? = null
