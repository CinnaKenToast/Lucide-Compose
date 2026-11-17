package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChevronsFromAxisHorizontal: ImageVector
    get() {
        val current = _chevronsFromAxisHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChevronsFromAxisHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 12 H2 m6 5 4 4 4 -4 M8 7 l4 -4 4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 6 5
                moveToRelative(dx = 6.0f, dy = 5.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // M 8 7
                moveTo(x = 8.0f, y = 7.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
            }
        }.build().also { _chevronsFromAxisHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _chevronsFromAxisHorizontal: ImageVector? = null
