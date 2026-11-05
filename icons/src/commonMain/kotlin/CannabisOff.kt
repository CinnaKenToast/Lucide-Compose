package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CannabisOff: ImageVector
    get() {
        val current = _cannabisOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "CannabisOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 v-4 c1.5 1.5 3.5 3 6 3 0 -1.5 -.5 -3.5 -2 -5 m-2.01 -7.67 A11 11 0 0 0 12 2 a9 9 0 0 0 -1.44 2.9 m6.82 6.82 C18.88 10.54 21 7.85 21 6 c-2.32 0 -5.08 1.3 -6.66 2.68 M2 2 l20 20 m-.98 -6.62 L22 15 c-.43 -1.28 -2.67 -2.56 -4.25 -2.9 M7 7 a10 10 0 0 0 -4 -1 c0 2 2.5 5 4 6 -1.5 0 -4.5 1.5 -5 3 3.5 1.5 6 1 6 1 -1.5 1.5 -2 3.5 -2 5 2.5 0 4.5 -1.5 6 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // c 1.5 1.5 3.5 3 6 3
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = 1.5f,
                    dx2 = 3.5f,
                    dy2 = 3.0f,
                    dx3 = 6.0f,
                    dy3 = 3.0f,
                )
                // c 0 -1.5 -0.5 -3.5 -2 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.5f,
                    dx2 = -0.5f,
                    dy2 = -3.5f,
                    dx3 = -2.0f,
                    dy3 = -5.0f,
                )
                // m -2.01 -7.67
                moveToRelative(dx = -2.01f, dy = -7.67f)
                // A 11 11 0 0 0 12 2
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 2.0f,
                )
                // a 9 9 0 0 0 -1.44 2.9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.44f,
                    dy1 = 2.9f,
                )
                // m 6.82 6.82
                moveToRelative(dx = 6.82f, dy = 6.82f)
                // C 18.88 10.54 21 7.85 21 6
                curveTo(
                    x1 = 18.88f,
                    y1 = 10.54f,
                    x2 = 21.0f,
                    y2 = 7.85f,
                    x3 = 21.0f,
                    y3 = 6.0f,
                )
                // c -2.32 0 -5.08 1.3 -6.66 2.68
                curveToRelative(
                    dx1 = -2.32f,
                    dy1 = 0.0f,
                    dx2 = -5.08f,
                    dy2 = 1.3f,
                    dx3 = -6.66f,
                    dy3 = 2.68f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m -0.98 -6.62
                moveToRelative(dx = -0.98f, dy = -6.62f)
                // L 22 15
                lineTo(x = 22.0f, y = 15.0f)
                // c -0.43 -1.28 -2.67 -2.56 -4.25 -2.9
                curveToRelative(
                    dx1 = -0.43f,
                    dy1 = -1.28f,
                    dx2 = -2.67f,
                    dy2 = -2.56f,
                    dx3 = -4.25f,
                    dy3 = -2.9f,
                )
                // M 7 7
                moveTo(x = 7.0f, y = 7.0f)
                // a 10 10 0 0 0 -4 -1
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -1.0f,
                )
                // c 0 2 2.5 5 4 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.5f,
                    dy2 = 5.0f,
                    dx3 = 4.0f,
                    dy3 = 6.0f,
                )
                // c -1.5 0 -4.5 1.5 -5 3
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.0f,
                    dx2 = -4.5f,
                    dy2 = 1.5f,
                    dx3 = -5.0f,
                    dy3 = 3.0f,
                )
                // c 3.5 1.5 6 1 6 1
                curveToRelative(
                    dx1 = 3.5f,
                    dy1 = 1.5f,
                    dx2 = 6.0f,
                    dy2 = 1.0f,
                    dx3 = 6.0f,
                    dy3 = 1.0f,
                )
                // c -1.5 1.5 -2 3.5 -2 5
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 1.5f,
                    dx2 = -2.0f,
                    dy2 = 3.5f,
                    dx3 = -2.0f,
                    dy3 = 5.0f,
                )
                // c 2.5 0 4.5 -1.5 6 -3
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 4.5f,
                    dy2 = -1.5f,
                    dx3 = 6.0f,
                    dy3 = -3.0f,
                )
            }
        }.build().also { _cannabisOff = it }
    }


@Suppress("ObjectPropertyName")
private var _cannabisOff: ImageVector? = null
