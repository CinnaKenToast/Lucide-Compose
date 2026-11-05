package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ClockPlus: ImageVector
    get() {
        val current = _clockPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ClockPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 6 v6 l3.64 1.82 M16 19 h6 m-3 -3 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // l 3.64 1.82
                lineToRelative(dx = 3.64f, dy = 1.82f)
                // M 16 19
                moveTo(x = 16.0f, y = 19.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 -3
                moveToRelative(dx = -3.0f, dy = -3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
            // M21.92 13.27 a10 10 0 1 0 -8.65 8.65
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.92 13.27
                moveTo(x = 21.92f, y = 13.27f)
                // a 10 10 0 1 0 -8.65 8.65
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.65f,
                    dy1 = 8.65f,
                )
            }
        }.build().also { _clockPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _clockPlus: ImageVector? = null
