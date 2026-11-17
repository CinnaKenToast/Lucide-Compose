package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowsToAxisVertical: ImageVector
    get() {
        val current = _arrowsToAxisVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowsToAxisVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 V2 m4 10 h6 m-3 3 -3 -3 3 -3 M2 12 h6 m-3 3 3 -3 -3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // m 4 10
                moveToRelative(dx = 4.0f, dy = 10.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 3
                moveToRelative(dx = -3.0f, dy = 3.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 3
                moveToRelative(dx = -3.0f, dy = 3.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
            }
        }.build().also { _arrowsToAxisVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowsToAxisVertical: ImageVector? = null
