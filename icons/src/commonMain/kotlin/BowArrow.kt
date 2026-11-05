package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BowArrow: ImageVector
    get() {
        val current = _bowArrow
        if (current != null) return current

        return ImageVector.Builder(
            name = "BowArrow",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 3 h4 v4 m-2.43 4.08 a13 13 0 0 1 1.05 9.03 1.17 1.17 0 0 1 -1.91 .6 L14 17 m-7 -7 L3.29 6.29 a1.17 1.17 0 0 1 .6 -1.91 13 13 0 0 1 9.03 1.05 M7 14 a1.7 1.7 0 0 0 -1.2 .5 l-2.65 2.65 A.5 .5 0 0 0 3.5 18 H5 a1 1 0 0 1 1 1 v1.5 a.5 .5 0 0 0 .85 .35 l2.65 -2.64 A1.7 1.7 0 0 0 10 17 v-2 a1 1 0 0 0 -1 -1z m2.7 .3 L21 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 3
                moveTo(x = 17.0f, y = 3.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m -2.43 4.08
                moveToRelative(dx = -2.43f, dy = 4.08f)
                // a 13 13 0 0 1 1.05 9.03
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.05f,
                    dy1 = 9.03f,
                )
                // a 1.17 1.17 0 0 1 -1.91 0.6
                arcToRelative(
                    a = 1.17f,
                    b = 1.17f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.91f,
                    dy1 = 0.6f,
                )
                // L 14 17
                lineTo(x = 14.0f, y = 17.0f)
                // m -7 -7
                moveToRelative(dx = -7.0f, dy = -7.0f)
                // L 3.29 6.29
                lineTo(x = 3.29f, y = 6.29f)
                // a 1.17 1.17 0 0 1 0.6 -1.91
                arcToRelative(
                    a = 1.17f,
                    b = 1.17f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.6f,
                    dy1 = -1.91f,
                )
                // a 13 13 0 0 1 9.03 1.05
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.03f,
                    dy1 = 1.05f,
                )
                // M 7 14
                moveTo(x = 7.0f, y = 14.0f)
                // a 1.7 1.7 0 0 0 -1.2 0.5
                arcToRelative(
                    a = 1.7f,
                    b = 1.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.2f,
                    dy1 = 0.5f,
                )
                // l -2.65 2.65
                lineToRelative(dx = -2.65f, dy = 2.65f)
                // A 0.5 0.5 0 0 0 3.5 18
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.5f,
                    y1 = 18.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // v 1.5
                verticalLineToRelative(dy = 1.5f)
                // a 0.5 0.5 0 0 0 0.85 0.35
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.85f,
                    dy1 = 0.35f,
                )
                // l 2.65 -2.64
                lineToRelative(dx = 2.65f, dy = -2.64f)
                // A 1.7 1.7 0 0 0 10 17
                arcTo(
                    horizontalEllipseRadius = 1.7f,
                    verticalEllipseRadius = 1.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 17.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 1 1 0 0 0 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
                // m 2.7 0.3
                moveToRelative(dx = 2.7f, dy = 0.3f)
                // L 21 3
                lineTo(x = 21.0f, y = 3.0f)
            }
        }.build().also { _bowArrow = it }
    }


@Suppress("ObjectPropertyName")
private var _bowArrow: ImageVector? = null
