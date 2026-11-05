package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FunnelX: ImageVector
    get() {
        val current = _funnelX
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FunnelX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.53 3 H3 a1 1 0 0 0 -.74 1.67 l7.22 7.99 A2 2 0 0 1 10 14 v6 a1 1 0 0 0 .55 .9 l2 1 A1 1 0 0 0 14 21 v-7 a2 2 0 0 1 .52 -1.34 l.42 -.47 M16.5 3.5 l5 5 m0 -5 -5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.53 3
                moveTo(x = 12.53f, y = 3.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 0 -0.74 1.67
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.74f,
                    dy1 = 1.67f,
                )
                // l 7.22 7.99
                lineToRelative(dx = 7.22f, dy = 7.99f)
                // A 2 2 0 0 1 10 14
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 14.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 1 1 0 0 0 0.55 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.55f,
                    dy1 = 0.9f,
                )
                // l 2 1
                lineToRelative(dx = 2.0f, dy = 1.0f)
                // A 1 1 0 0 0 14 21
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 21.0f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // a 2 2 0 0 1 0.52 -1.34
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.52f,
                    dy1 = -1.34f,
                )
                // l 0.42 -0.47
                lineToRelative(dx = 0.42f, dy = -0.47f)
                // M 16.5 3.5
                moveTo(x = 16.5f, y = 3.5f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
            }
        }.build().also { _funnelX = it }
    }

@Suppress("ObjectPropertyName")
private var _funnelX: ImageVector? = null
