package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Redo: ImageVector
    get() {
        val current = _redo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Redo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 7 v6 h-6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 7
                moveTo(x = 21.0f, y = 7.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
            }
            // M3 17 a9 9 0 0 1 9 -9 9 9 0 0 1 6 2.3 l3 2.7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 17
                moveTo(x = 3.0f, y = 17.0f)
                // a 9 9 0 0 1 9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = -9.0f,
                )
                // a 9 9 0 0 1 6 2.3
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 2.3f,
                )
                // l 3 2.7
                lineToRelative(dx = 3.0f, dy = 2.7f)
            }
        }.build().also { _redo = it }
    }

@Suppress("ObjectPropertyName")
private var _redo: ImageVector? = null
