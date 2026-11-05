package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TimerOff: ImageVector
    get() {
        val current = _timerOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TimerOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 2 h4 m-9.4 9 a8 8 0 0 0 1.7 8.7 8 8 0 0 0 8.7 1.7 m-7.6 -14 a8 8 0 0 1 10.3 1 8 8 0 0 1 .9 10.2 M2 2 l20 20 M12 12 v-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -9.4 9
                moveToRelative(dx = -9.4f, dy = 9.0f)
                // a 8 8 0 0 0 1.7 8.7
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.7f,
                    dy1 = 8.7f,
                )
                // a 8 8 0 0 0 8.7 1.7
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.7f,
                    dy1 = 1.7f,
                )
                // m -7.6 -14
                moveToRelative(dx = -7.6f, dy = -14.0f)
                // a 8 8 0 0 1 10.3 1
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.3f,
                    dy1 = 1.0f,
                )
                // a 8 8 0 0 1 0.9 10.2
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.9f,
                    dy1 = 10.2f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
            }
        }.build().also { _timerOff = it }
    }

@Suppress("ObjectPropertyName")
private var _timerOff: ImageVector? = null
