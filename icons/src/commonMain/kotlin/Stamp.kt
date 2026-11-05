package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stamp: ImageVector
    get() {
        val current = _stamp
        if (current != null) return current

        return ImageVector.Builder(
            name = "Stamp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 13 V8.5 C14 7 15 7 15 5 a3 3 0 0 0 -6 0 c0 2 1 2 1 3.5 V13 m10 2.5 a2.5 2.5 0 0 0 -2.5 -2.5 h-11 A2.5 2.5 0 0 0 4 15.5 V17 a1 1 0 0 0 1 1 h14 a1 1 0 0 0 1 -1z M5 22 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 13
                moveTo(x = 14.0f, y = 13.0f)
                // V 8.5
                verticalLineTo(y = 8.5f)
                // C 14 7 15 7 15 5
                curveTo(
                    x1 = 14.0f,
                    y1 = 7.0f,
                    x2 = 15.0f,
                    y2 = 7.0f,
                    x3 = 15.0f,
                    y3 = 5.0f,
                )
                // a 3 3 0 0 0 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // c 0 2 1 2 1 3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                    dx3 = 1.0f,
                    dy3 = 3.5f,
                )
                // V 13
                verticalLineTo(y = 13.0f)
                // m 10 2.5
                moveToRelative(dx = 10.0f, dy = 2.5f)
                // a 2.5 2.5 0 0 0 -2.5 -2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.5f,
                    dy1 = -2.5f,
                )
                // h -11
                horizontalLineToRelative(dx = -11.0f)
                // A 2.5 2.5 0 0 0 4 15.5
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 15.5f,
                )
                // V 17
                verticalLineTo(y = 17.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 1 1 0 0 0 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
                // M 5 22
                moveTo(x = 5.0f, y = 22.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
        }.build().also { _stamp = it }
    }


@Suppress("ObjectPropertyName")
private var _stamp: ImageVector? = null
