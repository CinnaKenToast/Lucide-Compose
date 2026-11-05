package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Parasol: ImageVector
    get() {
        val current = _parasol
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Parasol",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.5 11.13 18.2 21 m2.23 -15.7 a10 10 0 0 0 -16.95 9.78 c.19 .56 .85 .77 1.36 .48 L20.16 6.7 c.51 -.3 .66 -.97 .26 -1.41 M21 21 H3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.5 11.13
                moveTo(x = 12.5f, y = 11.13f)
                // L 18.2 21
                lineTo(x = 18.2f, y = 21.0f)
                // m 2.23 -15.7
                moveToRelative(dx = 2.23f, dy = -15.7f)
                // a 10 10 0 0 0 -16.95 9.78
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -16.95f,
                    dy1 = 9.78f,
                )
                // c 0.19 0.56 0.85 0.77 1.36 0.48
                curveToRelative(
                    dx1 = 0.19f,
                    dy1 = 0.56f,
                    dx2 = 0.85f,
                    dy2 = 0.77f,
                    dx3 = 1.36f,
                    dy3 = 0.48f,
                )
                // L 20.16 6.7
                lineTo(x = 20.16f, y = 6.7f)
                // c 0.51 -0.3 0.66 -0.97 0.26 -1.41
                curveToRelative(
                    dx1 = 0.51f,
                    dy1 = -0.3f,
                    dx2 = 0.66f,
                    dy2 = -0.97f,
                    dx3 = 0.26f,
                    dy3 = -1.41f,
                )
                // M 21 21
                moveTo(x = 21.0f, y = 21.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
            }
        }.build().also { _parasol = it }
    }

@Suppress("ObjectPropertyName")
private var _parasol: ImageVector? = null
