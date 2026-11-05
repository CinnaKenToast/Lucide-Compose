package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Logs: ImageVector
    get() {
        val current = _logs
        if (current != null) return current

        return ImageVector.Builder(
            name = "Logs",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 5 h1 m-1 7 h1 m-1 7 h1 M8 5 h1 m-1 7 h1 m-1 7 h1 m4 -14 h8 m-8 7 h8 m-8 7 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m -1 7
                moveToRelative(dx = -1.0f, dy = 7.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m -1 7
                moveToRelative(dx = -1.0f, dy = 7.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 8 5
                moveTo(x = 8.0f, y = 5.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m -1 7
                moveToRelative(dx = -1.0f, dy = 7.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m -1 7
                moveToRelative(dx = -1.0f, dy = 7.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 4 -14
                moveToRelative(dx = 4.0f, dy = -14.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 7
                moveToRelative(dx = -8.0f, dy = 7.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 7
                moveToRelative(dx = -8.0f, dy = 7.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _logs = it }
    }


@Suppress("ObjectPropertyName")
private var _logs: ImageVector? = null
