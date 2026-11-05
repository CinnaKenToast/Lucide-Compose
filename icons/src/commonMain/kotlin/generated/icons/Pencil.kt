package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pencil: ImageVector
    get() {
        val current = _pencil
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Pencil",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21.17 6.81 a1 1 0 0 0 -3.98 -3.98 L3.84 16.17 A2 2 0 0 0 3.34 17 l-1.32 4.36 a.5 .5 0 0 0 .62 .62 L7 20.66 a2 2 0 0 0 .83 -.5z M15 5 l4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.17 6.81
                moveTo(x = 21.17f, y = 6.81f)
                // a 1 1 0 0 0 -3.98 -3.98
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.98f,
                    dy1 = -3.98f,
                )
                // L 3.84 16.17
                lineTo(x = 3.84f, y = 16.17f)
                // A 2 2 0 0 0 3.34 17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.34f,
                    y1 = 17.0f,
                )
                // l -1.32 4.36
                lineToRelative(dx = -1.32f, dy = 4.36f)
                // a 0.5 0.5 0 0 0 0.62 0.62
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.62f,
                    dy1 = 0.62f,
                )
                // L 7 20.66
                lineTo(x = 7.0f, y = 20.66f)
                // a 2 2 0 0 0 0.83 -0.5z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.83f,
                    dy1 = -0.5f,
                )
                close()
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
            }
        }.build().also { _pencil = it }
    }

@Suppress("ObjectPropertyName")
private var _pencil: ImageVector? = null
