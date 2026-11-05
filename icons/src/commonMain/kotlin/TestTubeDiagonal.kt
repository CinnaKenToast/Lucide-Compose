package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TestTubeDiagonal: ImageVector
    get() {
        val current = _testTubeDiagonal
        if (current != null) return current

        return ImageVector.Builder(
            name = "TestTubeDiagonal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 7 6.82 21.18 a2.83 2.83 0 0 1 -3.99 -.01 2.83 2.83 0 0 1 0 -4 L17 3 m-1 -1 6 6 m-10 8 H4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 7
                moveTo(x = 21.0f, y = 7.0f)
                // L 6.82 21.18
                lineTo(x = 6.82f, y = 21.18f)
                // a 2.83 2.83 0 0 1 -3.99 -0.01
                arcToRelative(
                    a = 2.83f,
                    b = 2.83f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.99f,
                    dy1 = -0.01f,
                )
                // a 2.83 2.83 0 0 1 0 -4
                arcToRelative(
                    a = 2.83f,
                    b = 2.83f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // L 17 3
                lineTo(x = 17.0f, y = 3.0f)
                // m -1 -1
                moveToRelative(dx = -1.0f, dy = -1.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // m -10 8
                moveToRelative(dx = -10.0f, dy = 8.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
            }
        }.build().also { _testTubeDiagonal = it }
    }


@Suppress("ObjectPropertyName")
private var _testTubeDiagonal: ImageVector? = null
