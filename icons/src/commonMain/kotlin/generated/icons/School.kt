package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.School: ImageVector
    get() {
        val current = _school
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.School",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 21 v-3 a2 2 0 0 0 -4 0 v3 m8 -16.07 V21 M4 6 l7.1 -3.79 a2 2 0 0 1 1.8 0 L20 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 21
                moveTo(x = 14.0f, y = 21.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 2 2 0 0 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 8 -16.07
                moveToRelative(dx = 8.0f, dy = -16.07f)
                // V 21
                verticalLineTo(y = 21.0f)
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // l 7.1 -3.79
                lineToRelative(dx = 7.1f, dy = -3.79f)
                // a 2 2 0 0 1 1.8 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.8f,
                    dy1 = 0.0f,
                )
                // L 20 6
                lineTo(x = 20.0f, y = 6.0f)
            }
            // m6 11 -3.52 2.15 A1 1 0 0 0 2 14 v5 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-5 a1 1 0 0 0 -.48 -.85 L18 11 M6 4.93 V21
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 11
                moveTo(x = 6.0f, y = 11.0f)
                // l -3.52 2.15
                lineToRelative(dx = -3.52f, dy = 2.15f)
                // A 1 1 0 0 0 2 14
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 14.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 1 1 0 0 0 -0.48 -0.85
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.48f,
                    dy1 = -0.85f,
                )
                // L 18 11
                lineTo(x = 18.0f, y = 11.0f)
                // M 6 4.93
                moveTo(x = 6.0f, y = 4.93f)
                // V 21
                verticalLineTo(y = 21.0f)
            }
            // <circle cx="12.0" cy="9.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 9
                moveTo(x = 12.0f, y = 9.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _school = it }
    }

@Suppress("ObjectPropertyName")
private var _school: ImageVector? = null
