package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PaintGun: ImageVector
    get() {
        val current = _paintGun
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PaintGun",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 10 V9.83 a2 2 0 0 1 .59 -1.42 L12.4 7.6 A2 2 0 0 0 13 6.17 V3 a1 1 0 0 0 -1 -1 H6 a1 1 0 0 0 -1 1 v3.17 A2 2 0 0 0 5.59 7.6 L6.4 8.4 A2 2 0 0 1 7 9.83 V10 m5 4 -.81 3.24 A1 1 0 0 1 10.22 18 H7 m6 -6 h1 m4.01 -2 h.01 m-.01 4 h.01 m3.99 -2 h.01 m-.01 4 h.01 m-.01 -8 h.01
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 10
                moveTo(x = 11.0f, y = 10.0f)
                // V 9.83
                verticalLineTo(y = 9.83f)
                // a 2 2 0 0 1 0.59 -1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = -1.42f,
                )
                // L 12.4 7.6
                lineTo(x = 12.4f, y = 7.6f)
                // A 2 2 0 0 0 13 6.17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.0f,
                    y1 = 6.17f,
                )
                // V 3
                verticalLineTo(y = 3.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 3.17
                verticalLineToRelative(dy = 3.17f)
                // A 2 2 0 0 0 5.59 7.6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.59f,
                    y1 = 7.6f,
                )
                // L 6.4 8.4
                lineTo(x = 6.4f, y = 8.4f)
                // A 2 2 0 0 1 7 9.83
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 9.83f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // m 5 4
                moveToRelative(dx = 5.0f, dy = 4.0f)
                // l -0.81 3.24
                lineToRelative(dx = -0.81f, dy = 3.24f)
                // A 1 1 0 0 1 10.22 18
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.22f,
                    y1 = 18.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // m 6 -6
                moveToRelative(dx = 6.0f, dy = -6.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 4.01 -2
                moveToRelative(dx = 4.01f, dy = -2.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // m -0.01 4
                moveToRelative(dx = -0.01f, dy = 4.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // m 3.99 -2
                moveToRelative(dx = 3.99f, dy = -2.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // m -0.01 4
                moveToRelative(dx = -0.01f, dy = 4.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // m -0.01 -8
                moveToRelative(dx = -0.01f, dy = -8.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
            // m4 14 -1.84 7.38 A.5 .5 0 0 0 2.64 22 h2.58 a1 1 0 0 0 .97 -.76 L8 14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 14
                moveTo(x = 4.0f, y = 14.0f)
                // l -1.84 7.38
                lineToRelative(dx = -1.84f, dy = 7.38f)
                // A 0.5 0.5 0 0 0 2.64 22
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.64f,
                    y1 = 22.0f,
                )
                // h 2.58
                horizontalLineToRelative(dx = 2.58f)
                // a 1 1 0 0 0 0.97 -0.76
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.97f,
                    dy1 = -0.76f,
                )
                // L 8 14
                lineTo(x = 8.0f, y = 14.0f)
            }
            // <rect width="11" height="4" rx="1.0" x="2.0" y="10.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 11
                moveTo(x = 2.0f, y = 11.0f)
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
                // h 9
                horizontalLineToRelative(dx = 9.0f)
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
                // h -9
                horizontalLineToRelative(dx = -9.0f)
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
        }.build().also { _paintGun = it }
    }

@Suppress("ObjectPropertyName")
private var _paintGun: ImageVector? = null
