package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowsUpFromLine: ImageVector
    get() {
        val current = _arrowsUpFromLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "ArrowsUpFromLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m4 6 3 -3 3 3 M7 17 V3 m7 3 3 -3 3 3 m-3 11 V3 M4 21 h16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // M 7 17
                moveTo(x = 7.0f, y = 17.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m 7 3
                moveToRelative(dx = 7.0f, dy = 3.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // m -3 11
                moveToRelative(dx = -3.0f, dy = 11.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // M 4 21
                moveTo(x = 4.0f, y = 21.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
            }
        }.build().also { _arrowsUpFromLine = it }
    }


@Suppress("ObjectPropertyName")
private var _arrowsUpFromLine: ImageVector? = null
