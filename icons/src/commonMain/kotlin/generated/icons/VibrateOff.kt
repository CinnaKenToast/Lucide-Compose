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
            // m2 8 2 2 -2 2 2 2 -2 2 m20 -8 -2 2 2 2 -2 2 2 2 M8 8 v10 a1 1 0 0 0 1 1 h6 a1 1 0 0 0 1 -1 v-2 m0 -5.66 V6 a1 1 0 0 0 -1 -1 h-4.34
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
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
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 -5.66
                moveToRelative(dx = 0.0f, dy = -5.66f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -4.34
                horizontalLineToRelative(dx = -4.34f)
            }
            // <line x1="2.0" y1="2.0" x2="22.0" y2="22.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // L 22 22
                lineTo(x = 22.0f, y = 22.0f)
            }
        }.build().also { _vibrateOff = it }
    }

@Suppress("ObjectPropertyName")
private var _vibrateOff: ImageVector? = null
