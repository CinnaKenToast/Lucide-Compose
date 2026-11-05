package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BadgePoundSterling: ImageVector
    get() {
        val current = _badgePoundSterling
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BadgePoundSterling",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3.85 8.62 a4 4 0 0 1 4.78 -4.77 4 4 0 0 1 6.74 0 4 4 0 0 1 4.78 4.78 4 4 0 0 1 0 6.74 4 4 0 0 1 -4.77 4.78 4 4 0 0 1 -6.75 0 4 4 0 0 1 -4.78 -4.77 4 4 0 0 1 0 -6.76 M8 12 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3.85 8.62
                moveTo(x = 3.85f, y = 8.62f)
                // a 4 4 0 0 1 4.78 -4.77
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.78f,
                    dy1 = -4.77f,
                )
                // a 4 4 0 0 1 6.74 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.74f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 0 1 4.78 4.78
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.78f,
                    dy1 = 4.78f,
                )
                // a 4 4 0 0 1 0 6.74
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.74f,
                )
                // a 4 4 0 0 1 -4.77 4.78
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.77f,
                    dy1 = 4.78f,
                )
                // a 4 4 0 0 1 -6.75 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.75f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 0 1 -4.78 -4.77
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.78f,
                    dy1 = -4.77f,
                )
                // a 4 4 0 0 1 0 -6.76
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -6.76f,
                )
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
            // M10 16 V9.5 a2.5 2.5 0 0 1 5 0 M8 16 h7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 16
                moveTo(x = 10.0f, y = 16.0f)
                // V 9.5
                verticalLineTo(y = 9.5f)
                // a 2.5 2.5 0 0 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
            }
        }.build().also { _badgePoundSterling = it }
    }

@Suppress("ObjectPropertyName")
private var _badgePoundSterling: ImageVector? = null
