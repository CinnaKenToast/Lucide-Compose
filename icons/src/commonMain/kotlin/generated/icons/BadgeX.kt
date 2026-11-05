package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BadgeX: ImageVector
    get() {
        val current = _badgeX
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BadgeX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3.85 8.62 a4 4 0 0 1 4.78 -4.77 4 4 0 0 1 6.74 0 4 4 0 0 1 4.78 4.78 4 4 0 0 1 0 6.74 4 4 0 0 1 -4.77 4.78 4 4 0 0 1 -6.75 0 4 4 0 0 1 -4.78 -4.77 4 4 0 0 1 0 -6.76
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
            }
            // <line x1="15.0" y1="9.0" x2="9.0" y2="15.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // L 9 15
                lineTo(x = 9.0f, y = 15.0f)
            }
            // <line x1="9.0" y1="9.0" x2="15.0" y2="15.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 9
                moveTo(x = 9.0f, y = 9.0f)
                // L 15 15
                lineTo(x = 15.0f, y = 15.0f)
            }
        }.build().also { _badgeX = it }
    }

@Suppress("ObjectPropertyName")
private var _badgeX: ImageVector? = null
