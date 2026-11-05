package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Receipt: ImageVector
    get() {
        val current = _receipt
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Receipt",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 17 V7 m4 1 h-6 a2 2 0 0 0 0 4 h4 a2 2 0 0 1 0 4 H8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // m 4 1
                moveToRelative(dx = 4.0f, dy = 1.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 2 2 0 0 0 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
            }
            // M4 3 a1 1 0 0 1 1 -1 1.3 1.3 0 0 1 .7 .2 l.93 .6 a1.3 1.3 0 0 0 1.4 0 l.94 -.6 a1.3 1.3 0 0 1 1.4 0 l.93 .6 a1.3 1.3 0 0 0 1.4 0 l.93 -.6 a1.3 1.3 0 0 1 1.4 0 l.94 .6 a1.3 1.3 0 0 0 1.4 0 l.93 -.6 A1.3 1.3 0 0 1 19 2 a1 1 0 0 1 1 1 v18 a1 1 0 0 1 -1 1 1.3 1.3 0 0 1 -.7 -.2 l-.93 -.6 a1.3 1.3 0 0 0 -1.4 0 l-.94 .6 a1.3 1.3 0 0 1 -1.4 0 l-.93 -.6 a1.3 1.3 0 0 0 -1.4 0 l-.93 .6 a1.3 1.3 0 0 1 -1.4 0 l-.94 -.6 a1.3 1.3 0 0 0 -1.4 0 L5.7 21.8 A1.3 1.3 0 0 1 5 22 a1 1 0 0 1 -1 -1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 3
                moveTo(x = 4.0f, y = 3.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // a 1.3 1.3 0 0 1 0.7 0.2
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.7f,
                    dy1 = 0.2f,
                )
                // l 0.93 0.6
                lineToRelative(dx = 0.93f, dy = 0.6f)
                // a 1.3 1.3 0 0 0 1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 0.94 -0.6
                lineToRelative(dx = 0.94f, dy = -0.6f)
                // a 1.3 1.3 0 0 1 1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 0.93 0.6
                lineToRelative(dx = 0.93f, dy = 0.6f)
                // a 1.3 1.3 0 0 0 1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 0.93 -0.6
                lineToRelative(dx = 0.93f, dy = -0.6f)
                // a 1.3 1.3 0 0 1 1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 0.94 0.6
                lineToRelative(dx = 0.94f, dy = 0.6f)
                // a 1.3 1.3 0 0 0 1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 0.93 -0.6
                lineToRelative(dx = 0.93f, dy = -0.6f)
                // A 1.3 1.3 0 0 1 19 2
                arcTo(
                    horizontalEllipseRadius = 1.3f,
                    verticalEllipseRadius = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 2.0f,
                )
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
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
                // a 1.3 1.3 0 0 1 -0.7 -0.2
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = -0.2f,
                )
                // l -0.93 -0.6
                lineToRelative(dx = -0.93f, dy = -0.6f)
                // a 1.3 1.3 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -0.94 0.6
                lineToRelative(dx = -0.94f, dy = 0.6f)
                // a 1.3 1.3 0 0 1 -1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -0.93 -0.6
                lineToRelative(dx = -0.93f, dy = -0.6f)
                // a 1.3 1.3 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -0.93 0.6
                lineToRelative(dx = -0.93f, dy = 0.6f)
                // a 1.3 1.3 0 0 1 -1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -0.94 -0.6
                lineToRelative(dx = -0.94f, dy = -0.6f)
                // a 1.3 1.3 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // L 5.7 21.8
                lineTo(x = 5.7f, y = 21.8f)
                // A 1.3 1.3 0 0 1 5 22
                arcTo(
                    horizontalEllipseRadius = 1.3f,
                    verticalEllipseRadius = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 22.0f,
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
        }.build().also { _receipt = it }
    }

@Suppress("ObjectPropertyName")
private var _receipt: ImageVector? = null
