package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChevronsToAxisHorizontal: ImageVector
    get() {
        val current = _chevronsToAxisHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChevronsToAxisHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m16 21 -4 -4 -4 4 m8 -18 -4 4 -4 -4 m14 9 H2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 21
                moveTo(x = 16.0f, y = 21.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // m 8 -18
                moveToRelative(dx = 8.0f, dy = -18.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // m 14 9
                moveToRelative(dx = 14.0f, dy = 9.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _chevronsToAxisHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _chevronsToAxisHorizontal: ImageVector? = null
