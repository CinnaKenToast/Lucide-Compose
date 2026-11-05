package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TurkishLira: ImageVector
    get() {
        val current = _turkishLira
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TurkishLira",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 10 -8 4 m8 -9 L6 9 m12 3 a8 8 0 0 1 -7 7.94 C10.45 20 10 19.55 10 19 V4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 10
                moveTo(x = 14.0f, y = 10.0f)
                // l -8 4
                lineToRelative(dx = -8.0f, dy = 4.0f)
                // m 8 -9
                moveToRelative(dx = 8.0f, dy = -9.0f)
                // L 6 9
                lineTo(x = 6.0f, y = 9.0f)
                // m 12 3
                moveToRelative(dx = 12.0f, dy = 3.0f)
                // a 8 8 0 0 1 -7 7.94
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 7.94f,
                )
                // C 10.45 20 10 19.55 10 19
                curveTo(
                    x1 = 10.45f,
                    y1 = 20.0f,
                    x2 = 10.0f,
                    y2 = 19.55f,
                    x3 = 10.0f,
                    y3 = 19.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
            }
        }.build().also { _turkishLira = it }
    }

@Suppress("ObjectPropertyName")
private var _turkishLira: ImageVector? = null
