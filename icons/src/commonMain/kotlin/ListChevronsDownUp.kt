package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListChevronsDownUp: ImageVector
    get() {
        val current = _listChevronsDownUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "ListChevronsDownUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 5 h8 m-8 7 h8 m-8 7 h8 m4 -14 3 3 3 -3 m-6 14 3 -3 3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 7
                moveToRelative(dx = -8.0f, dy = 7.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 7
                moveToRelative(dx = -8.0f, dy = 7.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m 4 -14
                moveToRelative(dx = 4.0f, dy = -14.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // m -6 14
                moveToRelative(dx = -6.0f, dy = 14.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
            }
        }.build().also { _listChevronsDownUp = it }
    }


@Suppress("ObjectPropertyName")
private var _listChevronsDownUp: ImageVector? = null
