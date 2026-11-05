package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Plug2: ImageVector
    get() {
        val current = _plug2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Plug2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9 2 v6 m6 -6 v6 m-3 9 v5 M5 8 h14 M6 11 V8 h12 v3 a6 6 0 1 1 -12 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 2
                moveTo(x = 9.0f, y = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 6 -6
                moveToRelative(dx = 6.0f, dy = -6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m -3 9
                moveToRelative(dx = -3.0f, dy = 9.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // M 5 8
                moveTo(x = 5.0f, y = 8.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // M 6 11
                moveTo(x = 6.0f, y = 11.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 6 6 0 1 1 -12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _plug2 = it }
    }

@Suppress("ObjectPropertyName")
private var _plug2: ImageVector? = null
