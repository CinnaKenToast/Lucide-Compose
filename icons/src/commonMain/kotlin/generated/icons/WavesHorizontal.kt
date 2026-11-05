package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.WavesHorizontal: ImageVector
    get() {
        val current = _wavesHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.WavesHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 12 q2.5 2 5 0 t5 0 5 0 5 0 M2 19 q2.5 2 5 0 t5 0 5 0 5 0 M2 5 q2.5 2 5 0 t5 0 5 0 5 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // q 2.5 2 5 0
                quadToRelative(
                    dx1 = 2.5f,
                    dy1 = 2.0f,
                    dx2 = 5.0f,
                    dy2 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // M 2 19
                moveTo(x = 2.0f, y = 19.0f)
                // q 2.5 2 5 0
                quadToRelative(
                    dx1 = 2.5f,
                    dy1 = 2.0f,
                    dx2 = 5.0f,
                    dy2 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // M 2 5
                moveTo(x = 2.0f, y = 5.0f)
                // q 2.5 2 5 0
                quadToRelative(
                    dx1 = 2.5f,
                    dy1 = 2.0f,
                    dx2 = 5.0f,
                    dy2 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // t 5 0
                reflectiveQuadToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _wavesHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _wavesHorizontal: ImageVector? = null
