package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessagesCircle: ImageVector
    get() {
        val current = _messagesCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "MessagesCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19.95 10.05 a7 7 0 0 1 1.41 7.87 1 1 0 0 0 -.06 .79 l.68 2.09 a1 1 0 0 1 -1.24 1.17 l-2.15 -.64 a1 1 0 0 0 -.75 .06 7 7 0 0 1 -7.79 -1.44 M2.7 12.71 a1 1 0 0 0 -.06 -.79 7 7 0 1 1 3.52 3.48 1 1 0 0 0 -.75 -.06 l-2.15 .63 a1 1 0 0 1 -1.24 -1.17z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.95 10.05
                moveTo(x = 19.95f, y = 10.05f)
                // a 7 7 0 0 1 1.41 7.87
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.41f,
                    dy1 = 7.87f,
                )
                // a 1 1 0 0 0 -0.06 0.79
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.06f,
                    dy1 = 0.79f,
                )
                // l 0.68 2.09
                lineToRelative(dx = 0.68f, dy = 2.09f)
                // a 1 1 0 0 1 -1.24 1.17
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.24f,
                    dy1 = 1.17f,
                )
                // l -2.15 -0.64
                lineToRelative(dx = -2.15f, dy = -0.64f)
                // a 1 1 0 0 0 -0.75 0.06
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.75f,
                    dy1 = 0.06f,
                )
                // a 7 7 0 0 1 -7.79 -1.44
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.79f,
                    dy1 = -1.44f,
                )
                // M 2.7 12.71
                moveTo(x = 2.7f, y = 12.71f)
                // a 1 1 0 0 0 -0.06 -0.79
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.06f,
                    dy1 = -0.79f,
                )
                // a 7 7 0 1 1 3.52 3.48
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.52f,
                    dy1 = 3.48f,
                )
                // a 1 1 0 0 0 -0.75 -0.06
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.75f,
                    dy1 = -0.06f,
                )
                // l -2.15 0.63
                lineToRelative(dx = -2.15f, dy = 0.63f)
                // a 1 1 0 0 1 -1.24 -1.17z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.24f,
                    dy1 = -1.17f,
                )
                close()
            }
        }.build().also { _messagesCircle = it }
    }


@Suppress("ObjectPropertyName")
private var _messagesCircle: ImageVector? = null
