package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HikingStick: ImageVector
    get() {
        val current = _hikingStick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HikingStick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.5 10.5 2 22 m14.35 -10.35 a1.2 1.2 0 0 1 -1.7 0 l-2.3 -2.3 a1.2 1.2 0 0 1 0 -1.7 l.72 -.72 a2 2 0 0 1 1.02 -.55 l.6 -.12 a2 2 0 0 0 1.57 -1.57 l.12 -.6 a2 2 0 0 1 .55 -1.02 l.72 -.72 a1.2 1.2 0 0 1 1.7 0 l2.3 2.3 a1.2 1.2 0 0 1 0 1.7 l-6.02 6.02 a1 1 0 1 0 3 3 l.2 -.2 A7.4 7.4 0 0 0 21 9.93 V7 M6 21 l-3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.5 10.5
                moveTo(x = 13.5f, y = 10.5f)
                // L 2 22
                lineTo(x = 2.0f, y = 22.0f)
                // m 14.35 -10.35
                moveToRelative(dx = 14.35f, dy = -10.35f)
                // a 1.2 1.2 0 0 1 -1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                // l -2.3 -2.3
                lineToRelative(dx = -2.3f, dy = -2.3f)
                // a 1.2 1.2 0 0 1 0 -1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.7f,
                )
                // l 0.72 -0.72
                lineToRelative(dx = 0.72f, dy = -0.72f)
                // a 2 2 0 0 1 1.02 -0.55
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.02f,
                    dy1 = -0.55f,
                )
                // l 0.6 -0.12
                lineToRelative(dx = 0.6f, dy = -0.12f)
                // a 2 2 0 0 0 1.57 -1.57
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.57f,
                    dy1 = -1.57f,
                )
                // l 0.12 -0.6
                lineToRelative(dx = 0.12f, dy = -0.6f)
                // a 2 2 0 0 1 0.55 -1.02
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.55f,
                    dy1 = -1.02f,
                )
                // l 0.72 -0.72
                lineToRelative(dx = 0.72f, dy = -0.72f)
                // a 1.2 1.2 0 0 1 1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 2.3 2.3
                lineToRelative(dx = 2.3f, dy = 2.3f)
                // a 1.2 1.2 0 0 1 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l -6.02 6.02
                lineToRelative(dx = -6.02f, dy = 6.02f)
                // a 1 1 0 1 0 3 3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // l 0.2 -0.2
                lineToRelative(dx = 0.2f, dy = -0.2f)
                // A 7.4 7.4 0 0 0 21 9.93
                arcTo(
                    horizontalEllipseRadius = 7.4f,
                    verticalEllipseRadius = 7.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 9.93f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // M 6 21
                moveTo(x = 6.0f, y = 21.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
            }
        }.build().also { _hikingStick = it }
    }

@Suppress("ObjectPropertyName")
private var _hikingStick: ImageVector? = null
