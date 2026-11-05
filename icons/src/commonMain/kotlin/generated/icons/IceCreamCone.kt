package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.IceCreamCone: ImageVector
    get() {
        val current = _iceCreamCone
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.IceCreamCone",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m7 11 4.08 10.35 a1 1 0 0 0 1.84 0 L17 11 m0 -4 A5 5 0 0 0 7 7 m10 0 a2 2 0 0 1 0 4 H7 a2 2 0 0 1 0 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 11
                moveTo(x = 7.0f, y = 11.0f)
                // l 4.08 10.35
                lineToRelative(dx = 4.08f, dy = 10.35f)
                // a 1 1 0 0 0 1.84 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.84f,
                    dy1 = 0.0f,
                )
                // L 17 11
                lineTo(x = 17.0f, y = 11.0f)
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // A 5 5 0 0 0 7 7
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 7.0f,
                )
                // m 10 0
                moveToRelative(dx = 10.0f, dy = 0.0f)
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 2 2 0 0 1 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
            }
        }.build().also { _iceCreamCone = it }
    }

@Suppress("ObjectPropertyName")
private var _iceCreamCone: ImageVector? = null
