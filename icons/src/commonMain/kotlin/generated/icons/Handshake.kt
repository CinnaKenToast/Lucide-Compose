package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Handshake: ImageVector
    get() {
        val current = _handshake
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Handshake",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m11 17 2 2 a1 1 0 1 0 3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 17
                moveTo(x = 11.0f, y = 17.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // a 1 1 0 1 0 3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
            }
            // m14 14 2.5 2.5 a1 1 0 1 0 3 -3 l-3.88 -3.88 a3 3 0 0 0 -4.24 0 L10.5 10.5 a1 1 0 1 1 -3 -3 l2.81 -2.81 a5.8 5.8 0 0 1 7.06 -.87 l.47 .28 a2 2 0 0 0 1.42 .25 L21 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 14
                moveTo(x = 14.0f, y = 14.0f)
                // l 2.5 2.5
                lineToRelative(dx = 2.5f, dy = 2.5f)
                // a 1 1 0 1 0 3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // l -3.88 -3.88
                lineToRelative(dx = -3.88f, dy = -3.88f)
                // a 3 3 0 0 0 -4.24 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.24f,
                    dy1 = 0.0f,
                )
                // L 10.5 10.5
                lineTo(x = 10.5f, y = 10.5f)
                // a 1 1 0 1 1 -3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // l 2.81 -2.81
                lineToRelative(dx = 2.81f, dy = -2.81f)
                // a 5.8 5.8 0 0 1 7.06 -0.87
                arcToRelative(
                    a = 5.8f,
                    b = 5.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.06f,
                    dy1 = -0.87f,
                )
                // l 0.47 0.28
                lineToRelative(dx = 0.47f, dy = 0.28f)
                // a 2 2 0 0 0 1.42 0.25
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 0.25f,
                )
                // L 21 4
                lineTo(x = 21.0f, y = 4.0f)
            }
            // m21 3 1 11 h-2 M3 3 2 14 l6.5 6.5 a1 1 0 1 0 3 -3 M3 4 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 3
                moveTo(x = 21.0f, y = 3.0f)
                // l 1 11
                lineToRelative(dx = 1.0f, dy = 11.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // L 2 14
                lineTo(x = 2.0f, y = 14.0f)
                // l 6.5 6.5
                lineToRelative(dx = 6.5f, dy = 6.5f)
                // a 1 1 0 1 0 3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // M 3 4
                moveTo(x = 3.0f, y = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _handshake = it }
    }

@Suppress("ObjectPropertyName")
private var _handshake: ImageVector? = null
