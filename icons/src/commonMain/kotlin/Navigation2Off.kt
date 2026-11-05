package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Navigation2Off: ImageVector
    get() {
        val current = _navigation2Off
        if (current != null) return current

        return ImageVector.Builder(
            name = "Navigation2Off",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9.31 9.31 5 21 l7 -4 7 4 -1.17 -3.17 m-3.3 -8.95 L12 2 l-1.17 3.17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.31 9.31
                moveTo(x = 9.31f, y = 9.31f)
                // L 5 21
                lineTo(x = 5.0f, y = 21.0f)
                // l 7 -4
                lineToRelative(dx = 7.0f, dy = -4.0f)
                // l 7 4
                lineToRelative(dx = 7.0f, dy = 4.0f)
                // l -1.17 -3.17
                lineToRelative(dx = -1.17f, dy = -3.17f)
                // m -3.3 -8.95
                moveToRelative(dx = -3.3f, dy = -8.95f)
                // L 12 2
                lineTo(x = 12.0f, y = 2.0f)
                // l -1.17 3.17
                lineToRelative(dx = -1.17f, dy = 3.17f)
            }
            // <line x1="2.0" y1="2.0" x2="22.0" y2="22.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // L 22 22
                lineTo(x = 22.0f, y = 22.0f)
            }
        }.build().also { _navigation2Off = it }
    }


@Suppress("ObjectPropertyName")
private var _navigation2Off: ImageVector? = null
