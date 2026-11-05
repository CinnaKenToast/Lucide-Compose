package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Guitar: ImageVector
    get() {
        val current = _guitar
        if (current != null) return current

        return ImageVector.Builder(
            name = "Guitar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m11.9 12.1 4.51 -4.51 M20.1 2.3 a1 1 0 0 0 -1.4 0 l-1.11 1.11 A2 2 0 0 0 17 4.83 v1.34 a2 2 0 0 1 -.59 1.42 A2 2 0 0 1 17.83 7 h1.34 a2 2 0 0 0 1.42 -.59 L21.7 5.3 a1 1 0 0 0 0 -1.4z M6 16 l2 2 m.23 -8.15 A3 3 0 0 1 11 8 a5 5 0 0 1 5 5 3 3 0 0 1 -1.85 2.77 l-.92 .38 A2 2 0 0 0 12 18 a4 4 0 0 1 -4 4 6 6 0 0 1 -6 -6 4 4 0 0 1 4 -4 2 2 0 0 0 1.85 -1.23z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.9 12.1
                moveTo(x = 11.9f, y = 12.1f)
                // l 4.51 -4.51
                lineToRelative(dx = 4.51f, dy = -4.51f)
                // M 20.1 2.3
                moveTo(x = 20.1f, y = 2.3f)
                // a 1 1 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -1.11 1.11
                lineToRelative(dx = -1.11f, dy = 1.11f)
                // A 2 2 0 0 0 17 4.83
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 4.83f,
                )
                // v 1.34
                verticalLineToRelative(dy = 1.34f)
                // a 2 2 0 0 1 -0.59 1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.59f,
                    dy1 = 1.42f,
                )
                // A 2 2 0 0 1 17.83 7
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.83f,
                    y1 = 7.0f,
                )
                // h 1.34
                horizontalLineToRelative(dx = 1.34f)
                // a 2 2 0 0 0 1.42 -0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = -0.59f,
                )
                // L 21.7 5.3
                lineTo(x = 21.7f, y = 5.3f)
                // a 1 1 0 0 0 0 -1.4z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.4f,
                )
                close()
                // M 6 16
                moveTo(x = 6.0f, y = 16.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // m 0.23 -8.15
                moveToRelative(dx = 0.23f, dy = -8.15f)
                // A 3 3 0 0 1 11 8
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 8.0f,
                )
                // a 5 5 0 0 1 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                // a 3 3 0 0 1 -1.85 2.77
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.85f,
                    dy1 = 2.77f,
                )
                // l -0.92 0.38
                lineToRelative(dx = -0.92f, dy = 0.38f)
                // A 2 2 0 0 0 12 18
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 18.0f,
                )
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // a 6 6 0 0 1 -6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = -6.0f,
                )
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // a 2 2 0 0 0 1.85 -1.23z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.85f,
                    dy1 = -1.23f,
                )
                close()
            }
        }.build().also { _guitar = it }
    }


@Suppress("ObjectPropertyName")
private var _guitar: ImageVector? = null
