package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZodiacPisces: ImageVector
    get() {
        val current = _zodiacPisces
        if (current != null) return current

        return ImageVector.Builder(
            name = "ZodiacPisces",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 21 a15 15 0 0 1 0 -18 m1 9 H4 m1 -9 a15 15 0 0 1 0 18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 21
                moveTo(x = 19.0f, y = 21.0f)
                // a 15 15 0 0 1 0 -18
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -18.0f,
                )
                // m 1 9
                moveToRelative(dx = 1.0f, dy = 9.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // m 1 -9
                moveToRelative(dx = 1.0f, dy = -9.0f)
                // a 15 15 0 0 1 0 18
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 18.0f,
                )
            }
        }.build().also { _zodiacPisces = it }
    }


@Suppress("ObjectPropertyName")
private var _zodiacPisces: ImageVector? = null
