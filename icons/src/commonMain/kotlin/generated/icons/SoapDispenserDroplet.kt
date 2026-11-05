package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SoapDispenserDroplet: ImageVector
    get() {
        val current = _soapDispenserDroplet
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SoapDispenserDroplet",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.5 2 v4 M14 2 H7 a2 2 0 0 0 -2 2 m14.29 10.76 A6.7 6.7 0 0 1 17 11 a6.6 6.6 0 0 1 -2.29 3.76 A4 4 0 0 0 13 17.95 c0 2.22 1.8 4.05 4 4.05 s4 -1.83 4 -4.05 c0 -1.16 -.57 -2.26 -1.71 -3.19 M9.61 21 H6 a2 2 0 0 1 -2 -2 v-7 a2 2 0 0 1 2 -2 h7 V7 a1 1 0 0 0 -1 -1 H9 a1 1 0 0 0 -1 1 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.5 2
                moveTo(x = 10.5f, y = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // M 14 2
                moveTo(x = 14.0f, y = 2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m 14.29 10.76
                moveToRelative(dx = 14.29f, dy = 10.76f)
                // A 6.7 6.7 0 0 1 17 11
                arcTo(
                    horizontalEllipseRadius = 6.7f,
                    verticalEllipseRadius = 6.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 11.0f,
                )
                // a 6.6 6.6 0 0 1 -2.29 3.76
                arcToRelative(
                    a = 6.6f,
                    b = 6.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.29f,
                    dy1 = 3.76f,
                )
                // A 4 4 0 0 0 13 17.95
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.0f,
                    y1 = 17.95f,
                )
                // c 0 2.22 1.8 4.05 4 4.05
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.22f,
                    dx2 = 1.8f,
                    dy2 = 4.05f,
                    dx3 = 4.0f,
                    dy3 = 4.05f,
                )
                // s 4 -1.83 4 -4.05
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -1.83f,
                    dx2 = 4.0f,
                    dy2 = -4.05f,
                )
                // c 0 -1.16 -0.57 -2.26 -1.71 -3.19
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.16f,
                    dx2 = -0.57f,
                    dy2 = -2.26f,
                    dx3 = -1.71f,
                    dy3 = -3.19f,
                )
                // M 9.61 21
                moveTo(x = 9.61f, y = 21.0f)
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
                // v -7
                verticalLineToRelative(dy = -7.0f)
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
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _soapDispenserDroplet = it }
    }

@Suppress("ObjectPropertyName")
private var _soapDispenserDroplet: ImageVector? = null
