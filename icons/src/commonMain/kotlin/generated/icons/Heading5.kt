package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Heading5: ImageVector
    get() {
        val current = _heading5
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Heading5",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 12 h8 m-8 6 V6 m8 12 V6 m5 7 v-3 h4 m-4 7.7 c.4 .2 .8 .3 1.3 .3 1.5 0 2.7 -1.1 2.7 -2.5 S19.8 13 18.3 13 H17
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
                // m 5 7
                moveToRelative(dx = 5.0f, dy = 7.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 7.7
                moveToRelative(dx = -4.0f, dy = 7.7f)
                // c 0.4 0.2 0.8 0.3 1.3 0.3
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 0.2f,
                    dx2 = 0.8f,
                    dy2 = 0.3f,
                    dx3 = 1.3f,
                    dy3 = 0.3f,
                )
                // c 1.5 0 2.7 -1.1 2.7 -2.5
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.0f,
                    dx2 = 2.7f,
                    dy2 = -1.1f,
                    dx3 = 2.7f,
                    dy3 = -2.5f,
                )
                // S 19.8 13 18.3 13
                reflectiveCurveTo(
                    x1 = 19.8f,
                    y1 = 13.0f,
                    x2 = 18.3f,
                    y2 = 13.0f,
                )
                // H 17
                horizontalLineTo(x = 17.0f)
            }
        }.build().also { _heading5 = it }
    }

@Suppress("ObjectPropertyName")
private var _heading5: ImageVector? = null
