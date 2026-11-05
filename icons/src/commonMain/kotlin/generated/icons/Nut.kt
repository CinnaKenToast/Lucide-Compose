package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Nut: ImageVector
    get() {
        val current = _nut
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Nut",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16.85 5.85 20 9 a7.2 7.2 0 0 1 1.55 7.52 C21.25 17.35 21 17.93 21 19 v1 a1 1 0 0 1 -1 1 h-1 c-1.07 0 -1.65 .24 -2.48 .55 A7.2 7.2 0 0 1 9 20 l-3.15 -3.15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.85 5.85
                moveTo(x = 16.85f, y = 5.85f)
                // L 20 9
                lineTo(x = 20.0f, y = 9.0f)
                // a 7.2 7.2 0 0 1 1.55 7.52
                arcToRelative(
                    a = 7.2f,
                    b = 7.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.55f,
                    dy1 = 7.52f,
                )
                // C 21.25 17.35 21 17.93 21 19
                curveTo(
                    x1 = 21.25f,
                    y1 = 17.35f,
                    x2 = 21.0f,
                    y2 = 17.93f,
                    x3 = 21.0f,
                    y3 = 19.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -1.07 0 -1.65 0.24 -2.48 0.55
                curveToRelative(
                    dx1 = -1.07f,
                    dy1 = 0.0f,
                    dx2 = -1.65f,
                    dy2 = 0.24f,
                    dx3 = -2.48f,
                    dy3 = 0.55f,
                )
                // A 7.2 7.2 0 0 1 9 20
                arcTo(
                    horizontalEllipseRadius = 7.2f,
                    verticalEllipseRadius = 7.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 20.0f,
                )
                // l -3.15 -3.15
                lineToRelative(dx = -3.15f, dy = -3.15f)
            }
            // M18.21 5.43 C16.5 6.12 13.14 6.5 11.5 6.5 a9.6 9.6 0 0 1 .61 4.88 .9 .9 0 0 1 -.73 .74 A10.5 10.5 0 0 1 6.5 11.5 c0 1.64 -.38 5 -1.07 6.71 -.21 .52 -.82 .55 -1.17 .12 A10 10 0 0 1 18.33 4.26 c.43 .35 .4 .97 -.12 1.17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.21 5.43
                moveTo(x = 18.21f, y = 5.43f)
                // C 16.5 6.12 13.14 6.5 11.5 6.5
                curveTo(
                    x1 = 16.5f,
                    y1 = 6.12f,
                    x2 = 13.14f,
                    y2 = 6.5f,
                    x3 = 11.5f,
                    y3 = 6.5f,
                )
                // a 9.6 9.6 0 0 1 0.61 4.88
                arcToRelative(
                    a = 9.6f,
                    b = 9.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.61f,
                    dy1 = 4.88f,
                )
                // a 0.9 0.9 0 0 1 -0.73 0.74
                arcToRelative(
                    a = 0.9f,
                    b = 0.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.73f,
                    dy1 = 0.74f,
                )
                // A 10.5 10.5 0 0 1 6.5 11.5
                arcTo(
                    horizontalEllipseRadius = 10.5f,
                    verticalEllipseRadius = 10.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.5f,
                    y1 = 11.5f,
                )
                // c 0 1.64 -0.38 5 -1.07 6.71
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.64f,
                    dx2 = -0.38f,
                    dy2 = 5.0f,
                    dx3 = -1.07f,
                    dy3 = 6.71f,
                )
                // c -0.21 0.52 -0.82 0.55 -1.17 0.12
                curveToRelative(
                    dx1 = -0.21f,
                    dy1 = 0.52f,
                    dx2 = -0.82f,
                    dy2 = 0.55f,
                    dx3 = -1.17f,
                    dy3 = 0.12f,
                )
                // A 10 10 0 0 1 18.33 4.26
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.33f,
                    y1 = 4.26f,
                )
                // c 0.43 0.35 0.4 0.97 -0.12 1.17
                curveToRelative(
                    dx1 = 0.43f,
                    dy1 = 0.35f,
                    dx2 = 0.4f,
                    dy2 = 0.97f,
                    dx3 = -0.12f,
                    dy3 = 1.17f,
                )
            }
            // M4.93 4.93 3 3 a.7 .7 0 0 1 0 -1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.93 4.93
                moveTo(x = 4.93f, y = 4.93f)
                // L 3 3
                lineTo(x = 3.0f, y = 3.0f)
                // a 0.7 0.7 0 0 1 0 -1
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                )
            }
        }.build().also { _nut = it }
    }

@Suppress("ObjectPropertyName")
private var _nut: ImageVector? = null
