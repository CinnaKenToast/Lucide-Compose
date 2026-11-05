package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HandMetal: ImageVector
    get() {
        val current = _handMetal
        if (current != null) return current

        return ImageVector.Builder(
            name = "HandMetal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 12.5 V10 a2 2 0 0 0 -2 -2 2 2 0 0 0 -2 2 v1.4 m0 -.4 V9 a2 2 0 1 0 -4 0 v2 m0 -.5 V5 a2 2 0 1 0 -4 0 v9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 12.5
                moveTo(x = 18.0f, y = 12.5f)
                // V 10
                verticalLineTo(y = 10.0f)
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
                // v 1.4
                verticalLineToRelative(dy = 1.4f)
                // m 0 -0.4
                moveToRelative(dx = 0.0f, dy = -0.4f)
                // V 9
                verticalLineTo(y = 9.0f)
                // a 2 2 0 1 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 -0.5
                moveToRelative(dx = 0.0f, dy = -0.5f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 1 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
            }
            // m7 15 -1.76 -1.76 a2 2 0 0 0 -2.83 2.82 l3.6 3.6 C7.5 21.14 9.2 22 12 22 h2 a8 8 0 0 0 8 -8 V7 a2 2 0 1 0 -4 0 v5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 15
                moveTo(x = 7.0f, y = 15.0f)
                // l -1.76 -1.76
                lineToRelative(dx = -1.76f, dy = -1.76f)
                // a 2 2 0 0 0 -2.83 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.83f,
                    dy1 = 2.82f,
                )
                // l 3.6 3.6
                lineToRelative(dx = 3.6f, dy = 3.6f)
                // C 7.5 21.14 9.2 22 12 22
                curveTo(
                    x1 = 7.5f,
                    y1 = 21.14f,
                    x2 = 9.2f,
                    y2 = 22.0f,
                    x3 = 12.0f,
                    y3 = 22.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 8 8 0 0 0 8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = -8.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 2 2 0 1 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
            }
        }.build().also { _handMetal = it }
    }


@Suppress("ObjectPropertyName")
private var _handMetal: ImageVector? = null
