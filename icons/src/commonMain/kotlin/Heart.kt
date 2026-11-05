package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heart: ImageVector
    get() {
        val current = _heart
        if (current != null) return current

        return ImageVector.Builder(
            name = "Heart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 9.5 a5.5 5.5 0 0 1 9.6 -3.68 .56 .56 0 0 0 .8 0 A5.49 5.49 0 0 1 22 9.5 c0 2.29 -1.5 4 -3 5.5 l-5.5 5.31 a2 2 0 0 1 -3 .02 L5 15 c-1.5 -1.5 -3 -3.2 -3 -5.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 9.5
                moveTo(x = 2.0f, y = 9.5f)
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
                // c 0 2.29 -1.5 4 -3 5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.29f,
                    dx2 = -1.5f,
                    dy2 = 4.0f,
                    dx3 = -3.0f,
                    dy3 = 5.5f,
                )
                // l -5.5 5.31
                lineToRelative(dx = -5.5f, dy = 5.31f)
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
            }
        }.build().also { _heart = it }
    }


@Suppress("ObjectPropertyName")
private var _heart: ImageVector? = null
