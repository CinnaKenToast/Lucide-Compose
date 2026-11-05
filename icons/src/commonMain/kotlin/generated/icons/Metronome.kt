package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Metronome: ImageVector
    get() {
        val current = _metronome
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Metronome",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 11.4 V9.1 m0 7.9 6.59 -6.59 M15.05 5.7 14.83 5 a3 3 0 0 0 -5.66 0 L4.42 19.7 A1 1 0 0 0 5.37 21 h13.25 a1 1 0 0 0 .95 -1.31 l-1.12 -3.49
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 11.4
                moveTo(x = 12.0f, y = 11.4f)
                // V 9.1
                verticalLineTo(y = 9.1f)
                // m 0 7.9
                moveToRelative(dx = 0.0f, dy = 7.9f)
                // l 6.59 -6.59
                lineToRelative(dx = 6.59f, dy = -6.59f)
                // M 15.05 5.7
                moveTo(x = 15.05f, y = 5.7f)
                // L 14.83 5
                lineTo(x = 14.83f, y = 5.0f)
                // a 3 3 0 0 0 -5.66 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.66f,
                    dy1 = 0.0f,
                )
                // L 4.42 19.7
                lineTo(x = 4.42f, y = 19.7f)
                // A 1 1 0 0 0 5.37 21
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.37f,
                    y1 = 21.0f,
                )
                // h 13.25
                horizontalLineToRelative(dx = 13.25f)
                // a 1 1 0 0 0 0.95 -1.31
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.95f,
                    dy1 = -1.31f,
                )
                // l -1.12 -3.49
                lineToRelative(dx = -1.12f, dy = -3.49f)
            }
            // <circle cx="20.0" cy="9.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 9
                moveTo(x = 20.0f, y = 9.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _metronome = it }
    }

@Suppress("ObjectPropertyName")
private var _metronome: ImageVector? = null
