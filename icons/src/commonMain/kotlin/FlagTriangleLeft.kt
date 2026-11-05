package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlagTriangleLeft: ImageVector
    get() {
        val current = _flagTriangleLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "FlagTriangleLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 22 V2.8 a.8 .8 0 0 0 -1.17 -.71 L5.45 7.78 a.8 .8 0 0 0 0 1.44 L18 15.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 22
                moveTo(x = 18.0f, y = 22.0f)
                // V 2.8
                verticalLineTo(y = 2.8f)
                // a 0.8 0.8 0 0 0 -1.17 -0.71
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.17f,
                    dy1 = -0.71f,
                )
                // L 5.45 7.78
                lineTo(x = 5.45f, y = 7.78f)
                // a 0.8 0.8 0 0 0 0 1.44
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.44f,
                )
                // L 18 15.5
                lineTo(x = 18.0f, y = 15.5f)
            }
        }.build().also { _flagTriangleLeft = it }
    }


@Suppress("ObjectPropertyName")
private var _flagTriangleLeft: ImageVector? = null
