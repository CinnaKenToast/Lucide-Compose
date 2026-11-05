package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TrainTrack: ImageVector
    get() {
        val current = _trainTrack
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TrainTrack",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 17 17 2 M2 14 l8 8 M5 11 l8 8 M8 8 l8 8 M11 5 l8 8 M14 2 l8 8 M7 22 22 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 17
                moveTo(x = 2.0f, y = 17.0f)
                // L 17 2
                lineTo(x = 17.0f, y = 2.0f)
                // M 2 14
                moveTo(x = 2.0f, y = 14.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // M 5 11
                moveTo(x = 5.0f, y = 11.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // M 11 5
                moveTo(x = 11.0f, y = 5.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // M 14 2
                moveTo(x = 14.0f, y = 2.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // L 22 7
                lineTo(x = 22.0f, y = 7.0f)
            }
        }.build().also { _trainTrack = it }
    }

@Suppress("ObjectPropertyName")
private var _trainTrack: ImageVector? = null
