package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareDashedXCorner: ImageVector
    get() {
        val current = _squareDashedXCorner
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SquareDashedXCorner",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 3 h1 m1 13 5 5 M19 3 a2 2 0 0 1 2 2 m0 11 -5 5 m5 -12 v1 M3 14 v1 m0 -6 v1 m2 11 a2 2 0 0 1 -2 -2 M5 3 a2 2 0 0 0 -2 2 m6 16 h1 M9 3 h1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 3
                moveTo(x = 14.0f, y = 3.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 1 13
                moveToRelative(dx = 1.0f, dy = 13.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // M 19 3
                moveTo(x = 19.0f, y = 3.0f)
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
                // m 0 11
                moveToRelative(dx = 0.0f, dy = 11.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // m 5 -12
                moveToRelative(dx = 5.0f, dy = -12.0f)
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
                // m 6 16
                moveToRelative(dx = 6.0f, dy = 16.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 9 3
                moveTo(x = 9.0f, y = 3.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
            }
        }.build().also { _squareDashedXCorner = it }
    }

@Suppress("ObjectPropertyName")
private var _squareDashedXCorner: ImageVector? = null
