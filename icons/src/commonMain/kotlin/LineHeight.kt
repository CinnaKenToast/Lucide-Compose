package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LineHeight: ImageVector
    get() {
        val current = _lineHeight
        if (current != null) return current

        return ImageVector.Builder(
            name = "LineHeight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 14 H9 m12 7 H3 M21 3 H3 m5 13 3.45 -7.65 a.6 .6 0 0 1 1.1 0 L16 16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 14
                moveTo(x = 15.0f, y = 14.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // m 12 7
                moveToRelative(dx = 12.0f, dy = 7.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // M 21 3
                moveTo(x = 21.0f, y = 3.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 5 13
                moveToRelative(dx = 5.0f, dy = 13.0f)
                // l 3.45 -7.65
                lineToRelative(dx = 3.45f, dy = -7.65f)
                // a 0.6 0.6 0 0 1 1.1 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                )
                // L 16 16
                lineTo(x = 16.0f, y = 16.0f)
            }
        }.build().also { _lineHeight = it }
    }


@Suppress("ObjectPropertyName")
private var _lineHeight: ImageVector? = null
