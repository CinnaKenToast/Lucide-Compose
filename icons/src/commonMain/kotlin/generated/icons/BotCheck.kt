package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BotCheck: ImageVector
    get() {
        val current = _botCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BotCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 8 V4 H8 m7 9 v2 m1 4 2 2 4 -4 M2 14 h2 m16 -.5 V10 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v8 a2 2 0 0 0 2 2 h6 m-3 -7 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 7 9
                moveToRelative(dx = 7.0f, dy = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 1 4
                moveToRelative(dx = 1.0f, dy = 4.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // M 2 14
                moveTo(x = 2.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 -0.5
                moveToRelative(dx = 16.0f, dy = -0.5f)
                // V 10
                verticalLineTo(y = 10.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 -7
                moveToRelative(dx = -3.0f, dy = -7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _botCheck = it }
    }

@Suppress("ObjectPropertyName")
private var _botCheck: ImageVector? = null
