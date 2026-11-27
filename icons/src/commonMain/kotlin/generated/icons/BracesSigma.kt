package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BracesSigma: ImageVector
    get() {
        val current = _bracesSigma
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BracesSigma",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 9 a1 1 0 0 0 -1 -1 H9.5 a.5 .5 0 0 0 -.42 .78 l1.78 2.67 a1 1 0 0 1 0 1.1 l-1.78 2.67 A.5 .5 0 0 0 9.5 16 h4.6 a.9 .9 0 0 0 .9 -.9 m2 5.9 h1 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 1 2 -2 2 2 0 0 1 -2 -2 V5 a2 2 0 0 0 -2 -2 h-1 M7 3 H6 a2 2 0 0 0 -2 2 v5 a2 2 0 0 1 -2 2 2 2 0 0 1 2 2 v5 a2 2 0 0 0 2 2 h1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // H 9.5
                horizontalLineTo(x = 9.5f)
                // a 0.5 0.5 0 0 0 -0.42 0.78
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.42f,
                    dy1 = 0.78f,
                )
                // l 1.78 2.67
                lineToRelative(dx = 1.78f, dy = 2.67f)
                // a 1 1 0 0 1 0 1.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.1f,
                )
                // l -1.78 2.67
                lineToRelative(dx = -1.78f, dy = 2.67f)
                // A 0.5 0.5 0 0 0 9.5 16
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.5f,
                    y1 = 16.0f,
                )
                // h 4.6
                horizontalLineToRelative(dx = 4.6f)
                // a 0.9 0.9 0 0 0 0.9 -0.9
                arcToRelative(
                    a = 0.9f,
                    b = 0.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.9f,
                    dy1 = -0.9f,
                )
                // m 2 5.9
                moveToRelative(dx = 2.0f, dy = 5.9f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // M 7 3
                moveTo(x = 7.0f, y = 3.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
            }
        }.build().also { _bracesSigma = it }
    }

@Suppress("ObjectPropertyName")
private var _bracesSigma: ImageVector? = null
