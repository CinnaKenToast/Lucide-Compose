package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.VibrateOff: ImageVector
    get() {
        val current = _vibrateOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.VibrateOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.66 5 H14 a2 2 0 0 1 2 2 v3.34 M16 16 v1 a2 2 0 0 1 -2 2 h-4 a2 2 0 0 1 -2 -2 V8 M2 2 l20 20 M2 8 l2 2 -2 2 2 2 -2 2 m20 -8 -2 2 2 2 -2 2 2 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.66 5
                moveTo(x = 10.66f, y = 5.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
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
                // v 3.34
                verticalLineToRelative(dy = 3.34f)
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 2 8
                moveTo(x = 2.0f, y = 8.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // m 20 -8
                moveToRelative(dx = 20.0f, dy = -8.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
            }
        }.build().also { _vibrateOff = it }
    }

@Suppress("ObjectPropertyName")
private var _vibrateOff: ImageVector? = null
