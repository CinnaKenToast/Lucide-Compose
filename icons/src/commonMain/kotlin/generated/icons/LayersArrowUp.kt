package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LayersArrowUp: ImageVector
    get() {
        val current = _layersArrowUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LayersArrowUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 V2 M2 17 a1 1 0 0 0 .58 .91 l8.6 3.91 a2 2 0 0 0 1.65 0 l8.58 -3.9 A1 1 0 0 0 22 17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // M 2 17
                moveTo(x = 2.0f, y = 17.0f)
                // a 1 1 0 0 0 0.58 0.91
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.58f,
                    dy1 = 0.91f,
                )
                // l 8.6 3.91
                lineToRelative(dx = 8.6f, dy = 3.91f)
                // a 2 2 0 0 0 1.65 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.65f,
                    dy1 = 0.0f,
                )
                // l 8.58 -3.9
                lineToRelative(dx = 8.58f, dy = -3.9f)
                // A 1 1 0 0 0 22 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 17.0f,
                )
            }
            // M7.67 8.77 2.58 11.1 a1 1 0 0 0 0 1.82 l8.6 3.91 a2 2 0 0 0 1.65 0 l8.58 -3.9 A1 1 0 0 0 22 12 a1 1 0 0 0 -.59 -.92 l-5.08 -2.3 M9 5 l3 -3 3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7.67 8.77
                moveTo(x = 7.67f, y = 8.77f)
                // L 2.58 11.1
                lineTo(x = 2.58f, y = 11.1f)
                // a 1 1 0 0 0 0 1.82
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.82f,
                )
                // l 8.6 3.91
                lineToRelative(dx = 8.6f, dy = 3.91f)
                // a 2 2 0 0 0 1.65 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.65f,
                    dy1 = 0.0f,
                )
                // l 8.58 -3.9
                lineToRelative(dx = 8.58f, dy = -3.9f)
                // A 1 1 0 0 0 22 12
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 12.0f,
                )
                // a 1 1 0 0 0 -0.59 -0.92
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.59f,
                    dy1 = -0.92f,
                )
                // l -5.08 -2.3
                lineToRelative(dx = -5.08f, dy = -2.3f)
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
            }
        }.build().also { _layersArrowUp = it }
    }

@Suppress("ObjectPropertyName")
private var _layersArrowUp: ImageVector? = null
