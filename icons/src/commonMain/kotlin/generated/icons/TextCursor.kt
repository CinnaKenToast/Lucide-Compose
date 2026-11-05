package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TextCursor: ImageVector
    get() {
        val current = _textCursor
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TextCursor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 22 h-1 a4 4 0 0 1 -4 -4 V6 a4 4 0 0 1 4 -4 h1 M7 22 h1 a4 4 0 0 0 4 -4 M7 2 h1 a4 4 0 0 1 4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 22
                moveTo(x = 17.0f, y = 22.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // M 7 2
                moveTo(x = 7.0f, y = 2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
            }
        }.build().also { _textCursor = it }
    }

@Suppress("ObjectPropertyName")
private var _textCursor: ImageVector? = null
