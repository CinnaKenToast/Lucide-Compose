package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BowlChopsticks: ImageVector
    get() {
        val current = _bowlChopsticks
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BowlChopsticks",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 12 4 -9 m4 2 -4 7 M4 12 a1 1 0 0 0 -.99 1.13 A9 9 0 0 0 12 21 a9 9 0 0 0 8.99 -7.87 A1 1 0 0 0 20 12z m1 -.05 a3.5 3.5 0 1 1 5 0 M7 21 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 12
                moveTo(x = 14.0f, y = 12.0f)
                // l 4 -9
                lineToRelative(dx = 4.0f, dy = -9.0f)
                // m 4 2
                moveToRelative(dx = 4.0f, dy = 2.0f)
                // l -4 7
                lineToRelative(dx = -4.0f, dy = 7.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // a 1 1 0 0 0 -0.99 1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.99f,
                    dy1 = 1.13f,
                )
                // A 9 9 0 0 0 12 21
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 21.0f,
                )
                // a 9 9 0 0 0 8.99 -7.87
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.99f,
                    dy1 = -7.87f,
                )
                // A 1 1 0 0 0 20 12z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 12.0f,
                )
                close()
                // m 1 -0.05
                moveToRelative(dx = 1.0f, dy = -0.05f)
                // a 3.5 3.5 0 1 1 5 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // M 7 21
                moveTo(x = 7.0f, y = 21.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
        }.build().also { _bowlChopsticks = it }
    }

@Suppress("ObjectPropertyName")
private var _bowlChopsticks: ImageVector? = null
