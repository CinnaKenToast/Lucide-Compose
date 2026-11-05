package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArmenianDram: ImageVector
    get() {
        val current = _armenianDram
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArmenianDram",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 10 h8 m-8 4 h8 m-2 6 V10 a6 6 0 0 0 -12 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 10
                moveTo(x = 11.0f, y = 10.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 4
                moveToRelative(dx = -8.0f, dy = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -2 6
                moveToRelative(dx = -2.0f, dy = 6.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // a 6 6 0 0 0 -12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _armenianDram = it }
    }

@Suppress("ObjectPropertyName")
private var _armenianDram: ImageVector? = null
