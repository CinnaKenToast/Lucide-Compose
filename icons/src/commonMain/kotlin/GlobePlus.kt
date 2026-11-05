package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GlobePlus: ImageVector
    get() {
        val current = _globePlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "GlobePlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.93 10.56 A14.5 14.5 0 0 1 12 22 a1 1 0 0 1 0 -20 l.68 .77 M19 2 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.93 10.56
                moveTo(x = 15.93f, y = 10.56f)
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
                // a 1 1 0 0 1 0 -20
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -20.0f,
                )
                // l 0.68 0.77
                lineToRelative(dx = 0.68f, dy = 0.77f)
                // M 19 2
                moveTo(x = 19.0f, y = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
            // M21.92 10.73 A10 10 0 0 1 12 22 a14.5 14.5 0 0 1 0 -20 10 10 0 0 1 1.27 .08 M22 12 H2 m20 -7 h-6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.92 10.73
                moveTo(x = 21.92f, y = 10.73f)
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
                // a 14.5 14.5 0 0 1 0 -20
                arcToRelative(
                    a = 14.5f,
                    b = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -20.0f,
                )
                // a 10 10 0 0 1 1.27 0.08
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.27f,
                    dy1 = 0.08f,
                )
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 20 -7
                moveToRelative(dx = 20.0f, dy = -7.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
            }
        }.build().also { _globePlus = it }
    }


@Suppress("ObjectPropertyName")
private var _globePlus: ImageVector? = null
