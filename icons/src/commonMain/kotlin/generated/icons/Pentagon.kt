package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pentagon: ImageVector
    get() {
        val current = _pentagon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Pentagon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.83 2.38 a2 2 0 0 1 2.34 0 l8 5.74 a2 2 0 0 1 .73 2.25 l-3.04 9.26 a2 2 0 0 1 -1.9 1.37 H7.04 a2 2 0 0 1 -1.9 -1.37 L2.1 10.37 a2 2 0 0 1 .73 -2.25z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.83 2.38
                moveTo(x = 10.83f, y = 2.38f)
                // a 2 2 0 0 1 2.34 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.34f,
                    dy1 = 0.0f,
                )
                // l 8 5.74
                lineToRelative(dx = 8.0f, dy = 5.74f)
                // a 2 2 0 0 1 0.73 2.25
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.73f,
                    dy1 = 2.25f,
                )
                // l -3.04 9.26
                lineToRelative(dx = -3.04f, dy = 9.26f)
                // a 2 2 0 0 1 -1.9 1.37
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.9f,
                    dy1 = 1.37f,
                )
                // H 7.04
                horizontalLineTo(x = 7.04f)
                // a 2 2 0 0 1 -1.9 -1.37
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.9f,
                    dy1 = -1.37f,
                )
                // L 2.1 10.37
                lineTo(x = 2.1f, y = 10.37f)
                // a 2 2 0 0 1 0.73 -2.25z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.73f,
                    dy1 = -2.25f,
                )
                close()
            }
        }.build().also { _pentagon = it }
    }

@Suppress("ObjectPropertyName")
private var _pentagon: ImageVector? = null
