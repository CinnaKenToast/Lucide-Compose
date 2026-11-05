package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MessageSquareDiff: ImageVector
    get() {
        val current = _messageSquareDiff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MessageSquareDiff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 17 a2 2 0 0 1 -2 2 H6.83 a2 2 0 0 0 -1.42 .59 l-2.2 2.2 A.71 .71 0 0 1 2 21.29 V5 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2z m-12 -2 h4 m-4 -6 h4 m-2 -2 v4
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
                // m -12 -2
                moveToRelative(dx = -12.0f, dy = -2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -4 -6
                moveToRelative(dx = -4.0f, dy = -6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -2 -2
                moveToRelative(dx = -2.0f, dy = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _messageSquareDiff = it }
    }

@Suppress("ObjectPropertyName")
private var _messageSquareDiff: ImageVector? = null
