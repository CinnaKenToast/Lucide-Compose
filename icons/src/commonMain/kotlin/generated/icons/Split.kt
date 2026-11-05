package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Split: ImageVector
    get() {
        val current = _split
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Split",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 3 h5 v5 M8 3 H3 v5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 3
                moveTo(x = 16.0f, y = 3.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
            }
            // M12 22 v-8.3 a4 4 0 0 0 -1.17 -2.87 L3 3 m12 6 6 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -8.3
                verticalLineToRelative(dy = -8.3f)
                // a 4 4 0 0 0 -1.17 -2.87
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.17f,
                    dy1 = -2.87f,
                )
                // L 3 3
                lineTo(x = 3.0f, y = 3.0f)
                // m 12 6
                moveToRelative(dx = 12.0f, dy = 6.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
            }
        }.build().also { _split = it }
    }

@Suppress("ObjectPropertyName")
private var _split: ImageVector? = null
