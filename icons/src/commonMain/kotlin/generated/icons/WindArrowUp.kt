package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.WindArrowUp: ImageVector
    get() {
        val current = _windArrowUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.WindArrowUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 3 v6 m1.8 11.6 A2 2 0 1 0 14 17 H2 m15.5 -8 a2.5 2.5 0 1 1 2 4 H2 m6 -7 3 -3 3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 3
                moveTo(x = 11.0f, y = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 1.8 11.6
                moveToRelative(dx = 1.8f, dy = 11.6f)
                // A 2 2 0 1 0 14 17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 17.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 15.5 -8
                moveToRelative(dx = 15.5f, dy = -8.0f)
                // a 2.5 2.5 0 1 1 2 4
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 4.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 6 -7
                moveToRelative(dx = 6.0f, dy = -7.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
            }
        }.build().also { _windArrowUp = it }
    }

@Suppress("ObjectPropertyName")
private var _windArrowUp: ImageVector? = null
