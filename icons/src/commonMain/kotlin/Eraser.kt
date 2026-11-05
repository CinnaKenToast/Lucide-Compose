package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eraser: ImageVector
    get() {
        val current = _eraser
        if (current != null) return current

        return ImageVector.Builder(
            name = "Eraser",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 21 H8 a2 2 0 0 1 -1.42 -.59 l-4 -4 a2 2 0 0 1 0 -2.82 l10 -10 a2 2 0 0 1 2.84 0 l6 6 a2 2 0 0 1 0 2.82 L12.82 21 m-7.75 -9.91 8.83 8.83
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 21
                moveTo(x = 21.0f, y = 21.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 2 2 0 0 1 -1.42 -0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.42f,
                    dy1 = -0.59f,
                )
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // a 2 2 0 0 1 0 -2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.82f,
                )
                // l 10 -10
                lineToRelative(dx = 10.0f, dy = -10.0f)
                // a 2 2 0 0 1 2.84 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.84f,
                    dy1 = 0.0f,
                )
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // a 2 2 0 0 1 0 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.82f,
                )
                // L 12.82 21
                lineTo(x = 12.82f, y = 21.0f)
                // m -7.75 -9.91
                moveToRelative(dx = -7.75f, dy = -9.91f)
                // l 8.83 8.83
                lineToRelative(dx = 8.83f, dy = 8.83f)
            }
        }.build().also { _eraser = it }
    }


@Suppress("ObjectPropertyName")
private var _eraser: ImageVector? = null
