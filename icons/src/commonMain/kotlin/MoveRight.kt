package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoveRight: ImageVector
    get() {
        val current = _moveRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "MoveRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m18 8 4 4 -4 4 M2 12 h20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 8
                moveTo(x = 18.0f, y = 8.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
            }
        }.build().also { _moveRight = it }
    }


@Suppress("ObjectPropertyName")
private var _moveRight: ImageVector? = null
