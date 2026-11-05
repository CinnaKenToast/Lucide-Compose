package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ListOrdered: ImageVector
    get() {
        val current = _listOrdered
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ListOrdered",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 5 h10 m-10 7 h10 m-10 7 h10 M4 4 h1 v5 M4 9 h2 m.5 11 H3.4 c0 -1 2.6 -1.92 2.6 -3.5 a1.5 1.5 0 0 0 -2.6 -1.02
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 5
                moveTo(x = 11.0f, y = 5.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // m -10 7
                moveToRelative(dx = -10.0f, dy = 7.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // m -10 7
                moveToRelative(dx = -10.0f, dy = 7.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // M 4 9
                moveTo(x = 4.0f, y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 0.5 11
                moveToRelative(dx = 0.5f, dy = 11.0f)
                // H 3.4
                horizontalLineTo(x = 3.4f)
                // c 0 -1 2.6 -1.92 2.6 -3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = 2.6f,
                    dy2 = -1.92f,
                    dx3 = 2.6f,
                    dy3 = -3.5f,
                )
                // a 1.5 1.5 0 0 0 -2.6 -1.02
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.6f,
                    dy1 = -1.02f,
                )
            }
        }.build().also { _listOrdered = it }
    }

@Suppress("ObjectPropertyName")
private var _listOrdered: ImageVector? = null
