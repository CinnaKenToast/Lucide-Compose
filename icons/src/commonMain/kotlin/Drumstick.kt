package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drumstick: ImageVector
    get() {
        val current = _drumstick
        if (current != null) return current

        return ImageVector.Builder(
            name = "Drumstick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.4 15.63 a7.88 6 135 1 1 6.23 -6.23 4.5 3.43 135 0 0 -6.23 6.23
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.4 15.63
                moveTo(x = 15.4f, y = 15.63f)
                // a 7.88 6 135 1 1 6.23 -6.23
                arcToRelative(
                    a = 7.88f,
                    b = 6.0f,
                    theta = 135.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.23f,
                    dy1 = -6.23f,
                )
                // a 4.5 3.43 135 0 0 -6.23 6.23
                arcToRelative(
                    a = 4.5f,
                    b = 3.43f,
                    theta = 135.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.23f,
                    dy1 = 6.23f,
                )
            }
            // m8.29 12.71 -2.6 2.6 a2.5 2.5 0 1 0 -1.65 4.65 A2.5 2.5 0 1 0 8.7 18.3 l2.59 -2.59
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.29 12.71
                moveTo(x = 8.29f, y = 12.71f)
                // l -2.6 2.6
                lineToRelative(dx = -2.6f, dy = 2.6f)
                // a 2.5 2.5 0 1 0 -1.65 4.65
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.65f,
                    dy1 = 4.65f,
                )
                // A 2.5 2.5 0 1 0 8.7 18.3
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 8.7f,
                    y1 = 18.3f,
                )
                // l 2.59 -2.59
                lineToRelative(dx = 2.59f, dy = -2.59f)
            }
        }.build().also { _drumstick = it }
    }


@Suppress("ObjectPropertyName")
private var _drumstick: ImageVector? = null
