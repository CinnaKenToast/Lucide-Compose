package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Antenna: ImageVector
    get() {
        val current = _antenna
        if (current != null) return current

        return ImageVector.Builder(
            name = "Antenna",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 12 7 2 m0 10 5 -10 m0 10 5 -10 m0 10 5 -10 M4.5 7 h15 M12 16 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // L 7 2
                lineTo(x = 7.0f, y = 2.0f)
                // m 0 10
                moveToRelative(dx = 0.0f, dy = 10.0f)
                // l 5 -10
                lineToRelative(dx = 5.0f, dy = -10.0f)
                // m 0 10
                moveToRelative(dx = 0.0f, dy = 10.0f)
                // l 5 -10
                lineToRelative(dx = 5.0f, dy = -10.0f)
                // m 0 10
                moveToRelative(dx = 0.0f, dy = 10.0f)
                // l 5 -10
                lineToRelative(dx = 5.0f, dy = -10.0f)
                // M 4.5 7
                moveTo(x = 4.5f, y = 7.0f)
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // M 12 16
                moveTo(x = 12.0f, y = 16.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _antenna = it }
    }


@Suppress("ObjectPropertyName")
private var _antenna: ImageVector? = null
