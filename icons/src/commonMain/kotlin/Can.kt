package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Can: ImageVector
    get() {
        val current = _can
        if (current != null) return current

        return ImageVector.Builder(
            name = "Can",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 10.5 a9 2.5 0 0 1 -18 0 v8 a9 2.5 0 0 0 18 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 10.5
                moveTo(x = 21.0f, y = 10.5f)
                // a 9 2.5 0 0 1 -18 0
                arcToRelative(
                    a = 9.0f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -18.0f,
                    dy1 = 0.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 9 2.5 0 0 0 18 0z
                arcToRelative(
                    a = 9.0f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 18.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21 10.5 A9 2.5 25.32 0 0 4.59 3.47 9 2.5 25.32 0 0 21 10.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 10.5
                moveTo(x = 21.0f, y = 10.5f)
                // A 9 2.5 25.32 0 0 4.59 3.47
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 2.5f,
                    theta = 25.32f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.59f,
                    y1 = 3.47f,
                )
                // A 9 2.5 25.32 0 0 21 10.5
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 2.5f,
                    theta = 25.32f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 10.5f,
                )
            }
            // M3 10.5 a9 2.5 0 0 1 6.53 -2.4 M9 16.86 a31 31 0 0 0 6 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 10.5
                moveTo(x = 3.0f, y = 10.5f)
                // a 9 2.5 0 0 1 6.53 -2.4
                arcToRelative(
                    a = 9.0f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.53f,
                    dy1 = -2.4f,
                )
                // M 9 16.86
                moveTo(x = 9.0f, y = 16.86f)
                // a 31 31 0 0 0 6 0
                arcToRelative(
                    a = 31.0f,
                    b = 31.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _can = it }
    }


@Suppress("ObjectPropertyName")
private var _can: ImageVector? = null
