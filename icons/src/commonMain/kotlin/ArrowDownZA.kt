package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowDownZA: ImageVector
    get() {
        val current = _arrowDownZA
        if (current != null) return current

        return ImageVector.Builder(
            name = "ArrowDownZA",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m3 16 4 4 4 -4 M7 4 v16 m8 -16 h5 l-5 6 h5 m-5 10 v-3.5 a2.5 2.5 0 0 1 5 0 V20 m0 -2 h-5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // M 7 4
                moveTo(x = 7.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // m 8 -16
                moveToRelative(dx = 8.0f, dy = -16.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // l -5 6
                lineToRelative(dx = -5.0f, dy = 6.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // m -5 10
                moveToRelative(dx = -5.0f, dy = 10.0f)
                // v -3.5
                verticalLineToRelative(dy = -3.5f)
                // a 2.5 2.5 0 0 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
            }
        }.build().also { _arrowDownZA = it }
    }


@Suppress("ObjectPropertyName")
private var _arrowDownZA: ImageVector? = null
