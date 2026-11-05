package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareDashedText: ImageVector
    get() {
        val current = _squareDashedText
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SquareDashedText",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 21 h1 M14 3 h1 m4 0 a2 2 0 0 1 2 2 m0 9 v1 m0 4 a2 2 0 0 1 -2 2 m2 -12 v1 M3 14 v1 m0 -6 v1 m2 11 a2 2 0 0 1 -2 -2 M5 3 a2 2 0 0 0 -2 2 m4 7 h10 M7 16 h6 M7 8 h8 M9 21 h1 M9 3 h1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 21
                moveTo(x = 14.0f, y = 21.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 14 3
                moveTo(x = 14.0f, y = 3.0f)
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
                // m 0 9
                moveToRelative(dx = 0.0f, dy = 9.0f)
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
                // m 2 -12
                moveToRelative(dx = 2.0f, dy = -12.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // M 3 14
                moveTo(x = 3.0f, y = 14.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 2 11
                moveToRelative(dx = 2.0f, dy = 11.0f)
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
                // m 4 7
                moveToRelative(dx = 4.0f, dy = 7.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // M 7 16
                moveTo(x = 7.0f, y = 16.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 7 8
                moveTo(x = 7.0f, y = 8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 9 21
                moveTo(x = 9.0f, y = 21.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 9 3
                moveTo(x = 9.0f, y = 3.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
            }
        }.build().also { _squareDashedText = it }
    }

@Suppress("ObjectPropertyName")
private var _squareDashedText: ImageVector? = null
