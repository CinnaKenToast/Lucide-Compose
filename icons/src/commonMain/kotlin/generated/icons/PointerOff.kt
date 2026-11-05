package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PointerOff: ImageVector
    get() {
        val current = _pointerOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PointerOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 4.5 V4 a2 2 0 0 0 -2.41 -1.96 M13.9 8.4 a2 2 0 0 0 -1.26 -1.3 m9.06 9.1 A8 8 0 0 0 22 14 v-3 a2 2 0 1 0 -4 0 v-1 a2 2 0 0 0 -3.63 -1.16 M7 15 l-1.8 -1.8 a2 2 0 0 0 -2.79 2.86 L6 19.7 a7.7 7.7 0 0 0 6 2.3 h2 a8 8 0 0 0 5.66 -2.34 M6 6 v8 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 4.5
                moveTo(x = 10.0f, y = 4.5f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 0 -2.41 -1.96
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.41f,
                    dy1 = -1.96f,
                )
                // M 13.9 8.4
                moveTo(x = 13.9f, y = 8.4f)
                // a 2 2 0 0 0 -1.26 -1.3
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.26f,
                    dy1 = -1.3f,
                )
                // m 9.06 9.1
                moveToRelative(dx = 9.06f, dy = 9.1f)
                // A 8 8 0 0 0 22 14
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 14.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 2 2 0 1 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 2 2 0 0 0 -3.63 -1.16
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.63f,
                    dy1 = -1.16f,
                )
                // M 7 15
                moveTo(x = 7.0f, y = 15.0f)
                // l -1.8 -1.8
                lineToRelative(dx = -1.8f, dy = -1.8f)
                // a 2 2 0 0 0 -2.79 2.86
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.79f,
                    dy1 = 2.86f,
                )
                // L 6 19.7
                lineTo(x = 6.0f, y = 19.7f)
                // a 7.7 7.7 0 0 0 6 2.3
                arcToRelative(
                    a = 7.7f,
                    b = 7.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 2.3f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 8 8 0 0 0 5.66 -2.34
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.66f,
                    dy1 = -2.34f,
                )
                // M 6 6
                moveTo(x = 6.0f, y = 6.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _pointerOff = it }
    }

@Suppress("ObjectPropertyName")
private var _pointerOff: ImageVector? = null
