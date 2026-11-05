package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AArrowUp: ImageVector
    get() {
        val current = _aArrowUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.AArrowUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 11 4 -4 4 4 m-4 5 V7 M2 16 l4.04 -9.69 a.5 .5 0 0 1 .92 0 L11 16 m-7.7 -3 h6.4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 11
                moveTo(x = 14.0f, y = 11.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m -4 5
                moveToRelative(dx = -4.0f, dy = 5.0f)
                // V 7
                verticalLineTo(y = 7.0f)
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
        }.build().also { _aArrowUp = it }
    }

@Suppress("ObjectPropertyName")
private var _aArrowUp: ImageVector? = null
