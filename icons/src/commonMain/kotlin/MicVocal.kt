package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MicVocal: ImageVector
    get() {
        val current = _micVocal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MicVocal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m11 7.6 -6 8.2 a1 1 0 0 0 .1 1.29 l.82 .82 a1 1 0 0 0 1.32 .08 L15.09 12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 7.6
                moveTo(x = 11.0f, y = 7.6f)
                // l -6 8.2
                lineToRelative(dx = -6.0f, dy = 8.2f)
                // a 1 1 0 0 0 0.1 1.29
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.1f,
                    dy1 = 1.29f,
                )
                // l 0.82 0.82
                lineToRelative(dx = 0.82f, dy = 0.82f)
                // a 1 1 0 0 0 1.32 0.08
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.32f,
                    dy1 = 0.08f,
                )
                // L 15.09 12
                lineTo(x = 15.09f, y = 12.0f)
            }
            // M16.5 21.17 A6 6 0 0 0 13 20 c-2.06 0 -3.93 2.36 -6 2 s-2.77 -3.37 -1.5 -4.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.5 21.17
                moveTo(x = 16.5f, y = 21.17f)
                // A 6 6 0 0 0 13 20
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.0f,
                    y1 = 20.0f,
                )
                // c -2.06 0 -3.93 2.36 -6 2
                curveToRelative(
                    dx1 = -2.06f,
                    dy1 = 0.0f,
                    dx2 = -3.93f,
                    dy2 = 2.36f,
                    dx3 = -6.0f,
                    dy3 = 2.0f,
                )
                // s -2.77 -3.37 -1.5 -4.5
                reflectiveCurveToRelative(
                    dx1 = -2.77f,
                    dy1 = -3.37f,
                    dx2 = -1.5f,
                    dy2 = -4.5f,
                )
            }
            // <circle cx="16.0" cy="7.0" radius="5.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 7
                moveTo(x = 16.0f, y = 7.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _micVocal = it }
    }


@Suppress("ObjectPropertyName")
private var _micVocal: ImageVector? = null
