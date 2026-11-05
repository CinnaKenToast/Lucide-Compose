package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterSpacing: ImageVector
    get() {
        val current = _letterSpacing
        if (current != null) return current

        return ImageVector.Builder(
            name = "LetterSpacing",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 14 H9 M21 3 v18 M3 3 v18 m5 -5 3.45 -7.65 a.6 .6 0 0 1 1.1 0 L16 16
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
                // M 21 3
                moveTo(x = 21.0f, y = 3.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // m 5 -5
                moveToRelative(dx = 5.0f, dy = -5.0f)
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
        }.build().also { _letterSpacing = it }
    }


@Suppress("ObjectPropertyName")
private var _letterSpacing: ImageVector? = null
