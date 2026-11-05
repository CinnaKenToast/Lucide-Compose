package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ServerCog: ImageVector
    get() {
        val current = _serverCog
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ServerCog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10.85 14.77 -.38 .93 m2.68 -.93 a3 3 0 1 0 -2.3 -5.54 L10.47 8.3 m2.68 .92 .38 -.93
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.85 14.77
                moveTo(x = 10.85f, y = 14.77f)
                // l -0.38 0.93
                lineToRelative(dx = -0.38f, dy = 0.93f)
                // m 2.68 -0.93
                moveToRelative(dx = 2.68f, dy = -0.93f)
                // a 3 3 0 1 0 -2.3 -5.54
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.3f,
                    dy1 = -5.54f,
                )
                // L 10.47 8.3
                lineTo(x = 10.47f, y = 8.3f)
                // m 2.68 0.92
                moveToRelative(dx = 2.68f, dy = 0.92f)
                // l 0.38 -0.93
                lineToRelative(dx = 0.38f, dy = -0.93f)
            }
            // m13.53 15.7 -.38 -.93 a3 3 0 1 1 -2.3 -5.54 m3.92 1.62 .93 -.38 m-.93 2.68 .93 .38
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.53 15.7
                moveTo(x = 13.53f, y = 15.7f)
                // l -0.38 -0.93
                lineToRelative(dx = -0.38f, dy = -0.93f)
                // a 3 3 0 1 1 -2.3 -5.54
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.3f,
                    dy1 = -5.54f,
                )
                // m 3.92 1.62
                moveToRelative(dx = 3.92f, dy = 1.62f)
                // l 0.93 -0.38
                lineToRelative(dx = 0.93f, dy = -0.38f)
                // m -0.93 2.68
                moveToRelative(dx = -0.93f, dy = 2.68f)
                // l 0.93 0.38
                lineToRelative(dx = 0.93f, dy = 0.38f)
            }
            // M4.5 10 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 h-.5 m-15 4 H4 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 h-.5 M6 18z M6 6z m3.22 4.85 L8.3 10.47 m.93 2.68 L8.3 13.53
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.5 10
                moveTo(x = 4.5f, y = 10.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // h -0.5
                horizontalLineToRelative(dx = -0.5f)
                // m -15 4
                moveToRelative(dx = -15.0f, dy = 4.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // h -0.5
                horizontalLineToRelative(dx = -0.5f)
                // M 6 18z
                moveTo(x = 6.0f, y = 18.0f)
                close()
                // M 6 6z
                moveTo(x = 6.0f, y = 6.0f)
                close()
                // m 3.22 4.85
                moveToRelative(dx = 3.22f, dy = 4.85f)
                // L 8.3 10.47
                lineTo(x = 8.3f, y = 10.47f)
                // m 0.93 2.68
                moveToRelative(dx = 0.93f, dy = 2.68f)
                // L 8.3 13.53
                lineTo(x = 8.3f, y = 13.53f)
            }
        }.build().also { _serverCog = it }
    }

@Suppress("ObjectPropertyName")
private var _serverCog: ImageVector? = null
