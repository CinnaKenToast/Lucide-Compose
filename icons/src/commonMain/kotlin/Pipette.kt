package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pipette: ImageVector
    get() {
        val current = _pipette
        if (current != null) return current

        return ImageVector.Builder(
            name = "Pipette",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12 9 -8.41 8.41 A2 2 0 0 0 3 18.83 v1.34 a2 2 0 0 1 -.59 1.42 A2 2 0 0 1 3.83 21 h1.34 a2 2 0 0 0 1.42 -.59 L15 12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 9
                moveTo(x = 12.0f, y = 9.0f)
                // l -8.41 8.41
                lineToRelative(dx = -8.41f, dy = 8.41f)
                // A 2 2 0 0 0 3 18.83
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 18.83f,
                )
                // v 1.34
                verticalLineToRelative(dy = 1.34f)
                // a 2 2 0 0 1 -0.59 1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.59f,
                    dy1 = 1.42f,
                )
                // A 2 2 0 0 1 3.83 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.83f,
                    y1 = 21.0f,
                )
                // h 1.34
                horizontalLineToRelative(dx = 1.34f)
                // a 2 2 0 0 0 1.42 -0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = -0.59f,
                )
                // L 15 12
                lineTo(x = 15.0f, y = 12.0f)
            }
            // m18 9 .4 .4 a1 1 0 1 1 -3 3 l-3.8 -3.8 a1 1 0 1 1 3 -3 L15 6 l3.4 -3.4 a1 1 0 1 1 3 3z M2 22 l.41 -.41
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 9
                moveTo(x = 18.0f, y = 9.0f)
                // l 0.4 0.4
                lineToRelative(dx = 0.4f, dy = 0.4f)
                // a 1 1 0 1 1 -3 3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // l -3.8 -3.8
                lineToRelative(dx = -3.8f, dy = -3.8f)
                // a 1 1 0 1 1 3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // L 15 6
                lineTo(x = 15.0f, y = 6.0f)
                // l 3.4 -3.4
                lineToRelative(dx = 3.4f, dy = -3.4f)
                // a 1 1 0 1 1 3 3z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                close()
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // l 0.41 -0.41
                lineToRelative(dx = 0.41f, dy = -0.41f)
            }
        }.build().also { _pipette = it }
    }


@Suppress("ObjectPropertyName")
private var _pipette: ImageVector? = null
