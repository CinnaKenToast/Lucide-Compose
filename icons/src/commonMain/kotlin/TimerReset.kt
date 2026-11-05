package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TimerReset: ImageVector
    get() {
        val current = _timerReset
        if (current != null) return current

        return ImageVector.Builder(
            name = "TimerReset",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 2 h4 m-2 12 v-4 m-8 3 a8 8 0 0 1 8 -7 8 8 0 1 1 -5.3 14 L4 17.6
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
                // m -2 12
                moveToRelative(dx = -2.0f, dy = 12.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // m -8 3
                moveToRelative(dx = -8.0f, dy = 3.0f)
                // a 8 8 0 0 1 8 -7
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = -7.0f,
                )
                // a 8 8 0 1 1 -5.3 14
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.3f,
                    dy1 = 14.0f,
                )
                // L 4 17.6
                lineTo(x = 4.0f, y = 17.6f)
            }
            // M9 17 H4 v5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 17
                moveTo(x = 9.0f, y = 17.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
            }
        }.build().also { _timerReset = it }
    }


@Suppress("ObjectPropertyName")
private var _timerReset: ImageVector? = null
