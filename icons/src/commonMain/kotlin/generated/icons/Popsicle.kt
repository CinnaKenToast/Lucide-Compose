package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Popsicle: ImageVector
    get() {
        val current = _popsicle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Popsicle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18.6 14.4 c.8 -.8 .8 -2 0 -2.8 l-8.1 -8.1 a4.95 4.95 0 1 0 -7.1 7.1 l8.1 8.1 c.9 .7 2.1 .7 2.9 -.1Z M22 22 l-5.5 -5.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.6 14.4
                moveTo(x = 18.6f, y = 14.4f)
                // c 0.8 -0.8 0.8 -2 0 -2.8
                curveToRelative(
                    dx1 = 0.8f,
                    dy1 = -0.8f,
                    dx2 = 0.8f,
                    dy2 = -2.0f,
                    dx3 = 0.0f,
                    dy3 = -2.8f,
                )
                // l -8.1 -8.1
                lineToRelative(dx = -8.1f, dy = -8.1f)
                // a 4.95 4.95 0 1 0 -7.1 7.1
                arcToRelative(
                    a = 4.95f,
                    b = 4.95f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -7.1f,
                    dy1 = 7.1f,
                )
                // l 8.1 8.1
                lineToRelative(dx = 8.1f, dy = 8.1f)
                // c 0.9 0.7 2.1 0.7 2.9 -0.1z
                curveToRelative(
                    dx1 = 0.9f,
                    dy1 = 0.7f,
                    dx2 = 2.1f,
                    dy2 = 0.7f,
                    dx3 = 2.9f,
                    dy3 = -0.1f,
                )
                close()
                // M 22 22
                moveTo(x = 22.0f, y = 22.0f)
                // l -5.5 -5.5
                lineToRelative(dx = -5.5f, dy = -5.5f)
            }
        }.build().also { _popsicle = it }
    }

@Suppress("ObjectPropertyName")
private var _popsicle: ImageVector? = null
