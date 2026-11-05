package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageSquareHeart: ImageVector
    get() {
        val current = _messageSquareHeart
        if (current != null) return current

        return ImageVector.Builder(
            name = "MessageSquareHeart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 17 a2 2 0 0 1 -2 2 H6.83 a2 2 0 0 0 -1.42 .59 l-2.2 2.2 A.71 .71 0 0 1 2 21.29 V5 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 17
                moveTo(x = 22.0f, y = 17.0f)
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
                // H 6.83
                horizontalLineTo(x = 6.83f)
                // a 2 2 0 0 0 -1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.59f,
                )
                // l -2.2 2.2
                lineToRelative(dx = -2.2f, dy = 2.2f)
                // A 0.71 0.71 0 0 1 2 21.29
                arcTo(
                    horizontalEllipseRadius = 0.71f,
                    verticalEllipseRadius = 0.71f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 21.29f,
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
            }
            // M7.5 9.5 a2.8 2.8 0 0 0 .7 1.84 l3 3.27 a1 1 0 0 0 .41 .31 1 1 0 0 0 .79 0 1 1 0 0 0 .4 -.31 l3 -3.27 a2.8 2.8 0 0 0 .7 -1.84 A2.5 2.5 0 0 0 12 8 a2.5 2.5 0 0 0 -4.5 1.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7.5 9.5
                moveTo(x = 7.5f, y = 9.5f)
                // a 2.8 2.8 0 0 0 0.7 1.84
                arcToRelative(
                    a = 2.8f,
                    b = 2.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = 1.84f,
                )
                // l 3 3.27
                lineToRelative(dx = 3.0f, dy = 3.27f)
                // a 1 1 0 0 0 0.41 0.31
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.41f,
                    dy1 = 0.31f,
                )
                // a 1 1 0 0 0 0.79 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.79f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 0 0 0.4 -0.31
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.4f,
                    dy1 = -0.31f,
                )
                // l 3 -3.27
                lineToRelative(dx = 3.0f, dy = -3.27f)
                // a 2.8 2.8 0 0 0 0.7 -1.84
                arcToRelative(
                    a = 2.8f,
                    b = 2.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = -1.84f,
                )
                // A 2.5 2.5 0 0 0 12 8
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 8.0f,
                )
                // a 2.5 2.5 0 0 0 -4.5 1.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.5f,
                    dy1 = 1.5f,
                )
            }
        }.build().also { _messageSquareHeart = it }
    }


@Suppress("ObjectPropertyName")
private var _messageSquareHeart: ImageVector? = null
