package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Move3d: ImageVector
    get() {
        val current = _move3d
        if (current != null) return current

        return ImageVector.Builder(
            name = "Move3d",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 3 v16 h16 M5 19 l6 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 3
                moveTo(x = 5.0f, y = 3.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 5 19
                moveTo(x = 5.0f, y = 19.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
            }
            // m2 6 3 -3 3 3 m10 10 3 3 -3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 6
                moveTo(x = 2.0f, y = 6.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // m 10 10
                moveToRelative(dx = 10.0f, dy = 10.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
            }
        }.build().also { _move3d = it }
    }


@Suppress("ObjectPropertyName")
private var _move3d: ImageVector? = null
