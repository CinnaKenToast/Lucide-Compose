package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MapPinPen: ImageVector
    get() {
        val current = _mapPinPen
        if (current != null) return current

        return ImageVector.Builder(
            name = "MapPinPen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17.97 9.3 A8 8 0 0 0 2 10 c0 4.69 4.89 9.56 7.02 11.47 m12.36 -4.84 a1 1 0 0 0 -3 -3 l-4.02 4 a2 2 0 0 0 -.5 .86 l-.84 2.87 a.5 .5 0 0 0 .62 .62 l2.87 -.84 a2 2 0 0 0 .85 -.5z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.97 9.3
                moveTo(x = 17.97f, y = 9.3f)
                // A 8 8 0 0 0 2 10
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 10.0f,
                )
                // c 0 4.69 4.89 9.56 7.02 11.47
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.69f,
                    dx2 = 4.89f,
                    dy2 = 9.56f,
                    dx3 = 7.02f,
                    dy3 = 11.47f,
                )
                // m 12.36 -4.84
                moveToRelative(dx = 12.36f, dy = -4.84f)
                // a 1 1 0 0 0 -3 -3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // l -4.02 4
                lineToRelative(dx = -4.02f, dy = 4.0f)
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
                // a 2 2 0 0 0 0.85 -0.5z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.85f,
                    dy1 = -0.5f,
                )
                close()
            }
            // <circle cx="10.0" cy="10.0" radius="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _mapPinPen = it }
    }


@Suppress("ObjectPropertyName")
private var _mapPinPen: ImageVector? = null
