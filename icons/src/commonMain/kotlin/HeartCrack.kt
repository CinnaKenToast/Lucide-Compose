package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeartCrack: ImageVector
    get() {
        val current = _heartCrack
        if (current != null) return current

        return ImageVector.Builder(
            name = "HeartCrack",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.4 5.82 A7 7 0 0 0 11 8 l2.15 2.16 a.5 .5 0 0 1 0 .7 l-2.3 2.3 a.5 .5 0 0 0 0 .7 L12 15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.4 5.82
                moveTo(x = 12.4f, y = 5.82f)
                // A 7 7 0 0 0 11 8
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.0f,
                    y1 = 8.0f,
                )
                // l 2.15 2.16
                lineToRelative(dx = 2.15f, dy = 2.16f)
                // a 0.5 0.5 0 0 1 0 0.7
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 0.7f,
                )
                // l -2.3 2.3
                lineToRelative(dx = -2.3f, dy = 2.3f)
                // a 0.5 0.5 0 0 0 0 0.7
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 0.7f,
                )
                // L 12 15
                lineTo(x = 12.0f, y = 15.0f)
            }
            // M13.5 20.31 a2 2 0 0 1 -3 .02 L5 15 c-1.5 -1.5 -3 -3.2 -3 -5.5 a5.5 5.5 0 0 1 9.6 -3.68 .6 .6 0 0 0 .8 0 A5.5 5.5 0 0 1 22 9.5 c0 2.29 -1.5 4 -3 5.5z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.5 20.31
                moveTo(x = 13.5f, y = 20.31f)
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
                // a 0.6 0.6 0 0 0 0.8 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.8f,
                    dy1 = 0.0f,
                )
                // A 5.5 5.5 0 0 1 22 9.5
                arcTo(
                    horizontalEllipseRadius = 5.5f,
                    verticalEllipseRadius = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 9.5f,
                )
                // c 0 2.29 -1.5 4 -3 5.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.29f,
                    dx2 = -1.5f,
                    dy2 = 4.0f,
                    dx3 = -3.0f,
                    dy3 = 5.5f,
                )
                close()
            }
        }.build().also { _heartCrack = it }
    }


@Suppress("ObjectPropertyName")
private var _heartCrack: ImageVector? = null
