package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ClockArrowLeft: ImageVector
    get() {
        val current = _clockArrowLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ClockArrowLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 6 v6 l2.23 1.11
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
                // l 2.23 1.11
                lineToRelative(dx = 2.23f, dy = 1.11f)
            }
            // M13.27 21.92 a10 10 0 1 1 8.56 -8.07 M15 18 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.27 21.92
                moveTo(x = 13.27f, y = 21.92f)
                // a 10 10 0 1 1 8.56 -8.07
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.56f,
                    dy1 = -8.07f,
                )
                // M 15 18
                moveTo(x = 15.0f, y = 18.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
            // m18 15 -3 3 3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 15
                moveTo(x = 18.0f, y = 15.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
            }
        }.build().also { _clockArrowLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _clockArrowLeft: ImageVector? = null
