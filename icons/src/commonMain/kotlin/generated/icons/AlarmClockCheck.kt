package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlarmClockCheck: ImageVector
    get() {
        val current = _alarmClockCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.AlarmClockCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="13.0" radius="8.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 13
                moveTo(x = 12.0f, y = 13.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 8 8 0 1 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // a 8 8 0 1 1 -16 0z
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M5 3 2 6 m20 0 -3 -3 M6.38 18.7 4 21 m13.64 -2.33 L20 21 M9 13 l2 2 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 3
                moveTo(x = 5.0f, y = 3.0f)
                // L 2 6
                lineTo(x = 2.0f, y = 6.0f)
                // m 20 0
                moveToRelative(dx = 20.0f, dy = 0.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // M 6.38 18.7
                moveTo(x = 6.38f, y = 18.7f)
                // L 4 21
                lineTo(x = 4.0f, y = 21.0f)
                // m 13.64 -2.33
                moveToRelative(dx = 13.64f, dy = -2.33f)
                // L 20 21
                lineTo(x = 20.0f, y = 21.0f)
                // M 9 13
                moveTo(x = 9.0f, y = 13.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
        }.build().also { _alarmClockCheck = it }
    }

@Suppress("ObjectPropertyName")
private var _alarmClockCheck: ImageVector? = null
