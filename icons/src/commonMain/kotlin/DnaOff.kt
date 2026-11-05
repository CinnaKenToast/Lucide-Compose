package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DnaOff: ImageVector
    get() {
        val current = _dnaOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "DnaOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 2 c-1.35 1.5 -2.1 3 -2.5 4.5 L14 8 m3 -2 -2.9 -2.9 M2 15 c3.33 -3 6.67 -3 10 -3 M2 2 l20 20 M20 9 l.9 .9 M22 9 c-1.5 1.35 -3 2.1 -4.5 2.5 l-1 -1 M3.1 14.1 4 15 m2.5 -2.5 1 1 M7 18 l2.9 2.9 M9 22 c1.35 -1.5 2.1 -3 2.5 -4.5 L10 16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 2
                moveTo(x = 15.0f, y = 2.0f)
                // c -1.35 1.5 -2.1 3 -2.5 4.5
                curveToRelative(
                    dx1 = -1.35f,
                    dy1 = 1.5f,
                    dx2 = -2.1f,
                    dy2 = 3.0f,
                    dx3 = -2.5f,
                    dy3 = 4.5f,
                )
                // L 14 8
                lineTo(x = 14.0f, y = 8.0f)
                // m 3 -2
                moveToRelative(dx = 3.0f, dy = -2.0f)
                // l -2.9 -2.9
                lineToRelative(dx = -2.9f, dy = -2.9f)
                // M 2 15
                moveTo(x = 2.0f, y = 15.0f)
                // c 3.33 -3 6.67 -3 10 -3
                curveToRelative(
                    dx1 = 3.33f,
                    dy1 = -3.0f,
                    dx2 = 6.67f,
                    dy2 = -3.0f,
                    dx3 = 10.0f,
                    dy3 = -3.0f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 20 9
                moveTo(x = 20.0f, y = 9.0f)
                // l 0.9 0.9
                lineToRelative(dx = 0.9f, dy = 0.9f)
                // M 22 9
                moveTo(x = 22.0f, y = 9.0f)
                // c -1.5 1.35 -3 2.1 -4.5 2.5
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 1.35f,
                    dx2 = -3.0f,
                    dy2 = 2.1f,
                    dx3 = -4.5f,
                    dy3 = 2.5f,
                )
                // l -1 -1
                lineToRelative(dx = -1.0f, dy = -1.0f)
                // M 3.1 14.1
                moveTo(x = 3.1f, y = 14.1f)
                // L 4 15
                lineTo(x = 4.0f, y = 15.0f)
                // m 2.5 -2.5
                moveToRelative(dx = 2.5f, dy = -2.5f)
                // l 1 1
                lineToRelative(dx = 1.0f, dy = 1.0f)
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
                // l 2.9 2.9
                lineToRelative(dx = 2.9f, dy = 2.9f)
                // M 9 22
                moveTo(x = 9.0f, y = 22.0f)
                // c 1.35 -1.5 2.1 -3 2.5 -4.5
                curveToRelative(
                    dx1 = 1.35f,
                    dy1 = -1.5f,
                    dx2 = 2.1f,
                    dy2 = -3.0f,
                    dx3 = 2.5f,
                    dy3 = -4.5f,
                )
                // L 10 16
                lineTo(x = 10.0f, y = 16.0f)
            }
        }.build().also { _dnaOff = it }
    }


@Suppress("ObjectPropertyName")
private var _dnaOff: ImageVector? = null
