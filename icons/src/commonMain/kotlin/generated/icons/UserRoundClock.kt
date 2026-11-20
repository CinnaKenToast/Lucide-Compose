package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserRoundClock: ImageVector
    get() {
        val current = _userRoundClock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.UserRoundClock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 15.5 v1.7 l1 .63 M2 21 a8 8 0 0 1 6.9 -7.92 m.09 -.18 a5 5 0 1 1 6 -4.68
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 15.5
                moveTo(x = 17.0f, y = 15.5f)
                // v 1.7
                verticalLineToRelative(dy = 1.7f)
                // l 1 0.63
                lineToRelative(dx = 1.0f, dy = 0.63f)
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // a 8 8 0 0 1 6.9 -7.92
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.9f,
                    dy1 = -7.92f,
                )
                // m 0.09 -0.18
                moveToRelative(dx = 0.09f, dy = -0.18f)
                // a 5 5 0 1 1 6 -4.68
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = -4.68f,
                )
            }
            // <circle cx="17.0" cy="17.0" radius="5.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 17
                moveTo(x = 17.0f, y = 17.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _userRoundClock = it }
    }

@Suppress("ObjectPropertyName")
private var _userRoundClock: ImageVector? = null
