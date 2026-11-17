package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CaretsToAxisHorizontal: ImageVector
    get() {
        val current = _caretsToAxisHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CaretsToAxisHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 12 H2 m5.3 8.29 A1 1 0 0 0 8 22 h8 a1 1 0 0 0 .7 -1.71 l-3.99 -4 a1 1 0 0 0 -1.42 0z m0 -16.58 A1 1 0 0 1 8 2 h8 a1 1 0 0 1 .7 1.71 l-3.99 4 a1 1 0 0 1 -1.42 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 5.3 8.29
                moveToRelative(dx = 5.3f, dy = 8.29f)
                // A 1 1 0 0 0 8 22
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 22.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 1 1 0 0 0 0.7 -1.71
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = -1.71f,
                )
                // l -3.99 -4
                lineToRelative(dx = -3.99f, dy = -4.0f)
                // a 1 1 0 0 0 -1.42 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.0f,
                )
                close()
                // m 0 -16.58
                moveToRelative(dx = 0.0f, dy = -16.58f)
                // A 1 1 0 0 1 8 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 1 1 0 0 1 0.7 1.71
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.7f,
                    dy1 = 1.71f,
                )
                // l -3.99 4
                lineToRelative(dx = -3.99f, dy = 4.0f)
                // a 1 1 0 0 1 -1.42 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.42f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _caretsToAxisHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _caretsToAxisHorizontal: ImageVector? = null
