package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LayersArrowDown: ImageVector
    get() {
        val current = _layersArrowDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "LayersArrowDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 7 v15 M2 12 a1 1 0 0 0 .58 .91 l5.1 2.32 M22 12 a1 1 0 0 1 -.59 .92 l-5.08 2.3 M8 10.38 2.6 7.91 a1 1 0 0 1 0 -1.83 l8.57 -3.9 a2 2 0 0 1 1.66 0 l8.59 3.91 a1 1 0 0 1 0 1.83 l-5.4 2.45 M9 19 l3 3 3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 7
                moveTo(x = 12.0f, y = 7.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
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
                // l 5.1 2.32
                lineToRelative(dx = 5.1f, dy = 2.32f)
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // a 1 1 0 0 1 -0.59 0.92
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.59f,
                    dy1 = 0.92f,
                )
                // l -5.08 2.3
                lineToRelative(dx = -5.08f, dy = 2.3f)
                // M 8 10.38
                moveTo(x = 8.0f, y = 10.38f)
                // L 2.6 7.91
                lineTo(x = 2.6f, y = 7.91f)
                // a 1 1 0 0 1 0 -1.83
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.83f,
                )
                // l 8.57 -3.9
                lineToRelative(dx = 8.57f, dy = -3.9f)
                // a 2 2 0 0 1 1.66 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.66f,
                    dy1 = 0.0f,
                )
                // l 8.59 3.91
                lineToRelative(dx = 8.59f, dy = 3.91f)
                // a 1 1 0 0 1 0 1.83
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.83f,
                )
                // l -5.4 2.45
                lineToRelative(dx = -5.4f, dy = 2.45f)
                // M 9 19
                moveTo(x = 9.0f, y = 19.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
            }
        }.build().also { _layersArrowDown = it }
    }


@Suppress("ObjectPropertyName")
private var _layersArrowDown: ImageVector? = null
