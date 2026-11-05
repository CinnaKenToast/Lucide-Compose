package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Slice: ImageVector
    get() {
        val current = _slice
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Slice",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 16.59 V19 a1 1 0 0 1 -1 1 H2 L18.37 3.63 a1 1 0 1 1 3 3 l-9.66 9.66 a1 1 0 0 1 -1.42 0 L8 14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 16.59
                moveTo(x = 11.0f, y = 16.59f)
                // V 19
                verticalLineTo(y = 19.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // L 18.37 3.63
                lineTo(x = 18.37f, y = 3.63f)
                // a 1 1 0 1 1 3 3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // l -9.66 9.66
                lineToRelative(dx = -9.66f, dy = 9.66f)
                // a 1 1 0 0 1 -1.42 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.42f,
                    dy1 = 0.0f,
                )
                // L 8 14
                lineTo(x = 8.0f, y = 14.0f)
            }
        }.build().also { _slice = it }
    }

@Suppress("ObjectPropertyName")
private var _slice: ImageVector? = null
