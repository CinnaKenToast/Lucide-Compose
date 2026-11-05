package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LetterA: ImageVector
    get() {
        val current = _letterA
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LetterA",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17.12 14 H6.88 M4 20 l7.55 -15.71 a.5 .5 0 0 1 .9 0 L20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.12 14
                moveTo(x = 17.12f, y = 14.0f)
                // H 6.88
                horizontalLineTo(x = 6.88f)
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // l 7.55 -15.71
                lineToRelative(dx = 7.55f, dy = -15.71f)
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
                // L 20 20
                lineTo(x = 20.0f, y = 20.0f)
            }
        }.build().also { _letterA = it }
    }

@Suppress("ObjectPropertyName")
private var _letterA: ImageVector? = null
