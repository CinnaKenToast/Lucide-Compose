package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Rabbit: ImageVector
    get() {
        val current = _rabbit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Rabbit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 16 a3 3 0 0 1 2.24 5 M18 12 h.01
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 16
                moveTo(x = 13.0f, y = 16.0f)
                // a 3 3 0 0 1 2.24 5
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.24f,
                    dy1 = 5.0f,
                )
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
            // M18 21 h-8 a4 4 0 0 1 -4 -4 7 7 0 0 1 7 -7 h.2 L9.6 6.4 a1 1 0 1 1 2.8 -2.8 L15.8 7 H16 c3.3 0 6 2.7 6 6 v1 a2 2 0 0 1 -2 2 h-1 a3 3 0 0 0 -3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 21
                moveTo(x = 18.0f, y = 21.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // a 7 7 0 0 1 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // h 0.2
                horizontalLineToRelative(dx = 0.2f)
                // L 9.6 6.4
                lineTo(x = 9.6f, y = 6.4f)
                // a 1 1 0 1 1 2.8 -2.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.8f,
                    dy1 = -2.8f,
                )
                // L 15.8 7
                lineTo(x = 15.8f, y = 7.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // c 3.3 0 6 2.7 6 6
                curveToRelative(
                    dx1 = 3.3f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 2.7f,
                    dx3 = 6.0f,
                    dy3 = 6.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
            }
            // M20 8.54 V4 a2 2 0 1 0 -4 0 v3 m-8.39 5.52 a3 3 0 1 0 -1.6 4.3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 8.54
                moveTo(x = 20.0f, y = 8.54f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m -8.39 5.52
                moveToRelative(dx = -8.39f, dy = 5.52f)
                // a 3 3 0 1 0 -1.6 4.3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.6f,
                    dy1 = 4.3f,
                )
            }
        }.build().also { _rabbit = it }
    }

@Suppress("ObjectPropertyName")
private var _rabbit: ImageVector? = null
