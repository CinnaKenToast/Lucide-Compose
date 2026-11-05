package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Undo: ImageVector
    get() {
        val current = _undo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Undo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 7 v6 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 7
                moveTo(x = 3.0f, y = 7.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
            // M21 17 a9 9 0 0 0 -9 -9 9 9 0 0 0 -6 2.3 L3 13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 17
                moveTo(x = 21.0f, y = 17.0f)
                // a 9 9 0 0 0 -9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.0f,
                    dy1 = -9.0f,
                )
                // a 9 9 0 0 0 -6 2.3
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 2.3f,
                )
                // L 3 13
                lineTo(x = 3.0f, y = 13.0f)
            }
        }.build().also { _undo = it }
    }

@Suppress("ObjectPropertyName")
private var _undo: ImageVector? = null
