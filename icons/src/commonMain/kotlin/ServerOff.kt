package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ServerOff: ImageVector
    get() {
        val current = _serverOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "ServerOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7 2 h13 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 h-5 m-5 0 L2.5 2.5 C2 2 2 2.5 2 5 v3 a2 2 0 0 0 2 2z m12 7 v-1 a2 2 0 0 0 -2 -2 h-1 M4 14 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h16.5 l1 -.5 L22 22 l-8 -8z m2 4z M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 2
                moveTo(x = 7.0f, y = 2.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // L 2.5 2.5
                lineTo(x = 2.5f, y = 2.5f)
                // C 2 2 2 2.5 2 5
                curveTo(
                    x1 = 2.0f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 2.5f,
                    x3 = 2.0f,
                    y3 = 5.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 2 2 0 0 0 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
                // m 12 7
                moveToRelative(dx = 12.0f, dy = 7.0f)
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
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // M 4 14
                moveTo(x = 4.0f, y = 14.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 16.5
                horizontalLineToRelative(dx = 16.5f)
                // l 1 -0.5
                lineToRelative(dx = 1.0f, dy = -0.5f)
                // L 22 22
                lineTo(x = 22.0f, y = 22.0f)
                // l -8 -8z
                lineToRelative(dx = -8.0f, dy = -8.0f)
                close()
                // m 2 4z
                moveToRelative(dx = 2.0f, dy = 4.0f)
                close()
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _serverOff = it }
    }


@Suppress("ObjectPropertyName")
private var _serverOff: ImageVector? = null
