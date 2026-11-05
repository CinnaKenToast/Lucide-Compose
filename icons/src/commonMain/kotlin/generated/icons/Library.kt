package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Library: ImageVector
    get() {
        val current = _library
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Library",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m16 6 4 14 M12 6 v14 M8 8 v12 M4 4 v16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 6
                moveTo(x = 16.0f, y = 6.0f)
                // l 4 14
                lineToRelative(dx = 4.0f, dy = 14.0f)
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
            }
        }.build().also { _library = it }
    }

@Suppress("ObjectPropertyName")
private var _library: ImageVector? = null
