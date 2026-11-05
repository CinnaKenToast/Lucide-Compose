package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChessKing: ImageVector
    get() {
        val current = _chessKing
        if (current != null) return current

        return ImageVector.Builder(
            name = "ChessKing",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 20 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2 v1 a1 1 0 0 1 -1 1 H5 a1 1 0 0 1 -1 -1z m2.7 -2 -1 -1 C4.35 15.68 3 14.09 3 12 a5 5 0 0 1 4.95 -5 c1.58 0 2.7 .46 4.05 1.82 C13.35 7.45 14.47 7 16.05 7 A5 5 0 0 1 21 12 c0 2.08 -1.36 3.67 -2.7 5 l-1 1 M10 4 h4 m-2 -2 v6.82
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // m 2.7 -2
                moveToRelative(dx = 2.7f, dy = -2.0f)
                // l -1 -1
                lineToRelative(dx = -1.0f, dy = -1.0f)
                // C 4.35 15.68 3 14.09 3 12
                curveTo(
                    x1 = 4.35f,
                    y1 = 15.68f,
                    x2 = 3.0f,
                    y2 = 14.09f,
                    x3 = 3.0f,
                    y3 = 12.0f,
                )
                // a 5 5 0 0 1 4.95 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.95f,
                    dy1 = -5.0f,
                )
                // c 1.58 0 2.7 0.46 4.05 1.82
                curveToRelative(
                    dx1 = 1.58f,
                    dy1 = 0.0f,
                    dx2 = 2.7f,
                    dy2 = 0.46f,
                    dx3 = 4.05f,
                    dy3 = 1.82f,
                )
                // C 13.35 7.45 14.47 7 16.05 7
                curveTo(
                    x1 = 13.35f,
                    y1 = 7.45f,
                    x2 = 14.47f,
                    y2 = 7.0f,
                    x3 = 16.05f,
                    y3 = 7.0f,
                )
                // A 5 5 0 0 1 21 12
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 12.0f,
                )
                // c 0 2.08 -1.36 3.67 -2.7 5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.08f,
                    dx2 = -1.36f,
                    dy2 = 3.67f,
                    dx3 = -2.7f,
                    dy3 = 5.0f,
                )
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // M 10 4
                moveTo(x = 10.0f, y = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -2 -2
                moveToRelative(dx = -2.0f, dy = -2.0f)
                // v 6.82
                verticalLineToRelative(dy = 6.82f)
            }
        }.build().also { _chessKing = it }
    }


@Suppress("ObjectPropertyName")
private var _chessKing: ImageVector? = null
