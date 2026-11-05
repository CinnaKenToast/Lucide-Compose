package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Minimize: ImageVector
    get() {
        val current = _minimize
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Minimize",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 3 v3 a2 2 0 0 1 -2 2 H3 m18 0 h-3 a2 2 0 0 1 -2 -2 V3 M3 16 h3 a2 2 0 0 1 2 2 v3 m8 0 v-3 a2 2 0 0 1 2 -2 h3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 18 0
                moveToRelative(dx = 18.0f, dy = 0.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // V 3
                verticalLineTo(y = 3.0f)
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
            }
        }.build().also { _minimize = it }
    }

@Suppress("ObjectPropertyName")
private var _minimize: ImageVector? = null
