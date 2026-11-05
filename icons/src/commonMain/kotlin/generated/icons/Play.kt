package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Play: ImageVector
    get() {
        val current = _play
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Play",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 5 a2 2 0 0 1 3 -1.73 l12 7 a2 2 0 0 1 0 3.46 l-12 7 A2 2 0 0 1 5 19z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 5
                moveTo(x = 5.0f, y = 5.0f)
                // a 2 2 0 0 1 3 -1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -1.73f,
                )
                // l 12 7
                lineToRelative(dx = 12.0f, dy = 7.0f)
                // a 2 2 0 0 1 0 3.46
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.46f,
                )
                // l -12 7
                lineToRelative(dx = -12.0f, dy = 7.0f)
                // A 2 2 0 0 1 5 19z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 19.0f,
                )
                close()
            }
        }.build().also { _play = it }
    }

@Suppress("ObjectPropertyName")
private var _play: ImageVector? = null
