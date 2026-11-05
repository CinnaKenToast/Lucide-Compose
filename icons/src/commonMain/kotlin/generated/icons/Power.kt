package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Power: ImageVector
    get() {
        val current = _power
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Power",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v10 m6.4 -5.4 A9 9 0 1 1 5.63 6.64
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // m 6.4 -5.4
                moveToRelative(dx = 6.4f, dy = -5.4f)
                // A 9 9 0 1 1 5.63 6.64
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 5.63f,
                    y1 = 6.64f,
                )
            }
        }.build().also { _power = it }
    }

@Suppress("ObjectPropertyName")
private var _power: ImageVector? = null
