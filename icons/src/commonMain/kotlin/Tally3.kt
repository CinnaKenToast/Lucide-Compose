package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tally3: ImageVector
    get() {
        val current = _tally3
        if (current != null) return current

        return ImageVector.Builder(
            name = "Tally3",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 4 v16 M9 4 v16 m5 -16 v16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // M 9 4
                moveTo(x = 9.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // m 5 -16
                moveToRelative(dx = 5.0f, dy = -16.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
            }
        }.build().also { _tally3 = it }
    }


@Suppress("ObjectPropertyName")
private var _tally3: ImageVector? = null
