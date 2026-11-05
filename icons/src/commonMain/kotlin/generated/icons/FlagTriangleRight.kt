package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FlagTriangleRight: ImageVector
    get() {
        val current = _flagTriangleRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FlagTriangleRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 22 V2.8 a.8 .8 0 0 1 1.17 -.71 l11.38 5.69 a.8 .8 0 0 1 0 1.44 L6 15.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 22
                moveTo(x = 6.0f, y = 22.0f)
                // V 2.8
                verticalLineTo(y = 2.8f)
                // a 0.8 0.8 0 0 1 1.17 -0.71
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.17f,
                    dy1 = -0.71f,
                )
                // l 11.38 5.69
                lineToRelative(dx = 11.38f, dy = 5.69f)
                // a 0.8 0.8 0 0 1 0 1.44
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.44f,
                )
                // L 6 15.5
                lineTo(x = 6.0f, y = 15.5f)
            }
        }.build().also { _flagTriangleRight = it }
    }

@Suppress("ObjectPropertyName")
private var _flagTriangleRight: ImageVector? = null
