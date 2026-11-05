package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HeadphoneOff: ImageVector
    get() {
        val current = _headphoneOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HeadphoneOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 14 h-1.34 M9.13 3.47 A9 9 0 0 1 21 12 v3.34 M2 2 l20 20 m-1.59 -1.59 A2 2 0 0 1 19 21 h-1 a2 2 0 0 1 -2 -2 v-3 M3 14 h3 a2 2 0 0 1 2 2 v3 a2 2 0 0 1 -2 2 H5 a2 2 0 0 1 -2 -2 v-7 a9 9 0 0 1 2.64 -6.36
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 14
                moveTo(x = 21.0f, y = 14.0f)
                // h -1.34
                horizontalLineToRelative(dx = -1.34f)
                // M 9.13 3.47
                moveTo(x = 9.13f, y = 3.47f)
                // A 9 9 0 0 1 21 12
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 12.0f,
                )
                // v 3.34
                verticalLineToRelative(dy = 3.34f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m -1.59 -1.59
                moveToRelative(dx = -1.59f, dy = -1.59f)
                // A 2 2 0 0 1 19 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 21.0f,
                )
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // M 3 14
                moveTo(x = 3.0f, y = 14.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // a 9 9 0 0 1 2.64 -6.36
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.64f,
                    dy1 = -6.36f,
                )
            }
        }.build().also { _headphoneOff = it }
    }

@Suppress("ObjectPropertyName")
private var _headphoneOff: ImageVector? = null
