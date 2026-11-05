package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThumbsUp: ImageVector
    get() {
        val current = _thumbsUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "ThumbsUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 5.88 14 10 h5.83 a2 2 0 0 1 1.92 2.56 l-2.33 8 A2 2 0 0 1 17.5 22 H4 a2 2 0 0 1 -2 -2 v-8 a2 2 0 0 1 2 -2 h2.76 a2 2 0 0 0 1.79 -1.11 L12 2 a3.13 3.13 0 0 1 3 3.88 M7 10 v12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 5.88
                moveTo(x = 15.0f, y = 5.88f)
                // L 14 10
                lineTo(x = 14.0f, y = 10.0f)
                // h 5.83
                horizontalLineToRelative(dx = 5.83f)
                // a 2 2 0 0 1 1.92 2.56
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.92f,
                    dy1 = 2.56f,
                )
                // l -2.33 8
                lineToRelative(dx = -2.33f, dy = 8.0f)
                // A 2 2 0 0 1 17.5 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.5f,
                    y1 = 22.0f,
                )
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
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // h 2.76
                horizontalLineToRelative(dx = 2.76f)
                // a 2 2 0 0 0 1.79 -1.11
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.79f,
                    dy1 = -1.11f,
                )
                // L 12 2
                lineTo(x = 12.0f, y = 2.0f)
                // a 3.13 3.13 0 0 1 3 3.88
                arcToRelative(
                    a = 3.13f,
                    b = 3.13f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.88f,
                )
                // M 7 10
                moveTo(x = 7.0f, y = 10.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
            }
        }.build().also { _thumbsUp = it }
    }


@Suppress("ObjectPropertyName")
private var _thumbsUp: ImageVector? = null
