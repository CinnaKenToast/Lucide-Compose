package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wind: ImageVector
    get() {
        val current = _wind
        if (current != null) return current

        return ImageVector.Builder(
            name = "Wind",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.8 19.6 A2 2 0 1 0 14 16 H2 m15.5 -8 a2.5 2.5 0 1 1 2 4 H2 m7.8 -7.6 A2 2 0 1 1 11 8 H2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.8 19.6
                moveTo(x = 12.8f, y = 19.6f)
                // A 2 2 0 1 0 14 16
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 16.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 15.5 -8
                moveToRelative(dx = 15.5f, dy = -8.0f)
                // a 2.5 2.5 0 1 1 2 4
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 4.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 7.8 -7.6
                moveToRelative(dx = 7.8f, dy = -7.6f)
                // A 2 2 0 1 1 11 8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 8.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _wind = it }
    }


@Suppress("ObjectPropertyName")
private var _wind: ImageVector? = null
