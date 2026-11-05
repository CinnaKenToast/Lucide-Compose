package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowDownFromLine: ImageVector
    get() {
        val current = _arrowDownFromLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowDownFromLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 3 H5 m7 18 V7 m-6 8 6 6 6 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 3
                moveTo(x = 19.0f, y = 3.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // m 7 18
                moveToRelative(dx = 7.0f, dy = 18.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // m -6 8
                moveToRelative(dx = -6.0f, dy = 8.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
            }
        }.build().also { _arrowDownFromLine = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDownFromLine: ImageVector? = null
