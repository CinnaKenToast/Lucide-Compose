package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogOut: ImageVector
    get() {
        val current = _logOut
        if (current != null) return current

        return ImageVector.Builder(
            name = "LogOut",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m16 17 5 -5 -5 -5 m5 5 H9 m0 9 H5 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 17
                moveTo(x = 16.0f, y = 17.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // m 5 5
                moveToRelative(dx = 5.0f, dy = 5.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // m 0 9
                moveToRelative(dx = 0.0f, dy = 9.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _logOut = it }
    }


@Suppress("ObjectPropertyName")
private var _logOut: ImageVector? = null
