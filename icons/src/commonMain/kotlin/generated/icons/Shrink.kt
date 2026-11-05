package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Shrink: ImageVector
    get() {
        val current = _shrink
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Shrink",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 15 6 6 m-6 -6 v4.8 m0 -4.8 h4.8 M9 19.8 V15 m0 0 H4.2 M9 15 l-6 6 M15 4.2 V9 m0 0 h4.8 M15 9 l6 -6 M9 4.2 V9 m0 0 H4.2 M9 9 3 3
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
                // m -6 -6
                moveToRelative(dx = -6.0f, dy = -6.0f)
                // v 4.8
                verticalLineToRelative(dy = 4.8f)
                // m 0 -4.8
                moveToRelative(dx = 0.0f, dy = -4.8f)
                // h 4.8
                horizontalLineToRelative(dx = 4.8f)
                // M 9 19.8
                moveTo(x = 9.0f, y = 19.8f)
                // V 15
                verticalLineTo(y = 15.0f)
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // H 4.2
                horizontalLineTo(x = 4.2f)
                // M 9 15
                moveTo(x = 9.0f, y = 15.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // M 15 4.2
                moveTo(x = 15.0f, y = 4.2f)
                // V 9
                verticalLineTo(y = 9.0f)
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // h 4.8
                horizontalLineToRelative(dx = 4.8f)
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // M 9 4.2
                moveTo(x = 9.0f, y = 4.2f)
                // V 9
                verticalLineTo(y = 9.0f)
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // H 4.2
                horizontalLineTo(x = 4.2f)
                // M 9 9
                moveTo(x = 9.0f, y = 9.0f)
                // L 3 3
                lineTo(x = 3.0f, y = 3.0f)
            }
        }.build().also { _shrink = it }
    }

@Suppress("ObjectPropertyName")
private var _shrink: ImageVector? = null
