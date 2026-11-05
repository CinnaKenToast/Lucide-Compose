package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowDownRight: ImageVector
    get() {
        val current = _arrowDownRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "ArrowDownRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m7 7 10 10 m0 -10 v10 H7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 7
                moveTo(x = 7.0f, y = 7.0f)
                // l 10 10
                lineToRelative(dx = 10.0f, dy = 10.0f)
                // m 0 -10
                moveToRelative(dx = 0.0f, dy = -10.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
            }
        }.build().also { _arrowDownRight = it }
    }


@Suppress("ObjectPropertyName")
private var _arrowDownRight: ImageVector? = null
