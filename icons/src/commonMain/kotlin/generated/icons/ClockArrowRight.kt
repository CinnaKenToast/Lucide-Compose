package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ClockArrowRight: ImageVector
    get() {
        val current = _clockArrowRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ClockArrowRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 6 v6 l2.42 1.21
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
                // l 2.42 1.21
                lineToRelative(dx = 2.42f, dy = 1.21f)
            }
            // M13.85 21.83 a10 10 0 1 1 8.07 -8.57
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.85 21.83
                moveTo(x = 13.85f, y = 21.83f)
                // a 10 10 0 1 1 8.07 -8.57
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.07f,
                    dy1 = -8.57f,
                )
            }
            // m18 15 3 3 -3 3 m3 -3 h-6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 15
                moveTo(x = 18.0f, y = 15.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // m 3 -3
                moveToRelative(dx = 3.0f, dy = -3.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
            }
        }.build().also { _clockArrowRight = it }
    }

@Suppress("ObjectPropertyName")
private var _clockArrowRight: ImageVector? = null
