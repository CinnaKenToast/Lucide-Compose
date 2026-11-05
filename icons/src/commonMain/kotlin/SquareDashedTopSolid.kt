package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SquareDashedTopSolid: ImageVector
    get() {
        val current = _squareDashedTopSolid
        if (current != null) return current

        return ImageVector.Builder(
            name = "SquareDashedTopSolid",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 21 h1 m6 -7 v1 m0 4 a2 2 0 0 1 -2 2 m2 -12 v1 M3 14 v1 M3 5 a2 2 0 0 1 2 -2 h14 a2 2 0 0 1 2 2 M3 9 v1 m2 11 a2 2 0 0 1 -2 -2 m6 2 h1
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
                // m 6 -7
                moveToRelative(dx = 6.0f, dy = -7.0f)
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
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
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
                // m 6 2
                moveToRelative(dx = 6.0f, dy = 2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
            }
        }.build().also { _squareDashedTopSolid = it }
    }


@Suppress("ObjectPropertyName")
private var _squareDashedTopSolid: ImageVector? = null
