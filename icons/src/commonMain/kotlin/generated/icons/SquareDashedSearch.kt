package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareDashedSearch: ImageVector
    get() {
        val current = _squareDashedSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SquareDashedSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 3 h1 m4 0 a2 2 0 0 1 2 2 m0 16 -1.87 -1.87 M21 9 v1 M3 14 v1 m0 -6 v1 m2 11 a2 2 0 0 1 -2 -2 M5 3 a2 2 0 0 0 -2 2 m6 16 h1 M9 3 h1
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
                // m 0 16
                moveToRelative(dx = 0.0f, dy = 16.0f)
                // l -1.87 -1.87
                lineToRelative(dx = -1.87f, dy = -1.87f)
                // M 21 9
                moveTo(x = 21.0f, y = 9.0f)
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
            // <circle cx="17.0" cy="17.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 17
                moveTo(x = 17.0f, y = 17.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _squareDashedSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _squareDashedSearch: ImageVector? = null
