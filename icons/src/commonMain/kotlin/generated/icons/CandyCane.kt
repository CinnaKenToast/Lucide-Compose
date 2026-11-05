package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CandyCane: ImageVector
    get() {
        val current = _candyCane
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CandyCane",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10.8 5 2.11 4.22 M17.75 7 15 2.1 M4.87 14.65 7 18.89 M5.7 21 a2 2 0 0 1 -3.5 -2 l8.6 -14 a6 6 0 0 1 10.4 6 2 2 0 1 1 -3.46 -2 2 2 0 1 0 -3.47 -2z M7.9 9.71 l2.01 4.41
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.8 5
                moveTo(x = 10.8f, y = 5.0f)
                // l 2.11 4.22
                lineToRelative(dx = 2.11f, dy = 4.22f)
                // M 17.75 7
                moveTo(x = 17.75f, y = 7.0f)
                // L 15 2.1
                lineTo(x = 15.0f, y = 2.1f)
                // M 4.87 14.65
                moveTo(x = 4.87f, y = 14.65f)
                // L 7 18.89
                lineTo(x = 7.0f, y = 18.89f)
                // M 5.7 21
                moveTo(x = 5.7f, y = 21.0f)
                // a 2 2 0 0 1 -3.5 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.5f,
                    dy1 = -2.0f,
                )
                // l 8.6 -14
                lineToRelative(dx = 8.6f, dy = -14.0f)
                // a 6 6 0 0 1 10.4 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.4f,
                    dy1 = 6.0f,
                )
                // a 2 2 0 1 1 -3.46 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.46f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 1 0 -3.47 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.47f,
                    dy1 = -2.0f,
                )
                close()
                // M 7.9 9.71
                moveTo(x = 7.9f, y = 9.71f)
                // l 2.01 4.41
                lineToRelative(dx = 2.01f, dy = 4.41f)
            }
        }.build().also { _candyCane = it }
    }

@Suppress("ObjectPropertyName")
private var _candyCane: ImageVector? = null
