package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Signature: ImageVector
    get() {
        val current = _signature
        if (current != null) return current

        return ImageVector.Builder(
            name = "Signature",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m21 17 -2.16 -1.87 A.5 .5 0 0 0 18 15.5 V16 a1 1 0 0 1 -1 1 h-2 a1 1 0 0 1 -1 -1 c0 -2.54 -4 -3.97 -8.5 -4 a1 1 0 0 0 0 5 c4.15 0 4.75 -11.3 5.7 -13.5 a2.5 2.5 0 1 1 3.32 3.28 M3 21 h18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 17
                moveTo(x = 21.0f, y = 17.0f)
                // l -2.16 -1.87
                lineToRelative(dx = -2.16f, dy = -1.87f)
                // A 0.5 0.5 0 0 0 18 15.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 15.5f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // c 0 -2.54 -4 -3.97 -8.5 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.54f,
                    dx2 = -4.0f,
                    dy2 = -3.97f,
                    dx3 = -8.5f,
                    dy3 = -4.0f,
                )
                // a 1 1 0 0 0 0 5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // c 4.15 0 4.75 -11.3 5.7 -13.5
                curveToRelative(
                    dx1 = 4.15f,
                    dy1 = 0.0f,
                    dx2 = 4.75f,
                    dy2 = -11.3f,
                    dx3 = 5.7f,
                    dy3 = -13.5f,
                )
                // a 2.5 2.5 0 1 1 3.32 3.28
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.32f,
                    dy1 = 3.28f,
                )
                // M 3 21
                moveTo(x = 3.0f, y = 21.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
            }
        }.build().also { _signature = it }
    }


@Suppress("ObjectPropertyName")
private var _signature: ImageVector? = null
