package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KeyboardOff: ImageVector
    get() {
        val current = _keyboardOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "KeyboardOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M20 4 a2 2 0 0 1 2 2 m0 0 v10.41 M7 16 h9 M9.69 4 H20 m-6 4z M18 8 h.01 M2 2 l20 20 m-2 -2 H4 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 m2 4z M8 12z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 4
                moveTo(x = 20.0f, y = 4.0f)
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
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // v 10.41
                verticalLineToRelative(dy = 10.41f)
                // M 7 16
                moveTo(x = 7.0f, y = 16.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // M 9.69 4
                moveTo(x = 9.69f, y = 4.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // m -6 4z
                moveToRelative(dx = -6.0f, dy = 4.0f)
                close()
                // M 18 8
                moveTo(x = 18.0f, y = 8.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m -2 -2
                moveToRelative(dx = -2.0f, dy = -2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // m 2 4z
                moveToRelative(dx = 2.0f, dy = 4.0f)
                close()
                // M 8 12z
                moveTo(x = 8.0f, y = 12.0f)
                close()
            }
        }.build().also { _keyboardOff = it }
    }


@Suppress("ObjectPropertyName")
private var _keyboardOff: ImageVector? = null
