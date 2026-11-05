package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListCheck: ImageVector
    get() {
        val current = _listCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "ListCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 5 H3 m13 7 H3 m8 7 H3 m12 -1 2 2 4 -4
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
                // m 13 7
                moveToRelative(dx = 13.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 8 7
                moveToRelative(dx = 8.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 12 -1
                moveToRelative(dx = 12.0f, dy = -1.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
        }.build().also { _listCheck = it }
    }


@Suppress("ObjectPropertyName")
private var _listCheck: ImageVector? = null
