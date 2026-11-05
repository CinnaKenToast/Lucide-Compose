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
            // M12 6 v6 l1.5 .8
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
                // l 1.5 0.8
                lineToRelative(dx = 1.5f, dy = 0.8f)
            }
            // M12.34 22 a10 10 0 1 1 9.58 -8.77 M14 18 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.34 22
                moveTo(x = 12.34f, y = 22.0f)
                // a 10 10 0 1 1 9.58 -8.77
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.58f,
                    dy1 = -8.77f,
                )
                // M 14 18
                moveTo(x = 14.0f, y = 18.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
            // m18 22 -4 -4 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 22
                moveTo(x = 18.0f, y = 22.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
        }.build().also { _clockArrowLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _clockArrowLeft: ImageVector? = null
