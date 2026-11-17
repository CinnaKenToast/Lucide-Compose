package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowsToAxisDashedVertical: ImageVector
    get() {
        val current = _arrowsToAxisDashedVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowsToAxisDashedVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 10 V8 m0 8 v-2 m0 8 v-2 m0 -16 V2 m4 10 h6 m-3 3 -3 -3 3 -3 M2 12 h6 m-3 3 3 -3 -3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 -16
                moveToRelative(dx = 0.0f, dy = -16.0f)
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
        }.build().also { _arrowsToAxisDashedVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowsToAxisDashedVertical: ImageVector? = null
