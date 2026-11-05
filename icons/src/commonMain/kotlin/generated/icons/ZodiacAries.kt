package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ZodiacAries: ImageVector
    get() {
        val current = _zodiacAries
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ZodiacAries",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 7.5 a4.5 4.5 0 1 1 5 4.5 M7 12 a4.5 4.5 0 1 1 5 -4.5 V21
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 7.5
                moveTo(x = 12.0f, y = 7.5f)
                // a 4.5 4.5 0 1 1 5 4.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 4.5f,
                )
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // a 4.5 4.5 0 1 1 5 -4.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -4.5f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
            }
        }.build().also { _zodiacAries = it }
    }

@Suppress("ObjectPropertyName")
private var _zodiacAries: ImageVector? = null
