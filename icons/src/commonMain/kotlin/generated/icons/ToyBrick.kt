package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ToyBrick: ImageVector
    get() {
        val current = _toyBrick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ToyBrick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <rect width="18" height="12" rx="1.0" x="3.0" y="8.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -16
                horizontalLineToRelative(dx = -16.0f)
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
            // M10 8 V5 c0 -.6 -.4 -1 -1 -1 H6 a1 1 0 0 0 -1 1 v3 m14 0 V5 c0 -.6 -.4 -1 -1 -1 h-3 a1 1 0 0 0 -1 1 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 8
                moveTo(x = 10.0f, y = 8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // c 0 -0.6 -0.4 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.6f,
                    dx2 = -0.4f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 14 0
                moveToRelative(dx = 14.0f, dy = 0.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // c 0 -0.6 -0.4 -1 -1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.6f,
                    dx2 = -0.4f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _toyBrick = it }
    }

@Suppress("ObjectPropertyName")
private var _toyBrick: ImageVector? = null
