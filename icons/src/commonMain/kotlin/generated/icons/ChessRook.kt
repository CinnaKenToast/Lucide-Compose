package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChessRook: ImageVector
    get() {
        val current = _chessRook
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChessRook",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 20 a2 2 0 0 1 2 -2 h10 a2 2 0 0 1 2 2 v1 a1 1 0 0 1 -1 1 H6 a1 1 0 0 1 -1 -1z m5 -18 v2 m4 -2 v2 m3 14 -1 -9 M6 2 v5 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V2 M6 4 h12 M7 18 l1 -9
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
                // m 5 -18
                moveToRelative(dx = 5.0f, dy = -18.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 4 -2
                moveToRelative(dx = 4.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 3 14
                moveToRelative(dx = 3.0f, dy = 14.0f)
                // l -1 -9
                lineToRelative(dx = -1.0f, dy = -9.0f)
                // M 6 2
                moveTo(x = 6.0f, y = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
                // l 1 -9
                lineToRelative(dx = 1.0f, dy = -9.0f)
            }
        }.build().also { _chessRook = it }
    }

@Suppress("ObjectPropertyName")
private var _chessRook: ImageVector? = null
