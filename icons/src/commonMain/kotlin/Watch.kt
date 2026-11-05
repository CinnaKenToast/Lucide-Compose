package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Watch: ImageVector
    get() {
        val current = _watch
        if (current != null) return current

        return ImageVector.Builder(
            name = "Watch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 10 v2.2 l1.6 1 m2.53 -5.54 -.81 -4.05 a2 2 0 0 0 -2 -1.61 h-2.68 a2 2 0 0 0 -2 1.61 L7.86 7.66 m.02 8.7 .8 4 a2 2 0 0 0 2 1.61 h2.72 a2 2 0 0 0 2 -1.61 l.81 -4.05
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // v 2.2
                verticalLineToRelative(dy = 2.2f)
                // l 1.6 1
                lineToRelative(dx = 1.6f, dy = 1.0f)
                // m 2.53 -5.54
                moveToRelative(dx = 2.53f, dy = -5.54f)
                // l -0.81 -4.05
                lineToRelative(dx = -0.81f, dy = -4.05f)
                // a 2 2 0 0 0 -2 -1.61
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -1.61f,
                )
                // h -2.68
                horizontalLineToRelative(dx = -2.68f)
                // a 2 2 0 0 0 -2 1.61
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 1.61f,
                )
                // L 7.86 7.66
                lineTo(x = 7.86f, y = 7.66f)
                // m 0.02 8.7
                moveToRelative(dx = 0.02f, dy = 8.7f)
                // l 0.8 4
                lineToRelative(dx = 0.8f, dy = 4.0f)
                // a 2 2 0 0 0 2 1.61
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 1.61f,
                )
                // h 2.72
                horizontalLineToRelative(dx = 2.72f)
                // a 2 2 0 0 0 2 -1.61
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -1.61f,
                )
                // l 0.81 -4.05
                lineToRelative(dx = 0.81f, dy = -4.05f)
            }
            // <circle cx="12.0" cy="12.0" radius="6.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // a 6 6 0 1 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // a 6 6 0 1 1 -12 0z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _watch = it }
    }


@Suppress("ObjectPropertyName")
private var _watch: ImageVector? = null
