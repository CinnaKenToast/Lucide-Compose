package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChevronsFromAxisDashedHorizontal: ImageVector
    get() {
        val current = _chevronsFromAxisDashedHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChevronsFromAxisDashedHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 12 H8 m8 0 h-2 m8 0 h-2 M4 12 H2 m6 5 4 4 4 -4 M8 7 l4 -4 4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 12
                moveTo(x = 10.0f, y = 12.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
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
        }.build().also { _chevronsFromAxisDashedHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _chevronsFromAxisDashedHorizontal: ImageVector? = null
