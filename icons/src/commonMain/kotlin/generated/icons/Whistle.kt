package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Whistle: ImageVector
    get() {
        val current = _whistle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Whistle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 6 v4 m11 -4 a1 1 0 0 1 1 1 v2 a1 1 0 0 1 -1 1 h-5.67 A7 7 0 1 1 9 6z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 6
                moveTo(x = 10.0f, y = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 11 -4
                moveToRelative(dx = 11.0f, dy = -4.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -5.67
                horizontalLineToRelative(dx = -5.67f)
                // A 7 7 0 1 1 9 6z
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 6.0f,
                )
                close()
            }
        }.build().also { _whistle = it }
    }

@Suppress("ObjectPropertyName")
private var _whistle: ImageVector? = null
