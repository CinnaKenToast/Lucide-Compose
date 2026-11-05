package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Lighthouse: ImageVector
    get() {
        val current = _lighthouse
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Lighthouse",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 V2 m4.07 14.86 L7 22 l2 -11 V6 a3 3 0 0 1 6 0 v5 l2 11 m2.8 -17.5 L20.65 4 m-.86 9.5 .86 .5 M21 9 h1 M3 9 H2 m2.2 4.5 L3.34 14 M4.2 4.5 3.34 4 M5.5 22 h13 M7.93 16.88 l7.38 -4.18 M8 11 h8 M8 7 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // m 4.07 14.86
                moveToRelative(dx = 4.07f, dy = 14.86f)
                // L 7 22
                lineTo(x = 7.0f, y = 22.0f)
                // l 2 -11
                lineToRelative(dx = 2.0f, dy = -11.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 3 3 0 0 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // l 2 11
                lineToRelative(dx = 2.0f, dy = 11.0f)
                // m 2.8 -17.5
                moveToRelative(dx = 2.8f, dy = -17.5f)
                // L 20.65 4
                lineTo(x = 20.65f, y = 4.0f)
                // m -0.86 9.5
                moveToRelative(dx = -0.86f, dy = 9.5f)
                // l 0.86 0.5
                lineToRelative(dx = 0.86f, dy = 0.5f)
                // M 21 9
                moveTo(x = 21.0f, y = 9.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 2.2 4.5
                moveToRelative(dx = 2.2f, dy = 4.5f)
                // L 3.34 14
                lineTo(x = 3.34f, y = 14.0f)
                // M 4.2 4.5
                moveTo(x = 4.2f, y = 4.5f)
                // L 3.34 4
                lineTo(x = 3.34f, y = 4.0f)
                // M 5.5 22
                moveTo(x = 5.5f, y = 22.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // M 7.93 16.88
                moveTo(x = 7.93f, y = 16.88f)
                // l 7.38 -4.18
                lineToRelative(dx = 7.38f, dy = -4.18f)
                // M 8 11
                moveTo(x = 8.0f, y = 11.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 8 7
                moveTo(x = 8.0f, y = 7.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _lighthouse = it }
    }

@Suppress("ObjectPropertyName")
private var _lighthouse: ImageVector? = null
