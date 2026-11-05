package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.WavesArrowUp: ImageVector
    get() {
        val current = _wavesArrowUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.WavesArrowUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v8 M2 15 c.6 .5 1.2 1 2.5 1 2.5 0 2.5 -2 5 -2 2.6 0 2.4 2 5 2 2.5 0 2.5 -2 5 -2 1.3 0 1.9 .5 2.5 1 M2 21 c.6 .5 1.2 1 2.5 1 2.5 0 2.5 -2 5 -2 2.6 0 2.4 2 5 2 2.5 0 2.5 -2 5 -2 1.3 0 1.9 .5 2.5 1 M8 6 l4 -4 4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // M 2 15
                moveTo(x = 2.0f, y = 15.0f)
                // c 0.6 0.5 1.2 1 2.5 1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.5f,
                    dx2 = 1.2f,
                    dy2 = 1.0f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 2.6 0 2.4 2 5 2
                curveToRelative(
                    dx1 = 2.6f,
                    dy1 = 0.0f,
                    dx2 = 2.4f,
                    dy2 = 2.0f,
                    dx3 = 5.0f,
                    dy3 = 2.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 1.3 0 1.9 0.5 2.5 1
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 0.5f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // c 0.6 0.5 1.2 1 2.5 1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.5f,
                    dx2 = 1.2f,
                    dy2 = 1.0f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 2.6 0 2.4 2 5 2
                curveToRelative(
                    dx1 = 2.6f,
                    dy1 = 0.0f,
                    dx2 = 2.4f,
                    dy2 = 2.0f,
                    dx3 = 5.0f,
                    dy3 = 2.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 1.3 0 1.9 0.5 2.5 1
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 0.5f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
            }
        }.build().also { _wavesArrowUp = it }
    }

@Suppress("ObjectPropertyName")
private var _wavesArrowUp: ImageVector? = null
