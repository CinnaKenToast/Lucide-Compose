package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UtensilsCrossed: ImageVector
    get() {
        val current = _utensilsCrossed
        if (current != null) return current

        return ImageVector.Builder(
            name = "UtensilsCrossed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m16 2 -2.3 2.3 a3 3 0 0 0 0 4.2 l1.8 1.8 a3 3 0 0 0 4.2 0 L22 8 m-7 7 L3.3 3.3 a4.2 4.2 0 0 0 0 6 l7.3 7.3 c.7 .7 2 .7 2.8 0z m0 0 7 7 M2.1 21.8 l6.4 -6.3 M19 5 l-7 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // l -2.3 2.3
                lineToRelative(dx = -2.3f, dy = 2.3f)
                // a 3 3 0 0 0 0 4.2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.2f,
                )
                // l 1.8 1.8
                lineToRelative(dx = 1.8f, dy = 1.8f)
                // a 3 3 0 0 0 4.2 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.2f,
                    dy1 = 0.0f,
                )
                // L 22 8
                lineTo(x = 22.0f, y = 8.0f)
                // m -7 7
                moveToRelative(dx = -7.0f, dy = 7.0f)
                // L 3.3 3.3
                lineTo(x = 3.3f, y = 3.3f)
                // a 4.2 4.2 0 0 0 0 6
                arcToRelative(
                    a = 4.2f,
                    b = 4.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // l 7.3 7.3
                lineToRelative(dx = 7.3f, dy = 7.3f)
                // c 0.7 0.7 2 0.7 2.8 0z
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = 0.7f,
                    dx2 = 2.0f,
                    dy2 = 0.7f,
                    dx3 = 2.8f,
                    dy3 = 0.0f,
                )
                close()
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // l 7 7
                lineToRelative(dx = 7.0f, dy = 7.0f)
                // M 2.1 21.8
                moveTo(x = 2.1f, y = 21.8f)
                // l 6.4 -6.3
                lineToRelative(dx = 6.4f, dy = -6.3f)
                // M 19 5
                moveTo(x = 19.0f, y = 5.0f)
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
            }
        }.build().also { _utensilsCrossed = it }
    }


@Suppress("ObjectPropertyName")
private var _utensilsCrossed: ImageVector? = null
