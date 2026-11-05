package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Puzzle: ImageVector
    get() {
        val current = _puzzle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Puzzle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.39 4.39 a1 1 0 0 0 1.68 -.47 2.5 2.5 0 1 1 3.01 3.01 1 1 0 0 0 -.47 1.68 l1.68 1.68 a2.4 2.4 0 0 1 0 3.42 l-1.68 1.68 a1 1 0 0 1 -1.68 -.47 2.5 2.5 0 1 0 -3.01 3.01 1 1 0 0 1 .47 1.68 l-1.68 1.68 a2.4 2.4 0 0 1 -3.42 0 l-1.68 -1.68 a1 1 0 0 0 -1.68 .47 2.5 2.5 0 1 1 -3.01 -3.01 1 1 0 0 0 .47 -1.68 L2.71 13.7 a2.4 2.4 0 0 1 0 -3.42 l1.68 -1.68 a1 1 0 0 1 1.68 .47 2.5 2.5 0 1 0 3.01 -3.01 1 1 0 0 1 -.47 -1.68 l1.68 -1.68 a2.4 2.4 0 0 1 3.42 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.39 4.39
                moveTo(x = 15.39f, y = 4.39f)
                // a 1 1 0 0 0 1.68 -0.47
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.68f,
                    dy1 = -0.47f,
                )
                // a 2.5 2.5 0 1 1 3.01 3.01
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.01f,
                    dy1 = 3.01f,
                )
                // a 1 1 0 0 0 -0.47 1.68
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.47f,
                    dy1 = 1.68f,
                )
                // l 1.68 1.68
                lineToRelative(dx = 1.68f, dy = 1.68f)
                // a 2.4 2.4 0 0 1 0 3.42
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.42f,
                )
                // l -1.68 1.68
                lineToRelative(dx = -1.68f, dy = 1.68f)
                // a 1 1 0 0 1 -1.68 -0.47
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.68f,
                    dy1 = -0.47f,
                )
                // a 2.5 2.5 0 1 0 -3.01 3.01
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.01f,
                    dy1 = 3.01f,
                )
                // a 1 1 0 0 1 0.47 1.68
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.47f,
                    dy1 = 1.68f,
                )
                // l -1.68 1.68
                lineToRelative(dx = -1.68f, dy = 1.68f)
                // a 2.4 2.4 0 0 1 -3.42 0
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.42f,
                    dy1 = 0.0f,
                )
                // l -1.68 -1.68
                lineToRelative(dx = -1.68f, dy = -1.68f)
                // a 1 1 0 0 0 -1.68 0.47
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.68f,
                    dy1 = 0.47f,
                )
                // a 2.5 2.5 0 1 1 -3.01 -3.01
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.01f,
                    dy1 = -3.01f,
                )
                // a 1 1 0 0 0 0.47 -1.68
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.47f,
                    dy1 = -1.68f,
                )
                // L 2.71 13.7
                lineTo(x = 2.71f, y = 13.7f)
                // a 2.4 2.4 0 0 1 0 -3.42
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.42f,
                )
                // l 1.68 -1.68
                lineToRelative(dx = 1.68f, dy = -1.68f)
                // a 1 1 0 0 1 1.68 0.47
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.68f,
                    dy1 = 0.47f,
                )
                // a 2.5 2.5 0 1 0 3.01 -3.01
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.01f,
                    dy1 = -3.01f,
                )
                // a 1 1 0 0 1 -0.47 -1.68
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.47f,
                    dy1 = -1.68f,
                )
                // l 1.68 -1.68
                lineToRelative(dx = 1.68f, dy = -1.68f)
                // a 2.4 2.4 0 0 1 3.42 0z
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.42f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _puzzle = it }
    }

@Suppress("ObjectPropertyName")
private var _puzzle: ImageVector? = null
