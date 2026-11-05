package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ALargeSmall: ImageVector
    get() {
        val current = _aLargeSmall
        if (current != null) return current

        return ImageVector.Builder(
            name = "ALargeSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 16 2.54 -7.33 a1.02 1.02 1 0 1 1.92 0 L22 16 m-6.3 -2 h5.6 M2 16 l4.04 -9.69 a.5 .5 0 0 1 .92 0 L11 16 m-7.7 -3 h6.4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 16
                moveTo(x = 15.0f, y = 16.0f)
                // l 2.54 -7.33
                lineToRelative(dx = 2.54f, dy = -7.33f)
                // a 1.02 1.02 1 0 1 1.92 0
                arcToRelative(
                    a = 1.02f,
                    b = 1.02f,
                    theta = 1.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.92f,
                    dy1 = 0.0f,
                )
                // L 22 16
                lineTo(x = 22.0f, y = 16.0f)
                // m -6.3 -2
                moveToRelative(dx = -6.3f, dy = -2.0f)
                // h 5.6
                horizontalLineToRelative(dx = 5.6f)
                // M 2 16
                moveTo(x = 2.0f, y = 16.0f)
                // l 4.04 -9.69
                lineToRelative(dx = 4.04f, dy = -9.69f)
                // a 0.5 0.5 0 0 1 0.92 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.92f,
                    dy1 = 0.0f,
                )
                // L 11 16
                lineTo(x = 11.0f, y = 16.0f)
                // m -7.7 -3
                moveToRelative(dx = -7.7f, dy = -3.0f)
                // h 6.4
                horizontalLineToRelative(dx = 6.4f)
            }
        }.build().also { _aLargeSmall = it }
    }


@Suppress("ObjectPropertyName")
private var _aLargeSmall: ImageVector? = null
