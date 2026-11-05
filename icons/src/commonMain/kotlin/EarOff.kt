package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EarOff: ImageVector
    get() {
        val current = _earOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "EarOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 18.5 a3.5 3.5 0 1 0 7 0 c0 -1.57 .92 -2.52 2.04 -3.46 M6 8.5 a7 7 0 0 1 .36 -2.14 M8.8 3.15 A6.5 6.5 0 0 1 19 8.5 a6.4 6.4 0 0 1 -1.09 3.76
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 18.5
                moveTo(x = 6.0f, y = 18.5f)
                // a 3.5 3.5 0 1 0 7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // c 0 -1.57 0.92 -2.52 2.04 -3.46
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.57f,
                    dx2 = 0.92f,
                    dy2 = -2.52f,
                    dx3 = 2.04f,
                    dy3 = -3.46f,
                )
                // M 6 8.5
                moveTo(x = 6.0f, y = 8.5f)
                // a 7 7 0 0 1 0.36 -2.14
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.36f,
                    dy1 = -2.14f,
                )
                // M 8.8 3.15
                moveTo(x = 8.8f, y = 3.15f)
                // A 6.5 6.5 0 0 1 19 8.5
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 8.5f,
                )
                // a 6.4 6.4 0 0 1 -1.09 3.76
                arcToRelative(
                    a = 6.4f,
                    b = 6.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.09f,
                    dy1 = 3.76f,
                )
            }
            // M12.5 6 A2.5 2.5 0 0 1 15 8.5 M10 13 a2 2 0 0 0 1.82 -1.18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.5 6
                moveTo(x = 12.5f, y = 6.0f)
                // A 2.5 2.5 0 0 1 15 8.5
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 8.5f,
                )
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // a 2 2 0 0 0 1.82 -1.18
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.82f,
                    dy1 = -1.18f,
                )
            }
            // <line x1="2.0" y1="2.0" x2="22.0" y2="22.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // L 22 22
                lineTo(x = 22.0f, y = 22.0f)
            }
        }.build().also { _earOff = it }
    }


@Suppress("ObjectPropertyName")
private var _earOff: ImageVector? = null
