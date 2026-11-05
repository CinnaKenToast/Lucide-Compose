package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Layers: ImageVector
    get() {
        val current = _layers
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Layers",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.83 2.18 a2 2 0 0 0 -1.66 0 L2.6 6.08 a1 1 0 0 0 0 1.83 l8.58 3.91 a2 2 0 0 0 1.66 0 l8.58 -3.9 a1 1 0 0 0 0 -1.83z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.83 2.18
                moveTo(x = 12.83f, y = 2.18f)
                // a 2 2 0 0 0 -1.66 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.66f,
                    dy1 = 0.0f,
                )
                // L 2.6 6.08
                lineTo(x = 2.6f, y = 6.08f)
                // a 1 1 0 0 0 0 1.83
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.83f,
                )
                // l 8.58 3.91
                lineToRelative(dx = 8.58f, dy = 3.91f)
                // a 2 2 0 0 0 1.66 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.66f,
                    dy1 = 0.0f,
                )
                // l 8.58 -3.9
                lineToRelative(dx = 8.58f, dy = -3.9f)
                // a 1 1 0 0 0 0 -1.83z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.83f,
                )
                close()
            }
            // M2 12 a1 1 0 0 0 .58 .91 l8.6 3.91 a2 2 0 0 0 1.65 0 l8.58 -3.9 A1 1 0 0 0 22 12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
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
            }
            // M2 17 a1 1 0 0 0 .58 .91 l8.6 3.91 a2 2 0 0 0 1.65 0 l8.58 -3.9 A1 1 0 0 0 22 17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
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
        }.build().also { _layers = it }
    }

@Suppress("ObjectPropertyName")
private var _layers: ImageVector? = null
