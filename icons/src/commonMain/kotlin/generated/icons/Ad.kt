package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ad: ImageVector
    get() {
        val current = _ad
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Ad",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 13 H6 m4 2 v-4 a2 2 0 0 0 -4 0 v4 m8 -.5 a.5 .5 0 0 0 .5 .5 h1 a2.5 2.5 0 0 0 2.5 -2.5 v-1 A2.5 2.5 0 0 0 15.5 9 h-1 A.5 .5 0 0 0 14 9.5z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // m 4 2
                moveToRelative(dx = 4.0f, dy = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // a 2 2 0 0 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 8 -0.5
                moveToRelative(dx = 8.0f, dy = -0.5f)
                // a 0.5 0.5 0 0 0 0.5 0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = 0.5f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 2.5 2.5 0 0 0 2.5 -2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.5f,
                    dy1 = -2.5f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // A 2.5 2.5 0 0 0 15.5 9
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.5f,
                    y1 = 9.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // A 0.5 0.5 0 0 0 14 9.5z
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 9.5f,
                )
                close()
            }
            // <rect width="20" height="14" rx="2.0" x="2.0" y="5.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 7
                moveTo(x = 2.0f, y = 7.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // h -16
                horizontalLineToRelative(dx = -16.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _ad = it }
    }

@Suppress("ObjectPropertyName")
private var _ad: ImageVector? = null
