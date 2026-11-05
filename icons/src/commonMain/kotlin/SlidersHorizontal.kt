package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SlidersHorizontal: ImageVector
    get() {
        val current = _slidersHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "SlidersHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 5 H3 m9 14 H3 M14 3 v4 m2 10 v4 m5 -9 h-9 m9 7 h-5 m5 -14 h-7 m-6 5 v4 m0 -2 H3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 5
                moveTo(x = 10.0f, y = 5.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 9 14
                moveToRelative(dx = 9.0f, dy = 14.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // M 14 3
                moveTo(x = 14.0f, y = 3.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 2 10
                moveToRelative(dx = 2.0f, dy = 10.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 5 -9
                moveToRelative(dx = 5.0f, dy = -9.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // m 9 7
                moveToRelative(dx = 9.0f, dy = 7.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // m 5 -14
                moveToRelative(dx = 5.0f, dy = -14.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // m -6 5
                moveToRelative(dx = -6.0f, dy = 5.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
            }
        }.build().also { _slidersHorizontal = it }
    }


@Suppress("ObjectPropertyName")
private var _slidersHorizontal: ImageVector? = null
