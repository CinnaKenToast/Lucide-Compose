package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ListChecks: ImageVector
    get() {
        val current = _listChecks
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ListChecks",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 5 h8 m-8 7 h8 m-8 7 h8 M3 17 l2 2 4 -4 M3 7 l2 2 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 5
                moveTo(x = 13.0f, y = 5.0f)
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
                // M 3 17
                moveTo(x = 3.0f, y = 17.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // M 3 7
                moveTo(x = 3.0f, y = 7.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
        }.build().also { _listChecks = it }
    }

@Suppress("ObjectPropertyName")
private var _listChecks: ImageVector? = null
