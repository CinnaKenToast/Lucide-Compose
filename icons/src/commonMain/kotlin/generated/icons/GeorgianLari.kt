package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GeorgianLari: ImageVector
    get() {
        val current = _georgianLari
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.GeorgianLari",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 10 V3 m4 7 V3 m5 10 a7 7 0 1 0 -7 7 m-7 0 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m 4 7
                moveToRelative(dx = 4.0f, dy = 7.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m 5 10
                moveToRelative(dx = 5.0f, dy = 10.0f)
                // a 7 7 0 1 0 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // m -7 0
                moveToRelative(dx = -7.0f, dy = 0.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
        }.build().also { _georgianLari = it }
    }

@Suppress("ObjectPropertyName")
private var _georgianLari: ImageVector? = null
