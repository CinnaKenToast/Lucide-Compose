package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PlugZap: ImageVector
    get() {
        val current = _plugZap
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PlugZap",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6.3 20.3 a2.4 2.4 0 0 0 3.4 0 L12 18 l-6 -6 -2.3 2.3 a2.4 2.4 0 0 0 0 3.4Z M2 22 l3 -3 m2.5 -5.5 L10 11 m.5 5.5 L13 14 m5 -11 -4 4 h6 l-4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.3 20.3
                moveTo(x = 6.3f, y = 20.3f)
                // a 2.4 2.4 0 0 0 3.4 0
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.4f,
                    dy1 = 0.0f,
                )
                // L 12 18
                lineTo(x = 12.0f, y = 18.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // l -2.3 2.3
                lineToRelative(dx = -2.3f, dy = 2.3f)
                // a 2.4 2.4 0 0 0 0 3.4z
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.4f,
                )
                close()
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // m 2.5 -5.5
                moveToRelative(dx = 2.5f, dy = -5.5f)
                // L 10 11
                lineTo(x = 10.0f, y = 11.0f)
                // m 0.5 5.5
                moveToRelative(dx = 0.5f, dy = 5.5f)
                // L 13 14
                lineTo(x = 13.0f, y = 14.0f)
                // m 5 -11
                moveToRelative(dx = 5.0f, dy = -11.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
            }
        }.build().also { _plugZap = it }
    }

@Suppress("ObjectPropertyName")
private var _plugZap: ImageVector? = null
