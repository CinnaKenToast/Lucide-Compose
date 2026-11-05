package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LetterV: ImageVector
    get() {
        val current = _letterV
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LetterV",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m6 4 5.77 15.84 a.25 .25 0 0 0 .47 0 L18 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // l 5.77 15.84
                lineToRelative(dx = 5.77f, dy = 15.84f)
                // a 0.25 0.25 0 0 0 0.47 0
                arcToRelative(
                    a = 0.25f,
                    b = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.47f,
                    dy1 = 0.0f,
                )
                // L 18 4
                lineTo(x = 18.0f, y = 4.0f)
            }
        }.build().also { _letterV = it }
    }

@Suppress("ObjectPropertyName")
private var _letterV: ImageVector? = null
