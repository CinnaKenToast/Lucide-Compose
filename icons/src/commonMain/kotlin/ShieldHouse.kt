package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShieldHouse: ImageVector
    get() {
        val current = _shieldHouse
        if (current != null) return current

        return ImageVector.Builder(
            name = "ShieldHouse",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 22 a1 1 0 0 1 -1 -1 v-4 a1 1 0 0 1 .45 -.83 l3 -2 a1 1 0 0 1 1.1 0 l3 2 A1 1 0 0 1 22 17 v4 a1 1 0 0 1 -1 1z m3 0 v-3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 22
                moveTo(x = 15.0f, y = 22.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // a 1 1 0 0 1 0.45 -0.83
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.45f,
                    dy1 = -0.83f,
                )
                // l 3 -2
                lineToRelative(dx = 3.0f, dy = -2.0f)
                // a 1 1 0 0 1 1.1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                )
                // l 3 2
                lineToRelative(dx = 3.0f, dy = 2.0f)
                // A 1 1 0 0 1 22 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 17.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 1 1 0 0 1 -1 1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                close()
                // m 3 0
                moveToRelative(dx = 3.0f, dy = 0.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
            }
            // M20 10.42 V6 a1 1 0 0 0 -1 -1 c-2 0 -4.49 -1.19 -6.24 -2.72 a1.2 1.2 0 0 0 -1.52 0 C9.5 3.8 7 5 5 5 a1 1 0 0 0 -1 1 v7 c0 4.6 2.67 7.1 6.04 8.6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 10.42
                moveTo(x = 20.0f, y = 10.42f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // c -2 0 -4.49 -1.19 -6.24 -2.72
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -4.49f,
                    dy2 = -1.19f,
                    dx3 = -6.24f,
                    dy3 = -2.72f,
                )
                // a 1.2 1.2 0 0 0 -1.52 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.52f,
                    dy1 = 0.0f,
                )
                // C 9.5 3.8 7 5 5 5
                curveTo(
                    x1 = 9.5f,
                    y1 = 3.8f,
                    x2 = 7.0f,
                    y2 = 5.0f,
                    x3 = 5.0f,
                    y3 = 5.0f,
                )
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // c 0 4.6 2.67 7.1 6.04 8.6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.6f,
                    dx2 = 2.67f,
                    dy2 = 7.1f,
                    dx3 = 6.04f,
                    dy3 = 8.6f,
                )
            }
        }.build().also { _shieldHouse = it }
    }


@Suppress("ObjectPropertyName")
private var _shieldHouse: ImageVector? = null
