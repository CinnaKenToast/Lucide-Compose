package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZodiacVirgo: ImageVector
    get() {
        val current = _zodiacVirgo
        if (current != null) return current

        return ImageVector.Builder(
            name = "ZodiacVirgo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 5.5 a1 1 0 0 1 5 0 V16 a5 5 0 0 0 5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 5.5
                moveTo(x = 11.0f, y = 5.5f)
                // a 1 1 0 0 1 5 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // a 5 5 0 0 0 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
            }
            // M16 11.5 a1 1 0 0 1 5 0 V16 a5 5 0 0 1 -5 5 M6 19 V6 a3 3 0 0 0 -3 -3 m3 2.5 a1 1 0 0 1 5 0 V19
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 11.5
                moveTo(x = 16.0f, y = 11.5f)
                // a 1 1 0 0 1 5 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // a 5 5 0 0 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // M 6 19
                moveTo(x = 6.0f, y = 19.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // m 3 2.5
                moveToRelative(dx = 3.0f, dy = 2.5f)
                // a 1 1 0 0 1 5 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // V 19
                verticalLineTo(y = 19.0f)
            }
        }.build().also { _zodiacVirgo = it }
    }


@Suppress("ObjectPropertyName")
private var _zodiacVirgo: ImageVector? = null
