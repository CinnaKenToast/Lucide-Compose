package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChocolateBar: ImageVector
    get() {
        val current = _chocolateBar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChocolateBar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v10 m5 0 V4.4 A.4 .4 0 0 0 16.6 4 1.6 1.6 0 0 1 15 2.4 .4 .4 0 0 0 14.6 2 H9 a2 2 0 0 0 -2 2 v8 m-2 2 a2 2 0 0 1 2 -2 h10 a2 2 0 0 1 2 2 v2 a1 1 0 0 1 -1 1 2 2 0 0 1 -.9 -.2 l-1.2 -.6 a2 2 0 0 0 -1.8 0 l-1.2 .6 a2 2 0 0 1 -1.8 0 l-1.2 -.6 a2 2 0 0 0 -1.8 0 l-1.2 .6 A2 2 0 0 1 6 17 a1 1 0 0 1 -1 -1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // m 5 0
                moveToRelative(dx = 5.0f, dy = 0.0f)
                // V 4.4
                verticalLineTo(y = 4.4f)
                // A 0.4 0.4 0 0 0 16.6 4
                arcTo(
                    horizontalEllipseRadius = 0.4f,
                    verticalEllipseRadius = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.6f,
                    y1 = 4.0f,
                )
                // A 1.6 1.6 0 0 1 15 2.4
                arcTo(
                    horizontalEllipseRadius = 1.6f,
                    verticalEllipseRadius = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 2.4f,
                )
                // A 0.4 0.4 0 0 0 14.6 2
                arcTo(
                    horizontalEllipseRadius = 0.4f,
                    verticalEllipseRadius = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.6f,
                    y1 = 2.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m -2 2
                moveToRelative(dx = -2.0f, dy = 2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // a 2 2 0 0 1 -0.9 -0.2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.9f,
                    dy1 = -0.2f,
                )
                // l -1.2 -0.6
                lineToRelative(dx = -1.2f, dy = -0.6f)
                // a 2 2 0 0 0 -1.8 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.8f,
                    dy1 = 0.0f,
                )
                // l -1.2 0.6
                lineToRelative(dx = -1.2f, dy = 0.6f)
                // a 2 2 0 0 1 -1.8 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.8f,
                    dy1 = 0.0f,
                )
                // l -1.2 -0.6
                lineToRelative(dx = -1.2f, dy = -0.6f)
                // a 2 2 0 0 0 -1.8 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.8f,
                    dy1 = 0.0f,
                )
                // l -1.2 0.6
                lineToRelative(dx = -1.2f, dy = 0.6f)
                // A 2 2 0 0 1 6 17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 17.0f,
                )
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
            // M7 16.75 V20 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-3.25 M7 7 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 16.75
                moveTo(x = 7.0f, y = 16.75f)
                // V 20
                verticalLineTo(y = 20.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v -3.25
                verticalLineToRelative(dy = -3.25f)
                // M 7 7
                moveTo(x = 7.0f, y = 7.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
        }.build().also { _chocolateBar = it }
    }

@Suppress("ObjectPropertyName")
private var _chocolateBar: ImageVector? = null
