package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Laptop: ImageVector
    get() {
        val current = _laptop
        if (current != null) return current

        return ImageVector.Builder(
            name = "Laptop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 5 a2 2 0 0 1 2 2 v8.53 a2 2 0 0 0 .21 .9 l1.07 2.12 a1 1 0 0 1 -.9 1.45 H3.62 a1 1 0 0 1 -.9 -1.45 l1.07 -2.13 A2 2 0 0 0 4 15.52 V7 a2 2 0 0 1 2 -2z m2.05 10.99 H3.95
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 8.53
                verticalLineToRelative(dy = 8.53f)
                // a 2 2 0 0 0 0.21 0.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.21f,
                    dy1 = 0.9f,
                )
                // l 1.07 2.12
                lineToRelative(dx = 1.07f, dy = 2.12f)
                // a 1 1 0 0 1 -0.9 1.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.9f,
                    dy1 = 1.45f,
                )
                // H 3.62
                horizontalLineTo(x = 3.62f)
                // a 1 1 0 0 1 -0.9 -1.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.9f,
                    dy1 = -1.45f,
                )
                // l 1.07 -2.13
                lineToRelative(dx = 1.07f, dy = -2.13f)
                // A 2 2 0 0 0 4 15.52
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 15.52f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 2 2 0 0 1 2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                close()
                // m 2.05 10.99
                moveToRelative(dx = 2.05f, dy = 10.99f)
                // H 3.95
                horizontalLineTo(x = 3.95f)
            }
        }.build().also { _laptop = it }
    }


@Suppress("ObjectPropertyName")
private var _laptop: ImageVector? = null
