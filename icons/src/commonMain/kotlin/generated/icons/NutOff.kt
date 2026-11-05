package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.NutOff: ImageVector
    get() {
        val current = _nutOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.NutOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.87 11.87 a1 1 0 0 1 -.49 .25 A10.5 10.5 0 0 1 6.5 11.5 c0 1.27 -.23 3.58 -.65 5.35 a10 10 0 0 1 -.42 1.36 c-.21 .52 -.82 .55 -1.17 .12 a10 10 0 0 1 .68 -13.4 m7.2 1.56 a27 27 0 0 0 4.7 -.64 L20 9 a7.2 7.2 0 0 1 1.7 7.05 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.87 11.87
                moveTo(x = 11.87f, y = 11.87f)
                // a 1 1 0 0 1 -0.49 0.25
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.49f,
                    dy1 = 0.25f,
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
                // c 0 1.27 -0.23 3.58 -0.65 5.35
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.27f,
                    dx2 = -0.23f,
                    dy2 = 3.58f,
                    dx3 = -0.65f,
                    dy3 = 5.35f,
                )
                // a 10 10 0 0 1 -0.42 1.36
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.42f,
                    dy1 = 1.36f,
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
                // a 10 10 0 0 1 0.68 -13.4
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.68f,
                    dy1 = -13.4f,
                )
                // m 7.2 1.56
                moveToRelative(dx = 7.2f, dy = 1.56f)
                // a 27 27 0 0 0 4.7 -0.64
                arcToRelative(
                    a = 27.0f,
                    b = 27.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.7f,
                    dy1 = -0.64f,
                )
                // L 20 9
                lineTo(x = 20.0f, y = 9.0f)
                // a 7.2 7.2 0 0 1 1.7 7.05
                arcToRelative(
                    a = 7.2f,
                    b = 7.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 7.05f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
            // M20.7 20.7 A1 1 0 0 1 20 21 h-1 c-1.07 0 -1.65 .24 -2.48 .55 A7.2 7.2 0 0 1 9 20 l-3.15 -3.15 M8.35 2.7 a10 10 0 0 1 9.98 1.56 c.43 .35 .4 .97 -.12 1.17 a10 10 0 0 1 -1.36 .42
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20.7 20.7
                moveTo(x = 20.7f, y = 20.7f)
                // A 1 1 0 0 1 20 21
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 21.0f,
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
                // M 8.35 2.7
                moveTo(x = 8.35f, y = 2.7f)
                // a 10 10 0 0 1 9.98 1.56
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.98f,
                    dy1 = 1.56f,
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
                // a 10 10 0 0 1 -1.36 0.42
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.36f,
                    dy1 = 0.42f,
                )
            }
        }.build().also { _nutOff = it }
    }

@Suppress("ObjectPropertyName")
private var _nutOff: ImageVector? = null
