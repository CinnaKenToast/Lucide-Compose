package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Loader: ImageVector
    get() {
        val current = _loader
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Loader",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v4 m4.2 1.8 2.9 -2.9 M18 12 h4 m-5.8 4.2 2.9 2.9 M12 18 v4 m-7.1 -2.9 2.9 -2.9 M2 12 h4 M4.9 4.9 l2.9 2.9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 4.2 1.8
                moveToRelative(dx = 4.2f, dy = 1.8f)
                // l 2.9 -2.9
                lineToRelative(dx = 2.9f, dy = -2.9f)
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -5.8 4.2
                moveToRelative(dx = -5.8f, dy = 4.2f)
                // l 2.9 2.9
                lineToRelative(dx = 2.9f, dy = 2.9f)
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m -7.1 -2.9
                moveToRelative(dx = -7.1f, dy = -2.9f)
                // l 2.9 -2.9
                lineToRelative(dx = 2.9f, dy = -2.9f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // M 4.9 4.9
                moveTo(x = 4.9f, y = 4.9f)
                // l 2.9 2.9
                lineToRelative(dx = 2.9f, dy = 2.9f)
            }
        }.build().also { _loader = it }
    }

@Suppress("ObjectPropertyName")
private var _loader: ImageVector? = null
