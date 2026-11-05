package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Turtle: ImageVector
    get() {
        val current = _turtle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Turtle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12 10 2 4 v3 a1 1 0 0 0 1 1 h2 a1 1 0 0 0 1 -1 v-3 a8 8 0 1 0 -16 0 v3 a1 1 0 0 0 1 1 h2 a1 1 0 0 0 1 -1 v-3 l2 -4z M4.82 7.9 8 10 m7.18 -2.1 L12 10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // l 2 4
                lineToRelative(dx = 2.0f, dy = 4.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 8 8 0 1 0 -16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // l 2 -4z
                lineToRelative(dx = 2.0f, dy = -4.0f)
                close()
                // M 4.82 7.9
                moveTo(x = 4.82f, y = 7.9f)
                // L 8 10
                lineTo(x = 8.0f, y = 10.0f)
                // m 7.18 -2.1
                moveToRelative(dx = 7.18f, dy = -2.1f)
                // L 12 10
                lineTo(x = 12.0f, y = 10.0f)
            }
            // M16.93 10 H20 a2 2 0 0 1 0 4 H2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.93 10
                moveTo(x = 16.93f, y = 10.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _turtle = it }
    }

@Suppress("ObjectPropertyName")
private var _turtle: ImageVector? = null
