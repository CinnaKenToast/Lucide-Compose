package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BatteryExclamationPoint: ImageVector
    get() {
        val current = _batteryExclamationPoint
        if (current != null) return current

        return ImageVector.Builder(
            name = "BatteryExclamationPoint",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 17z M10 7 v6 m4 -7 h2 a2 2 0 0 1 2 2 v8 a2 2 0 0 1 -2 2 h-2 m8 -4 v-4 M6 18 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 17z
                moveTo(x = 10.0f, y = 17.0f)
                close()
                // M 10 7
                moveTo(x = 10.0f, y = 7.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 4 -7
                moveToRelative(dx = 4.0f, dy = -7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 8 -4
                moveToRelative(dx = 8.0f, dy = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _batteryExclamationPoint = it }
    }


@Suppress("ObjectPropertyName")
private var _batteryExclamationPoint: ImageVector? = null
