package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowDownToLine: ImageVector
    get() {
        val current = _arrowDownToLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowDownToLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 17 V3 m-6 8 6 6 6 -6 m1 10 H5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m -6 8
                moveToRelative(dx = -6.0f, dy = 8.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // m 1 10
                moveToRelative(dx = 1.0f, dy = 10.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
            }
        }.build().also { _arrowDownToLine = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDownToLine: ImageVector? = null
