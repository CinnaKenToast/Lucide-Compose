package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.WindArrowDown: ImageVector
    get() {
        val current = _windArrowDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.WindArrowDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 2 v8 m2.8 11.6 A2 2 0 1 0 14 18 H2 m15.5 -8 a2.5 2.5 0 1 1 2 4 H2 m4 -8 4 4 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 2.8 11.6
                moveToRelative(dx = 2.8f, dy = 11.6f)
                // A 2 2 0 1 0 14 18
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 18.0f,
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
                // m 4 -8
                moveToRelative(dx = 4.0f, dy = -8.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
        }.build().also { _windArrowDown = it }
    }

@Suppress("ObjectPropertyName")
private var _windArrowDown: ImageVector? = null
