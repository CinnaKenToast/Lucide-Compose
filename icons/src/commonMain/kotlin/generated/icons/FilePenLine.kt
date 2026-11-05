package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FilePenLine: ImageVector
    get() {
        val current = _filePenLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FilePenLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14.36 13.63 a2 2 0 0 0 -.5 .86 l-.84 2.87 a.5 .5 0 0 0 .62 .62 l2.87 -.84 a2 2 0 0 0 .85 -.5 l4.02 -4.01 a1 1 0 0 0 -3 -3z m.13 -5.77 A1 1 0 0 1 14 7 V2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.36 13.63
                moveTo(x = 14.36f, y = 13.63f)
                // a 2 2 0 0 0 -0.5 0.86
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = 0.86f,
                )
                // l -0.84 2.87
                lineToRelative(dx = -0.84f, dy = 2.87f)
                // a 0.5 0.5 0 0 0 0.62 0.62
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.62f,
                    dy1 = 0.62f,
                )
                // l 2.87 -0.84
                lineToRelative(dx = 2.87f, dy = -0.84f)
                // a 2 2 0 0 0 0.85 -0.5
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.85f,
                    dy1 = -0.5f,
                )
                // l 4.02 -4.01
                lineToRelative(dx = 4.02f, dy = -4.01f)
                // a 1 1 0 0 0 -3 -3z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                close()
                // m 0.13 -5.77
                moveToRelative(dx = 0.13f, dy = -5.77f)
                // A 1 1 0 0 1 14 7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 7.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
            }
            // M20 19.65 V20 a2 2 0 0 1 -2 2 H6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h8 a2.4 2.4 0 0 1 1.7 .7 l2.52 2.52 M8 18 h1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 19.65
                moveTo(x = 20.0f, y = 19.65f)
                // V 20
                verticalLineTo(y = 20.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2.4 2.4 0 0 1 1.7 0.7
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.7f,
                )
                // l 2.52 2.52
                lineToRelative(dx = 2.52f, dy = 2.52f)
                // M 8 18
                moveTo(x = 8.0f, y = 18.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
            }
        }.build().also { _filePenLine = it }
    }

@Suppress("ObjectPropertyName")
private var _filePenLine: ImageVector? = null
