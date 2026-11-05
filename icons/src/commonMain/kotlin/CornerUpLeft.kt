package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CornerUpLeft: ImageVector
    get() {
        val current = _cornerUpLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "CornerUpLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M20 20 v-7 a4 4 0 0 0 -4 -4 H4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 20
                moveTo(x = 20.0f, y = 20.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
            }
            // M9 14 4 9 l5 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 14
                moveTo(x = 9.0f, y = 14.0f)
                // L 4 9
                lineTo(x = 4.0f, y = 9.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
            }
        }.build().also { _cornerUpLeft = it }
    }


@Suppress("ObjectPropertyName")
private var _cornerUpLeft: ImageVector? = null
