package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleBounce: ImageVector
    get() {
        val current = _circleBounce
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CircleBounce",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 13 c2.5 .5 5 4 5 8 0 -2.16 1.81 -7.54 6 -11.3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 13
                moveTo(x = 2.0f, y = 13.0f)
                // c 2.5 0.5 5 4 5 8
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.5f,
                    dx2 = 5.0f,
                    dy2 = 4.0f,
                    dx3 = 5.0f,
                    dy3 = 8.0f,
                )
                // c 0 -2.16 1.81 -7.54 6 -11.3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.16f,
                    dx2 = 1.81f,
                    dy2 = -7.54f,
                    dx3 = 6.0f,
                    dy3 = -11.3f,
                )
            }
            // <circle cx="19.0" cy="6.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 6
                moveTo(x = 19.0f, y = 6.0f)
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
        }.build().also { _circleBounce = it }
    }

@Suppress("ObjectPropertyName")
private var _circleBounce: ImageVector? = null
