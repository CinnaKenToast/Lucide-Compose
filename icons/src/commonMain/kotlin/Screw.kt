package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Screw: ImageVector
    get() {
        val current = _screw
        if (current != null) return current

        return ImageVector.Builder(
            name = "Screw",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 9 v10 m4 -6 v2 m2.5 -4.5 L5.7 21.3 A2.4 2.4 0 0 1 4 22 H2.5 A.5 .5 0 0 1 2 21.5 V20 a2.4 2.4 0 0 1 .7 -1.7 L13.5 7.5 m7.32 4.07 a6 6 0 0 0 .97 -5.16 .6 .6 0 0 0 -.98 -.22 l-.46 .46 a1.2 1.2 0 0 1 -1.7 0 l-1.3 -1.3 a1.2 1.2 0 0 1 0 -1.7 l.46 -.46 a.6 .6 0 0 0 -.22 -.98 6 6 0 0 0 -5.16 .97 A2 2 0 0 0 12.2 6.2 l5.6 5.6 a2 2 0 0 0 3.02 -.22 M6 13 v8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 9
                moveTo(x = 10.0f, y = 9.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // m 4 -6
                moveToRelative(dx = 4.0f, dy = -6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 2.5 -4.5
                moveToRelative(dx = 2.5f, dy = -4.5f)
                // L 5.7 21.3
                lineTo(x = 5.7f, y = 21.3f)
                // A 2.4 2.4 0 0 1 4 22
                arcTo(
                    horizontalEllipseRadius = 2.4f,
                    verticalEllipseRadius = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 22.0f,
                )
                // H 2.5
                horizontalLineTo(x = 2.5f)
                // A 0.5 0.5 0 0 1 2 21.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 21.5f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // a 2.4 2.4 0 0 1 0.7 -1.7
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.7f,
                    dy1 = -1.7f,
                )
                // L 13.5 7.5
                lineTo(x = 13.5f, y = 7.5f)
                // m 7.32 4.07
                moveToRelative(dx = 7.32f, dy = 4.07f)
                // a 6 6 0 0 0 0.97 -5.16
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.97f,
                    dy1 = -5.16f,
                )
                // a 0.6 0.6 0 0 0 -0.98 -0.22
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.98f,
                    dy1 = -0.22f,
                )
                // l -0.46 0.46
                lineToRelative(dx = -0.46f, dy = 0.46f)
                // a 1.2 1.2 0 0 1 -1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                // l -1.3 -1.3
                lineToRelative(dx = -1.3f, dy = -1.3f)
                // a 1.2 1.2 0 0 1 0 -1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.7f,
                )
                // l 0.46 -0.46
                lineToRelative(dx = 0.46f, dy = -0.46f)
                // a 0.6 0.6 0 0 0 -0.22 -0.98
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.22f,
                    dy1 = -0.98f,
                )
                // a 6 6 0 0 0 -5.16 0.97
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.16f,
                    dy1 = 0.97f,
                )
                // A 2 2 0 0 0 12.2 6.2
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.2f,
                    y1 = 6.2f,
                )
                // l 5.6 5.6
                lineToRelative(dx = 5.6f, dy = 5.6f)
                // a 2 2 0 0 0 3.02 -0.22
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.02f,
                    dy1 = -0.22f,
                )
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
            }
        }.build().also { _screw = it }
    }


@Suppress("ObjectPropertyName")
private var _screw: ImageVector? = null
