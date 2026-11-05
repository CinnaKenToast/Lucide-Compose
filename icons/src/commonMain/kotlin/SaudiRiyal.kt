package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SaudiRiyal: ImageVector
    get() {
        val current = _saudiRiyal
        if (current != null) return current

        return ImageVector.Builder(
            name = "SaudiRiyal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 2.98 v13.19 A2 2 0 0 1 8.77 18 L4 20 M14 4 v9.52 a1 1 0 0 0 1.37 .93 L19 13 m0 5 -5 2 m5 -12 L4 14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 2.98
                moveTo(x = 10.0f, y = 2.98f)
                // v 13.19
                verticalLineToRelative(dy = 13.19f)
                // A 2 2 0 0 1 8.77 18
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.77f,
                    y1 = 18.0f,
                )
                // L 4 20
                lineTo(x = 4.0f, y = 20.0f)
                // M 14 4
                moveTo(x = 14.0f, y = 4.0f)
                // v 9.52
                verticalLineToRelative(dy = 9.52f)
                // a 1 1 0 0 0 1.37 0.93
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.37f,
                    dy1 = 0.93f,
                )
                // L 19 13
                lineTo(x = 19.0f, y = 13.0f)
                // m 0 5
                moveToRelative(dx = 0.0f, dy = 5.0f)
                // l -5 2
                lineToRelative(dx = -5.0f, dy = 2.0f)
                // m 5 -12
                moveToRelative(dx = 5.0f, dy = -12.0f)
                // L 4 14
                lineTo(x = 4.0f, y = 14.0f)
            }
        }.build().also { _saudiRiyal = it }
    }


@Suppress("ObjectPropertyName")
private var _saudiRiyal: ImageVector? = null
