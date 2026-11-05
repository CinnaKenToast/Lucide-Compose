package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ScratchBlocks: ImageVector
    get() {
        val current = _scratchBlocks
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ScratchBlocks",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 5 a2 2 0 0 1 2 2 v11 a2 2 0 0 1 -2 2 h-5.59 a1 1 0 0 0 -.7 .3 l-1.42 1.4 a1 1 0 0 1 -.7 .3 H8.4 a1 1 0 0 1 -.7 -.3 l-1.42 -1.4 A1 1 0 0 0 5.6 20 H5 a2 2 0 0 1 -2 -2 V5.29 a1.7 1.7 0 0 1 .36 -1.1 6 6 0 0 1 9.17 -.13 A2.5 2.5 0 0 0 14.35 5z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 5
                moveTo(x = 19.0f, y = 5.0f)
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
                // v 11
                verticalLineToRelative(dy = 11.0f)
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
                // h -5.59
                horizontalLineToRelative(dx = -5.59f)
                // a 1 1 0 0 0 -0.7 0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.7f,
                    dy1 = 0.3f,
                )
                // l -1.42 1.4
                lineToRelative(dx = -1.42f, dy = 1.4f)
                // a 1 1 0 0 1 -0.7 0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = 0.3f,
                )
                // H 8.4
                horizontalLineTo(x = 8.4f)
                // a 1 1 0 0 1 -0.7 -0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = -0.3f,
                )
                // l -1.42 -1.4
                lineToRelative(dx = -1.42f, dy = -1.4f)
                // A 1 1 0 0 0 5.6 20
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.6f,
                    y1 = 20.0f,
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
                // V 5.29
                verticalLineTo(y = 5.29f)
                // a 1.7 1.7 0 0 1 0.36 -1.1
                arcToRelative(
                    a = 1.7f,
                    b = 1.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.36f,
                    dy1 = -1.1f,
                )
                // a 6 6 0 0 1 9.17 -0.13
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.17f,
                    dy1 = -0.13f,
                )
                // A 2.5 2.5 0 0 0 14.35 5z
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.35f,
                    y1 = 5.0f,
                )
                close()
            }
            // M21 12 h-7.59 a1 1 0 0 0 -.7 .3 l-1.42 1.4 a1 1 0 0 1 -.7 .3 H8.4 a1 1 0 0 1 -.7 -.3 l-1.42 -1.4 A1 1 0 0 0 5.6 12 H3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // h -7.59
                horizontalLineToRelative(dx = -7.59f)
                // a 1 1 0 0 0 -0.7 0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.7f,
                    dy1 = 0.3f,
                )
                // l -1.42 1.4
                lineToRelative(dx = -1.42f, dy = 1.4f)
                // a 1 1 0 0 1 -0.7 0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = 0.3f,
                )
                // H 8.4
                horizontalLineTo(x = 8.4f)
                // a 1 1 0 0 1 -0.7 -0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = -0.3f,
                )
                // l -1.42 -1.4
                lineToRelative(dx = -1.42f, dy = -1.4f)
                // A 1 1 0 0 0 5.6 12
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.6f,
                    y1 = 12.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
            }
        }.build().also { _scratchBlocks = it }
    }

@Suppress("ObjectPropertyName")
private var _scratchBlocks: ImageVector? = null
