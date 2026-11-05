package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Haze: ImageVector
    get() {
        val current = _haze
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Haze",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m5.2 6.2 1.4 1.4 M2 13 h2 m16 0 h2 m-4.6 -5.4 1.4 -1.4 M22 17 H2 m20 4 H2 m14 -8 a4 4 0 0 0 -8 0 m4 -8 V2.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.2 6.2
                moveTo(x = 5.2f, y = 6.2f)
                // l 1.4 1.4
                lineToRelative(dx = 1.4f, dy = 1.4f)
                // M 2 13
                moveTo(x = 2.0f, y = 13.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -4.6 -5.4
                moveToRelative(dx = -4.6f, dy = -5.4f)
                // l 1.4 -1.4
                lineToRelative(dx = 1.4f, dy = -1.4f)
                // M 22 17
                moveTo(x = 22.0f, y = 17.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 20 4
                moveToRelative(dx = 20.0f, dy = 4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 14 -8
                moveToRelative(dx = 14.0f, dy = -8.0f)
                // a 4 4 0 0 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // m 4 -8
                moveToRelative(dx = 4.0f, dy = -8.0f)
                // V 2.5
                verticalLineTo(y = 2.5f)
            }
        }.build().also { _haze = it }
    }

@Suppress("ObjectPropertyName")
private var _haze: ImageVector? = null
