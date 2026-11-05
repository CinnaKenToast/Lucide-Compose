package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WavesVertical: ImageVector
    get() {
        val current = _wavesVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "WavesVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 q2 2.5 0 5 t0 5 0 5 0 5 m7 -20 q2 2.5 0 5 t0 5 0 5 0 5 M5 2 q2 2.5 0 5 t0 5 0 5 0 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // q 2 2.5 0 5
                quadToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.5f,
                    dx2 = 0.0f,
                    dy2 = 5.0f,
                )
                // t 0 5
                reflectiveQuadToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // t 0 5
                reflectiveQuadToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // t 0 5
                reflectiveQuadToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // m 7 -20
                moveToRelative(dx = 7.0f, dy = -20.0f)
                // q 2 2.5 0 5
                quadToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.5f,
                    dx2 = 0.0f,
                    dy2 = 5.0f,
                )
                // t 0 5
                reflectiveQuadToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // t 0 5
                reflectiveQuadToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // t 0 5
                reflectiveQuadToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // M 5 2
                moveTo(x = 5.0f, y = 2.0f)
                // q 2 2.5 0 5
                quadToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.5f,
                    dx2 = 0.0f,
                    dy2 = 5.0f,
                )
                // t 0 5
                reflectiveQuadToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // t 0 5
                reflectiveQuadToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // t 0 5
                reflectiveQuadToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
            }
        }.build().also { _wavesVertical = it }
    }


@Suppress("ObjectPropertyName")
private var _wavesVertical: ImageVector? = null
