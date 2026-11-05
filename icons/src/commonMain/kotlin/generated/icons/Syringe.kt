package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Syringe: ImageVector
    get() {
        val current = _syringe
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Syringe",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m18 2 4 4 m-5 1 3 -3 m-1 5 L8.7 19.3 c-1 1 -2.5 1 -3.4 0 l-.6 -.6 c-1 -1 -1 -2.5 0 -3.4 L15 5 m-6 6 4 4 m-8 4 -3 3 M14 4 l6 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 2
                moveTo(x = 18.0f, y = 2.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m -5 1
                moveToRelative(dx = -5.0f, dy = 1.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // m -1 5
                moveToRelative(dx = -1.0f, dy = 5.0f)
                // L 8.7 19.3
                lineTo(x = 8.7f, y = 19.3f)
                // c -1 1 -2.5 1 -3.4 0
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                    dx2 = -2.5f,
                    dy2 = 1.0f,
                    dx3 = -3.4f,
                    dy3 = 0.0f,
                )
                // l -0.6 -0.6
                lineToRelative(dx = -0.6f, dy = -0.6f)
                // c -1 -1 -1 -2.5 0 -3.4
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -2.5f,
                    dx3 = 0.0f,
                    dy3 = -3.4f,
                )
                // L 15 5
                lineTo(x = 15.0f, y = 5.0f)
                // m -6 6
                moveToRelative(dx = -6.0f, dy = 6.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m -8 4
                moveToRelative(dx = -8.0f, dy = 4.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // M 14 4
                moveTo(x = 14.0f, y = 4.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
            }
        }.build().also { _syringe = it }
    }

@Suppress("ObjectPropertyName")
private var _syringe: ImageVector? = null
