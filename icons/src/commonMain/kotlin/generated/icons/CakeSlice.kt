package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CakeSlice: ImageVector
    get() {
        val current = _cakeSlice
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CakeSlice",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 13 H3 m13 4 H3 m4.2 -9.1 -3.39 2.5 A2 2 0 0 0 3 12.01 V20 a1 1 0 0 0 1 1 h16 a1 1 0 0 0 1 -1 v-8.65 c0 -2 -2.44 -6.03 -6.44 -8.03 a1 1 0 0 0 -1.08 .06 L10.4 5.6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 13
                moveTo(x = 16.0f, y = 13.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 13 4
                moveToRelative(dx = 13.0f, dy = 4.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 4.2 -9.1
                moveToRelative(dx = 4.2f, dy = -9.1f)
                // l -3.39 2.5
                lineToRelative(dx = -3.39f, dy = 2.5f)
                // A 2 2 0 0 0 3 12.01
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 12.01f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -8.65
                verticalLineToRelative(dy = -8.65f)
                // c 0 -2 -2.44 -6.03 -6.44 -8.03
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -2.44f,
                    dy2 = -6.03f,
                    dx3 = -6.44f,
                    dy3 = -8.03f,
                )
                // a 1 1 0 0 0 -1.08 0.06
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.08f,
                    dy1 = 0.06f,
                )
                // L 10.4 5.6
                lineTo(x = 10.4f, y = 5.6f)
            }
            // <circle cx="9.0" cy="7.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 7
                moveTo(x = 9.0f, y = 7.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
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
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _cakeSlice = it }
    }

@Suppress("ObjectPropertyName")
private var _cakeSlice: ImageVector? = null
