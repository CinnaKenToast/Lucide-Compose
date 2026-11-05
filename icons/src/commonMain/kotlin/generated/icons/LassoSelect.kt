package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LassoSelect: ImageVector
    get() {
        val current = _lassoSelect
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LassoSelect",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7 22 a5 5 0 0 1 -2 -4 m2 -1.07 a12 12 0 0 0 2.99 .91 M3.34 14 A6.8 6.8 0 0 1 2 10 c0 -4.42 4.48 -8 10 -8 s10 3.58 10 8 a7 7 0 0 1 -.33 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // a 5 5 0 0 1 -2 -4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -4.0f,
                )
                // m 2 -1.07
                moveToRelative(dx = 2.0f, dy = -1.07f)
                // a 12 12 0 0 0 2.99 0.91
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.99f,
                    dy1 = 0.91f,
                )
                // M 3.34 14
                moveTo(x = 3.34f, y = 14.0f)
                // A 6.8 6.8 0 0 1 2 10
                arcTo(
                    horizontalEllipseRadius = 6.8f,
                    verticalEllipseRadius = 6.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 10.0f,
                )
                // c 0 -4.42 4.48 -8 10 -8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.42f,
                    dx2 = 4.48f,
                    dy2 = -8.0f,
                    dx3 = 10.0f,
                    dy3 = -8.0f,
                )
                // s 10 3.58 10 8
                reflectiveCurveToRelative(
                    dx1 = 10.0f,
                    dy1 = 3.58f,
                    dx2 = 10.0f,
                    dy2 = 8.0f,
                )
                // a 7 7 0 0 1 -0.33 2
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.33f,
                    dy1 = 2.0f,
                )
            }
            // M5 18 a2 2 0 1 0 0 -4 2 2 0 0 0 0 4 m9.33 4 h-.09 A.4 .4 0 0 1 14 21.68 v-10 a.34 .34 0 0 1 .33 -.34 .3 .3 0 0 1 .21 .08 l7.34 6 a.33 .33 0 0 1 -.21 .59 h-4.49 l-2.57 3.85 A.4 .4 0 0 1 14.33 22
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 18
                moveTo(x = 5.0f, y = 18.0f)
                // a 2 2 0 1 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
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
                // m 9.33 4
                moveToRelative(dx = 9.33f, dy = 4.0f)
                // h -0.09
                horizontalLineToRelative(dx = -0.09f)
                // A 0.4 0.4 0 0 1 14 21.68
                arcTo(
                    horizontalEllipseRadius = 0.4f,
                    verticalEllipseRadius = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 21.68f,
                )
                // v -10
                verticalLineToRelative(dy = -10.0f)
                // a 0.34 0.34 0 0 1 0.33 -0.34
                arcToRelative(
                    a = 0.34f,
                    b = 0.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.33f,
                    dy1 = -0.34f,
                )
                // a 0.3 0.3 0 0 1 0.21 0.08
                arcToRelative(
                    a = 0.3f,
                    b = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.21f,
                    dy1 = 0.08f,
                )
                // l 7.34 6
                lineToRelative(dx = 7.34f, dy = 6.0f)
                // a 0.33 0.33 0 0 1 -0.21 0.59
                arcToRelative(
                    a = 0.33f,
                    b = 0.33f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.21f,
                    dy1 = 0.59f,
                )
                // h -4.49
                horizontalLineToRelative(dx = -4.49f)
                // l -2.57 3.85
                lineToRelative(dx = -2.57f, dy = 3.85f)
                // A 0.4 0.4 0 0 1 14.33 22
                arcTo(
                    horizontalEllipseRadius = 0.4f,
                    verticalEllipseRadius = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.33f,
                    y1 = 22.0f,
                )
            }
        }.build().also { _lassoSelect = it }
    }

@Suppress("ObjectPropertyName")
private var _lassoSelect: ImageVector? = null
