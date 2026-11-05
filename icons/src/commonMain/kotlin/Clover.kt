package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Clover: ImageVector
    get() {
        val current = _clover
        if (current != null) return current

        return ImageVector.Builder(
            name = "Clover",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16.17 7.83 2 22 m2.02 -10 a2.83 2.83 0 1 1 3.81 -4.17 A2.83 2.83 0 1 1 12 4.02 a2.83 2.83 0 1 1 4.17 3.81 A2.83 2.83 0 1 1 19.98 12 a2.83 2.83 0 1 1 -3.81 4.17 A2.83 2.83 0 1 1 12 19.98 a2.83 2.83 0 1 1 -4.17 -3.81 A1 1 0 1 1 4 12 m3.83 -4.17 8.34 8.34
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.17 7.83
                moveTo(x = 16.17f, y = 7.83f)
                // L 2 22
                lineTo(x = 2.0f, y = 22.0f)
                // m 2.02 -10
                moveToRelative(dx = 2.02f, dy = -10.0f)
                // a 2.83 2.83 0 1 1 3.81 -4.17
                arcToRelative(
                    a = 2.83f,
                    b = 2.83f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.81f,
                    dy1 = -4.17f,
                )
                // A 2.83 2.83 0 1 1 12 4.02
                arcTo(
                    horizontalEllipseRadius = 2.83f,
                    verticalEllipseRadius = 2.83f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 4.02f,
                )
                // a 2.83 2.83 0 1 1 4.17 3.81
                arcToRelative(
                    a = 2.83f,
                    b = 2.83f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.17f,
                    dy1 = 3.81f,
                )
                // A 2.83 2.83 0 1 1 19.98 12
                arcTo(
                    horizontalEllipseRadius = 2.83f,
                    verticalEllipseRadius = 2.83f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 19.98f,
                    y1 = 12.0f,
                )
                // a 2.83 2.83 0 1 1 -3.81 4.17
                arcToRelative(
                    a = 2.83f,
                    b = 2.83f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.81f,
                    dy1 = 4.17f,
                )
                // A 2.83 2.83 0 1 1 12 19.98
                arcTo(
                    horizontalEllipseRadius = 2.83f,
                    verticalEllipseRadius = 2.83f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 19.98f,
                )
                // a 2.83 2.83 0 1 1 -4.17 -3.81
                arcToRelative(
                    a = 2.83f,
                    b = 2.83f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.17f,
                    dy1 = -3.81f,
                )
                // A 1 1 0 1 1 4 12
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 12.0f,
                )
                // m 3.83 -4.17
                moveToRelative(dx = 3.83f, dy = -4.17f)
                // l 8.34 8.34
                lineToRelative(dx = 8.34f, dy = 8.34f)
            }
        }.build().also { _clover = it }
    }


@Suppress("ObjectPropertyName")
private var _clover: ImageVector? = null
