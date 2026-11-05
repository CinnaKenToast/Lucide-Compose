package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Printer3d: ImageVector
    get() {
        val current = _printer3d
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Printer3d",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 11 v1 m2 -4 h8 m-5 12 v-3 a1 1 0 0 0 -1 -1 H9 a1 1 0 0 0 -1 1 v3 m-4 0 h16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 11
                moveTo(x = 10.0f, y = 11.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 2 -4
                moveToRelative(dx = 2.0f, dy = -4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -5 12
                moveToRelative(dx = -5.0f, dy = 12.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
            }
            // M4 22 V4 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2 v18 M4 8 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 22
                moveTo(x = 4.0f, y = 22.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // M 4 8
                moveTo(x = 4.0f, y = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
            // M8.64 10.1 A2 2 0 0 1 8 8.62 V7 a1 1 0 0 1 1 -1 h2 a1 1 0 0 1 1 1 v2 a1 1 0 0 1 -.3 .7 l-1 1 a1 1 0 0 1 -1.4 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.64 10.1
                moveTo(x = 8.64f, y = 10.1f)
                // A 2 2 0 0 1 8 8.62
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 8.62f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 1 -0.3 0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.3f,
                    dy1 = 0.7f,
                )
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // a 1 1 0 0 1 -1.4 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _printer3d = it }
    }

@Suppress("ObjectPropertyName")
private var _printer3d: ImageVector? = null
