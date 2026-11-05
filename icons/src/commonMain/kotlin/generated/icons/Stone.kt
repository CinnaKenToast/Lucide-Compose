package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Stone: ImageVector
    get() {
        val current = _stone
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Stone",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.26 2.2 a4 4 0 0 0 -4.84 2.01 l-4 8 a4 4 0 0 0 1.36 5.12 l6 4 a4 4 0 0 0 4.44 0 l6 -4 a4 4 0 0 0 1.57 -4.6 l-2 -6 a4 4 0 0 0 -2.53 -2.52z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.26 2.2
                moveTo(x = 11.26f, y = 2.2f)
                // a 4 4 0 0 0 -4.84 2.01
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.84f,
                    dy1 = 2.01f,
                )
                // l -4 8
                lineToRelative(dx = -4.0f, dy = 8.0f)
                // a 4 4 0 0 0 1.36 5.12
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.36f,
                    dy1 = 5.12f,
                )
                // l 6 4
                lineToRelative(dx = 6.0f, dy = 4.0f)
                // a 4 4 0 0 0 4.44 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.44f,
                    dy1 = 0.0f,
                )
                // l 6 -4
                lineToRelative(dx = 6.0f, dy = -4.0f)
                // a 4 4 0 0 0 1.57 -4.6
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.57f,
                    dy1 = -4.6f,
                )
                // l -2 -6
                lineToRelative(dx = -2.0f, dy = -6.0f)
                // a 4 4 0 0 0 -2.53 -2.52z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.53f,
                    dy1 = -2.52f,
                )
                close()
            }
            // M11.99 22 14 12 l7.82 3.18 M14 12 8.47 2.3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.99 22
                moveTo(x = 11.99f, y = 22.0f)
                // L 14 12
                lineTo(x = 14.0f, y = 12.0f)
                // l 7.82 3.18
                lineToRelative(dx = 7.82f, dy = 3.18f)
                // M 14 12
                moveTo(x = 14.0f, y = 12.0f)
                // L 8.47 2.3
                lineTo(x = 8.47f, y = 2.3f)
            }
        }.build().also { _stone = it }
    }

@Suppress("ObjectPropertyName")
private var _stone: ImageVector? = null
