package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Gavel: ImageVector
    get() {
        val current = _gavel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Gavel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 13 -8.38 8.38 a1 1 0 0 1 -3 -3 L11 10 m5 6 6 -6 m-.5 .5 -8 -8 M8 8 l6 -6 M8.5 7.5 l8 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 13
                moveTo(x = 14.0f, y = 13.0f)
                // l -8.38 8.38
                lineToRelative(dx = -8.38f, dy = 8.38f)
                // a 1 1 0 0 1 -3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // L 11 10
                lineTo(x = 11.0f, y = 10.0f)
                // m 5 6
                moveToRelative(dx = 5.0f, dy = 6.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // m -0.5 0.5
                moveToRelative(dx = -0.5f, dy = 0.5f)
                // l -8 -8
                lineToRelative(dx = -8.0f, dy = -8.0f)
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // M 8.5 7.5
                moveTo(x = 8.5f, y = 7.5f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
            }
        }.build().also { _gavel = it }
    }

@Suppress("ObjectPropertyName")
private var _gavel: ImageVector? = null
