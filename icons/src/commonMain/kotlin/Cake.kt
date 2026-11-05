package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cake: ImageVector
    get() {
        val current = _cake
        if (current != null) return current

        return ImageVector.Builder(
            name = "Cake",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M20 21 v-8 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 21
                moveTo(x = 20.0f, y = 21.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
            }
            // M4 16 s.5 -1 2 -1 2.5 2 4 2 2.5 -2 4 -2 2.5 2 4 2 2 -1 2 -1 M2 21 h20 M7 8 v3 m5 -3 v3 m5 -3 v3 M7 4z M12 4z M17 4 h.01
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 16
                moveTo(x = 4.0f, y = 16.0f)
                // s 0.5 -1 2 -1
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = -1.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                )
                // s 2.5 2 4 2
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = 2.0f,
                    dx2 = 4.0f,
                    dy2 = 2.0f,
                )
                // s 2.5 -2 4 -2
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = -2.0f,
                    dx2 = 4.0f,
                    dy2 = -2.0f,
                )
                // s 2.5 2 4 2
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = 2.0f,
                    dx2 = 4.0f,
                    dy2 = 2.0f,
                )
                // s 2 -1 2 -1
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -1.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                )
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 7 8
                moveTo(x = 7.0f, y = 8.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 5 -3
                moveToRelative(dx = 5.0f, dy = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 5 -3
                moveToRelative(dx = 5.0f, dy = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // M 7 4z
                moveTo(x = 7.0f, y = 4.0f)
                close()
                // M 12 4z
                moveTo(x = 12.0f, y = 4.0f)
                close()
                // M 17 4
                moveTo(x = 17.0f, y = 4.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
        }.build().also { _cake = it }
    }


@Suppress("ObjectPropertyName")
private var _cake: ImageVector? = null
