package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PackageOpen: ImageVector
    get() {
        val current = _packageOpen
        if (current != null) return current

        return ImageVector.Builder(
            name = "PackageOpen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 v-9 m3.17 -10.79 a1.7 1.7 0 0 1 1.63 0 L21 4.57 a1.93 1.93 0 0 1 0 3.36 L8.82 14.79 a1.7 1.7 0 0 1 -1.64 0 L3 12.43 a1.93 1.93 0 0 1 0 -3.36z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // m 3.17 -10.79
                moveToRelative(dx = 3.17f, dy = -10.79f)
                // a 1.7 1.7 0 0 1 1.63 0
                arcToRelative(
                    a = 1.7f,
                    b = 1.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.63f,
                    dy1 = 0.0f,
                )
                // L 21 4.57
                lineTo(x = 21.0f, y = 4.57f)
                // a 1.93 1.93 0 0 1 0 3.36
                arcToRelative(
                    a = 1.93f,
                    b = 1.93f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.36f,
                )
                // L 8.82 14.79
                lineTo(x = 8.82f, y = 14.79f)
                // a 1.7 1.7 0 0 1 -1.64 0
                arcToRelative(
                    a = 1.7f,
                    b = 1.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.64f,
                    dy1 = 0.0f,
                )
                // L 3 12.43
                lineTo(x = 3.0f, y = 12.43f)
                // a 1.93 1.93 0 0 1 0 -3.36z
                arcToRelative(
                    a = 1.93f,
                    b = 1.93f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.36f,
                )
                close()
            }
            // M20 13 v3.87 a2.1 2.1 0 0 1 -1.11 1.83 l-6 3.08 a2 2 0 0 1 -1.78 0 l-6 -3.08 A2.1 2.1 0 0 1 4 16.87 V13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 13
                moveTo(x = 20.0f, y = 13.0f)
                // v 3.87
                verticalLineToRelative(dy = 3.87f)
                // a 2.1 2.1 0 0 1 -1.11 1.83
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.11f,
                    dy1 = 1.83f,
                )
                // l -6 3.08
                lineToRelative(dx = -6.0f, dy = 3.08f)
                // a 2 2 0 0 1 -1.78 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.78f,
                    dy1 = 0.0f,
                )
                // l -6 -3.08
                lineToRelative(dx = -6.0f, dy = -3.08f)
                // A 2.1 2.1 0 0 1 4 16.87
                arcTo(
                    horizontalEllipseRadius = 2.1f,
                    verticalEllipseRadius = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 16.87f,
                )
                // V 13
                verticalLineTo(y = 13.0f)
            }
            // M21 12.43 a1.93 1.93 0 0 0 0 -3.36 L8.83 2.2 a1.6 1.6 0 0 0 -1.63 0 L3 4.57 a1.93 1.93 0 0 0 0 3.36 l12.18 6.86 a1.6 1.6 0 0 0 1.63 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 12.43
                moveTo(x = 21.0f, y = 12.43f)
                // a 1.93 1.93 0 0 0 0 -3.36
                arcToRelative(
                    a = 1.93f,
                    b = 1.93f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.36f,
                )
                // L 8.83 2.2
                lineTo(x = 8.83f, y = 2.2f)
                // a 1.6 1.6 0 0 0 -1.63 0
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.63f,
                    dy1 = 0.0f,
                )
                // L 3 4.57
                lineTo(x = 3.0f, y = 4.57f)
                // a 1.93 1.93 0 0 0 0 3.36
                arcToRelative(
                    a = 1.93f,
                    b = 1.93f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.36f,
                )
                // l 12.18 6.86
                lineToRelative(dx = 12.18f, dy = 6.86f)
                // a 1.6 1.6 0 0 0 1.63 0z
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.63f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _packageOpen = it }
    }


@Suppress("ObjectPropertyName")
private var _packageOpen: ImageVector? = null
