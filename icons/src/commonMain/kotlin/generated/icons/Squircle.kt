package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Squircle: ImageVector
    get() {
        val current = _squircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Squircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 c7.2 0 9 1.8 9 9 s-1.8 9 -9 9 -9 -1.8 -9 -9 1.8 -9 9 -9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // c 7.2 0 9 1.8 9 9
                curveToRelative(
                    dx1 = 7.2f,
                    dy1 = 0.0f,
                    dx2 = 9.0f,
                    dy2 = 1.8f,
                    dx3 = 9.0f,
                    dy3 = 9.0f,
                )
                // s -1.8 9 -9 9
                reflectiveCurveToRelative(
                    dx1 = -1.8f,
                    dy1 = 9.0f,
                    dx2 = -9.0f,
                    dy2 = 9.0f,
                )
                // s -9 -1.8 -9 -9
                reflectiveCurveToRelative(
                    dx1 = -9.0f,
                    dy1 = -1.8f,
                    dx2 = -9.0f,
                    dy2 = -9.0f,
                )
                // s 1.8 -9 9 -9
                reflectiveCurveToRelative(
                    dx1 = 1.8f,
                    dy1 = -9.0f,
                    dx2 = 9.0f,
                    dy2 = -9.0f,
                )
            }
        }.build().also { _squircle = it }
    }

@Suppress("ObjectPropertyName")
private var _squircle: ImageVector? = null
