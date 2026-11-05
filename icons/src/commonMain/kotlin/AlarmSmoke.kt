package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlarmSmoke: ImageVector
    get() {
        val current = _alarmSmoke
        if (current != null) return current

        return ImageVector.Builder(
            name = "AlarmSmoke",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 21 c0 -2.5 2 -2.5 2 -5 m3 5 c0 -2.5 2 -2.5 2 -5 m1 -8 -.8 3 a1.25 1.25 0 0 1 -1.2 1 H7 a1.25 1.25 0 0 1 -1.2 -1 L5 8 m16 -5 a1 1 0 0 1 1 1 v2 a2 2 0 0 1 -2 2 H4 a2 2 0 0 1 -2 -2 V4 a1 1 0 0 1 1 -1z M6 21 c0 -2.5 2 -2.5 2 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 21
                moveTo(x = 11.0f, y = 21.0f)
                // c 0 -2.5 2 -2.5 2 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.5f,
                    dx2 = 2.0f,
                    dy2 = -2.5f,
                    dx3 = 2.0f,
                    dy3 = -5.0f,
                )
                // m 3 5
                moveToRelative(dx = 3.0f, dy = 5.0f)
                // c 0 -2.5 2 -2.5 2 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.5f,
                    dx2 = 2.0f,
                    dy2 = -2.5f,
                    dx3 = 2.0f,
                    dy3 = -5.0f,
                )
                // m 1 -8
                moveToRelative(dx = 1.0f, dy = -8.0f)
                // l -0.8 3
                lineToRelative(dx = -0.8f, dy = 3.0f)
                // a 1.25 1.25 0 0 1 -1.2 1
                arcToRelative(
                    a = 1.25f,
                    b = 1.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.2f,
                    dy1 = 1.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 1.25 1.25 0 0 1 -1.2 -1
                arcToRelative(
                    a = 1.25f,
                    b = 1.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.2f,
                    dy1 = -1.0f,
                )
                // L 5 8
                lineTo(x = 5.0f, y = 8.0f)
                // m 16 -5
                moveToRelative(dx = 16.0f, dy = -5.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 1 1 0 0 1 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
                // M 6 21
                moveTo(x = 6.0f, y = 21.0f)
                // c 0 -2.5 2 -2.5 2 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.5f,
                    dx2 = 2.0f,
                    dy2 = -2.5f,
                    dx3 = 2.0f,
                    dy3 = -5.0f,
                )
            }
        }.build().also { _alarmSmoke = it }
    }


@Suppress("ObjectPropertyName")
private var _alarmSmoke: ImageVector? = null
