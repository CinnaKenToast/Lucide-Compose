package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListFilter: ImageVector
    get() {
        val current = _listFilter
        if (current != null) return current

        return ImageVector.Builder(
            name = "ListFilter",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 5 h20 M6 12 h12 m-9 7 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 5
                moveTo(x = 2.0f, y = 5.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // m -9 7
                moveToRelative(dx = -9.0f, dy = 7.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _listFilter = it }
    }


@Suppress("ObjectPropertyName")
private var _listFilter: ImageVector? = null
