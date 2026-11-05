package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PowerOff: ImageVector
    get() {
        val current = _powerOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PowerOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18.36 6.64 A9 9 0 0 1 20.77 15 M6.16 6.16 a9 9 0 1 0 12.68 12.68 M12 2 v4 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.36 6.64
                moveTo(x = 18.36f, y = 6.64f)
                // A 9 9 0 0 1 20.77 15
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.77f,
                    y1 = 15.0f,
                )
                // M 6.16 6.16
                moveTo(x = 6.16f, y = 6.16f)
                // a 9 9 0 1 0 12.68 12.68
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 12.68f,
                    dy1 = 12.68f,
                )
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _powerOff = it }
    }

@Suppress("ObjectPropertyName")
private var _powerOff: ImageVector? = null
