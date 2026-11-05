package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScreenShare: ImageVector
    get() {
        val current = _screenShare
        if (current != null) return current

        return ImageVector.Builder(
            name = "ScreenShare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 3 H4 a2 2 0 0 0 -2 2 v10 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-3 M8 21 h8 m-4 -4 v4 m5 -13 5 -5 m-5 0 h5 v5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 3
                moveTo(x = 13.0f, y = 3.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // M 8 21
                moveTo(x = 8.0f, y = 21.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -4 -4
                moveToRelative(dx = -4.0f, dy = -4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 5 -13
                moveToRelative(dx = 5.0f, dy = -13.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
            }
        }.build().also { _screenShare = it }
    }


@Suppress("ObjectPropertyName")
private var _screenShare: ImageVector? = null
