package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sigma: ImageVector
    get() {
        val current = _sigma
        if (current != null) return current

        return ImageVector.Builder(
            name = "Sigma",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 7 V5 a1 1 0 0 0 -1 -1 H6.5 a.5 .5 0 0 0 -.4 .8 l4.5 6 a2 2 0 0 1 0 2.4 l-4.5 6 A.5 .5 0 0 0 6.5 20 H17 a1 1 0 0 0 1 -1 v-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 7
                moveTo(x = 18.0f, y = 7.0f)
                // V 5
                verticalLineTo(y = 5.0f)
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
                // H 6.5
                horizontalLineTo(x = 6.5f)
                // a 0.5 0.5 0 0 0 -0.4 0.8
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.4f,
                    dy1 = 0.8f,
                )
                // l 4.5 6
                lineToRelative(dx = 4.5f, dy = 6.0f)
                // a 2 2 0 0 1 0 2.4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.4f,
                )
                // l -4.5 6
                lineToRelative(dx = -4.5f, dy = 6.0f)
                // A 0.5 0.5 0 0 0 6.5 20
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.5f,
                    y1 = 20.0f,
                )
                // H 17
                horizontalLineTo(x = 17.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
            }
        }.build().also { _sigma = it }
    }


@Suppress("ObjectPropertyName")
private var _sigma: ImageVector? = null
