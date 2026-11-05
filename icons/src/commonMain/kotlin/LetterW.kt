package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterW: ImageVector
    get() {
        val current = _letterW
        if (current != null) return current

        return ImageVector.Builder(
            name = "LetterW",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m21 4 -4.8 15.82 a.25 .25 0 0 1 -.46 .02 l-3.5 -8.68 a.25 .25 0 0 0 -.47 0 l-3.5 8.68 a.25 .25 0 0 1 -.48 -.02 L3 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 4
                moveTo(x = 21.0f, y = 4.0f)
                // l -4.8 15.82
                lineToRelative(dx = -4.8f, dy = 15.82f)
                // a 0.25 0.25 0 0 1 -0.46 0.02
                arcToRelative(
                    a = 0.25f,
                    b = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.46f,
                    dy1 = 0.02f,
                )
                // l -3.5 -8.68
                lineToRelative(dx = -3.5f, dy = -8.68f)
                // a 0.25 0.25 0 0 0 -0.47 0
                arcToRelative(
                    a = 0.25f,
                    b = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.47f,
                    dy1 = 0.0f,
                )
                // l -3.5 8.68
                lineToRelative(dx = -3.5f, dy = 8.68f)
                // a 0.25 0.25 0 0 1 -0.48 -0.02
                arcToRelative(
                    a = 0.25f,
                    b = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.48f,
                    dy1 = -0.02f,
                )
                // L 3 4
                lineTo(x = 3.0f, y = 4.0f)
            }
        }.build().also { _letterW = it }
    }


@Suppress("ObjectPropertyName")
private var _letterW: ImageVector? = null
