package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Amphora: ImageVector
    get() {
        val current = _amphora
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Amphora",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 2 v5.63 c0 .43 -.27 .8 -.65 .98 A6 6 0 0 0 6 14 c0 4 3 7 5 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // v 5.63
                verticalLineToRelative(dy = 5.63f)
                // c 0 0.43 -0.27 0.8 -0.65 0.98
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.43f,
                    dx2 = -0.27f,
                    dy2 = 0.8f,
                    dx3 = -0.65f,
                    dy3 = 0.98f,
                )
                // A 6 6 0 0 0 6 14
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 14.0f,
                )
                // c 0 4 3 7 5 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 3.0f,
                    dy2 = 7.0f,
                    dx3 = 5.0f,
                    dy3 = 8.0f,
                )
            }
            // M10 5 H8 a2 2 0 0 0 0 4 h.68 M14 2 v5.63 c0 .43 .27 .8 .65 .98 A6 6 0 0 1 18 14 c0 4 -3 7 -5 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 5
                moveTo(x = 10.0f, y = 5.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 2 2 0 0 0 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // h 0.68
                horizontalLineToRelative(dx = 0.68f)
                // M 14 2
                moveTo(x = 14.0f, y = 2.0f)
                // v 5.63
                verticalLineToRelative(dy = 5.63f)
                // c 0 0.43 0.27 0.8 0.65 0.98
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.43f,
                    dx2 = 0.27f,
                    dy2 = 0.8f,
                    dx3 = 0.65f,
                    dy3 = 0.98f,
                )
                // A 6 6 0 0 1 18 14
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 14.0f,
                )
                // c 0 4 -3 7 -5 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -3.0f,
                    dy2 = 7.0f,
                    dx3 = -5.0f,
                    dy3 = 8.0f,
                )
            }
            // M14 5 h2 a2 2 0 0 1 0 4 h-.68 M18 22 H6 M9 2 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 5
                moveTo(x = 14.0f, y = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // h -0.68
                horizontalLineToRelative(dx = -0.68f)
                // M 18 22
                moveTo(x = 18.0f, y = 22.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // M 9 2
                moveTo(x = 9.0f, y = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _amphora = it }
    }

@Suppress("ObjectPropertyName")
private var _amphora: ImageVector? = null
