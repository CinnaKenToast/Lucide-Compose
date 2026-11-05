package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Earbuds: ImageVector
    get() {
        val current = _earbuds
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Earbuds",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 3 a4 4 90 0 0 -4 4 v12 a2 2 90 0 0 4 0 v-8 a5 5 90 0 0 3.75 -1.7 A1 1 90 0 0 22 8.66 v-3.3 a1 1 90 0 0 -.25 -.66 A5 5 90 0 0 18 3 M6 3 a4 4 0 0 1 4 4 v12 a2 2 0 0 1 -4 0 v-8 a5 5 0 0 1 -3.75 -1.7 A1 1 0 0 1 2 8.66 v-3.3 A1 1 0 0 1 2.25 4.7 5 5 0 0 1 6 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 3
                moveTo(x = 18.0f, y = 3.0f)
                // a 4 4 90 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 90.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 90 0 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 90.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 5 5 90 0 0 3.75 -1.7
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 90.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.75f,
                    dy1 = -1.7f,
                )
                // A 1 1 90 0 0 22 8.66
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 90.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 8.66f,
                )
                // v -3.3
                verticalLineToRelative(dy = -3.3f)
                // a 1 1 90 0 0 -0.25 -0.66
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 90.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.25f,
                    dy1 = -0.66f,
                )
                // A 5 5 90 0 0 18 3
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 90.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 3.0f,
                )
                // M 6 3
                moveTo(x = 6.0f, y = 3.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 5 5 0 0 1 -3.75 -1.7
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.75f,
                    dy1 = -1.7f,
                )
                // A 1 1 0 0 1 2 8.66
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 8.66f,
                )
                // v -3.3
                verticalLineToRelative(dy = -3.3f)
                // A 1 1 0 0 1 2.25 4.7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.25f,
                    y1 = 4.7f,
                )
                // A 5 5 0 0 1 6 3
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 3.0f,
                )
            }
        }.build().also { _earbuds = it }
    }

@Suppress("ObjectPropertyName")
private var _earbuds: ImageVector? = null
