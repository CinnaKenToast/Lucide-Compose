package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Jacket: ImageVector
    get() {
        val current = _jacket
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Jacket",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 2 a3 3 0 0 0 -3 3 c0 2.6 4 4.4 4 7 0 -2.6 4 -4.4 4 -7 a3 3 0 0 0 -3 -3 m-1 10 v10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 2
                moveTo(x = 11.0f, y = 2.0f)
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
                // c 0 2.6 4 4.4 4 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.6f,
                    dx2 = 4.0f,
                    dy2 = 4.4f,
                    dx3 = 4.0f,
                    dy3 = 7.0f,
                )
                // c 0 -2.6 4 -4.4 4 -7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.6f,
                    dx2 = 4.0f,
                    dy2 = -4.4f,
                    dx3 = 4.0f,
                    dy3 = -7.0f,
                )
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // m -1 10
                moveToRelative(dx = -1.0f, dy = 10.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
            }
            // M18 10 v10 a2 2 0 0 1 -2 2 H8 a2 2 0 0 1 -2 -2 V10 m12 7 h-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 10
                moveTo(x = 18.0f, y = 10.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // m 12 7
                moveToRelative(dx = 12.0f, dy = 7.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
            }
            // M18 20 h3 a1 1 0 0 0 1 -1 V9 a7 7 0 0 0 -7 -7 H9 a7 7 0 0 0 -7 7 v10 a1 1 0 0 0 1 1 h3 m0 -3 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 20
                moveTo(x = 18.0f, y = 20.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
                // V 9
                verticalLineTo(y = 9.0f)
                // a 7 7 0 0 0 -7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 7 7 0 0 0 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // m 0 -3
                moveToRelative(dx = 0.0f, dy = -3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _jacket = it }
    }

@Suppress("ObjectPropertyName")
private var _jacket: ImageVector? = null
