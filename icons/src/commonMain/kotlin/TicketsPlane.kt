package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TicketsPlane: ImageVector
    get() {
        val current = _ticketsPlane
        if (current != null) return current

        return ImageVector.Builder(
            name = "TicketsPlane",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.5 17 h1.23 a2 2 0 0 0 1.34 -.52 L18 12 m-6 1.5 3.8 .5 M3.16 8.19 l11 -5 a2 2 0 0 1 2.65 1 L18.56 8 M6 10 V8 m0 6 v1 m0 4 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.5 17
                moveTo(x = 10.5f, y = 17.0f)
                // h 1.23
                horizontalLineToRelative(dx = 1.23f)
                // a 2 2 0 0 0 1.34 -0.52
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.34f,
                    dy1 = -0.52f,
                )
                // L 18 12
                lineTo(x = 18.0f, y = 12.0f)
                // m -6 1.5
                moveToRelative(dx = -6.0f, dy = 1.5f)
                // l 3.8 0.5
                lineToRelative(dx = 3.8f, dy = 0.5f)
                // M 3.16 8.19
                moveTo(x = 3.16f, y = 8.19f)
                // l 11 -5
                lineToRelative(dx = 11.0f, dy = -5.0f)
                // a 2 2 0 0 1 2.65 1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.65f,
                    dy1 = 1.0f,
                )
                // L 18.56 8
                lineTo(x = 18.56f, y = 8.0f)
                // M 6 10
                moveTo(x = 6.0f, y = 10.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
            // <rect width="20" height="13" rx="2.0" x="2.0" y="8.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 9
                verticalLineToRelative(dy = 9.0f)
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
                // h -16
                horizontalLineToRelative(dx = -16.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _ticketsPlane = it }
    }


@Suppress("ObjectPropertyName")
private var _ticketsPlane: ImageVector? = null
