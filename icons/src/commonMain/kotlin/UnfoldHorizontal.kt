package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UnfoldHorizontal: ImageVector
    get() {
        val current = _unfoldHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "UnfoldHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 12 h6 M8 12 H2 M12 2 v2 m0 4 v2 m0 4 v2 m0 4 v2 m7 -7 3 -3 -3 -3 M5 9 l-3 3 3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 12
                moveTo(x = 16.0f, y = 12.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 7 -7
                moveToRelative(dx = 7.0f, dy = -7.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // M 5 9
                moveTo(x = 5.0f, y = 9.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
            }
        }.build().also { _unfoldHorizontal = it }
    }


@Suppress("ObjectPropertyName")
private var _unfoldHorizontal: ImageVector? = null
