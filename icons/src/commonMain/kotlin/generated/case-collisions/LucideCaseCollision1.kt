package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LetterS: ImageVector
    get() {
        val current = _letterS
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LetterS",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 4 h-7 a4 4 0 0 0 0 8 h4 a4 4 0 0 1 0 8 H6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 4
                moveTo(x = 17.0f, y = 4.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // a 4 4 0 0 0 0 8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
            }
        }.build().also { _letterS = it }
    }

@Suppress("ObjectPropertyName")
private var _letterS: ImageVector? = null
