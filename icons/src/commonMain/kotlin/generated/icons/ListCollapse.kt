package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ListCollapse: ImageVector
    get() {
        val current = _listCollapse
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ListCollapse",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 5 h11 m-11 7 h11 m-11 7 h11 M3 10 l3 -3 -3 -3 m0 16 3 -3 -3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 5
                moveTo(x = 10.0f, y = 5.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // m -11 7
                moveToRelative(dx = -11.0f, dy = 7.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // m -11 7
                moveToRelative(dx = -11.0f, dy = 7.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // M 3 10
                moveTo(x = 3.0f, y = 10.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // m 0 16
                moveToRelative(dx = 0.0f, dy = 16.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
            }
        }.build().also { _listCollapse = it }
    }

@Suppress("ObjectPropertyName")
private var _listCollapse: ImageVector? = null
