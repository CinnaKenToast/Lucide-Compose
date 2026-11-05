package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlashlightOff: ImageVector
    get() {
        val current = _flashlightOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "FlashlightOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.65 6 H18 m-6 7 v1 m4 2 v4 a2 2 0 0 1 -2 2 h-4 a2 2 0 0 1 -2 -2 v-8 a4 4 0 0 0 -.8 -2.4 L6.6 8.8 A3 3 0 0 1 6 7 V6 M2 2 l20 20 M7.65 2 H17 a1 1 0 0 1 1 1 v4 a3 3 0 0 1 -.6 1.8 l-.6 .8 a4 4 0 0 0 -.55 1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.65 6
                moveTo(x = 11.65f, y = 6.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // m -6 7
                moveToRelative(dx = -6.0f, dy = 7.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 4 2
                moveToRelative(dx = 4.0f, dy = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 4 4 0 0 0 -0.8 -2.4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.8f,
                    dy1 = -2.4f,
                )
                // L 6.6 8.8
                lineTo(x = 6.6f, y = 8.8f)
                // A 3 3 0 0 1 6 7
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 7.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 7.65 2
                moveTo(x = 7.65f, y = 2.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 3 3 0 0 1 -0.6 1.8
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.6f,
                    dy1 = 1.8f,
                )
                // l -0.6 0.8
                lineToRelative(dx = -0.6f, dy = 0.8f)
                // a 4 4 0 0 0 -0.55 1
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.55f,
                    dy1 = 1.0f,
                )
            }
        }.build().also { _flashlightOff = it }
    }


@Suppress("ObjectPropertyName")
private var _flashlightOff: ImageVector? = null
