package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GermOff: ImageVector
    get() {
        val current = _germOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.GermOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m11 2 .93 1.85 M13 15z m.41 -7.23 a2 2 0 1 1 2.81 2.8 M16 21 l-1 -2.47 m1.99 -1.54 A12 12 0 0 1 9 20 a5 5 0 0 1 -2.76 -9.17 9 9 0 0 0 2.3 -2.28 M19 2 l-1 1.8 M2 19 l2.75 -1.37 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 2
                moveTo(x = 11.0f, y = 2.0f)
                // l 0.93 1.85
                lineToRelative(dx = 0.93f, dy = 1.85f)
                // M 13 15z
                moveTo(x = 13.0f, y = 15.0f)
                close()
                // m 0.41 -7.23
                moveToRelative(dx = 0.41f, dy = -7.23f)
                // a 2 2 0 1 1 2.81 2.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.81f,
                    dy1 = 2.8f,
                )
                // M 16 21
                moveTo(x = 16.0f, y = 21.0f)
                // l -1 -2.47
                lineToRelative(dx = -1.0f, dy = -2.47f)
                // m 1.99 -1.54
                moveToRelative(dx = 1.99f, dy = -1.54f)
                // A 12 12 0 0 1 9 20
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 20.0f,
                )
                // a 5 5 0 0 1 -2.76 -9.17
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.76f,
                    dy1 = -9.17f,
                )
                // a 9 9 0 0 0 2.3 -2.28
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.3f,
                    dy1 = -2.28f,
                )
                // M 19 2
                moveTo(x = 19.0f, y = 2.0f)
                // l -1 1.8
                lineToRelative(dx = -1.0f, dy = 1.8f)
                // M 2 19
                moveTo(x = 2.0f, y = 19.0f)
                // l 2.75 -1.37
                lineToRelative(dx = 2.75f, dy = -1.37f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
            // m22 16 -2.47 -2.13 a12 12 0 0 0 1.37 -3.79 A6 6 0 0 0 10.6 4.93 M22 5 l-1.8 1 M3 10 l2 2 m4 4z M9 20 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 16
                moveTo(x = 22.0f, y = 16.0f)
                // l -2.47 -2.13
                lineToRelative(dx = -2.47f, dy = -2.13f)
                // a 12 12 0 0 0 1.37 -3.79
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.37f,
                    dy1 = -3.79f,
                )
                // A 6 6 0 0 0 10.6 4.93
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.6f,
                    y1 = 4.93f,
                )
                // M 22 5
                moveTo(x = 22.0f, y = 5.0f)
                // l -1.8 1
                lineToRelative(dx = -1.8f, dy = 1.0f)
                // M 3 10
                moveTo(x = 3.0f, y = 10.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // m 4 4z
                moveToRelative(dx = 4.0f, dy = 4.0f)
                close()
                // M 9 20
                moveTo(x = 9.0f, y = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _germOff = it }
    }

@Suppress("ObjectPropertyName")
private var _germOff: ImageVector? = null
