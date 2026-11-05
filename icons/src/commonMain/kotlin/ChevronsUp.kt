package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronsUp: ImageVector
    get() {
        val current = _chevronsUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "ChevronsUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m17 11 -5 -5 -5 5 m10 7 -5 -5 -5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 11
                moveTo(x = 17.0f, y = 11.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // m 10 7
                moveToRelative(dx = 10.0f, dy = 7.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
            }
        }.build().also { _chevronsUp = it }
    }


@Suppress("ObjectPropertyName")
private var _chevronsUp: ImageVector? = null
