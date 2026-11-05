package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Helicopter: ImageVector
    get() {
        val current = _helicopter
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Helicopter",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 17 v4 m3 -18 v8 a2 2 0 0 0 2 2 h5.87 M17 17 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 17
                moveTo(x = 11.0f, y = 17.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 3 -18
                moveToRelative(dx = 3.0f, dy = -18.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 5.87
                horizontalLineToRelative(dx = 5.87f)
                // M 17 17
                moveTo(x = 17.0f, y = 17.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
            // M18 17 a4 4 0 0 0 4 -4 8 6 0 0 0 -8 -6 6 5 0 0 0 -6 5 v3 a2 2 0 0 0 2 2z M2 10 v5 M6 3 h16 M7 21 h14 M8 13 H2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 17
                moveTo(x = 18.0f, y = 17.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // a 8 6 0 0 0 -8 -6
                arcToRelative(
                    a = 8.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = -6.0f,
                )
                // a 6 5 0 0 0 -6 5
                arcToRelative(
                    a = 6.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 5.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 2 2 0 0 0 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // M 6 3
                moveTo(x = 6.0f, y = 3.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 7 21
                moveTo(x = 7.0f, y = 21.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // M 8 13
                moveTo(x = 8.0f, y = 13.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _helicopter = it }
    }

@Suppress("ObjectPropertyName")
private var _helicopter: ImageVector? = null
