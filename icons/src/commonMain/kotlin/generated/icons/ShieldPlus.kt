package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ShieldPlus: ImageVector
    get() {
        val current = _shieldPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ShieldPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M20 13 c0 5 -3.5 7.5 -7.66 8.95 a1 1 0 0 1 -.67 -.01 C7.5 20.5 4 18 4 13 V6 a1 1 0 0 1 1 -1 c2 0 4.5 -1.2 6.24 -2.72 a1.2 1.2 0 0 1 1.52 0 C14.51 3.81 17 5 19 5 a1 1 0 0 1 1 1z M9 12 h6 m-3 -3 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 13
                moveTo(x = 20.0f, y = 13.0f)
                // c 0 5 -3.5 7.5 -7.66 8.95
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                    dx2 = -3.5f,
                    dy2 = 7.5f,
                    dx3 = -7.66f,
                    dy3 = 8.95f,
                )
                // a 1 1 0 0 1 -0.67 -0.01
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.67f,
                    dy1 = -0.01f,
                )
                // C 7.5 20.5 4 18 4 13
                curveTo(
                    x1 = 7.5f,
                    y1 = 20.5f,
                    x2 = 4.0f,
                    y2 = 18.0f,
                    x3 = 4.0f,
                    y3 = 13.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // c 2 0 4.5 -1.2 6.24 -2.72
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 4.5f,
                    dy2 = -1.2f,
                    dx3 = 6.24f,
                    dy3 = -2.72f,
                )
                // a 1.2 1.2 0 0 1 1.52 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.52f,
                    dy1 = 0.0f,
                )
                // C 14.51 3.81 17 5 19 5
                curveTo(
                    x1 = 14.51f,
                    y1 = 3.81f,
                    x2 = 17.0f,
                    y2 = 5.0f,
                    x3 = 19.0f,
                    y3 = 5.0f,
                )
                // a 1 1 0 0 1 1 1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                close()
                // M 9 12
                moveTo(x = 9.0f, y = 12.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 -3
                moveToRelative(dx = -3.0f, dy = -3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _shieldPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _shieldPlus: ImageVector? = null
