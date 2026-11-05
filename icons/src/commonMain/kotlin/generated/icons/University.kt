package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.University: ImageVector
    get() {
        val current = _university
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.University",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 21 v-3 a2 2 0 0 0 -4 0 v3 m8 -9 h.01 M18 16 h.01
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
                // m 8 -9
                moveToRelative(dx = 8.0f, dy = -9.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 18 16
                moveTo(x = 18.0f, y = 16.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
            // M22 7 a1 1 0 0 0 -1 -1 h-2 a2 2 0 0 1 -1.14 -.36 l-4.72 -3.28 a2 2 0 0 0 -2.28 0 L6.14 5.64 A2 2 0 0 1 5 6 H3 a1 1 0 0 0 -1 1 v12 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2z M6 12z M6 16z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 7
                moveTo(x = 22.0f, y = 7.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 2 2 0 0 1 -1.14 -0.36
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.14f,
                    dy1 = -0.36f,
                )
                // l -4.72 -3.28
                lineToRelative(dx = -4.72f, dy = -3.28f)
                // a 2 2 0 0 0 -2.28 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.28f,
                    dy1 = 0.0f,
                )
                // L 6.14 5.64
                lineTo(x = 6.14f, y = 5.64f)
                // A 2 2 0 0 1 5 6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 6.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // a 2 2 0 0 0 2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                close()
                // M 6 12z
                moveTo(x = 6.0f, y = 12.0f)
                close()
                // M 6 16z
                moveTo(x = 6.0f, y = 16.0f)
                close()
            }
            // <circle cx="12.0" cy="10.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
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
        }.build().also { _university = it }
    }

@Suppress("ObjectPropertyName")
private var _university: ImageVector? = null
