package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Undo2: ImageVector
    get() {
        val current = _undo2
        if (current != null) return current

        return ImageVector.Builder(
            name = "Undo2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9 14 4 9 l5 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 14
                moveTo(x = 9.0f, y = 14.0f)
                // L 4 9
                lineTo(x = 4.0f, y = 9.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
            }
            // M4 9 h10.5 a5.5 5.5 0 0 1 5.5 5.5 5.5 5.5 0 0 1 -5.5 5.5 H11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 9
                moveTo(x = 4.0f, y = 9.0f)
                // h 10.5
                horizontalLineToRelative(dx = 10.5f)
                // a 5.5 5.5 0 0 1 5.5 5.5
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.5f,
                    dy1 = 5.5f,
                )
                // a 5.5 5.5 0 0 1 -5.5 5.5
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.5f,
                    dy1 = 5.5f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
            }
        }.build().also { _undo2 = it }
    }


@Suppress("ObjectPropertyName")
private var _undo2: ImageVector? = null
