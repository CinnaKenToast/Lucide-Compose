package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ListX: ImageVector
    get() {
        val current = _listX
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ListX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 5 H3 m8 7 H3 m13 7 H3 m12.5 -9.5 5 5 m0 -5 -5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 5
                moveTo(x = 16.0f, y = 5.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 8 7
                moveToRelative(dx = 8.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 13 7
                moveToRelative(dx = 13.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 12.5 -9.5
                moveToRelative(dx = 12.5f, dy = -9.5f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
            }
        }.build().also { _listX = it }
    }

@Suppress("ObjectPropertyName")
private var _listX: ImageVector? = null
