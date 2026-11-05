package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageCircleQuestionMark: ImageVector
    get() {
        val current = _messageCircleQuestionMark
        if (current != null) return current

        return ImageVector.Builder(
            name = "MessageCircleQuestionMark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 16.34 a2 2 0 0 1 .09 1.17 L2.02 20.8 a1 1 0 0 0 1.24 1.17 l3.41 -1 a2 2 0 0 1 1.1 .1 10 10 0 1 0 -4.78 -4.73
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 16.34
                moveTo(x = 3.0f, y = 16.34f)
                // a 2 2 0 0 1 0.09 1.17
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.09f,
                    dy1 = 1.17f,
                )
                // L 2.02 20.8
                lineTo(x = 2.02f, y = 20.8f)
                // a 1 1 0 0 0 1.24 1.17
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.24f,
                    dy1 = 1.17f,
                )
                // l 3.41 -1
                lineToRelative(dx = 3.41f, dy = -1.0f)
                // a 2 2 0 0 1 1.1 0.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.1f,
                )
                // a 10 10 0 1 0 -4.78 -4.73
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.78f,
                    dy1 = -4.73f,
                )
            }
            // M9.09 9 a3 3 0 0 1 5.83 1 c0 2 -3 3 -3 3 M12 17z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.09 9
                moveTo(x = 9.09f, y = 9.0f)
                // a 3 3 0 0 1 5.83 1
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.83f,
                    dy1 = 1.0f,
                )
                // c 0 2 -3 3 -3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // M 12 17z
                moveTo(x = 12.0f, y = 17.0f)
                close()
            }
        }.build().also { _messageCircleQuestionMark = it }
    }


@Suppress("ObjectPropertyName")
private var _messageCircleQuestionMark: ImageVector? = null
