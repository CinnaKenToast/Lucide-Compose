package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Brush: ImageVector
    get() {
        val current = _brush
        if (current != null) return current

        return ImageVector.Builder(
            name = "Brush",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m11 10 3 3 m-7.5 8 A3.5 3.5 0 1 0 3 17.5 a2.6 2.6 0 0 1 -.7 1.8 A1 1 0 0 0 3 21z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 10
                moveTo(x = 11.0f, y = 10.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // m -7.5 8
                moveToRelative(dx = -7.5f, dy = 8.0f)
                // A 3.5 3.5 0 1 0 3 17.5
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 17.5f,
                )
                // a 2.6 2.6 0 0 1 -0.7 1.8
                arcToRelative(
                    a = 2.6f,
                    b = 2.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = 1.8f,
                )
                // A 1 1 0 0 0 3 21z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 21.0f,
                )
                close()
            }
            // m9.97 17.03 11.4 -11.4 a1 1 0 0 0 -3 -3 l-11.4 11.4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.97 17.03
                moveTo(x = 9.97f, y = 17.03f)
                // l 11.4 -11.4
                lineToRelative(dx = 11.4f, dy = -11.4f)
                // a 1 1 0 0 0 -3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // l -11.4 11.4
                lineToRelative(dx = -11.4f, dy = 11.4f)
            }
        }.build().also { _brush = it }
    }


@Suppress("ObjectPropertyName")
private var _brush: ImageVector? = null
