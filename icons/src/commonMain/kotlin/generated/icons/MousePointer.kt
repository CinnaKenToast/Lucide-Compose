package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MousePointer: ImageVector
    get() {
        val current = _mousePointer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MousePointer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.59 12.59 19 19 M3.69 3.04 a.5 .5 0 0 0 -.65 .65 l6.5 16 a.5 .5 0 0 0 .94 -.07 l1.57 -6.08 a2 2 0 0 1 1.45 -1.48 l6.13 -1.58 a.5 .5 0 0 0 .06 -.94z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.59 12.59
                moveTo(x = 12.59f, y = 12.59f)
                // L 19 19
                lineTo(x = 19.0f, y = 19.0f)
                // M 3.69 3.04
                moveTo(x = 3.69f, y = 3.04f)
                // a 0.5 0.5 0 0 0 -0.65 0.65
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.65f,
                    dy1 = 0.65f,
                )
                // l 6.5 16
                lineToRelative(dx = 6.5f, dy = 16.0f)
                // a 0.5 0.5 0 0 0 0.94 -0.07
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.94f,
                    dy1 = -0.07f,
                )
                // l 1.57 -6.08
                lineToRelative(dx = 1.57f, dy = -6.08f)
                // a 2 2 0 0 1 1.45 -1.48
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.45f,
                    dy1 = -1.48f,
                )
                // l 6.13 -1.58
                lineToRelative(dx = 6.13f, dy = -1.58f)
                // a 0.5 0.5 0 0 0 0.06 -0.94z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.06f,
                    dy1 = -0.94f,
                )
                close()
            }
        }.build().also { _mousePointer = it }
    }

@Suppress("ObjectPropertyName")
private var _mousePointer: ImageVector? = null
