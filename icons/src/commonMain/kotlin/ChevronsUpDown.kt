package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronsUpDown: ImageVector
    get() {
        val current = _chevronsUpDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "ChevronsUpDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m7 15 5 5 5 -5 M7 9 l5 -5 5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 15
                moveTo(x = 7.0f, y = 15.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // M 7 9
                moveTo(x = 7.0f, y = 9.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
            }
        }.build().also { _chevronsUpDown = it }
    }


@Suppress("ObjectPropertyName")
private var _chevronsUpDown: ImageVector? = null
