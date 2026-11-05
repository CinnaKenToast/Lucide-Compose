package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Footprints: ImageVector
    get() {
        val current = _footprints
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Footprints",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 16 v-2.38 C4 11.5 2.97 10.5 3 8 c.03 -2.72 1.49 -6 4.5 -6 C9.37 2 10 3.8 10 5.5 c0 3.11 -2 5.66 -2 8.68 V16 a2 2 0 1 1 -4 0 m16 4 v-2.38 c0 -2.12 1.03 -3.12 1 -5.62 -.03 -2.72 -1.49 -6 -4.5 -6 C14.63 6 14 7.8 14 9.5 c0 3.11 2 5.66 2 8.68 V20 a2 2 0 1 0 4 0 m-4 -3 h4 M4 13 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 16
                moveTo(x = 4.0f, y = 16.0f)
                // v -2.38
                verticalLineToRelative(dy = -2.38f)
                // C 4 11.5 2.97 10.5 3 8
                curveTo(
                    x1 = 4.0f,
                    y1 = 11.5f,
                    x2 = 2.97f,
                    y2 = 10.5f,
                    x3 = 3.0f,
                    y3 = 8.0f,
                )
                // c 0.03 -2.72 1.49 -6 4.5 -6
                curveToRelative(
                    dx1 = 0.03f,
                    dy1 = -2.72f,
                    dx2 = 1.49f,
                    dy2 = -6.0f,
                    dx3 = 4.5f,
                    dy3 = -6.0f,
                )
                // C 9.37 2 10 3.8 10 5.5
                curveTo(
                    x1 = 9.37f,
                    y1 = 2.0f,
                    x2 = 10.0f,
                    y2 = 3.8f,
                    x3 = 10.0f,
                    y3 = 5.5f,
                )
                // c 0 3.11 -2 5.66 -2 8.68
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.11f,
                    dx2 = -2.0f,
                    dy2 = 5.66f,
                    dx3 = -2.0f,
                    dy3 = 8.68f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // m 16 4
                moveToRelative(dx = 16.0f, dy = 4.0f)
                // v -2.38
                verticalLineToRelative(dy = -2.38f)
                // c 0 -2.12 1.03 -3.12 1 -5.62
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.12f,
                    dx2 = 1.03f,
                    dy2 = -3.12f,
                    dx3 = 1.0f,
                    dy3 = -5.62f,
                )
                // c -0.03 -2.72 -1.49 -6 -4.5 -6
                curveToRelative(
                    dx1 = -0.03f,
                    dy1 = -2.72f,
                    dx2 = -1.49f,
                    dy2 = -6.0f,
                    dx3 = -4.5f,
                    dy3 = -6.0f,
                )
                // C 14.63 6 14 7.8 14 9.5
                curveTo(
                    x1 = 14.63f,
                    y1 = 6.0f,
                    x2 = 14.0f,
                    y2 = 7.8f,
                    x3 = 14.0f,
                    y3 = 9.5f,
                )
                // c 0 3.11 2 5.66 2 8.68
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.11f,
                    dx2 = 2.0f,
                    dy2 = 5.66f,
                    dx3 = 2.0f,
                    dy3 = 8.68f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // a 2 2 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // m -4 -3
                moveToRelative(dx = -4.0f, dy = -3.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // M 4 13
                moveTo(x = 4.0f, y = 13.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _footprints = it }
    }

@Suppress("ObjectPropertyName")
private var _footprints: ImageVector? = null
