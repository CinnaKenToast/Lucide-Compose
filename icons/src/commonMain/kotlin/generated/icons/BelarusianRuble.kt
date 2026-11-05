package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BelarusianRuble: ImageVector
    get() {
        val current = _belarusianRuble
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BelarusianRuble",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 16 h10 m-7 -4 h9 a4 4 0 0 1 0 8 H7 a1 1 0 0 1 -1 -1 V5 a1 1 0 0 1 1 -1 h7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // m -7 -4
                moveToRelative(dx = -7.0f, dy = -4.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // a 4 4 0 0 1 0 8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
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
            }
        }.build().also { _belarusianRuble = it }
    }

@Suppress("ObjectPropertyName")
private var _belarusianRuble: ImageVector? = null
