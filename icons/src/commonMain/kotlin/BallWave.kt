package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BallWave: ImageVector
    get() {
        val current = _ballWave
        if (current != null) return current

        return ImageVector.Builder(
            name = "BallWave",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 20 c.6 .5 1.2 1 2.5 1 2.5 0 2.5 -2 5 -2 2.6 0 2.4 2 5 2 2.5 0 2.5 -2 5 -2 1.3 0 1.9 .5 2.5 1 M7.76 13.24 a2 6 45 1 0 8.48 -8.48 2 6 45 1 0 -8.48 8.48
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 20
                moveTo(x = 2.0f, y = 20.0f)
                // c 0.6 0.5 1.2 1 2.5 1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.5f,
                    dx2 = 1.2f,
                    dy2 = 1.0f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 2.6 0 2.4 2 5 2
                curveToRelative(
                    dx1 = 2.6f,
                    dy1 = 0.0f,
                    dx2 = 2.4f,
                    dy2 = 2.0f,
                    dx3 = 5.0f,
                    dy3 = 2.0f,
                )
                // c 2.5 0 2.5 -2 5 -2
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = -2.0f,
                    dx3 = 5.0f,
                    dy3 = -2.0f,
                )
                // c 1.3 0 1.9 0.5 2.5 1
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = 0.5f,
                    dx3 = 2.5f,
                    dy3 = 1.0f,
                )
                // M 7.76 13.24
                moveTo(x = 7.76f, y = 13.24f)
                // a 2 6 45 1 0 8.48 -8.48
                arcToRelative(
                    a = 2.0f,
                    b = 6.0f,
                    theta = 45.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.48f,
                    dy1 = -8.48f,
                )
                // a 2 6 45 1 0 -8.48 8.48
                arcToRelative(
                    a = 2.0f,
                    b = 6.0f,
                    theta = 45.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.48f,
                    dy1 = 8.48f,
                )
            }
            // <circle cx="12.0" cy="9.0" radius="6.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 9
                moveTo(x = 12.0f, y = 9.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // a 6 6 0 1 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // a 6 6 0 1 1 -12 0z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _ballWave = it }
    }


@Suppress("ObjectPropertyName")
private var _ballWave: ImageVector? = null
