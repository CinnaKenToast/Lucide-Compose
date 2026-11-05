package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LampFloor: ImageVector
    get() {
        val current = _lampFloor
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LampFloor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 10 v12 m5.93 -14.37 A1 1 0 0 1 17 9 H7 a1 1 0 0 1 -.93 -1.37 l2 -5 A1 1 0 0 1 9 2 h6 a1 1 0 0 1 .93 .63z M9 22 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // m 5.93 -14.37
                moveToRelative(dx = 5.93f, dy = -14.37f)
                // A 1 1 0 0 1 17 9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 9.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 1 1 0 0 1 -0.93 -1.37
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.93f,
                    dy1 = -1.37f,
                )
                // l 2 -5
                lineToRelative(dx = 2.0f, dy = -5.0f)
                // A 1 1 0 0 1 9 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 1 1 0 0 1 0.93 0.63z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.93f,
                    dy1 = 0.63f,
                )
                close()
                // M 9 22
                moveTo(x = 9.0f, y = 22.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _lampFloor = it }
    }

@Suppress("ObjectPropertyName")
private var _lampFloor: ImageVector? = null
