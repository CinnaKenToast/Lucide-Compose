package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ZodiacGemini: ImageVector
    get() {
        val current = _zodiacGemini
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ZodiacGemini",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 4.53 v14.94 M20 3 A17 17 0 0 1 4 3 m0 18 a17 17 0 0 1 16 0 M8 4.52 v14.95
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 4.53
                moveTo(x = 16.0f, y = 4.53f)
                // v 14.94
                verticalLineToRelative(dy = 14.94f)
                // M 20 3
                moveTo(x = 20.0f, y = 3.0f)
                // A 17 17 0 0 1 4 3
                arcTo(
                    horizontalEllipseRadius = 17.0f,
                    verticalEllipseRadius = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 3.0f,
                )
                // m 0 18
                moveToRelative(dx = 0.0f, dy = 18.0f)
                // a 17 17 0 0 1 16 0
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // M 8 4.52
                moveTo(x = 8.0f, y = 4.52f)
                // v 14.95
                verticalLineToRelative(dy = 14.95f)
            }
        }.build().also { _zodiacGemini = it }
    }

@Suppress("ObjectPropertyName")
private var _zodiacGemini: ImageVector? = null
