package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Croissant: ImageVector
    get() {
        val current = _croissant
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Croissant",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.2 18 H4.77 a1.5 1.5 0 0 1 -1.35 -.97 11 11 0 0 1 .13 -6.49 M18 10.2 V4.77 a1.5 1.5 0 0 0 -.97 -1.35 11 11 0 0 0 -6.49 .13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.2 18
                moveTo(x = 10.2f, y = 18.0f)
                // H 4.77
                horizontalLineTo(x = 4.77f)
                // a 1.5 1.5 0 0 1 -1.35 -0.97
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.35f,
                    dy1 = -0.97f,
                )
                // a 11 11 0 0 1 0.13 -6.49
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.13f,
                    dy1 = -6.49f,
                )
                // M 18 10.2
                moveTo(x = 18.0f, y = 10.2f)
                // V 4.77
                verticalLineTo(y = 4.77f)
                // a 1.5 1.5 0 0 0 -0.97 -1.35
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.97f,
                    dy1 = -1.35f,
                )
                // a 11 11 0 0 0 -6.49 0.13
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.49f,
                    dy1 = 0.13f,
                )
            }
            // M18 5 a4 3 0 0 1 4 3 2 2 0 0 1 -2 2 10 10 0 0 0 -5.14 1.42 M5 18 a3 4 0 0 0 3 4 2 2 0 0 0 2 -2 10 10 0 0 1 1.42 -5.14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // a 4 3 0 0 1 4 3
                arcToRelative(
                    a = 4.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 3.0f,
                )
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
                // a 10 10 0 0 0 -5.14 1.42
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.14f,
                    dy1 = 1.42f,
                )
                // M 5 18
                moveTo(x = 5.0f, y = 18.0f)
                // a 3 4 0 0 0 3 4
                arcToRelative(
                    a = 3.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 4.0f,
                )
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
                // a 10 10 0 0 1 1.42 -5.14
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.42f,
                    dy1 = -5.14f,
                )
            }
            // M8.7 2.55 a10 10 0 0 0 -6.15 6.16 1.5 1.5 0 0 0 .68 1.62 l9.8 5.42 a2 2 0 0 0 2.72 -2.71 l-5.42 -9.81 a1.5 1.5 0 0 0 -1.62 -.68
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.7 2.55
                moveTo(x = 8.7f, y = 2.55f)
                // a 10 10 0 0 0 -6.15 6.16
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.15f,
                    dy1 = 6.16f,
                )
                // a 1.5 1.5 0 0 0 0.68 1.62
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.68f,
                    dy1 = 1.62f,
                )
                // l 9.8 5.42
                lineToRelative(dx = 9.8f, dy = 5.42f)
                // a 2 2 0 0 0 2.72 -2.71
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.72f,
                    dy1 = -2.71f,
                )
                // l -5.42 -9.81
                lineToRelative(dx = -5.42f, dy = -9.81f)
                // a 1.5 1.5 0 0 0 -1.62 -0.68
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.62f,
                    dy1 = -0.68f,
                )
            }
        }.build().also { _croissant = it }
    }

@Suppress("ObjectPropertyName")
private var _croissant: ImageVector? = null
