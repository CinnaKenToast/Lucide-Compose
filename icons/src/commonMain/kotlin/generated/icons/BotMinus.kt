package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BotMinus: ImageVector
    get() {
        val current = _botMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BotMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 8 V4 H8 m7 9 v2 M2 14 h2 m16 1 v-5 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v8 a2 2 0 0 0 2 2 h6 m10 -1 h-6 m-7 -6 v2
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
                // M 2 14
                moveTo(x = 2.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 1
                moveToRelative(dx = 16.0f, dy = 1.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
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
                // m 10 -1
                moveToRelative(dx = 10.0f, dy = -1.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // m -7 -6
                moveToRelative(dx = -7.0f, dy = -6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _botMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _botMinus: ImageVector? = null
