package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ribbon: ImageVector
    get() {
        val current = _ribbon
        if (current != null) return current

        return ImageVector.Builder(
            name = "Ribbon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 11.22 C11 10 10 9 10 8 a2 2 0 0 1 4 0 c0 1 -1 2 -2.01 3.22 M12 18 l2.57 -3.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 11.22
                moveTo(x = 12.0f, y = 11.22f)
                // C 11 10 10 9 10 8
                curveTo(
                    x1 = 11.0f,
                    y1 = 10.0f,
                    x2 = 10.0f,
                    y2 = 9.0f,
                    x3 = 10.0f,
                    y3 = 8.0f,
                )
                // a 2 2 0 0 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // c 0 1 -1 2 -2.01 3.22
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -1.0f,
                    dy2 = 2.0f,
                    dx3 = -2.01f,
                    dy3 = 3.22f,
                )
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // l 2.57 -3.5
                lineToRelative(dx = 2.57f, dy = -3.5f)
            }
            // M6.24 9.02 A7 7 0 0 1 17.75 9 m-8.4 5.52 L12 11.22
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.24 9.02
                moveTo(x = 6.24f, y = 9.02f)
                // A 7 7 0 0 1 17.75 9
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.75f,
                    y1 = 9.0f,
                )
                // m -8.4 5.52
                moveToRelative(dx = -8.4f, dy = 5.52f)
                // L 12 11.22
                lineTo(x = 12.0f, y = 11.22f)
            }
            // M9.35 14.53 C7.73 12.25 6 10.23 6 7 a6 5 0 0 1 12 0 c0 3.22 -1.78 5.24 -3.43 7.5 l3.56 4.53 a1 1 0 0 1 -.2 1.43 l-1.9 1.36 a1 1 0 0 1 -1.38 -.22 L12 18 l-2.68 3.6 a1 1 0 0 1 -1.39 .2 l-1.86 -1.35 a1 1 0 0 1 -.2 -1.42z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.35 14.53
                moveTo(x = 9.35f, y = 14.53f)
                // C 7.73 12.25 6 10.23 6 7
                curveTo(
                    x1 = 7.73f,
                    y1 = 12.25f,
                    x2 = 6.0f,
                    y2 = 10.23f,
                    x3 = 6.0f,
                    y3 = 7.0f,
                )
                // a 6 5 0 0 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // c 0 3.22 -1.78 5.24 -3.43 7.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.22f,
                    dx2 = -1.78f,
                    dy2 = 5.24f,
                    dx3 = -3.43f,
                    dy3 = 7.5f,
                )
                // l 3.56 4.53
                lineToRelative(dx = 3.56f, dy = 4.53f)
                // a 1 1 0 0 1 -0.2 1.43
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.2f,
                    dy1 = 1.43f,
                )
                // l -1.9 1.36
                lineToRelative(dx = -1.9f, dy = 1.36f)
                // a 1 1 0 0 1 -1.38 -0.22
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.38f,
                    dy1 = -0.22f,
                )
                // L 12 18
                lineTo(x = 12.0f, y = 18.0f)
                // l -2.68 3.6
                lineToRelative(dx = -2.68f, dy = 3.6f)
                // a 1 1 0 0 1 -1.39 0.2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.39f,
                    dy1 = 0.2f,
                )
                // l -1.86 -1.35
                lineToRelative(dx = -1.86f, dy = -1.35f)
                // a 1 1 0 0 1 -0.2 -1.42z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.2f,
                    dy1 = -1.42f,
                )
                close()
            }
        }.build().also { _ribbon = it }
    }


@Suppress("ObjectPropertyName")
private var _ribbon: ImageVector? = null
