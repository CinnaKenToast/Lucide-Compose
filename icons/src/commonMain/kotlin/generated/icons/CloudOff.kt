package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudOff: ImageVector
    get() {
        val current = _cloudOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CloudOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.94 5.27 A7 7 0 0 1 15.71 10 h1.79 a4.5 4.5 0 0 1 4.22 6.06 M18.8 18.8 A5 5 0 0 1 17.5 19 H9 A7 7 0 0 1 5.79 5.78 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.94 5.27
                moveTo(x = 10.94f, y = 5.27f)
                // A 7 7 0 0 1 15.71 10
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.71f,
                    y1 = 10.0f,
                )
                // h 1.79
                horizontalLineToRelative(dx = 1.79f)
                // a 4.5 4.5 0 0 1 4.22 6.06
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.22f,
                    dy1 = 6.06f,
                )
                // M 18.8 18.8
                moveTo(x = 18.8f, y = 18.8f)
                // A 5 5 0 0 1 17.5 19
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.5f,
                    y1 = 19.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // A 7 7 0 0 1 5.79 5.78
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.79f,
                    y1 = 5.78f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _cloudOff = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudOff: ImageVector? = null
