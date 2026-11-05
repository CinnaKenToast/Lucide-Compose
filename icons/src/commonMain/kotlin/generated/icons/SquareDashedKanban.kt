package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareDashedKanban: ImageVector
    get() {
        val current = _squareDashedKanban
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SquareDashedKanban",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 7 v7 m4 -7 v4 m4 -4 v9 M5 3 a2 2 0 0 0 -2 2 m6 -2 h1 m4 0 h1 m4 0 a2 2 0 0 1 2 2 m0 4 v1 m0 4 v1 m0 4 a2 2 0 0 1 -2 2 m-5 0 h1 m-6 0 h1 m-5 0 a2 2 0 0 1 -2 -2 m0 -5 v1 m0 -6 v1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 7
                moveTo(x = 8.0f, y = 7.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // m 4 -7
                moveToRelative(dx = 4.0f, dy = -7.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // M 5 3
                moveTo(x = 5.0f, y = 3.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m 6 -2
                moveToRelative(dx = 6.0f, dy = -2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
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
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
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
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
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
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
            }
        }.build().also { _squareDashedKanban = it }
    }

@Suppress("ObjectPropertyName")
private var _squareDashedKanban: ImageVector? = null
