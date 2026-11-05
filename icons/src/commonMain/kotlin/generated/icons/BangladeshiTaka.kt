package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BangladeshiTaka: ImageVector
    get() {
        val current = _bangladeshiTaka
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BangladeshiTaka",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 5 a2 2 0 0 1 4 0 v12 a4 4 0 0 0 8 0 2 2 0 0 0 -4 0 M6 9 h12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 5
                moveTo(x = 6.0f, y = 5.0f)
                // a 2 2 0 0 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 4 4 0 0 0 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
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
                // M 6 9
                moveTo(x = 6.0f, y = 9.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
            }
        }.build().also { _bangladeshiTaka = it }
    }

@Suppress("ObjectPropertyName")
private var _bangladeshiTaka: ImageVector? = null
