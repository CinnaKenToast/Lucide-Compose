package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.StrokeLineCapRound: ImageVector
    get() {
        val current = _strokeLineCapRound
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.StrokeLineCapRound",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.99 12z M2 12 h2 M2 4 h12 a8 8 0 0 1 0 16 H2 m6 -8 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.99 12z
                moveTo(x = 13.99f, y = 12.0f)
                close()
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 2 4
                moveTo(x = 2.0f, y = 4.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 8 8 0 0 1 0 16
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 16.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 6 -8
                moveToRelative(dx = 6.0f, dy = -8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _strokeLineCapRound = it }
    }

@Suppress("ObjectPropertyName")
private var _strokeLineCapRound: ImageVector? = null
