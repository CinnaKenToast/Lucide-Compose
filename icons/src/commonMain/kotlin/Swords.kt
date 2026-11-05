package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Swords: ImageVector
    get() {
        val current = _swords
        if (current != null) return current

        return ImageVector.Builder(
            name = "Swords",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m13 19 6 -6 m-4.5 4.5 L3.59 6.59 A2 2 0 0 1 3 5.17 V3 h2.17 A2 2 0 0 1 6.6 3.59 L17.5 14.5 m-2.67 -8.33 L17.4 3.6 A2 2 0 0 1 18.83 3 H21 v2.17 a2 2 0 0 1 -.59 1.42 l-2.58 2.58 M16 16 l4 4 m-1 1 2 -2 M5 14 l4 4 m-4 3 -2 -2 m4.5 -2.5 L4 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 19
                moveTo(x = 13.0f, y = 19.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // m -4.5 4.5
                moveToRelative(dx = -4.5f, dy = 4.5f)
                // L 3.59 6.59
                lineTo(x = 3.59f, y = 6.59f)
                // A 2 2 0 0 1 3 5.17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.0f,
                    y1 = 5.17f,
                )
                // V 3
                verticalLineTo(y = 3.0f)
                // h 2.17
                horizontalLineToRelative(dx = 2.17f)
                // A 2 2 0 0 1 6.6 3.59
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.6f,
                    y1 = 3.59f,
                )
                // L 17.5 14.5
                lineTo(x = 17.5f, y = 14.5f)
                // m -2.67 -8.33
                moveToRelative(dx = -2.67f, dy = -8.33f)
                // L 17.4 3.6
                lineTo(x = 17.4f, y = 3.6f)
                // A 2 2 0 0 1 18.83 3
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.83f,
                    y1 = 3.0f,
                )
                // H 21
                horizontalLineTo(x = 21.0f)
                // v 2.17
                verticalLineToRelative(dy = 2.17f)
                // a 2 2 0 0 1 -0.59 1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.59f,
                    dy1 = 1.42f,
                )
                // l -2.58 2.58
                lineToRelative(dx = -2.58f, dy = 2.58f)
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m -1 1
                moveToRelative(dx = -1.0f, dy = 1.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // M 5 14
                moveTo(x = 5.0f, y = 14.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m -4 3
                moveToRelative(dx = -4.0f, dy = 3.0f)
                // l -2 -2
                lineToRelative(dx = -2.0f, dy = -2.0f)
                // m 4.5 -2.5
                moveToRelative(dx = 4.5f, dy = -2.5f)
                // L 4 20
                lineTo(x = 4.0f, y = 20.0f)
            }
        }.build().also { _swords = it }
    }


@Suppress("ObjectPropertyName")
private var _swords: ImageVector? = null
