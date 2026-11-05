package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Wrench: ImageVector
    get() {
        val current = _wrench
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Wrench",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14.7 6.3 a1 1 0 0 0 0 1.4 l1.6 1.6 a1 1 0 0 0 1.4 0 l3.1 -3.1 c.33 -.33 .87 -.23 .99 .21 a6 6 0 0 1 -8.26 7.06 l-7.91 7.91 a1 1 0 0 1 -3 -3 l7.91 -7.91 a6 6 0 0 1 7.06 -8.26 c.44 .12 .54 .66 .22 .98z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.7 6.3
                moveTo(x = 14.7f, y = 6.3f)
                // a 1 1 0 0 0 0 1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.4f,
                )
                // l 1.6 1.6
                lineToRelative(dx = 1.6f, dy = 1.6f)
                // a 1 1 0 0 0 1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 3.1 -3.1
                lineToRelative(dx = 3.1f, dy = -3.1f)
                // c 0.33 -0.33 0.87 -0.23 0.99 0.21
                curveToRelative(
                    dx1 = 0.33f,
                    dy1 = -0.33f,
                    dx2 = 0.87f,
                    dy2 = -0.23f,
                    dx3 = 0.99f,
                    dy3 = 0.21f,
                )
                // a 6 6 0 0 1 -8.26 7.06
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.26f,
                    dy1 = 7.06f,
                )
                // l -7.91 7.91
                lineToRelative(dx = -7.91f, dy = 7.91f)
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
                // l 7.91 -7.91
                lineToRelative(dx = 7.91f, dy = -7.91f)
                // a 6 6 0 0 1 7.06 -8.26
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.06f,
                    dy1 = -8.26f,
                )
                // c 0.44 0.12 0.54 0.66 0.22 0.98z
                curveToRelative(
                    dx1 = 0.44f,
                    dy1 = 0.12f,
                    dx2 = 0.54f,
                    dy2 = 0.66f,
                    dx3 = 0.22f,
                    dy3 = 0.98f,
                )
                close()
            }
        }.build().also { _wrench = it }
    }

@Suppress("ObjectPropertyName")
private var _wrench: ImageVector? = null
