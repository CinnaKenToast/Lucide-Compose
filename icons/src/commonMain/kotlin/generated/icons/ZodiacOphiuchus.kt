package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ZodiacOphiuchus: ImageVector
    get() {
        val current = _zodiacOphiuchus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ZodiacOphiuchus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 10 a6.06 6.06 0 0 1 9 0 6.06 6.06 0 0 0 9 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 10
                moveTo(x = 3.0f, y = 10.0f)
                // a 6.06 6.06 0 0 1 9 0
                arcToRelative(
                    a = 6.06f,
                    b = 6.06f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = 0.0f,
                )
                // a 6.06 6.06 0 0 0 9 0
                arcToRelative(
                    a = 6.06f,
                    b = 6.06f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.0f,
                    dy1 = 0.0f,
                )
            }
            // M6 3 v12 a6 6 0 0 0 12 0 V3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 3
                moveTo(x = 6.0f, y = 3.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 6 6 0 0 0 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // V 3
                verticalLineTo(y = 3.0f)
            }
        }.build().also { _zodiacOphiuchus = it }
    }

@Suppress("ObjectPropertyName")
private var _zodiacOphiuchus: ImageVector? = null
