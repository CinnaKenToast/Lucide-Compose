package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MoveUp: ImageVector
    get() {
        val current = _moveUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MoveUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m8 6 4 -4 4 4 m-4 -4 v20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m -4 -4
                moveToRelative(dx = -4.0f, dy = -4.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
            }
        }.build().also { _moveUp = it }
    }

@Suppress("ObjectPropertyName")
private var _moveUp: ImageVector? = null
