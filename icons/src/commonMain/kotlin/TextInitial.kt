package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextInitial: ImageVector
    get() {
        val current = _textInitial
        if (current != null) return current

        return ImageVector.Builder(
            name = "TextInitial",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 5 h6 m-6 7 h6 M3 19 h18 M3 12 l3.55 -7.72 a.5 .5 0 0 1 .9 0 L11 12 m-7.08 -2 h6.16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -6 7
                moveToRelative(dx = -6.0f, dy = 7.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // l 3.55 -7.72
                lineToRelative(dx = 3.55f, dy = -7.72f)
                // a 0.5 0.5 0 0 1 0.9 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.9f,
                    dy1 = 0.0f,
                )
                // L 11 12
                lineTo(x = 11.0f, y = 12.0f)
                // m -7.08 -2
                moveToRelative(dx = -7.08f, dy = -2.0f)
                // h 6.16
                horizontalLineToRelative(dx = 6.16f)
            }
        }.build().also { _textInitial = it }
    }


@Suppress("ObjectPropertyName")
private var _textInitial: ImageVector? = null
