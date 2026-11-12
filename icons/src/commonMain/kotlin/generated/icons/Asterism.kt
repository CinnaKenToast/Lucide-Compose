package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Asterism: ImageVector
    get() {
        val current = _asterism
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Asterism",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v8 m2.5 5 7 4 m-7 0 7 -4 M18 13 v8 M2.5 15 l7 4 m-7 0 7 -4 M6 13 v8 M8.5 4 l7 4 m-7 0 7 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 2.5 5
                moveToRelative(dx = 2.5f, dy = 5.0f)
                // l 7 4
                lineToRelative(dx = 7.0f, dy = 4.0f)
                // m -7 0
                moveToRelative(dx = -7.0f, dy = 0.0f)
                // l 7 -4
                lineToRelative(dx = 7.0f, dy = -4.0f)
                // M 18 13
                moveTo(x = 18.0f, y = 13.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // M 2.5 15
                moveTo(x = 2.5f, y = 15.0f)
                // l 7 4
                lineToRelative(dx = 7.0f, dy = 4.0f)
                // m -7 0
                moveToRelative(dx = -7.0f, dy = 0.0f)
                // l 7 -4
                lineToRelative(dx = 7.0f, dy = -4.0f)
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // M 8.5 4
                moveTo(x = 8.5f, y = 4.0f)
                // l 7 4
                lineToRelative(dx = 7.0f, dy = 4.0f)
                // m -7 0
                moveToRelative(dx = -7.0f, dy = 0.0f)
                // l 7 -4
                lineToRelative(dx = 7.0f, dy = -4.0f)
            }
        }.build().also { _asterism = it }
    }

@Suppress("ObjectPropertyName")
private var _asterism: ImageVector? = null
