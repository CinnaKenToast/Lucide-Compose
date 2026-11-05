package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BellPlus: ImageVector
    get() {
        val current = _bellPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "BellPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.27 21 a2 2 0 0 0 3.46 0 M15 8 h6 m-3 -3 v6 m2 3.46 a9 9 0 0 0 .74 .87 A1 1 0 0 1 20 17 H4 a1 1 0 0 1 -.74 -1.67 C4.59 13.96 6 12.5 6 8 a6 6 0 0 1 8.75 -5.33
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.27 21
                moveTo(x = 10.27f, y = 21.0f)
                // a 2 2 0 0 0 3.46 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.46f,
                    dy1 = 0.0f,
                )
                // M 15 8
                moveTo(x = 15.0f, y = 8.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 -3
                moveToRelative(dx = -3.0f, dy = -3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 2 3.46
                moveToRelative(dx = 2.0f, dy = 3.46f)
                // a 9 9 0 0 0 0.74 0.87
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.74f,
                    dy1 = 0.87f,
                )
                // A 1 1 0 0 1 20 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 17.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 1 1 0 0 1 -0.74 -1.67
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.74f,
                    dy1 = -1.67f,
                )
                // C 4.59 13.96 6 12.5 6 8
                curveTo(
                    x1 = 4.59f,
                    y1 = 13.96f,
                    x2 = 6.0f,
                    y2 = 12.5f,
                    x3 = 6.0f,
                    y3 = 8.0f,
                )
                // a 6 6 0 0 1 8.75 -5.33
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.75f,
                    dy1 = -5.33f,
                )
            }
        }.build().also { _bellPlus = it }
    }


@Suppress("ObjectPropertyName")
private var _bellPlus: ImageVector? = null
