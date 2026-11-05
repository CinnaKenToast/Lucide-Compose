package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pointer: ImageVector
    get() {
        val current = _pointer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Pointer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 14 a8 8 0 0 1 -8 8 m4 -11 v-1 a2 2 0 0 0 -2 -2 2 2 0 0 0 -2 2 m0 0 V9 a2 2 0 0 0 -2 -2 2 2 0 0 0 -2 2 v1 m0 -.5 V4 a2 2 0 0 0 -2 -2 2 2 0 0 0 -2 2 v10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 14
                moveTo(x = 22.0f, y = 14.0f)
                // a 8 8 0 0 1 -8 8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 8.0f,
                )
                // m 4 -11
                moveToRelative(dx = 4.0f, dy = -11.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 -0.5
                moveToRelative(dx = 0.0f, dy = -0.5f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
            }
            // M18 11 a2 2 0 1 1 4 0 v3 a8 8 0 0 1 -8 8 h-2 c-2.8 0 -4.5 -.86 -5.99 -2.34 l-3.6 -3.6 a2 2 0 0 1 2.83 -2.82 L7 15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 11
                moveTo(x = 18.0f, y = 11.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 8 8 0 0 1 -8 8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 8.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -2.8 0 -4.5 -0.86 -5.99 -2.34
                curveToRelative(
                    dx1 = -2.8f,
                    dy1 = 0.0f,
                    dx2 = -4.5f,
                    dy2 = -0.86f,
                    dx3 = -5.99f,
                    dy3 = -2.34f,
                )
                // l -3.6 -3.6
                lineToRelative(dx = -3.6f, dy = -3.6f)
                // a 2 2 0 0 1 2.83 -2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.83f,
                    dy1 = -2.82f,
                )
                // L 7 15
                lineTo(x = 7.0f, y = 15.0f)
            }
        }.build().also { _pointer = it }
    }

@Suppress("ObjectPropertyName")
private var _pointer: ImageVector? = null
