package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Minimize2: ImageVector
    get() {
        val current = _minimize2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Minimize2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 10 7 -7 m-1 7 h-6 V4 M3 21 l7 -7 m-6 0 h6 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 10
                moveTo(x = 14.0f, y = 10.0f)
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // m -1 7
                moveToRelative(dx = -1.0f, dy = 7.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // M 3 21
                moveTo(x = 3.0f, y = 21.0f)
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _minimize2 = it }
    }

@Suppress("ObjectPropertyName")
private var _minimize2: ImageVector? = null
