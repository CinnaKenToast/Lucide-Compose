package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChessKnight: ImageVector
    get() {
        val current = _chessKnight
        if (current != null) return current

        return ImageVector.Builder(
            name = "ChessKnight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 20 a2 2 0 0 1 2 -2 h10 a2 2 0 0 1 2 2 v1 a1 1 0 0 1 -1 1 H6 a1 1 0 0 1 -1 -1z m11.5 -2 c1 -2 2.5 -5 2.5 -9 a7 7 0 0 0 -7 -7 H6.64 a1 1 0 0 0 -.77 1.64 L7 5 l-2.32 5.8 a2 2 0 0 0 .95 2.53 l2.87 1.45 M15 5 l1.43 -1.42 M17 8 l1.53 -1.53 m-8.82 5.72 L7 18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 20
                moveTo(x = 5.0f, y = 20.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
                // m 11.5 -2
                moveToRelative(dx = 11.5f, dy = -2.0f)
                // c 1 -2 2.5 -5 2.5 -9
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = -2.0f,
                    dx2 = 2.5f,
                    dy2 = -5.0f,
                    dx3 = 2.5f,
                    dy3 = -9.0f,
                )
                // a 7 7 0 0 0 -7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                // H 6.64
                horizontalLineTo(x = 6.64f)
                // a 1 1 0 0 0 -0.77 1.64
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.77f,
                    dy1 = 1.64f,
                )
                // L 7 5
                lineTo(x = 7.0f, y = 5.0f)
                // l -2.32 5.8
                lineToRelative(dx = -2.32f, dy = 5.8f)
                // a 2 2 0 0 0 0.95 2.53
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.95f,
                    dy1 = 2.53f,
                )
                // l 2.87 1.45
                lineToRelative(dx = 2.87f, dy = 1.45f)
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // l 1.43 -1.42
                lineToRelative(dx = 1.43f, dy = -1.42f)
                // M 17 8
                moveTo(x = 17.0f, y = 8.0f)
                // l 1.53 -1.53
                lineToRelative(dx = 1.53f, dy = -1.53f)
                // m -8.82 5.72
                moveToRelative(dx = -8.82f, dy = 5.72f)
                // L 7 18
                lineTo(x = 7.0f, y = 18.0f)
            }
        }.build().also { _chessKnight = it }
    }


@Suppress("ObjectPropertyName")
private var _chessKnight: ImageVector? = null
