package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListIndentIncrease: ImageVector
    get() {
        val current = _listIndentIncrease
        if (current != null) return current

        return ImageVector.Builder(
            name = "ListIndentIncrease",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 5 H11 m10 7 H11 m10 7 H11 M3 8 l4 4 -4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 5
                moveTo(x = 21.0f, y = 5.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // m 10 7
                moveToRelative(dx = 10.0f, dy = 7.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // m 10 7
                moveToRelative(dx = 10.0f, dy = 7.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // M 3 8
                moveTo(x = 3.0f, y = 8.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
            }
        }.build().also { _listIndentIncrease = it }
    }


@Suppress("ObjectPropertyName")
private var _listIndentIncrease: ImageVector? = null
