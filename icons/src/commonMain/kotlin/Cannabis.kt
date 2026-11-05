package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cannabis: ImageVector
    get() {
        val current = _cannabis
        if (current != null) return current

        return ImageVector.Builder(
            name = "Cannabis",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 v-4 m-5 -6 c-1.5 0 -4.5 1.5 -5 3 3.5 1.5 6 1 6 1 -1.5 1.5 -2 3.5 -2 5 2.5 0 4.5 -1.5 6 -3 1.5 1.5 3.5 3 6 3 0 -1.5 -.5 -3.5 -2 -5 0 0 2.5 .5 6 -1 -.5 -1.5 -3.5 -3 -5 -3 1.5 -1 4 -4 4 -6 -2.5 0 -5.5 1.5 -7 3 0 -2.5 -.5 -5 -2 -7 -1.5 2 -2 4.5 -2 7 -1.5 -1.5 -4.5 -3 -7 -3 0 2 2.5 5 4 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // m -5 -6
                moveToRelative(dx = -5.0f, dy = -6.0f)
                // c -1.5 0 -4.5 1.5 -5 3
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.0f,
                    dx2 = -4.5f,
                    dy2 = 1.5f,
                    dx3 = -5.0f,
                    dy3 = 3.0f,
                )
                // c 3.5 1.5 6 1 6 1
                curveToRelative(
                    dx1 = 3.5f,
                    dy1 = 1.5f,
                    dx2 = 6.0f,
                    dy2 = 1.0f,
                    dx3 = 6.0f,
                    dy3 = 1.0f,
                )
                // c -1.5 1.5 -2 3.5 -2 5
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 1.5f,
                    dx2 = -2.0f,
                    dy2 = 3.5f,
                    dx3 = -2.0f,
                    dy3 = 5.0f,
                )
                // c 2.5 0 4.5 -1.5 6 -3
                curveToRelative(
                    dx1 = 2.5f,
                    dy1 = 0.0f,
                    dx2 = 4.5f,
                    dy2 = -1.5f,
                    dx3 = 6.0f,
                    dy3 = -3.0f,
                )
                // c 1.5 1.5 3.5 3 6 3
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = 1.5f,
                    dx2 = 3.5f,
                    dy2 = 3.0f,
                    dx3 = 6.0f,
                    dy3 = 3.0f,
                )
                // c 0 -1.5 -0.5 -3.5 -2 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.5f,
                    dx2 = -0.5f,
                    dy2 = -3.5f,
                    dx3 = -2.0f,
                    dy3 = -5.0f,
                )
                // c 0 0 2.5 0.5 6 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = 0.5f,
                    dx3 = 6.0f,
                    dy3 = -1.0f,
                )
                // c -0.5 -1.5 -3.5 -3 -5 -3
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = -1.5f,
                    dx2 = -3.5f,
                    dy2 = -3.0f,
                    dx3 = -5.0f,
                    dy3 = -3.0f,
                )
                // c 1.5 -1 4 -4 4 -6
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = -1.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -6.0f,
                )
                // c -2.5 0 -5.5 1.5 -7 3
                curveToRelative(
                    dx1 = -2.5f,
                    dy1 = 0.0f,
                    dx2 = -5.5f,
                    dy2 = 1.5f,
                    dx3 = -7.0f,
                    dy3 = 3.0f,
                )
                // c 0 -2.5 -0.5 -5 -2 -7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.5f,
                    dx2 = -0.5f,
                    dy2 = -5.0f,
                    dx3 = -2.0f,
                    dy3 = -7.0f,
                )
                // c -1.5 2 -2 4.5 -2 7
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 4.5f,
                    dx3 = -2.0f,
                    dy3 = 7.0f,
                )
                // c -1.5 -1.5 -4.5 -3 -7 -3
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = -1.5f,
                    dx2 = -4.5f,
                    dy2 = -3.0f,
                    dx3 = -7.0f,
                    dy3 = -3.0f,
                )
                // c 0 2 2.5 5 4 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = 2.5f,
                    dy2 = 5.0f,
                    dx3 = 4.0f,
                    dy3 = 6.0f,
                )
            }
        }.build().also { _cannabis = it }
    }


@Suppress("ObjectPropertyName")
private var _cannabis: ImageVector? = null
