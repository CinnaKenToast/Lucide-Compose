package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Merge: ImageVector
    get() {
        val current = _merge
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Merge",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m8 6 4 -4 4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
            }
            // M12 2 v10.3 a4 4 0 0 1 -1.17 2.87 L4 22 m16 0 -5 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 10.3
                verticalLineToRelative(dy = 10.3f)
                // a 4 4 0 0 1 -1.17 2.87
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.17f,
                    dy1 = 2.87f,
                )
                // L 4 22
                lineTo(x = 4.0f, y = 22.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
            }
        }.build().also { _merge = it }
    }

@Suppress("ObjectPropertyName")
private var _merge: ImageVector? = null
