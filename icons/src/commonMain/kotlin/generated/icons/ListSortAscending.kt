package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ListSortAscending: ImageVector
    get() {
        val current = _listSortAscending
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ListSortAscending",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 19 h18 m-6 -7 H3 m6 -7 H3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // m -6 -7
                moveToRelative(dx = -6.0f, dy = -7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 6 -7
                moveToRelative(dx = 6.0f, dy = -7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
            }
        }.build().also { _listSortAscending = it }
    }

@Suppress("ObjectPropertyName")
private var _listSortAscending: ImageVector? = null
