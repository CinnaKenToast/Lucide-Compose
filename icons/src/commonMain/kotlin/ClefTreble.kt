package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClefTreble: ImageVector
    get() {
        val current = _clefTreble
        if (current != null) return current

        return ImageVector.Builder(
            name = "ClefTreble",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.59 21.41 a2 2 0 0 0 3.37 -1.79 L11.04 4.38 A2 2 0 1 1 14.4 5.4 C12.41 7.41 7 8 7 13 a5 5 0 0 0 5 5 5 4 0 0 0 5 -4 3 3 0 0 0 -3 -3 3 2 0 0 0 -3 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.59 21.41
                moveTo(x = 10.59f, y = 21.41f)
                // a 2 2 0 0 0 3.37 -1.79
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.37f,
                    dy1 = -1.79f,
                )
                // L 11.04 4.38
                lineTo(x = 11.04f, y = 4.38f)
                // A 2 2 0 1 1 14.4 5.4
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 14.4f,
                    y1 = 5.4f,
                )
                // C 12.41 7.41 7 8 7 13
                curveTo(
                    x1 = 12.41f,
                    y1 = 7.41f,
                    x2 = 7.0f,
                    y2 = 8.0f,
                    x3 = 7.0f,
                    y3 = 13.0f,
                )
                // a 5 5 0 0 0 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                // a 5 4 0 0 0 5 -4
                arcToRelative(
                    a = 5.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = -4.0f,
                )
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // a 3 2 0 0 0 -3 2
                arcToRelative(
                    a = 3.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 2.0f,
                )
            }
        }.build().also { _clefTreble = it }
    }


@Suppress("ObjectPropertyName")
private var _clefTreble: ImageVector? = null
