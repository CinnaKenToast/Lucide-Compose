package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessagesSquare: ImageVector
    get() {
        val current = _messagesSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "MessagesSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 10 a2 2 0 0 1 -2 2 H6.83 a2 2 0 0 0 -1.42 .59 l-2.2 2.2 A.71 .71 0 0 1 2 14.29 V4 a2 2 0 0 1 2 -2 h10 a2 2 0 0 1 2 2z m4 -1 a2 2 0 0 1 2 2 v10.29 a.71 .71 0 0 1 -1.21 .5 l-2.2 -2.2 A2 2 0 0 0 17.17 19 H10 a2 2 0 0 1 -2 -2 v-1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 10
                moveTo(x = 16.0f, y = 10.0f)
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
                // A 0.71 0.71 0 0 1 2 14.29
                arcTo(
                    horizontalEllipseRadius = 0.71f,
                    verticalEllipseRadius = 0.71f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 14.29f,
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
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
                // m 4 -1
                moveToRelative(dx = 4.0f, dy = -1.0f)
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
                // v 10.29
                verticalLineToRelative(dy = 10.29f)
                // a 0.71 0.71 0 0 1 -1.21 0.5
                arcToRelative(
                    a = 0.71f,
                    b = 0.71f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.21f,
                    dy1 = 0.5f,
                )
                // l -2.2 -2.2
                lineToRelative(dx = -2.2f, dy = -2.2f)
                // A 2 2 0 0 0 17.17 19
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.17f,
                    y1 = 19.0f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
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
                // v -1
                verticalLineToRelative(dy = -1.0f)
            }
        }.build().also { _messagesSquare = it }
    }


@Suppress("ObjectPropertyName")
private var _messagesSquare: ImageVector? = null
