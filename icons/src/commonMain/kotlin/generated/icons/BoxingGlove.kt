package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BoxingGlove: ImageVector
    get() {
        val current = _boxingGlove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BoxingGlove",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 17 h3 M5 7 a2 2 0 0 0 -2 2 v2.5 a5.5 5.5 0 0 0 4.1 5.32 C7.6 16.95 8 17.37 8 17.89 V20 a2 2 0 0 0 2 2 h7 a2 2 0 0 0 2 -2 v-2 a1 1 0 0 1 .3 -.7 c1 -1 1.7 -3.3 1.7 -5.3 V7 a5 5 0 0 0 -5 -5 h-4 a5 5 0 0 0 -5 5z m2 0 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // M 5 7
                moveTo(x = 5.0f, y = 7.0f)
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
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // a 5.5 5.5 0 0 0 4.1 5.32
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.1f,
                    dy1 = 5.32f,
                )
                // C 7.6 16.95 8 17.37 8 17.89
                curveTo(
                    x1 = 7.6f,
                    y1 = 16.95f,
                    x2 = 8.0f,
                    y2 = 17.37f,
                    x3 = 8.0f,
                    y3 = 17.89f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 1 1 0 0 1 0.3 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.3f,
                    dy1 = -0.7f,
                )
                // c 1 -1 1.7 -3.3 1.7 -5.3
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 1.7f,
                    dy2 = -3.3f,
                    dx3 = 1.7f,
                    dy3 = -5.3f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 5 5 0 0 0 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 5 5 0 0 0 -5 5z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                close()
                // m 2 0
                moveToRelative(dx = 2.0f, dy = 0.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _boxingGlove = it }
    }

@Suppress("ObjectPropertyName")
private var _boxingGlove: ImageVector? = null
