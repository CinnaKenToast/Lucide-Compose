package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Drone: ImageVector
    get() {
        val current = _drone
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Drone",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 10 7 7 m3 7 -3 3 m7 -7 3 -3 m-3 7 3 3 M14.2 4.14 A4 4 0 1 1 19.65 10 m0 4 a4 4 0 1 1 -5.43 5.87 M4.37 10 A4 4 0 1 1 9.8 4.14 m0 15.72 A4 4 0 1 1 4.37 14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // L 7 7
                lineTo(x = 7.0f, y = 7.0f)
                // m 3 7
                moveToRelative(dx = 3.0f, dy = 7.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // m 7 -7
                moveToRelative(dx = 7.0f, dy = -7.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // m -3 7
                moveToRelative(dx = -3.0f, dy = 7.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // M 14.2 4.14
                moveTo(x = 14.2f, y = 4.14f)
                // A 4 4 0 1 1 19.65 10
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 19.65f,
                    y1 = 10.0f,
                )
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // a 4 4 0 1 1 -5.43 5.87
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.43f,
                    dy1 = 5.87f,
                )
                // M 4.37 10
                moveTo(x = 4.37f, y = 10.0f)
                // A 4 4 0 1 1 9.8 4.14
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 9.8f,
                    y1 = 4.14f,
                )
                // m 0 15.72
                moveToRelative(dx = 0.0f, dy = 15.72f)
                // A 4 4 0 1 1 4.37 14
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 4.37f,
                    y1 = 14.0f,
                )
            }
            // <rect width="4" height="8" rx="1.0" x="10.0" y="8.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 9
                moveTo(x = 10.0f, y = 9.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
            }
        }.build().also { _drone = it }
    }

@Suppress("ObjectPropertyName")
private var _drone: ImageVector? = null
