package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GlobeOff: ImageVector
    get() {
        val current = _globeOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.GlobeOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.11 4.46 A15 15 0 0 1 12 2 a10 10 0 0 1 9.31 13.64 m-5.75 -.08 A14.5 14.5 0 0 1 12 22 10 10 0 0 1 4.93 4.93
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.11 4.46
                moveTo(x = 10.11f, y = 4.46f)
                // A 15 15 0 0 1 12 2
                arcTo(
                    horizontalEllipseRadius = 15.0f,
                    verticalEllipseRadius = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 2.0f,
                )
                // a 10 10 0 0 1 9.31 13.64
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.31f,
                    dy1 = 13.64f,
                )
                // m -5.75 -0.08
                moveToRelative(dx = -5.75f, dy = -0.08f)
                // A 14.5 14.5 0 0 1 12 22
                arcTo(
                    horizontalEllipseRadius = 14.5f,
                    verticalEllipseRadius = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 22.0f,
                )
                // A 10 10 0 0 1 4.93 4.93
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.93f,
                    y1 = 4.93f,
                )
            }
            // M15.9 10.23 A14.5 14.5 0 0 0 12 2 a10 10 0 0 0 -3.64 .69 m9.3 9.31 H22 m-2.93 7.07 A10 10 0 0 1 12 22 14.5 14.5 0 0 1 8.44 8.45 M2 12 h10 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.9 10.23
                moveTo(x = 15.9f, y = 10.23f)
                // A 14.5 14.5 0 0 0 12 2
                arcTo(
                    horizontalEllipseRadius = 14.5f,
                    verticalEllipseRadius = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 2.0f,
                )
                // a 10 10 0 0 0 -3.64 0.69
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.64f,
                    dy1 = 0.69f,
                )
                // m 9.3 9.31
                moveToRelative(dx = 9.3f, dy = 9.31f)
                // H 22
                horizontalLineTo(x = 22.0f)
                // m -2.93 7.07
                moveToRelative(dx = -2.93f, dy = 7.07f)
                // A 10 10 0 0 1 12 22
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 22.0f,
                )
                // A 14.5 14.5 0 0 1 8.44 8.45
                arcTo(
                    horizontalEllipseRadius = 14.5f,
                    verticalEllipseRadius = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.44f,
                    y1 = 8.45f,
                )
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _globeOff = it }
    }

@Suppress("ObjectPropertyName")
private var _globeOff: ImageVector? = null
