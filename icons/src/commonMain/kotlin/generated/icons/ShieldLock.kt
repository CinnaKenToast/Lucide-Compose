package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ShieldLock: ImageVector
    get() {
        val current = _shieldLock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ShieldLock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M20 9.8 V6 a1 1 0 0 0 -1 -1 c-2 0 -4.49 -1.19 -6.24 -2.72 a1.2 1.2 0 0 0 -1.52 0 C9.5 3.8 7 5 5 5 a1 1 0 0 0 -1 1 v7 c0 3.88 2.1 6.25 5 7.8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 9.8
                moveTo(x = 20.0f, y = 9.8f)
                // V 6
                verticalLineTo(y = 6.0f)
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
                // c -2 0 -4.49 -1.19 -6.24 -2.72
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -4.49f,
                    dy2 = -1.19f,
                    dx3 = -6.24f,
                    dy3 = -2.72f,
                )
                // a 1.2 1.2 0 0 0 -1.52 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.52f,
                    dy1 = 0.0f,
                )
                // C 9.5 3.8 7 5 5 5
                curveTo(
                    x1 = 9.5f,
                    y1 = 3.8f,
                    x2 = 7.0f,
                    y2 = 5.0f,
                    x3 = 5.0f,
                    y3 = 5.0f,
                )
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
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // c 0 3.88 2.1 6.25 5 7.8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.88f,
                    dx2 = 2.1f,
                    dy2 = 6.25f,
                    dx3 = 5.0f,
                    dy3 = 7.8f,
                )
            }
            // M19 17 v-2 a2 2 0 0 0 -4 0 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 17
                moveTo(x = 19.0f, y = 17.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 2 2 0 0 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
            // <rect width="8" height="5" rx="1.0" x="13.0" y="17.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 18
                moveTo(x = 13.0f, y = 18.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // h -6
                horizontalLineToRelative(dx = -6.0f)
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
        }.build().also { _shieldLock = it }
    }

@Suppress("ObjectPropertyName")
private var _shieldLock: ImageVector? = null
