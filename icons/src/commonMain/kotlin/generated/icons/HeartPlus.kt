package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HeartPlus: ImageVector
    get() {
        val current = _heartPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HeartPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14.48 19.37 -.97 .94 a2 2 0 0 1 -3 .02 L5 15 c-1.5 -1.5 -3 -3.2 -3 -5.5 a5.5 5.5 0 0 1 9.6 -3.68 .56 .56 0 0 0 .8 0 A5.49 5.49 0 0 1 22 9.5 a5 5 0 0 1 -.22 1.49 M15 15 h6 m-3 -3 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.48 19.37
                moveTo(x = 14.48f, y = 19.37f)
                // l -0.97 0.94
                lineToRelative(dx = -0.97f, dy = 0.94f)
                // a 2 2 0 0 1 -3 0.02
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.02f,
                )
                // L 5 15
                lineTo(x = 5.0f, y = 15.0f)
                // c -1.5 -1.5 -3 -3.2 -3 -5.5
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = -1.5f,
                    dx2 = -3.0f,
                    dy2 = -3.2f,
                    dx3 = -3.0f,
                    dy3 = -5.5f,
                )
                // a 5.5 5.5 0 0 1 9.6 -3.68
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.6f,
                    dy1 = -3.68f,
                )
                // a 0.56 0.56 0 0 0 0.8 0
                arcToRelative(
                    a = 0.56f,
                    b = 0.56f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.8f,
                    dy1 = 0.0f,
                )
                // A 5.49 5.49 0 0 1 22 9.5
                arcTo(
                    horizontalEllipseRadius = 5.49f,
                    verticalEllipseRadius = 5.49f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 9.5f,
                )
                // a 5 5 0 0 1 -0.22 1.49
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.22f,
                    dy1 = 1.49f,
                )
                // M 15 15
                moveTo(x = 15.0f, y = 15.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 -3
                moveToRelative(dx = -3.0f, dy = -3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _heartPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _heartPlus: ImageVector? = null
