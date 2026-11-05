package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bone: ImageVector
    get() {
        val current = _bone
        if (current != null) return current

        return ImageVector.Builder(
            name = "Bone",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 10 c.7 -.7 1.69 0 2.5 0 a2.5 2.5 0 1 0 0 -5 A.5 .5 0 0 1 19 4.5 a2.5 2.5 0 1 0 -5 0 c0 .81 .7 1.8 0 2.5 l-7 7 c-.7 .7 -1.69 0 -2.5 0 a2.5 2.5 0 0 0 0 5 A.5 .5 0 0 1 5 19.5 a2.5 2.5 0 1 0 5 0 c0 -.81 -.7 -1.8 0 -2.5Z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 10
                moveTo(x = 17.0f, y = 10.0f)
                // c 0.7 -0.7 1.69 0 2.5 0
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = -0.7f,
                    dx2 = 1.69f,
                    dy2 = 0.0f,
                    dx3 = 2.5f,
                    dy3 = 0.0f,
                )
                // a 2.5 2.5 0 1 0 0 -5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                )
                // A 0.5 0.5 0 0 1 19 4.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 4.5f,
                )
                // a 2.5 2.5 0 1 0 -5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                // c 0 0.81 0.7 1.8 0 2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.81f,
                    dx2 = 0.7f,
                    dy2 = 1.8f,
                    dx3 = 0.0f,
                    dy3 = 2.5f,
                )
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
                // c -0.7 0.7 -1.69 0 -2.5 0
                curveToRelative(
                    dx1 = -0.7f,
                    dy1 = 0.7f,
                    dx2 = -1.69f,
                    dy2 = 0.0f,
                    dx3 = -2.5f,
                    dy3 = 0.0f,
                )
                // a 2.5 2.5 0 0 0 0 5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // A 0.5 0.5 0 0 1 5 19.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 19.5f,
                )
                // a 2.5 2.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // c 0 -0.81 -0.7 -1.8 0 -2.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.81f,
                    dx2 = -0.7f,
                    dy2 = -1.8f,
                    dx3 = 0.0f,
                    dy3 = -2.5f,
                )
                close()
            }
        }.build().also { _bone = it }
    }


@Suppress("ObjectPropertyName")
private var _bone: ImageVector? = null
