package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.EyeDashed: ImageVector
    get() {
        val current = _eyeDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.EyeDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.05 18.95 a11 11 0 0 1 -2.1 0 m2.1 -13.9 a11 11 0 0 0 -2.1 0 m6.12 1.22 a11 11 0 0 1 1.75 1.18 m0 9.1 a11 11 0 0 1 -1.75 1.18 M2.51 13.3 a11 11 0 0 1 -.45 -.95 1 1 0 0 1 0 -.7 11 11 0 0 1 .45 -.95 m18.97 0 a11 11 0 0 1 .46 .95 1 1 0 0 1 0 .7 11 11 0 0 1 -.46 .95 M5.18 7.45 a11 11 0 0 1 1.75 -1.18 m0 11.46 a11 11 0 0 1 -1.76 -1.18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.05 18.95
                moveTo(x = 13.05f, y = 18.95f)
                // a 11 11 0 0 1 -2.1 0
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.1f,
                    dy1 = 0.0f,
                )
                // m 2.1 -13.9
                moveToRelative(dx = 2.1f, dy = -13.9f)
                // a 11 11 0 0 0 -2.1 0
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.1f,
                    dy1 = 0.0f,
                )
                // m 6.12 1.22
                moveToRelative(dx = 6.12f, dy = 1.22f)
                // a 11 11 0 0 1 1.75 1.18
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.75f,
                    dy1 = 1.18f,
                )
                // m 0 9.1
                moveToRelative(dx = 0.0f, dy = 9.1f)
                // a 11 11 0 0 1 -1.75 1.18
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.75f,
                    dy1 = 1.18f,
                )
                // M 2.51 13.3
                moveTo(x = 2.51f, y = 13.3f)
                // a 11 11 0 0 1 -0.45 -0.95
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.45f,
                    dy1 = -0.95f,
                )
                // a 1 1 0 0 1 0 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -0.7f,
                )
                // a 11 11 0 0 1 0.45 -0.95
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.45f,
                    dy1 = -0.95f,
                )
                // m 18.97 0
                moveToRelative(dx = 18.97f, dy = 0.0f)
                // a 11 11 0 0 1 0.46 0.95
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.46f,
                    dy1 = 0.95f,
                )
                // a 1 1 0 0 1 0 0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 0.7f,
                )
                // a 11 11 0 0 1 -0.46 0.95
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.46f,
                    dy1 = 0.95f,
                )
                // M 5.18 7.45
                moveTo(x = 5.18f, y = 7.45f)
                // a 11 11 0 0 1 1.75 -1.18
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.75f,
                    dy1 = -1.18f,
                )
                // m 0 11.46
                moveToRelative(dx = 0.0f, dy = 11.46f)
                // a 11 11 0 0 1 -1.76 -1.18
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.76f,
                    dy1 = -1.18f,
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
        }.build().also { _eyeDashed = it }
    }

@Suppress("ObjectPropertyName")
private var _eyeDashed: ImageVector? = null
