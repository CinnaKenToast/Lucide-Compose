package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Settings: ImageVector
    get() {
        val current = _settings
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Settings",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9.67 4.14 a2.34 2.34 0 0 1 4.66 0 2.34 2.34 0 0 0 3.32 1.91 2.34 2.34 0 0 1 2.33 4.03 2.34 2.34 0 0 0 0 3.83 2.34 2.34 0 0 1 -2.33 4.04 2.34 2.34 0 0 0 -3.32 1.91 2.34 2.34 0 0 1 -4.66 0 2.34 2.34 0 0 0 -3.32 -1.91 2.34 2.34 0 0 1 -2.33 -4.03 2.34 2.34 0 0 0 0 -3.84 2.34 2.34 0 0 1 2.33 -4.03 2.34 2.34 0 0 0 3.32 -1.91
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.67 4.14
                moveTo(x = 9.67f, y = 4.14f)
                // a 2.34 2.34 0 0 1 4.66 0
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.66f,
                    dy1 = 0.0f,
                )
                // a 2.34 2.34 0 0 0 3.32 1.91
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.32f,
                    dy1 = 1.91f,
                )
                // a 2.34 2.34 0 0 1 2.33 4.03
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.33f,
                    dy1 = 4.03f,
                )
                // a 2.34 2.34 0 0 0 0 3.83
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.83f,
                )
                // a 2.34 2.34 0 0 1 -2.33 4.04
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.33f,
                    dy1 = 4.04f,
                )
                // a 2.34 2.34 0 0 0 -3.32 1.91
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.32f,
                    dy1 = 1.91f,
                )
                // a 2.34 2.34 0 0 1 -4.66 0
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.66f,
                    dy1 = 0.0f,
                )
                // a 2.34 2.34 0 0 0 -3.32 -1.91
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.32f,
                    dy1 = -1.91f,
                )
                // a 2.34 2.34 0 0 1 -2.33 -4.03
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.33f,
                    dy1 = -4.03f,
                )
                // a 2.34 2.34 0 0 0 0 -3.84
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.84f,
                )
                // a 2.34 2.34 0 0 1 2.33 -4.03
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.33f,
                    dy1 = -4.03f,
                )
                // a 2.34 2.34 0 0 0 3.32 -1.91
                arcToRelative(
                    a = 2.34f,
                    b = 2.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.32f,
                    dy1 = -1.91f,
                )
            }
            // <circle cx="12.0" cy="12.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _settings = it }
    }

@Suppress("ObjectPropertyName")
private var _settings: ImageVector? = null
