package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserRoundShield: ImageVector
    get() {
        val current = _userRoundShield
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.UserRoundShield",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 21 a8 8 0 0 1 8 -8 5 5 0 1 1 4.85 -3.76 M22 17.5 c0 2.5 -1.75 3.75 -3.83 4.47 a.5 .5 0 0 1 -.33 0 C15.75 21.25 14 20 14 17.5 V14 a.5 .5 0 0 1 .5 -.5 c1 0 2.25 -.6 3.12 -1.36 a.6 .6 0 0 1 .76 0 5.3 5.3 0 0 0 3.12 1.36 A.5 .5 0 0 1 22 14z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // a 8 8 0 0 1 8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = -8.0f,
                )
                // a 5 5 0 1 1 4.85 -3.76
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.85f,
                    dy1 = -3.76f,
                )
                // M 22 17.5
                moveTo(x = 22.0f, y = 17.5f)
                // c 0 2.5 -1.75 3.75 -3.83 4.47
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.5f,
                    dx2 = -1.75f,
                    dy2 = 3.75f,
                    dx3 = -3.83f,
                    dy3 = 4.47f,
                )
                // a 0.5 0.5 0 0 1 -0.33 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.33f,
                    dy1 = 0.0f,
                )
                // C 15.75 21.25 14 20 14 17.5
                curveTo(
                    x1 = 15.75f,
                    y1 = 21.25f,
                    x2 = 14.0f,
                    y2 = 20.0f,
                    x3 = 14.0f,
                    y3 = 17.5f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // a 0.5 0.5 0 0 1 0.5 -0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = -0.5f,
                )
                // c 1 0 2.25 -0.6 3.12 -1.36
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.25f,
                    dy2 = -0.6f,
                    dx3 = 3.12f,
                    dy3 = -1.36f,
                )
                // a 0.6 0.6 0 0 1 0.76 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.76f,
                    dy1 = 0.0f,
                )
                // a 5.3 5.3 0 0 0 3.12 1.36
                arcToRelative(
                    a = 5.3f,
                    b = 5.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.12f,
                    dy1 = 1.36f,
                )
                // A 0.5 0.5 0 0 1 22 14z
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 14.0f,
                )
                close()
            }
        }.build().also { _userRoundShield = it }
    }

@Suppress("ObjectPropertyName")
private var _userRoundShield: ImageVector? = null
