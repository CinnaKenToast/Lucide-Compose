package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TextCursorInput: ImageVector
    get() {
        val current = _textCursorInput
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TextCursorInput",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 20 h-1 a2 2 0 0 1 -2 -2 2 2 0 0 1 -2 2 H6 m7 -12 h7 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 h-7 m-8 0 H4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h1 m1 -4 h1 a2 2 0 0 1 2 2 2 2 0 0 1 2 -2 h1 M9 6 v12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 20
                moveTo(x = 12.0f, y = 20.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
                // m 7 -12
                moveToRelative(dx = 7.0f, dy = -12.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
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
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 1 -4
                moveToRelative(dx = 1.0f, dy = -4.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
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
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 9 6
                moveTo(x = 9.0f, y = 6.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
            }
        }.build().also { _textCursorInput = it }
    }

@Suppress("ObjectPropertyName")
private var _textCursorInput: ImageVector? = null
