package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ListMinus: ImageVector
    get() {
        val current = _listMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ListMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 5 H3 m8 7 H3 m13 7 H3 m18 -7 h-6
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
                // m 18 -7
                moveToRelative(dx = 18.0f, dy = -7.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
            }
        }.build().also { _listMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _listMinus: ImageVector? = null
