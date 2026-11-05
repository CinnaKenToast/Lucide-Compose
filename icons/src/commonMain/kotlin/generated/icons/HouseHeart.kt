package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HouseHeart: ImageVector
    get() {
        val current = _houseHeart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HouseHeart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8.62 13.8 A2.25 2.25 0 1 1 12 10.84 a2.25 2.25 0 1 1 3.38 2.96 l-2.63 2.86 a1 1 0 0 1 -1.5 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.62 13.8
                moveTo(x = 8.62f, y = 13.8f)
                // A 2.25 2.25 0 1 1 12 10.84
                arcTo(
                    horizontalEllipseRadius = 2.25f,
                    verticalEllipseRadius = 2.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 10.84f,
                )
                // a 2.25 2.25 0 1 1 3.38 2.96
                arcToRelative(
                    a = 2.25f,
                    b = 2.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.38f,
                    dy1 = 2.96f,
                )
                // l -2.63 2.86
                lineToRelative(dx = -2.63f, dy = 2.86f)
                // a 1 1 0 0 1 -1.5 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.5f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M3 10 a2 2 0 0 1 .7 -1.53 l7 -6 a2 2 0 0 1 2.6 0 l7 6 A2 2 0 0 1 21 10 v9 a2 2 0 0 1 -2 2 H5 a2 2 0 0 1 -2 -2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 10
                moveTo(x = 3.0f, y = 10.0f)
                // a 2 2 0 0 1 0.7 -1.53
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.7f,
                    dy1 = -1.53f,
                )
                // l 7 -6
                lineToRelative(dx = 7.0f, dy = -6.0f)
                // a 2 2 0 0 1 2.6 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.6f,
                    dy1 = 0.0f,
                )
                // l 7 6
                lineToRelative(dx = 7.0f, dy = 6.0f)
                // A 2 2 0 0 1 21 10
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 10.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
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
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _houseHeart = it }
    }

@Suppress("ObjectPropertyName")
private var _houseHeart: ImageVector? = null
