package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PlayingCards: ImageVector
    get() {
        val current = _playingCards
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PlayingCards",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14.83 8.45 a1 1 0 0 0 -1.59 -.1 l-2.07 3.1 a1 1 0 0 0 0 1.1 l2 3 a1 1 0 0 0 1.66 0 l2 -3 a1 1 0 0 0 0 -1.1z M7.18 20.83 l-5 -11 a2 2 0 0 1 1 -2.65 L7 5.44
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.83 8.45
                moveTo(x = 14.83f, y = 8.45f)
                // a 1 1 0 0 0 -1.59 -0.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.59f,
                    dy1 = -0.1f,
                )
                // l -2.07 3.1
                lineToRelative(dx = -2.07f, dy = 3.1f)
                // a 1 1 0 0 0 0 1.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.1f,
                )
                // l 2 3
                lineToRelative(dx = 2.0f, dy = 3.0f)
                // a 1 1 0 0 0 1.66 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.66f,
                    dy1 = 0.0f,
                )
                // l 2 -3
                lineToRelative(dx = 2.0f, dy = -3.0f)
                // a 1 1 0 0 0 0 -1.1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                )
                close()
                // M 7.18 20.83
                moveTo(x = 7.18f, y = 20.83f)
                // l -5 -11
                lineToRelative(dx = -5.0f, dy = -11.0f)
                // a 2 2 0 0 1 1 -2.65
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -2.65f,
                )
                // L 7 5.44
                lineTo(x = 7.0f, y = 5.44f)
            }
            // <rect width="14" height="20" rx="2.0" x="7.0" y="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 4
                moveTo(x = 7.0f, y = 4.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // h -10
                horizontalLineToRelative(dx = -10.0f)
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
        }.build().also { _playingCards = it }
    }

@Suppress("ObjectPropertyName")
private var _playingCards: ImageVector? = null
