package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hourglass: ImageVector
    get() {
        val current = _hourglass
        if (current != null) return current

        return ImageVector.Builder(
            name = "Hourglass",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 22 h14 M5 2 h14 m-2 20 v-4.17 a2 2 0 0 0 -.59 -1.42 L12 12 l-4.41 4.41 A2 2 0 0 0 7 17.83 V22 M7 2 v4.17 A2 2 0 0 0 7.59 7.6 L12 12 l4.41 -4.41 A2 2 0 0 0 17 6.17 V2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 22
                moveTo(x = 5.0f, y = 22.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // M 5 2
                moveTo(x = 5.0f, y = 2.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // m -2 20
                moveToRelative(dx = -2.0f, dy = 20.0f)
                // v -4.17
                verticalLineToRelative(dy = -4.17f)
                // a 2 2 0 0 0 -0.59 -1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.59f,
                    dy1 = -1.42f,
                )
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
                // l -4.41 4.41
                lineToRelative(dx = -4.41f, dy = 4.41f)
                // A 2 2 0 0 0 7 17.83
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 17.83f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // M 7 2
                moveTo(x = 7.0f, y = 2.0f)
                // v 4.17
                verticalLineToRelative(dy = 4.17f)
                // A 2 2 0 0 0 7.59 7.6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.59f,
                    y1 = 7.6f,
                )
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
                // l 4.41 -4.41
                lineToRelative(dx = 4.41f, dy = -4.41f)
                // A 2 2 0 0 0 17 6.17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 6.17f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
            }
        }.build().also { _hourglass = it }
    }


@Suppress("ObjectPropertyName")
private var _hourglass: ImageVector? = null
