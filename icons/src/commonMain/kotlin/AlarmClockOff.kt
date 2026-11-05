package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlarmClockOff: ImageVector
    get() {
        val current = _alarmClockOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "AlarmClockOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6.87 6.87 a8 8 0 1 0 11.26 11.26 m1.77 -3.88 a8 8 0 0 0 -9.15 -9.15 M22 6 l-3 -3 M6.26 18.67 4 21 M2 2 l20 20 M4 4 2 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.87 6.87
                moveTo(x = 6.87f, y = 6.87f)
                // a 8 8 0 1 0 11.26 11.26
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 11.26f,
                    dy1 = 11.26f,
                )
                // m 1.77 -3.88
                moveToRelative(dx = 1.77f, dy = -3.88f)
                // a 8 8 0 0 0 -9.15 -9.15
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.15f,
                    dy1 = -9.15f,
                )
                // M 22 6
                moveTo(x = 22.0f, y = 6.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // M 6.26 18.67
                moveTo(x = 6.26f, y = 18.67f)
                // L 4 21
                lineTo(x = 4.0f, y = 21.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // L 2 6
                lineTo(x = 2.0f, y = 6.0f)
            }
        }.build().also { _alarmClockOff = it }
    }


@Suppress("ObjectPropertyName")
private var _alarmClockOff: ImageVector? = null
