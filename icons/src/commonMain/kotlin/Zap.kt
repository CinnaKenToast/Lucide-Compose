package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Zap: ImageVector
    get() {
        val current = _zap
        if (current != null) return current

        return ImageVector.Builder(
            name = "Zap",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.91 4 a1.5 1.5 0 0 0 -2.47 -1.56 l-9 9 A1.5 1.5 0 0 0 5.5 14 h4 a.5 .5 0 0 1 .47 .67 L8.1 20 a1.5 1.5 0 0 0 2.47 1.56 l9 -9 A1.5 1.5 0 0 0 18.5 10 h-4 a.5 .5 0 0 1 -.47 -.67z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.91 4
                moveTo(x = 15.91f, y = 4.0f)
                // a 1.5 1.5 0 0 0 -2.47 -1.56
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.47f,
                    dy1 = -1.56f,
                )
                // l -9 9
                lineToRelative(dx = -9.0f, dy = 9.0f)
                // A 1.5 1.5 0 0 0 5.5 14
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.5f,
                    y1 = 14.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 0.5 0.5 0 0 1 0.47 0.67
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.47f,
                    dy1 = 0.67f,
                )
                // L 8.1 20
                lineTo(x = 8.1f, y = 20.0f)
                // a 1.5 1.5 0 0 0 2.47 1.56
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.47f,
                    dy1 = 1.56f,
                )
                // l 9 -9
                lineToRelative(dx = 9.0f, dy = -9.0f)
                // A 1.5 1.5 0 0 0 18.5 10
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.5f,
                    y1 = 10.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 0.5 0.5 0 0 1 -0.47 -0.67z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.47f,
                    dy1 = -0.67f,
                )
                close()
            }
        }.build().also { _zap = it }
    }


@Suppress("ObjectPropertyName")
private var _zap: ImageVector? = null
