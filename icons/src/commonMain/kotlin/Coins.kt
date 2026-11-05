package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Coins: ImageVector
    get() {
        val current = _coins
        if (current != null) return current

        return ImageVector.Builder(
            name = "Coins",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.74 17.74 a6 6 0 1 1 -7.48 -7.48 M15 6 h1 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.74 17.74
                moveTo(x = 13.74f, y = 17.74f)
                // a 6 6 0 1 1 -7.48 -7.48
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.48f,
                    dy1 = -7.48f,
                )
                // M 15 6
                moveTo(x = 15.0f, y = 6.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
            // M6.13 14.77 7 14.27 l2 3.46
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.13 14.77
                moveTo(x = 6.13f, y = 14.77f)
                // L 7 14.27
                lineTo(x = 7.0f, y = 14.27f)
                // l 2 3.46
                lineToRelative(dx = 2.0f, dy = 3.46f)
            }
            // <circle cx="16.0" cy="8.0" radius="6.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
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
        }.build().also { _coins = it }
    }


@Suppress("ObjectPropertyName")
private var _coins: ImageVector? = null
