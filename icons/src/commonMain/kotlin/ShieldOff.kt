package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShieldOff: ImageVector
    get() {
        val current = _shieldOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "ShieldOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 2 20 20 M5 5 a1 1 0 0 0 -1 1 v7 c0 5 3.5 7.5 7.67 8.94 a1 1 0 0 0 .67 .01 c2.35 -.82 4.48 -1.97 5.9 -3.71 M9.31 3.65 a12 12 0 0 0 1.93 -1.37 1.2 1.2 0 0 1 1.52 0 C14.51 3.81 17 5 19 5 a1 1 0 0 1 1 1 v7 a10 10 0 0 1 -.08 1.26
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 5 5
                moveTo(x = 5.0f, y = 5.0f)
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
                // c 0 5 3.5 7.5 7.67 8.94
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                    dx2 = 3.5f,
                    dy2 = 7.5f,
                    dx3 = 7.67f,
                    dy3 = 8.94f,
                )
                // a 1 1 0 0 0 0.67 0.01
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.67f,
                    dy1 = 0.01f,
                )
                // c 2.35 -0.82 4.48 -1.97 5.9 -3.71
                curveToRelative(
                    dx1 = 2.35f,
                    dy1 = -0.82f,
                    dx2 = 4.48f,
                    dy2 = -1.97f,
                    dx3 = 5.9f,
                    dy3 = -3.71f,
                )
                // M 9.31 3.65
                moveTo(x = 9.31f, y = 3.65f)
                // a 12 12 0 0 0 1.93 -1.37
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.93f,
                    dy1 = -1.37f,
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
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // a 10 10 0 0 1 -0.08 1.26
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.08f,
                    dy1 = 1.26f,
                )
            }
        }.build().also { _shieldOff = it }
    }


@Suppress("ObjectPropertyName")
private var _shieldOff: ImageVector? = null
