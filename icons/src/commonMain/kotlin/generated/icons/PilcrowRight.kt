package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PilcrowRight: ImageVector
    get() {
        val current = _pilcrowRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PilcrowRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 3 v11 m0 -5 H7 a1 1 0 0 1 0 -6 h8 m-1 0 v11 m4 0 4 4 H2 m20 0 -4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 3
                moveTo(x = 10.0f, y = 3.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 1 1 0 0 1 0 -6
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 20 0
                moveToRelative(dx = 20.0f, dy = 0.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
            }
        }.build().also { _pilcrowRight = it }
    }

@Suppress("ObjectPropertyName")
private var _pilcrowRight: ImageVector? = null
