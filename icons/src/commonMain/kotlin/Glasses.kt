package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Glasses: ImageVector
    get() {
        val current = _glasses
        if (current != null) return current

        return ImageVector.Builder(
            name = "Glasses",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="6.0" cy="15.0" radius="4.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 15
                moveTo(x = 6.0f, y = 15.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="18.0" cy="15.0" radius="4.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 15
                moveTo(x = 18.0f, y = 15.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M14 15 a2 2 0 0 0 -2 -2 2 2 0 0 0 -2 2 m-7.5 -2 L5 7 c.7 -1.3 1.4 -2 3 -2 m13.5 8 L19 7 c-.7 -1.3 -1.5 -2 -3 -2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 15
                moveTo(x = 14.0f, y = 15.0f)
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
                // m -7.5 -2
                moveToRelative(dx = -7.5f, dy = -2.0f)
                // L 5 7
                lineTo(x = 5.0f, y = 7.0f)
                // c 0.7 -1.3 1.4 -2 3 -2
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = -1.3f,
                    dx2 = 1.4f,
                    dy2 = -2.0f,
                    dx3 = 3.0f,
                    dy3 = -2.0f,
                )
                // m 13.5 8
                moveToRelative(dx = 13.5f, dy = 8.0f)
                // L 19 7
                lineTo(x = 19.0f, y = 7.0f)
                // c -0.7 -1.3 -1.5 -2 -3 -2
                curveToRelative(
                    dx1 = -0.7f,
                    dy1 = -1.3f,
                    dx2 = -1.5f,
                    dy2 = -2.0f,
                    dx3 = -3.0f,
                    dy3 = -2.0f,
                )
            }
        }.build().also { _glasses = it }
    }


@Suppress("ObjectPropertyName")
private var _glasses: ImageVector? = null
