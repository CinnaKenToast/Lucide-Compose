package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChevronsToAxisVertical: ImageVector
    get() {
        val current = _chevronsToAxisVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChevronsToAxisVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v20 m9 -14 -4 4 4 4 M3 8 l4 4 -4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // m 9 -14
                moveToRelative(dx = 9.0f, dy = -14.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // M 3 8
                moveTo(x = 3.0f, y = 8.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
            }
        }.build().also { _chevronsToAxisVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _chevronsToAxisVertical: ImageVector? = null
