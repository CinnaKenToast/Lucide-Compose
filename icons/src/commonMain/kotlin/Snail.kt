package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Snail: ImageVector
    get() {
        val current = _snail
        if (current != null) return current

        return ImageVector.Builder(
            name = "Snail",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 13 a6 6 0 1 0 12 0 4 4 0 1 0 -8 0 2 2 0 0 0 4 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 13
                moveTo(x = 2.0f, y = 13.0f)
                // a 6 6 0 1 0 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 0 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
            }
            // <circle cx="10.0" cy="13.0" radius="8.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 8 8 0 1 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // a 8 8 0 1 1 -16 0z
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M2 21 h12 c4.4 0 8 -3.6 8 -8 V7 a2 2 0 1 0 -4 0 v6 m0 -10 1.1 2.2 M22 3 l-1.1 2.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // c 4.4 0 8 -3.6 8 -8
                curveToRelative(
                    dx1 = 4.4f,
                    dy1 = 0.0f,
                    dx2 = 8.0f,
                    dy2 = -3.6f,
                    dx3 = 8.0f,
                    dy3 = -8.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 2 2 0 1 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 0 -10
                moveToRelative(dx = 0.0f, dy = -10.0f)
                // l 1.1 2.2
                lineToRelative(dx = 1.1f, dy = 2.2f)
                // M 22 3
                moveTo(x = 22.0f, y = 3.0f)
                // l -1.1 2.2
                lineToRelative(dx = -1.1f, dy = 2.2f)
            }
        }.build().also { _snail = it }
    }


@Suppress("ObjectPropertyName")
private var _snail: ImageVector? = null
