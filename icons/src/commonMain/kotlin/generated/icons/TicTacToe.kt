package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TicTacToe: ImageVector
    get() {
        val current = _ticTacToe
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TicTacToe",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v20 m9 -6 -5 5 m5 0 -5 -5 m6 -4 H2 m6 -9 L3 8 m5 0 L3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // m 9 -6
                moveToRelative(dx = 9.0f, dy = -6.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // m 5 0
                moveToRelative(dx = 5.0f, dy = 0.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // m 6 -4
                moveToRelative(dx = 6.0f, dy = -4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 6 -9
                moveToRelative(dx = 6.0f, dy = -9.0f)
                // L 3 8
                lineTo(x = 3.0f, y = 8.0f)
                // m 5 0
                moveToRelative(dx = 5.0f, dy = 0.0f)
                // L 3 3
                lineTo(x = 3.0f, y = 3.0f)
            }
            // <circle cx="18.5" cy="5.5" radius="2.5" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.5 5.5
                moveTo(x = 18.5f, y = 5.5f)
                // m -2.5 0
                moveToRelative(dx = -2.5f, dy = 0.0f)
                // a 2.5 2.5 0 1 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 1 1 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="5.5" cy="18.5" radius="2.5" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.5 18.5
                moveTo(x = 5.5f, y = 18.5f)
                // m -2.5 0
                moveToRelative(dx = -2.5f, dy = 0.0f)
                // a 2.5 2.5 0 1 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 1 1 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _ticTacToe = it }
    }

@Suppress("ObjectPropertyName")
private var _ticTacToe: ImageVector? = null
