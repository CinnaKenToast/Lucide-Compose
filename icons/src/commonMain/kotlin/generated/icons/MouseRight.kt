package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MouseRight: ImageVector
    get() {
        val current = _mouseRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MouseRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 7.32 V10 m7 0 v5 a7 7 0 0 1 -14 0 V9 c0 -3.53 2.6 -6.51 6 -7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 7.32
                moveTo(x = 12.0f, y = 7.32f)
                // V 10
                verticalLineTo(y = 10.0f)
                // m 7 0
                moveToRelative(dx = 7.0f, dy = 0.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // a 7 7 0 0 1 -14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -3.53 2.6 -6.51 6 -7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.53f,
                    dx2 = 2.6f,
                    dy2 = -6.51f,
                    dx3 = 6.0f,
                    dy3 = -7.0f,
                )
            }
            // <circle cx="17.0" cy="4.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 4
                moveTo(x = 17.0f, y = 4.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _mouseRight = it }
    }

@Suppress("ObjectPropertyName")
private var _mouseRight: ImageVector? = null
