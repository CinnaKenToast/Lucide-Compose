package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserRoundX: ImageVector
    get() {
        val current = _userRoundX
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.UserRoundX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m16.5 16.5 5 5 M2 21 a8 8 0 0 1 11.53 -7.18 m7.97 2.68 -5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.5 16.5
                moveTo(x = 16.5f, y = 16.5f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // a 8 8 0 0 1 11.53 -7.18
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 11.53f,
                    dy1 = -7.18f,
                )
                // m 7.97 2.68
                moveToRelative(dx = 7.97f, dy = 2.68f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
            }
            // <circle cx="10.0" cy="8.0" radius="5.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 8
                moveTo(x = 10.0f, y = 8.0f)
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
        }.build().also { _userRoundX = it }
    }

@Suppress("ObjectPropertyName")
private var _userRoundX: ImageVector? = null
