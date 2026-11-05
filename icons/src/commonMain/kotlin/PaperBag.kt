package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PaperBag: ImageVector
    get() {
        val current = _paperBag
        if (current != null) return current

        return ImageVector.Builder(
            name = "PaperBag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5.36 3.85 C4 6 3 9.65 3 12.65 V19 a2 2 0 0 0 2 2 h14 a2 2 0 0 0 2 -2 v-5 c0 -2.33 -1.82 -4.67 -2.62 -7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.36 3.85
                moveTo(x = 5.36f, y = 3.85f)
                // C 4 6 3 9.65 3 12.65
                curveTo(
                    x1 = 4.0f,
                    y1 = 6.0f,
                    x2 = 3.0f,
                    y2 = 9.65f,
                    x3 = 3.0f,
                    y3 = 12.65f,
                )
                // V 19
                verticalLineTo(y = 19.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // c 0 -2.33 -1.82 -4.67 -2.62 -7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.33f,
                    dx2 = -1.82f,
                    dy2 = -4.67f,
                    dx3 = -2.62f,
                    dy3 = -7.0f,
                )
            }
            // M7 3 h11.38 a2 2 0 0 1 1.79 1.1 l.72 1.45 A1 1 0 0 1 20 7 h-8.52 a2 2 0 0 1 -1.79 -1.1 L8.8 4.1 a2 2 0 1 0 -3.58 1.8 l2.26 4.52 A5 5 0 0 1 8 12.65 V21
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 3
                moveTo(x = 7.0f, y = 3.0f)
                // h 11.38
                horizontalLineToRelative(dx = 11.38f)
                // a 2 2 0 0 1 1.79 1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.79f,
                    dy1 = 1.1f,
                )
                // l 0.72 1.45
                lineToRelative(dx = 0.72f, dy = 1.45f)
                // A 1 1 0 0 1 20 7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 7.0f,
                )
                // h -8.52
                horizontalLineToRelative(dx = -8.52f)
                // a 2 2 0 0 1 -1.79 -1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.79f,
                    dy1 = -1.1f,
                )
                // L 8.8 4.1
                lineTo(x = 8.8f, y = 4.1f)
                // a 2 2 0 1 0 -3.58 1.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.58f,
                    dy1 = 1.8f,
                )
                // l 2.26 4.52
                lineToRelative(dx = 2.26f, dy = 4.52f)
                // A 5 5 0 0 1 8 12.65
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 12.65f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
            }
        }.build().also { _paperBag = it }
    }


@Suppress("ObjectPropertyName")
private var _paperBag: ImageVector? = null
