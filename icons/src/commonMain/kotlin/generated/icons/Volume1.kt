package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Volume1: ImageVector
    get() {
        val current = _volume1
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Volume1",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 4.7 a.7 .7 0 0 0 -1.2 -.5 L6.4 7.6 a1.4 1.4 0 0 1 -1 .41 H3 a1 1 0 0 0 -1 1 v6 a1 1 0 0 0 1 1 h2.42 a1.4 1.4 0 0 1 1 .41 L9.8 19.8 a.7 .7 0 0 0 1.2 -.5z M16 9 a5 5 0 0 1 0 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 4.7
                moveTo(x = 11.0f, y = 4.7f)
                // a 0.7 0.7 0 0 0 -1.2 -0.5
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.2f,
                    dy1 = -0.5f,
                )
                // L 6.4 7.6
                lineTo(x = 6.4f, y = 7.6f)
                // a 1.4 1.4 0 0 1 -1 0.41
                arcToRelative(
                    a = 1.4f,
                    b = 1.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.41f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 2.42
                horizontalLineToRelative(dx = 2.42f)
                // a 1.4 1.4 0 0 1 1 0.41
                arcToRelative(
                    a = 1.4f,
                    b = 1.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.41f,
                )
                // L 9.8 19.8
                lineTo(x = 9.8f, y = 19.8f)
                // a 0.7 0.7 0 0 0 1.2 -0.5z
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.2f,
                    dy1 = -0.5f,
                )
                close()
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // a 5 5 0 0 1 0 6
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
            }
        }.build().also { _volume1 = it }
    }

@Suppress("ObjectPropertyName")
private var _volume1: ImageVector? = null
