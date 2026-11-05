package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SquareDashedPlus: ImageVector
    get() {
        val current = _squareDashedPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "SquareDashedPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 3 a2 2 0 0 0 -2 2 m16 -2 a2 2 0 0 1 2 2 m0 14 a2 2 0 0 1 -2 2 M5 21 a2 2 0 0 1 -2 -2 M9 3 h1 M9 21 h1 m4 -18 h1 m-1 18 h1 M3 9 v1 m18 -1 v1 M3 14 v1 m18 -1 v1 M8 12 h8 m-4 -4 v8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
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
                // m 16 -2
                moveToRelative(dx = 16.0f, dy = -2.0f)
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
                // m 0 14
                moveToRelative(dx = 0.0f, dy = 14.0f)
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
                // M 5 21
                moveTo(x = 5.0f, y = 21.0f)
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
                // M 9 3
                moveTo(x = 9.0f, y = 3.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 9 21
                moveTo(x = 9.0f, y = 21.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 4 -18
                moveToRelative(dx = 4.0f, dy = -18.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m -1 18
                moveToRelative(dx = -1.0f, dy = 18.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 18 -1
                moveToRelative(dx = 18.0f, dy = -1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // M 3 14
                moveTo(x = 3.0f, y = 14.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 18 -1
                moveToRelative(dx = 18.0f, dy = -1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -4 -4
                moveToRelative(dx = -4.0f, dy = -4.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
            }
        }.build().also { _squareDashedPlus = it }
    }


@Suppress("ObjectPropertyName")
private var _squareDashedPlus: ImageVector? = null
