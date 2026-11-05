package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GuitarElectric: ImageVector
    get() {
        val current = _guitarElectric
        if (current != null) return current

        return ImageVector.Builder(
            name = "GuitarElectric",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12.17 11.83 4.24 -4.24 m0 0 A2 2 0 0 0 17 6.17 V5 a2 2 0 0 1 1.18 -1.82 l2.41 -1.09 a1 1 0 0 1 1.32 1.32 l-1.09 2.41 A2 2 0 0 1 19 7 h-1 a2 2 0 0 0 -1.59 .59 M6 16 l2 2 m.23 -8.15 A3 3 0 0 1 9.51 8.4 a1 1 0 0 1 1.5 .81 A4 4 0 0 0 14.79 13 a1 1 0 0 1 .81 1.5 3 3 0 0 1 -1.45 1.28 l-.92 .38 A2 2 0 0 0 12 18 a4 4 0 0 1 -4 4 6 6 0 0 1 -6 -6 4 4 0 0 1 4 -4 2 2 0 0 0 1.85 -1.23z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.17 11.83
                moveTo(x = 12.17f, y = 11.83f)
                // l 4.24 -4.24
                lineToRelative(dx = 4.24f, dy = -4.24f)
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // A 2 2 0 0 0 17 6.17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 6.17f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 1 1.18 -1.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.18f,
                    dy1 = -1.82f,
                )
                // l 2.41 -1.09
                lineToRelative(dx = 2.41f, dy = -1.09f)
                // a 1 1 0 0 1 1.32 1.32
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.32f,
                    dy1 = 1.32f,
                )
                // l -1.09 2.41
                lineToRelative(dx = -1.09f, dy = 2.41f)
                // A 2 2 0 0 1 19 7
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 7.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 2 2 0 0 0 -1.59 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.59f,
                    dy1 = 0.59f,
                )
                // M 6 16
                moveTo(x = 6.0f, y = 16.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // m 0.23 -8.15
                moveToRelative(dx = 0.23f, dy = -8.15f)
                // A 3 3 0 0 1 9.51 8.4
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.51f,
                    y1 = 8.4f,
                )
                // a 1 1 0 0 1 1.5 0.81
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.5f,
                    dy1 = 0.81f,
                )
                // A 4 4 0 0 0 14.79 13
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.79f,
                    y1 = 13.0f,
                )
                // a 1 1 0 0 1 0.81 1.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.81f,
                    dy1 = 1.5f,
                )
                // a 3 3 0 0 1 -1.45 1.28
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.45f,
                    dy1 = 1.28f,
                )
                // l -0.92 0.38
                lineToRelative(dx = -0.92f, dy = 0.38f)
                // A 2 2 0 0 0 12 18
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 18.0f,
                )
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // a 6 6 0 0 1 -6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = -6.0f,
                )
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // a 2 2 0 0 0 1.85 -1.23z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.85f,
                    dy1 = -1.23f,
                )
                close()
            }
        }.build().also { _guitarElectric = it }
    }


@Suppress("ObjectPropertyName")
private var _guitarElectric: ImageVector? = null
