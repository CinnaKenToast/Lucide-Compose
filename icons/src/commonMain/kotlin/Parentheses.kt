package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Parentheses: ImageVector
    get() {
        val current = _parentheses
        if (current != null) return current

        return ImageVector.Builder(
            name = "Parentheses",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 21 s-4 -3 -4 -9 4 -9 4 -9 m8 0 s4 3 4 9 -4 9 -4 9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 21
                moveTo(x = 8.0f, y = 21.0f)
                // s -4 -3 -4 -9
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = -3.0f,
                    dx2 = -4.0f,
                    dy2 = -9.0f,
                )
                // s 4 -9 4 -9
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -9.0f,
                    dx2 = 4.0f,
                    dy2 = -9.0f,
                )
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // s 4 3 4 9
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = 3.0f,
                    dx2 = 4.0f,
                    dy2 = 9.0f,
                )
                // s -4 9 -4 9
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 9.0f,
                    dx2 = -4.0f,
                    dy2 = 9.0f,
                )
            }
        }.build().also { _parentheses = it }
    }


@Suppress("ObjectPropertyName")
private var _parentheses: ImageVector? = null
