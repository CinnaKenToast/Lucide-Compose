package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RepeatOff: ImageVector
    get() {
        val current = _repeatOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "RepeatOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.66 6 H21 l-4 -4 m.9 15.9 A4 4 0 0 1 17 18 H3 l4 -4 M2 2 l20 20 m-1 -9 v1 a4 4 0 0 1 -.17 1.16 M21 6 l-4 4 M3 11 v-1 a4 4 0 0 1 3.1 -3.9 M7 22 l-4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.66 6
                moveTo(x = 11.66f, y = 6.0f)
                // H 21
                horizontalLineTo(x = 21.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // m 0.9 15.9
                moveToRelative(dx = 0.9f, dy = 15.9f)
                // A 4 4 0 0 1 17 18
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 18.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m -1 -9
                moveToRelative(dx = -1.0f, dy = -9.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 4 4 0 0 1 -0.17 1.16
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.17f,
                    dy1 = 1.16f,
                )
                // M 21 6
                moveTo(x = 21.0f, y = 6.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // M 3 11
                moveTo(x = 3.0f, y = 11.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 4 4 0 0 1 3.1 -3.9
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.1f,
                    dy1 = -3.9f,
                )
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
            }
        }.build().also { _repeatOff = it }
    }


@Suppress("ObjectPropertyName")
private var _repeatOff: ImageVector? = null
