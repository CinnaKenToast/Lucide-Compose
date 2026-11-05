package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleStar: ImageVector
    get() {
        val current = _circleStar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CircleStar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="12.0" radius="10.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0z
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M11.05 7.62 a1 1 0 0 1 1.91 .02 l.74 1.45 a1 1 0 0 0 .73 .54 l1.64 .25 a1 1 0 0 1 .59 1.8 l-1.18 1.18 a1 1 0 0 0 -.28 .86 l.26 1.62 a1 1 0 0 1 -1.54 1.13 l-1.46 -.75 a1 1 0 0 0 -.92 0 l-1.46 .75 a1 1 0 0 1 -1.54 -1.13 l.26 -1.62 a1 1 0 0 0 -.29 -.86 L7.37 11.7 a1 1 0 0 1 .57 -1.83 l1.63 -.25 a1 1 0 0 0 .74 -.54z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.05 7.62
                moveTo(x = 11.05f, y = 7.62f)
                // a 1 1 0 0 1 1.91 0.02
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.91f,
                    dy1 = 0.02f,
                )
                // l 0.74 1.45
                lineToRelative(dx = 0.74f, dy = 1.45f)
                // a 1 1 0 0 0 0.73 0.54
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.73f,
                    dy1 = 0.54f,
                )
                // l 1.64 0.25
                lineToRelative(dx = 1.64f, dy = 0.25f)
                // a 1 1 0 0 1 0.59 1.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = 1.8f,
                )
                // l -1.18 1.18
                lineToRelative(dx = -1.18f, dy = 1.18f)
                // a 1 1 0 0 0 -0.28 0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.28f,
                    dy1 = 0.86f,
                )
                // l 0.26 1.62
                lineToRelative(dx = 0.26f, dy = 1.62f)
                // a 1 1 0 0 1 -1.54 1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.54f,
                    dy1 = 1.13f,
                )
                // l -1.46 -0.75
                lineToRelative(dx = -1.46f, dy = -0.75f)
                // a 1 1 0 0 0 -0.92 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.92f,
                    dy1 = 0.0f,
                )
                // l -1.46 0.75
                lineToRelative(dx = -1.46f, dy = 0.75f)
                // a 1 1 0 0 1 -1.54 -1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.54f,
                    dy1 = -1.13f,
                )
                // l 0.26 -1.62
                lineToRelative(dx = 0.26f, dy = -1.62f)
                // a 1 1 0 0 0 -0.29 -0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.29f,
                    dy1 = -0.86f,
                )
                // L 7.37 11.7
                lineTo(x = 7.37f, y = 11.7f)
                // a 1 1 0 0 1 0.57 -1.83
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.57f,
                    dy1 = -1.83f,
                )
                // l 1.63 -0.25
                lineToRelative(dx = 1.63f, dy = -0.25f)
                // a 1 1 0 0 0 0.74 -0.54z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.74f,
                    dy1 = -0.54f,
                )
                close()
            }
        }.build().also { _circleStar = it }
    }

@Suppress("ObjectPropertyName")
private var _circleStar: ImageVector? = null
