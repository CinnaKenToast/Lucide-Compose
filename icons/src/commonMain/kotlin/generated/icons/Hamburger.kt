package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Hamburger: ImageVector
    get() {
        val current = _hamburger
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Hamburger",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 16 H4 a2 2 0 1 1 0 -4 h16 a2 2 0 1 1 0 4 h-4.25 M5 12 a2 2 0 0 1 -2 -2 9 7 0 0 1 18 0 2 2 0 0 1 -2 2 M5 16 a2 2 0 0 0 -2 2 3 3 0 0 0 3 3 h12 a3 3 0 0 0 3 -3 2 2 0 0 0 -2 -2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 16
                moveTo(x = 12.0f, y = 16.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 1 1 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 1 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // h -4.25
                horizontalLineToRelative(dx = -4.25f)
                // M 5 12
                moveTo(x = 5.0f, y = 12.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // a 9 7 0 0 1 18 0
                arcToRelative(
                    a = 9.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 18.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // M 5 16
                moveTo(x = 5.0f, y = 16.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // a 3 3 0 0 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 3 3 0 0 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
            }
            // m6.67 12 6.13 4.6 a2 2 0 0 0 2.8 -.4 l3.15 -4.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.67 12
                moveTo(x = 6.67f, y = 12.0f)
                // l 6.13 4.6
                lineToRelative(dx = 6.13f, dy = 4.6f)
                // a 2 2 0 0 0 2.8 -0.4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.8f,
                    dy1 = -0.4f,
                )
                // l 3.15 -4.2
                lineToRelative(dx = 3.15f, dy = -4.2f)
            }
        }.build().also { _hamburger = it }
    }

@Suppress("ObjectPropertyName")
private var _hamburger: ImageVector? = null
