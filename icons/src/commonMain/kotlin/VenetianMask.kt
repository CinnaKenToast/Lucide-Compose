package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VenetianMask: ImageVector
    get() {
        val current = _venetianMask
        if (current != null) return current

        return ImageVector.Builder(
            name = "VenetianMask",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 11 c-1.5 0 -2.5 .5 -3 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 11
                moveTo(x = 18.0f, y = 11.0f)
                // c -1.5 0 -2.5 0.5 -3 2
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.0f,
                    dx2 = -2.5f,
                    dy2 = 0.5f,
                    dx3 = -3.0f,
                    dy3 = 2.0f,
                )
            }
            // M4 6 a2 2 0 0 0 -2 2 v4 a5 5 0 0 0 5 5 8 8 0 0 1 5 2 8 8 0 0 1 5 -2 5 5 0 0 0 5 -5 V8 a2 2 0 0 0 -2 -2 h-3 a8 8 0 0 0 -5 2 8 8 0 0 0 -5 -2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 5 5 0 0 0 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                // a 8 8 0 0 1 5 2
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 2.0f,
                )
                // a 8 8 0 0 1 5 -2
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -2.0f,
                )
                // a 5 5 0 0 0 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // a 8 8 0 0 0 -5 2
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 2.0f,
                )
                // a 8 8 0 0 0 -5 -2z
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = -2.0f,
                )
                close()
            }
            // M6 11 c1.5 0 2.5 .5 3 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 11
                moveTo(x = 6.0f, y = 11.0f)
                // c 1.5 0 2.5 0.5 3 2
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = 0.5f,
                    dx3 = 3.0f,
                    dy3 = 2.0f,
                )
            }
        }.build().also { _venetianMask = it }
    }


@Suppress("ObjectPropertyName")
private var _venetianMask: ImageVector? = null
