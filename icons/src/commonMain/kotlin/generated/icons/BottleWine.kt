package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BottleWine: ImageVector
    get() {
        val current = _bottleWine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BottleWine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 3 a1 1 0 0 1 1 -1 h2 a1 1 0 0 1 1 1 v2 a6 6 0 0 0 1.2 3.6 l.6 .8 A6 6 0 0 1 17 13 v8 a1 1 0 0 1 -1 1 H8 a1 1 0 0 1 -1 -1 v-8 a6 6 0 0 1 1.2 -3.6 l.6 -.8 A6 6 0 0 0 10 5z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 3
                moveTo(x = 10.0f, y = 3.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 6 6 0 0 0 1.2 3.6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.2f,
                    dy1 = 3.6f,
                )
                // l 0.6 0.8
                lineToRelative(dx = 0.6f, dy = 0.8f)
                // A 6 6 0 0 1 17 13
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 13.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 6 6 0 0 1 1.2 -3.6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.2f,
                    dy1 = -3.6f,
                )
                // l 0.6 -0.8
                lineToRelative(dx = 0.6f, dy = -0.8f)
                // A 6 6 0 0 0 10 5z
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 5.0f,
                )
                close()
            }
            // M17 13 h-4 a1 1 0 0 0 -1 1 v3 a1 1 0 0 0 1 1 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 13
                moveTo(x = 17.0f, y = 13.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _bottleWine = it }
    }

@Suppress("ObjectPropertyName")
private var _bottleWine: ImageVector? = null
