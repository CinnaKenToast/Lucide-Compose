package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SquareStar: ImageVector
    get() {
        val current = _squareStar
        if (current != null) return current

        return ImageVector.Builder(
            name = "SquareStar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.04 7.69 a1 1 0 0 1 1.9 .02 l.74 1.46 a1 1 0 0 0 .74 .53 l1.63 .26 a1 1 0 0 1 .59 1.8 l-1.17 1.17 a1 1 0 0 0 -.28 .87 l.26 1.61 a1 1 0 0 1 -1.55 1.13 l-1.46 -.75 a1 1 0 0 0 -.91 0 l-1.47 .75 a1 1 0 0 1 -1.54 -1.13 l.26 -1.61 a1 1 0 0 0 -.28 -.87 l-1.16 -1.15 a1 1 0 0 1 .57 -1.82 L9.56 9.7 a1 1 0 0 0 .73 -.53z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.04 7.69
                moveTo(x = 11.04f, y = 7.69f)
                // a 1 1 0 0 1 1.9 0.02
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.9f,
                    dy1 = 0.02f,
                )
                // l 0.74 1.46
                lineToRelative(dx = 0.74f, dy = 1.46f)
                // a 1 1 0 0 0 0.74 0.53
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.74f,
                    dy1 = 0.53f,
                )
                // l 1.63 0.26
                lineToRelative(dx = 1.63f, dy = 0.26f)
                // a 1 1 0 0 1 0.59 1.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = 1.8f,
                )
                // l -1.17 1.17
                lineToRelative(dx = -1.17f, dy = 1.17f)
                // a 1 1 0 0 0 -0.28 0.87
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.28f,
                    dy1 = 0.87f,
                )
                // l 0.26 1.61
                lineToRelative(dx = 0.26f, dy = 1.61f)
                // a 1 1 0 0 1 -1.55 1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.55f,
                    dy1 = 1.13f,
                )
                // l -1.46 -0.75
                lineToRelative(dx = -1.46f, dy = -0.75f)
                // a 1 1 0 0 0 -0.91 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.91f,
                    dy1 = 0.0f,
                )
                // l -1.47 0.75
                lineToRelative(dx = -1.47f, dy = 0.75f)
                // a 1 1 0 0 1 -1.54 -1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.54f,
                    dy1 = -1.13f,
                )
                // l 0.26 -1.61
                lineToRelative(dx = 0.26f, dy = -1.61f)
                // a 1 1 0 0 0 -0.28 -0.87
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.28f,
                    dy1 = -0.87f,
                )
                // l -1.16 -1.15
                lineToRelative(dx = -1.16f, dy = -1.15f)
                // a 1 1 0 0 1 0.57 -1.82
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.57f,
                    dy1 = -1.82f,
                )
                // L 9.56 9.7
                lineTo(x = 9.56f, y = 9.7f)
                // a 1 1 0 0 0 0.73 -0.53z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.73f,
                    dy1 = -0.53f,
                )
                close()
            }
            // <rect width="18" height="18" rx="2.0" x="3.0" y="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // h -14
                horizontalLineToRelative(dx = -14.0f)
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
        }.build().also { _squareStar = it }
    }


@Suppress("ObjectPropertyName")
private var _squareStar: ImageVector? = null
