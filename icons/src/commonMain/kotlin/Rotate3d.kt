package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rotate3d: ImageVector
    get() {
        val current = _rotate3d
        if (current != null) return current

        return ImageVector.Builder(
            name = "Rotate3d",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15.2 13.7 3.8 1.87 -1.85 3.81 M16.47 7.53 A5 10 0 1 0 13 21.8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.2 13.7
                moveTo(x = 15.2f, y = 13.7f)
                // l 3.8 1.87
                lineToRelative(dx = 3.8f, dy = 1.87f)
                // l -1.85 3.81
                lineToRelative(dx = -1.85f, dy = 3.81f)
                // M 16.47 7.53
                moveTo(x = 16.47f, y = 7.53f)
                // A 5 10 0 1 0 13 21.8
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 13.0f,
                    y1 = 21.8f,
                )
            }
            // M21.8 11 a10 5 0 1 0 -2.8 4.57
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.8 11
                moveTo(x = 21.8f, y = 11.0f)
                // a 10 5 0 1 0 -2.8 4.57
                arcToRelative(
                    a = 10.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.8f,
                    dy1 = 4.57f,
                )
            }
        }.build().also { _rotate3d = it }
    }


@Suppress("ObjectPropertyName")
private var _rotate3d: ImageVector? = null
