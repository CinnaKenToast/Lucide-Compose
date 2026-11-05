package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageSquareShare: ImageVector
    get() {
        val current = _messageSquareShare
        if (current != null) return current

        return ImageVector.Builder(
            name = "MessageSquareShare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 H4 a2 2 0 0 0 -2 2 v16.29 a.71 .71 0 0 0 1.21 .5 l2.2 -2.2 A2 2 0 0 1 6.83 19 H20 a2 2 0 0 0 2 -2 v-4 M16 3 h6 v6 m-6 0 6 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
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
                // v 16.29
                verticalLineToRelative(dy = 16.29f)
                // a 0.71 0.71 0 0 0 1.21 0.5
                arcToRelative(
                    a = 0.71f,
                    b = 0.71f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.21f,
                    dy1 = 0.5f,
                )
                // l 2.2 -2.2
                lineToRelative(dx = 2.2f, dy = -2.2f)
                // A 2 2 0 0 1 6.83 19
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.83f,
                    y1 = 19.0f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
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
                // M 16 3
                moveTo(x = 16.0f, y = 3.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
            }
        }.build().also { _messageSquareShare = it }
    }


@Suppress("ObjectPropertyName")
private var _messageSquareShare: ImageVector? = null
