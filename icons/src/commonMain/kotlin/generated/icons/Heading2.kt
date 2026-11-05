package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Heading2: ImageVector
    get() {
        val current = _heading2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Heading2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 12 h8 m-8 6 V6 m8 12 V6 m9 12 h-4 c0 -4 4 -3 4 -6 0 -1.5 -2 -2.5 -4 -1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 6
                moveToRelative(dx = -8.0f, dy = 6.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // m 8 12
                moveToRelative(dx = 8.0f, dy = 12.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // m 9 12
                moveToRelative(dx = 9.0f, dy = 12.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c 0 -4 4 -3 4 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -3.0f,
                    dx3 = 4.0f,
                    dy3 = -6.0f,
                )
                // c 0 -1.5 -2 -2.5 -4 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.5f,
                    dx2 = -2.0f,
                    dy2 = -2.5f,
                    dx3 = -4.0f,
                    dy3 = -1.0f,
                )
            }
        }.build().also { _heading2 = it }
    }

@Suppress("ObjectPropertyName")
private var _heading2: ImageVector? = null
