package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Fence: ImageVector
    get() {
        val current = _fence
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Fence",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 3 2 5 v15 c0 .6 .4 1 1 1 h2 c.6 0 1 -.4 1 -1 V5Z m2 5 h4 M6 18 h4 m2 -15 -2 2 v15 c0 .6 .4 1 1 1 h2 c.6 0 1 -.4 1 -1 V5Z m2 5 h4 m-4 10 h4 m2 -15 -2 2 v15 c0 .6 .4 1 1 1 h2 c.6 0 1 -.4 1 -1 V5Z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 3
                moveTo(x = 4.0f, y = 3.0f)
                // L 2 5
                lineTo(x = 2.0f, y = 5.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // c 0 0.6 0.4 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.6f,
                    dx2 = 0.4f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.6 0 1 -0.4 1 -1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.4f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // V 5z
                verticalLineTo(y = 5.0f)
                close()
                // m 2 5
                moveToRelative(dx = 2.0f, dy = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 2 -15
                moveToRelative(dx = 2.0f, dy = -15.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // c 0 0.6 0.4 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.6f,
                    dx2 = 0.4f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.6 0 1 -0.4 1 -1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.4f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // V 5z
                verticalLineTo(y = 5.0f)
                close()
                // m 2 5
                moveToRelative(dx = 2.0f, dy = 5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 10
                moveToRelative(dx = -4.0f, dy = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 2 -15
                moveToRelative(dx = 2.0f, dy = -15.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // c 0 0.6 0.4 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.6f,
                    dx2 = 0.4f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.6 0 1 -0.4 1 -1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.4f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // V 5z
                verticalLineTo(y = 5.0f)
                close()
            }
        }.build().also { _fence = it }
    }

@Suppress("ObjectPropertyName")
private var _fence: ImageVector? = null
