package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronsLeft: ImageVector
    get() {
        val current = _chevronsLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "ChevronsLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m11 17 -5 -5 5 -5 m7 10 -5 -5 5 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 17
                moveTo(x = 11.0f, y = 17.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // m 7 10
                moveToRelative(dx = 7.0f, dy = 10.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
            }
        }.build().also { _chevronsLeft = it }
    }


@Suppress("ObjectPropertyName")
private var _chevronsLeft: ImageVector? = null
