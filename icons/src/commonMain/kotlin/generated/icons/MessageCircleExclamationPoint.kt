package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MessageCircleExclamationPoint: ImageVector
    get() {
        val current = _messageCircleExclamationPoint
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MessageCircleExclamationPoint",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 16.34 a2 2 0 0 1 .09 1.17 L2.02 20.8 a1 1 0 0 0 1.24 1.17 l3.41 -1 a2 2 0 0 1 1.1 .1 10 10 0 1 0 -4.78 -4.73 M12 8 v4 m0 4z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 16.34
                moveTo(x = 3.0f, y = 16.34f)
                // a 2 2 0 0 1 0.09 1.17
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.09f,
                    dy1 = 1.17f,
                )
                // L 2.02 20.8
                lineTo(x = 2.02f, y = 20.8f)
                // a 1 1 0 0 0 1.24 1.17
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.24f,
                    dy1 = 1.17f,
                )
                // l 3.41 -1
                lineToRelative(dx = 3.41f, dy = -1.0f)
                // a 2 2 0 0 1 1.1 0.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.1f,
                )
                // a 10 10 0 1 0 -4.78 -4.73
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.78f,
                    dy1 = -4.73f,
                )
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0 4z
                moveToRelative(dx = 0.0f, dy = 4.0f)
                close()
            }
        }.build().also { _messageCircleExclamationPoint = it }
    }

@Suppress("ObjectPropertyName")
private var _messageCircleExclamationPoint: ImageVector? = null
