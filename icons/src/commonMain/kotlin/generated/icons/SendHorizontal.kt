package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SendHorizontal: ImageVector
    get() {
        val current = _sendHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SendHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3.71 3.05 a.5 .5 0 0 0 -.68 .63 l2.84 7.62 a2 2 0 0 1 0 1.4 l-2.84 7.63 a.5 .5 0 0 0 .68 .62 l18 -8.5 a.5 .5 0 0 0 0 -.9z M6 12 h16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3.71 3.05
                moveTo(x = 3.71f, y = 3.05f)
                // a 0.5 0.5 0 0 0 -0.68 0.63
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.68f,
                    dy1 = 0.63f,
                )
                // l 2.84 7.62
                lineToRelative(dx = 2.84f, dy = 7.62f)
                // a 2 2 0 0 1 0 1.4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.4f,
                )
                // l -2.84 7.63
                lineToRelative(dx = -2.84f, dy = 7.63f)
                // a 0.5 0.5 0 0 0 0.68 0.62
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.68f,
                    dy1 = 0.62f,
                )
                // l 18 -8.5
                lineToRelative(dx = 18.0f, dy = -8.5f)
                // a 0.5 0.5 0 0 0 0 -0.9z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -0.9f,
                )
                close()
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
            }
        }.build().also { _sendHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _sendHorizontal: ImageVector? = null
