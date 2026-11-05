package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowLeftFromLine: ImageVector
    get() {
        val current = _arrowLeftFromLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "ArrowLeftFromLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m9 6 -6 6 6 6 m-6 -6 h14 m4 7 V5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 6
                moveTo(x = 9.0f, y = 6.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // m -6 -6
                moveToRelative(dx = -6.0f, dy = -6.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // m 4 7
                moveToRelative(dx = 4.0f, dy = 7.0f)
                // V 5
                verticalLineTo(y = 5.0f)
            }
        }.build().also { _arrowLeftFromLine = it }
    }


@Suppress("ObjectPropertyName")
private var _arrowLeftFromLine: ImageVector? = null
