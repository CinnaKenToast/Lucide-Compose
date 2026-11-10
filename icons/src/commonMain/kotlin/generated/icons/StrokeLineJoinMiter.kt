package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.StrokeLineJoinMiter: ImageVector
    get() {
        val current = _strokeLineJoinMiter
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.StrokeLineJoinMiter",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 21 v-2 M3 3 h16 a2 2 0 0 1 2 2 v16 M5 13 H3 m6 0 h1 a1 1 0 0 1 1 1 v1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 21
                moveTo(x = 11.0f, y = 21.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // M 5 13
                moveTo(x = 5.0f, y = 13.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 6 0
                moveToRelative(dx = 6.0f, dy = 0.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
            }
        }.build().also { _strokeLineJoinMiter = it }
    }

@Suppress("ObjectPropertyName")
private var _strokeLineJoinMiter: ImageVector? = null
