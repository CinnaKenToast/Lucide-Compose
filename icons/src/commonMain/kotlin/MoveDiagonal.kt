package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoveDiagonal: ImageVector
    get() {
        val current = _moveDiagonal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MoveDiagonal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 19 H5 v-6 m8 -8 h6 v6 m0 -6 L5 19
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 19
                moveTo(x = 11.0f, y = 19.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // m 8 -8
                moveToRelative(dx = 8.0f, dy = -8.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // L 5 19
                lineTo(x = 5.0f, y = 19.0f)
            }
        }.build().also { _moveDiagonal = it }
    }


@Suppress("ObjectPropertyName")
private var _moveDiagonal: ImageVector? = null
