package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudSun: ImageVector
    get() {
        val current = _cloudSun
        if (current != null) return current

        return ImageVector.Builder(
            name = "CloudSun",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v2 M4.93 4.93 l1.41 1.41 M20 12 h2 m-2.93 -7.07 -1.41 1.41 m-1.71 6.31 a4 4 0 0 0 -5.93 -4.13 M13 22 H7 a5 5 0 1 1 4.9 -6 H13 a3 3 0 0 1 0 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 4.93 4.93
                moveTo(x = 4.93f, y = 4.93f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // M 20 12
                moveTo(x = 20.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -2.93 -7.07
                moveToRelative(dx = -2.93f, dy = -7.07f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // m -1.71 6.31
                moveToRelative(dx = -1.71f, dy = 6.31f)
                // a 4 4 0 0 0 -5.93 -4.13
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.93f,
                    dy1 = -4.13f,
                )
                // M 13 22
                moveTo(x = 13.0f, y = 22.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 5 5 0 1 1 4.9 -6
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.9f,
                    dy1 = -6.0f,
                )
                // H 13
                horizontalLineTo(x = 13.0f)
                // a 3 3 0 0 1 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
            }
        }.build().also { _cloudSun = it }
    }


@Suppress("ObjectPropertyName")
private var _cloudSun: ImageVector? = null
