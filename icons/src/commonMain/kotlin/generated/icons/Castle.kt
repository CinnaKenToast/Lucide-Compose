package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Castle: ImageVector
    get() {
        val current = _castle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Castle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 5 V3 m4 2 V3 m1 18 v-3 a3 3 0 0 0 -6 0 v3 m9 -18 v8 m0 -6 H6 m16 6 H2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 5
                moveTo(x = 10.0f, y = 5.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m 4 2
                moveToRelative(dx = 4.0f, dy = 2.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m 1 18
                moveToRelative(dx = 1.0f, dy = 18.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 3 3 0 0 0 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 9 -18
                moveToRelative(dx = 9.0f, dy = -18.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // m 16 6
                moveToRelative(dx = 16.0f, dy = 6.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
            }
            // M22 9 v10 a2 2 0 0 1 -2 2 H4 a2 2 0 0 1 -2 -2 V9 m4 -6 v8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 9
                moveTo(x = 22.0f, y = 9.0f)
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
                // V 9
                verticalLineTo(y = 9.0f)
                // m 4 -6
                moveToRelative(dx = 4.0f, dy = -6.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
            }
        }.build().also { _castle = it }
    }

@Suppress("ObjectPropertyName")
private var _castle: ImageVector? = null
