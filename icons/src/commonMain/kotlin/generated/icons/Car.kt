package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Car: ImageVector
    get() {
        val current = _car
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Car",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 17 h2 c.6 0 1 -.4 1 -1 v-3 c0 -.9 -.7 -1.7 -1.5 -1.9 C18.7 10.6 16 10 16 10 s-1.3 -1.4 -2.2 -2.3 A3 3 0 0 0 12 7 H5 C4.4 7 3.9 7.4 3.6 7.9 l-1.4 2.9 A4 4 0 0 0 2 12 v4 c0 .6 .4 1 1 1 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 17
                moveTo(x = 19.0f, y = 17.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0.6 0 1 -0.4 1 -1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.4f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -0.9 -0.7 -1.7 -1.5 -1.9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.9f,
                    dx2 = -0.7f,
                    dy2 = -1.7f,
                    dx3 = -1.5f,
                    dy3 = -1.9f,
                )
                // C 18.7 10.6 16 10 16 10
                curveTo(
                    x1 = 18.7f,
                    y1 = 10.6f,
                    x2 = 16.0f,
                    y2 = 10.0f,
                    x3 = 16.0f,
                    y3 = 10.0f,
                )
                // s -1.3 -1.4 -2.2 -2.3
                reflectiveCurveToRelative(
                    dx1 = -1.3f,
                    dy1 = -1.4f,
                    dx2 = -2.2f,
                    dy2 = -2.3f,
                )
                // A 3 3 0 0 0 12 7
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 7.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // C 4.4 7 3.9 7.4 3.6 7.9
                curveTo(
                    x1 = 4.4f,
                    y1 = 7.0f,
                    x2 = 3.9f,
                    y2 = 7.4f,
                    x3 = 3.6f,
                    y3 = 7.9f,
                )
                // l -1.4 2.9
                lineToRelative(dx = -1.4f, dy = 2.9f)
                // A 4 4 0 0 0 2 12
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 12.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 0.6 0.4 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.6f,
                    dx2 = 0.4f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
            // <circle cx="7.0" cy="17.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 17
                moveTo(x = 7.0f, y = 17.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M9 17 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 17
                moveTo(x = 9.0f, y = 17.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
            // <circle cx="17.0" cy="17.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 17
                moveTo(x = 17.0f, y = 17.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _car = it }
    }

@Suppress("ObjectPropertyName")
private var _car: ImageVector? = null
