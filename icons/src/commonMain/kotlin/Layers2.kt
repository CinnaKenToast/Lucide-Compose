package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Layers2: ImageVector
    get() {
        val current = _layers2
        if (current != null) return current

        return ImageVector.Builder(
            name = "Layers2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 13.74 a2 2 0 0 1 -2 0 L2.5 8.87 a1 1 0 0 1 0 -1.74 L11 2.26 a2 2 0 0 1 2 0 l8.5 4.87 a1 1 0 0 1 0 1.74z m7 .54 1.5 .85 a1 1 0 0 1 0 1.74 L13 21.74 a2 2 0 0 1 -2 0 l-8.5 -4.87 a1 1 0 0 1 0 -1.74 L4 14.28
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 13.74
                moveTo(x = 13.0f, y = 13.74f)
                // a 2 2 0 0 1 -2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // L 2.5 8.87
                lineTo(x = 2.5f, y = 8.87f)
                // a 1 1 0 0 1 0 -1.74
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.74f,
                )
                // L 11 2.26
                lineTo(x = 11.0f, y = 2.26f)
                // a 2 2 0 0 1 2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // l 8.5 4.87
                lineToRelative(dx = 8.5f, dy = 4.87f)
                // a 1 1 0 0 1 0 1.74z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.74f,
                )
                close()
                // m 7 0.54
                moveToRelative(dx = 7.0f, dy = 0.54f)
                // l 1.5 0.85
                lineToRelative(dx = 1.5f, dy = 0.85f)
                // a 1 1 0 0 1 0 1.74
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.74f,
                )
                // L 13 21.74
                lineTo(x = 13.0f, y = 21.74f)
                // a 2 2 0 0 1 -2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // l -8.5 -4.87
                lineToRelative(dx = -8.5f, dy = -4.87f)
                // a 1 1 0 0 1 0 -1.74
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.74f,
                )
                // L 4 14.28
                lineTo(x = 4.0f, y = 14.28f)
            }
        }.build().also { _layers2 = it }
    }


@Suppress("ObjectPropertyName")
private var _layers2: ImageVector? = null
