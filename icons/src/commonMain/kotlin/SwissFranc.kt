package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SwissFranc: ImageVector
    get() {
        val current = _swissFranc
        if (current != null) return current

        return ImageVector.Builder(
            name = "SwissFranc",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 10 h7 m-7 10 V5 a1 1 0 0 1 1 -1 h7 M6 16 h9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // m -7 10
                moveToRelative(dx = -7.0f, dy = 10.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // M 6 16
                moveTo(x = 6.0f, y = 16.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
            }
        }.build().also { _swissFranc = it }
    }


@Suppress("ObjectPropertyName")
private var _swissFranc: ImageVector? = null
