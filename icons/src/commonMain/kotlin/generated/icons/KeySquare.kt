package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.KeySquare: ImageVector
    get() {
        val current = _keySquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.KeySquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.4 2.7 a2.5 2.5 0 0 1 3.4 0 l5.5 5.5 a2.5 2.5 0 0 1 0 3.4 l-3.7 3.7 a2.5 2.5 0 0 1 -3.4 0 L8.7 9.8 a2.5 2.5 0 0 1 0 -3.4z M14 7 l3 3 m-7.6 .6 -6.81 6.81 A2 2 0 0 0 2 18.83 V21 a1 1 0 0 0 1 1 h3 a1 1 0 0 0 1 -1 v-1 a1 1 0 0 1 1 -1 h1 a1 1 0 0 0 1 -1 v-1 a1 1 0 0 1 1 -1 h.17 a2 2 0 0 0 1.42 -.59 l.81 -.81
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.4 2.7
                moveTo(x = 12.4f, y = 2.7f)
                // a 2.5 2.5 0 0 1 3.4 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.4f,
                    dy1 = 0.0f,
                )
                // l 5.5 5.5
                lineToRelative(dx = 5.5f, dy = 5.5f)
                // a 2.5 2.5 0 0 1 0 3.4
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.4f,
                )
                // l -3.7 3.7
                lineToRelative(dx = -3.7f, dy = 3.7f)
                // a 2.5 2.5 0 0 1 -3.4 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.4f,
                    dy1 = 0.0f,
                )
                // L 8.7 9.8
                lineTo(x = 8.7f, y = 9.8f)
                // a 2.5 2.5 0 0 1 0 -3.4z
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.4f,
                )
                close()
                // M 14 7
                moveTo(x = 14.0f, y = 7.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // m -7.6 0.6
                moveToRelative(dx = -7.6f, dy = 0.6f)
                // l -6.81 6.81
                lineToRelative(dx = -6.81f, dy = 6.81f)
                // A 2 2 0 0 0 2 18.83
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 18.83f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
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
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 0.17
                horizontalLineToRelative(dx = 0.17f)
                // a 2 2 0 0 0 1.42 -0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = -0.59f,
                )
                // l 0.81 -0.81
                lineToRelative(dx = 0.81f, dy = -0.81f)
            }
        }.build().also { _keySquare = it }
    }

@Suppress("ObjectPropertyName")
private var _keySquare: ImageVector? = null
