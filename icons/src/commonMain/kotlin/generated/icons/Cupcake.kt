package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cupcake: ImageVector
    get() {
        val current = _cupcake
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Cupcake",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 v-9 m2 -9 h1 a3 3 0 0 1 3 3 v.13 A4 4 0 0 1 21 11 v2 m-5.5 9 1.5 -9 m4 0 a1 1 0 0 1 .92 1.4 l-2.74 6.39 A2 2 0 0 1 17.34 22 H6.66 a2 2 0 0 1 -1.84 -1.21 l-2.74 -6.4 A1 1 0 0 1 3 13z M3 13 v-2 a4 4 0 0 1 3 -3.87 V7 a3 3 0 0 1 3 -3 h1 M8.5 22 7 13
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
                // m 2 -9
                moveToRelative(dx = 2.0f, dy = -9.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 3 3 0 0 1 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // v 0.13
                verticalLineToRelative(dy = 0.13f)
                // A 4 4 0 0 1 21 11
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 11.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m -5.5 9
                moveToRelative(dx = -5.5f, dy = 9.0f)
                // l 1.5 -9
                lineToRelative(dx = 1.5f, dy = -9.0f)
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // a 1 1 0 0 1 0.92 1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.92f,
                    dy1 = 1.4f,
                )
                // l -2.74 6.39
                lineToRelative(dx = -2.74f, dy = 6.39f)
                // A 2 2 0 0 1 17.34 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.34f,
                    y1 = 22.0f,
                )
                // H 6.66
                horizontalLineTo(x = 6.66f)
                // a 2 2 0 0 1 -1.84 -1.21
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.84f,
                    dy1 = -1.21f,
                )
                // l -2.74 -6.4
                lineToRelative(dx = -2.74f, dy = -6.4f)
                // A 1 1 0 0 1 3 13z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.0f,
                    y1 = 13.0f,
                )
                close()
                // M 3 13
                moveTo(x = 3.0f, y = 13.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 4 4 0 0 1 3 -3.87
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.87f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 8.5 22
                moveTo(x = 8.5f, y = 22.0f)
                // L 7 13
                lineTo(x = 7.0f, y = 13.0f)
            }
            // <circle cx="12.0" cy="4.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
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
        }.build().also { _cupcake = it }
    }

@Suppress("ObjectPropertyName")
private var _cupcake: ImageVector? = null
