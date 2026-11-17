package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowsFromAxisDashedVertical: ImageVector
    get() {
        val current = _arrowsFromAxisDashedVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowsFromAxisDashedVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 10 V8 m0 8 v-2 m0 8 v-2 m0 -16 V2 m7 13 3 -3 -3 -3 m3 3 h-6 M5 15 l-3 -3 3 -3 m3 3 H2
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
                // m 7 13
                moveToRelative(dx = 7.0f, dy = 13.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // m 3 3
                moveToRelative(dx = 3.0f, dy = 3.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // M 5 15
                moveTo(x = 5.0f, y = 15.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // m 3 3
                moveToRelative(dx = 3.0f, dy = 3.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _arrowsFromAxisDashedVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowsFromAxisDashedVertical: ImageVector? = null
