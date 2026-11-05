package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MoveUpRight: ImageVector
    get() {
        val current = _moveUpRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MoveUpRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 5 h6 v6 m0 -6 L5 19
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 5
                moveTo(x = 13.0f, y = 5.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // L 5 19
                lineTo(x = 5.0f, y = 19.0f)
            }
        }.build().also { _moveUpRight = it }
    }

@Suppress("ObjectPropertyName")
private var _moveUpRight: ImageVector? = null
