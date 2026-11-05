package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TouchpadOff: ImageVector
    get() {
        val current = _touchpadOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TouchpadOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 20 v-6 m7.66 0 H22 M2 14 h12 M2 2 l20 20 m-2 -2 H4 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 m5.66 0 H20 a2 2 0 0 1 2 2 v10.34
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 20
                moveTo(x = 12.0f, y = 20.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // m 7.66 0
                moveToRelative(dx = 7.66f, dy = 0.0f)
                // H 22
                horizontalLineTo(x = 22.0f)
                // M 2 14
                moveTo(x = 2.0f, y = 14.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m -2 -2
                moveToRelative(dx = -2.0f, dy = -2.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // m 5.66 0
                moveToRelative(dx = 5.66f, dy = 0.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
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
                // v 10.34
                verticalLineToRelative(dy = 10.34f)
            }
        }.build().also { _touchpadOff = it }
    }

@Suppress("ObjectPropertyName")
private var _touchpadOff: ImageVector? = null
