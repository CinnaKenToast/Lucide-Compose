package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Biohazard: ImageVector
    get() {
        val current = _biohazard
        if (current != null) return current

        return ImageVector.Builder(
            name = "Biohazard",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="11.9" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 11.9
                moveTo(x = 12.0f, y = 11.9f)
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
            // M6.7 3.4 a5.7 5.7 0 0 0 2.2 6.7 A5.8 5.8 0 0 0 2 11.6 m6.9 -1.5 1.4 .8 m7 -7.5 c.9 2.5 0 5.2 -2.2 6.7 2.4 -1.2 5.2 -.6 6.9 1.5 m-6.9 -1.5 -1.4 .8 m3 9.9 a5.56 5.56 0 0 1 -4.7 -5.3 5.64 5.64 0 0 1 -4.7 5.2 m4.7 -6.8 v1.6 m1.5 -10.1 q-1.5 -.3 -3 0 m6.5 11 c.7 -.7 1.2 -1.6 1.5 -2.5 m-13 0 c.3 .9 .8 1.8 1.5 2.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.7 3.4
                moveTo(x = 6.7f, y = 3.4f)
                // a 5.7 5.7 0 0 0 2.2 6.7
                arcToRelative(
                    a = 5.7f,
                    b = 5.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.2f,
                    dy1 = 6.7f,
                )
                // A 5.8 5.8 0 0 0 2 11.6
                arcTo(
                    horizontalEllipseRadius = 5.8f,
                    verticalEllipseRadius = 5.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 11.6f,
                )
                // m 6.9 -1.5
                moveToRelative(dx = 6.9f, dy = -1.5f)
                // l 1.4 0.8
                lineToRelative(dx = 1.4f, dy = 0.8f)
                // m 7 -7.5
                moveToRelative(dx = 7.0f, dy = -7.5f)
                // c 0.9 2.5 0 5.2 -2.2 6.7
                curveToRelative(
                    dx1 = 0.9f,
                    dy1 = 2.5f,
                    dx2 = 0.0f,
                    dy2 = 5.2f,
                    dx3 = -2.2f,
                    dy3 = 6.7f,
                )
                // c 2.4 -1.2 5.2 -0.6 6.9 1.5
                curveToRelative(
                    dx1 = 2.4f,
                    dy1 = -1.2f,
                    dx2 = 5.2f,
                    dy2 = -0.6f,
                    dx3 = 6.9f,
                    dy3 = 1.5f,
                )
                // m -6.9 -1.5
                moveToRelative(dx = -6.9f, dy = -1.5f)
                // l -1.4 0.8
                lineToRelative(dx = -1.4f, dy = 0.8f)
                // m 3 9.9
                moveToRelative(dx = 3.0f, dy = 9.9f)
                // a 5.56 5.56 0 0 1 -4.7 -5.3
                arcToRelative(
                    a = 5.56f,
                    b = 5.56f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.7f,
                    dy1 = -5.3f,
                )
                // a 5.64 5.64 0 0 1 -4.7 5.2
                arcToRelative(
                    a = 5.64f,
                    b = 5.64f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.7f,
                    dy1 = 5.2f,
                )
                // m 4.7 -6.8
                moveToRelative(dx = 4.7f, dy = -6.8f)
                // v 1.6
                verticalLineToRelative(dy = 1.6f)
                // m 1.5 -10.1
                moveToRelative(dx = 1.5f, dy = -10.1f)
                // q -1.5 -0.3 -3 0
                quadToRelative(
                    dx1 = -1.5f,
                    dy1 = -0.3f,
                    dx2 = -3.0f,
                    dy2 = 0.0f,
                )
                // m 6.5 11
                moveToRelative(dx = 6.5f, dy = 11.0f)
                // c 0.7 -0.7 1.2 -1.6 1.5 -2.5
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = -0.7f,
                    dx2 = 1.2f,
                    dy2 = -1.6f,
                    dx3 = 1.5f,
                    dy3 = -2.5f,
                )
                // m -13 0
                moveToRelative(dx = -13.0f, dy = 0.0f)
                // c 0.3 0.9 0.8 1.8 1.5 2.5
                curveToRelative(
                    dx1 = 0.3f,
                    dy1 = 0.9f,
                    dx2 = 0.8f,
                    dy2 = 1.8f,
                    dx3 = 1.5f,
                    dy3 = 2.5f,
                )
            }
        }.build().also { _biohazard = it }
    }


@Suppress("ObjectPropertyName")
private var _biohazard: ImageVector? = null
