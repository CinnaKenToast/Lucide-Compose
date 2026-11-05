package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Barrel: ImageVector
    get() {
        val current = _barrel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Barrel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.5 2 a34.5 34.5 0 0 0 0 20 m3 -20 a34.5 34.5 0 0 1 0 20 m-8.83 -5 h14.67 M4.67 7 h14.67
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.5 2
                moveTo(x = 10.5f, y = 2.0f)
                // a 34.5 34.5 0 0 0 0 20
                arcToRelative(
                    a = 34.5f,
                    b = 34.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 20.0f,
                )
                // m 3 -20
                moveToRelative(dx = 3.0f, dy = -20.0f)
                // a 34.5 34.5 0 0 1 0 20
                arcToRelative(
                    a = 34.5f,
                    b = 34.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 20.0f,
                )
                // m -8.83 -5
                moveToRelative(dx = -8.83f, dy = -5.0f)
                // h 14.67
                horizontalLineToRelative(dx = 14.67f)
                // M 4.67 7
                moveTo(x = 4.67f, y = 7.0f)
                // h 14.67
                horizontalLineToRelative(dx = 14.67f)
            }
            // M6.23 3.06 a19 19 0 0 0 0 17.88 A2 2 0 0 0 8 22 h8 a2 2 0 0 0 1.77 -1.06 19 19 0 0 0 0 -17.88 A2 2 0 0 0 16 2 H8 a2 2 0 0 0 -1.77 1.06
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.23 3.06
                moveTo(x = 6.23f, y = 3.06f)
                // a 19 19 0 0 0 0 17.88
                arcToRelative(
                    a = 19.0f,
                    b = 19.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 17.88f,
                )
                // A 2 2 0 0 0 8 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 22.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2 2 0 0 0 1.77 -1.06
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.77f,
                    dy1 = -1.06f,
                )
                // a 19 19 0 0 0 0 -17.88
                arcToRelative(
                    a = 19.0f,
                    b = 19.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -17.88f,
                )
                // A 2 2 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 2 2 0 0 0 -1.77 1.06
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.77f,
                    dy1 = 1.06f,
                )
            }
        }.build().also { _barrel = it }
    }

@Suppress("ObjectPropertyName")
private var _barrel: ImageVector? = null
