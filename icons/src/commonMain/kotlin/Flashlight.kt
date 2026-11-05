package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flashlight: ImageVector
    get() {
        val current = _flashlight
        if (current != null) return current

        return ImageVector.Builder(
            name = "Flashlight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 13 v1 m5 -12 a1 1 0 0 1 1 1 v4 a3 3 0 0 1 -.6 1.8 l-.6 .8 A4 4 0 0 0 16 12 v8 a2 2 0 0 1 -2 2 h-4 a2 2 0 0 1 -2 -2 v-8 a4 4 0 0 0 -.8 -2.4 L6.6 8.8 A3 3 0 0 1 6 7 V3 a1 1 0 0 1 1 -1z M6 6 h12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 13
                moveTo(x = 12.0f, y = 13.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 5 -12
                moveToRelative(dx = 5.0f, dy = -12.0f)
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
                // A 4 4 0 0 0 16 12
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 12.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 1 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
                // M 6 6
                moveTo(x = 6.0f, y = 6.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
            }
        }.build().also { _flashlight = it }
    }


@Suppress("ObjectPropertyName")
private var _flashlight: ImageVector? = null
