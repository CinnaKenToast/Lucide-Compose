package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cigarette: ImageVector
    get() {
        val current = _cigarette
        if (current != null) return current

        return ImageVector.Builder(
            name = "Cigarette",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 12 H3 a1 1 0 0 0 -1 1 v2 a1 1 0 0 0 1 1 h14 m1 -8 c0 -2.5 -2 -2.5 -2 -5 m5 13 a1 1 0 0 0 1 -1 v-2 a1 1 0 0 0 -1 -1 m1 -4 c0 -2.5 -2 -2.5 -2 -5 M7 12 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 12
                moveTo(x = 17.0f, y = 12.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // m 1 -8
                moveToRelative(dx = 1.0f, dy = -8.0f)
                // c 0 -2.5 -2 -2.5 -2 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.5f,
                    dx2 = -2.0f,
                    dy2 = -2.5f,
                    dx3 = -2.0f,
                    dy3 = -5.0f,
                )
                // m 5 13
                moveToRelative(dx = 5.0f, dy = 13.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // m 1 -4
                moveToRelative(dx = 1.0f, dy = -4.0f)
                // c 0 -2.5 -2 -2.5 -2 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.5f,
                    dx2 = -2.0f,
                    dy2 = -2.5f,
                    dx3 = -2.0f,
                    dy3 = -5.0f,
                )
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _cigarette = it }
    }


@Suppress("ObjectPropertyName")
private var _cigarette: ImageVector? = null
