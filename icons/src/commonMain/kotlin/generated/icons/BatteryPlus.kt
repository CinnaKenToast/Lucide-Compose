package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BatteryPlus: ImageVector
    get() {
        val current = _batteryPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BatteryPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 9 v6 m2.54 -9 H16 a2 2 0 0 1 2 2 v8 a2 2 0 0 1 -2 2 h-3.6 m9.6 -4 v-4 M7 12 h6 m-5.4 6 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h3.6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 9
                moveTo(x = 10.0f, y = 9.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 2.54 -9
                moveToRelative(dx = 2.54f, dy = -9.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
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
                // h -3.6
                horizontalLineToRelative(dx = -3.6f)
                // m 9.6 -4
                moveToRelative(dx = 9.6f, dy = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -5.4 6
                moveToRelative(dx = -5.4f, dy = 6.0f)
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
                // h 3.6
                horizontalLineToRelative(dx = 3.6f)
            }
        }.build().also { _batteryPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _batteryPlus: ImageVector? = null
