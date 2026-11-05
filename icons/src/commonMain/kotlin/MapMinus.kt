package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MapMinus: ImageVector
    get() {
        val current = _mapMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "MapMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m11 19 -1.1 -.55 a2 2 0 0 0 -1.8 0 l-3.65 1.83 A1 1 0 0 1 3 19.38 V6.62 a1 1 0 0 1 .55 -.9 l4.56 -2.27 a2 2 0 0 1 1.78 0 l4.22 2.1 a2 2 0 0 0 1.78 0 l3.66 -1.83 A1 1 0 0 1 21 4.62 V14 m-6 -8.24 V14 m6 4 h-6 M9 3.24 v15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 19
                moveTo(x = 11.0f, y = 19.0f)
                // l -1.1 -0.55
                lineToRelative(dx = -1.1f, dy = -0.55f)
                // a 2 2 0 0 0 -1.8 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.8f,
                    dy1 = 0.0f,
                )
                // l -3.65 1.83
                lineToRelative(dx = -3.65f, dy = 1.83f)
                // A 1 1 0 0 1 3 19.38
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.0f,
                    y1 = 19.38f,
                )
                // V 6.62
                verticalLineTo(y = 6.62f)
                // a 1 1 0 0 1 0.55 -0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.55f,
                    dy1 = -0.9f,
                )
                // l 4.56 -2.27
                lineToRelative(dx = 4.56f, dy = -2.27f)
                // a 2 2 0 0 1 1.78 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.78f,
                    dy1 = 0.0f,
                )
                // l 4.22 2.1
                lineToRelative(dx = 4.22f, dy = 2.1f)
                // a 2 2 0 0 0 1.78 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.78f,
                    dy1 = 0.0f,
                )
                // l 3.66 -1.83
                lineToRelative(dx = 3.66f, dy = -1.83f)
                // A 1 1 0 0 1 21 4.62
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 4.62f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // m -6 -8.24
                moveToRelative(dx = -6.0f, dy = -8.24f)
                // V 14
                verticalLineTo(y = 14.0f)
                // m 6 4
                moveToRelative(dx = 6.0f, dy = 4.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // M 9 3.24
                moveTo(x = 9.0f, y = 3.24f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
            }
        }.build().also { _mapMinus = it }
    }


@Suppress("ObjectPropertyName")
private var _mapMinus: ImageVector? = null
