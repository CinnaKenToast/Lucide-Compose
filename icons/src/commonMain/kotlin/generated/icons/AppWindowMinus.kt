package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AppWindowMinus: ImageVector
    get() {
        val current = _appWindowMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.AppWindowMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 4 v4 m3.35 12 H4 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v7 m-6 4 h6 m0 -9 H2 m4 0 V4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 4
                moveTo(x = 10.0f, y = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 3.35 12
                moveToRelative(dx = 3.35f, dy = 12.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // m -6 4
                moveToRelative(dx = -6.0f, dy = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m 0 -9
                moveToRelative(dx = 0.0f, dy = -9.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // V 4
                verticalLineTo(y = 4.0f)
            }
        }.build().also { _appWindowMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _appWindowMinus: ImageVector? = null
